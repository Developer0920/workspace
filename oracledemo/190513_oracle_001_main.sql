<집합연산자>
- 둘 이상의 query결과를 하나의 결과로 조합한다. --쿼리를 조합해서 원하는 결과를 가져옴
- select의 인자 갯수가 같아야 한다.
 첫번째 select가 2개이면 두번째 select도 2개여야 한다.
 - 타입이 일치해야 한다.
  예를 들어 character이면 character이어야 한다.

<집합연산자 종류>
union(합집합) - 중복행이 제거된 두 query
union all(합집합) - 중복행이 포함된 두 query행
intersect(교집합) - 두 query에 공통적인 행
minus(차집합) - 첫 번째 query에 있는 행 중 두 번째 query에 없는 행 표시

<집합연산자 사용이유>
- 서로 다른 테이블에서 유사한 형태의 결과를 반환하기 위해서 -- column명은 달라도 상관없지만 데이터 형태는 같아야 한다.
- 서로 같은 테이블에서 서로 다른 질의를 수행하여 결과를 합치기 위해서


--=====================
--union (합집합) : 이게 진짜 합집합
SELECT department_id, first_name, last_name
FROM employees
WHERE department_id=20 or department_id=40
UNION
SELECT department_id, first_name, last_name --가져오는 column의 데이터가 같아야 한다.(컬럼명은 달라도 됨)
FROM employees
WHERE department_id=20 or department_id=60;

--union all(합집합) : 겹치는 걸 한 번 더 가져옴
SELECT department_id, first_name, last_name
FROM employees
WHERE department_id=20 or department_id=40
UNION ALL
SELECT department_id, first_name, last_name --가져오는 column의 데이터가 같아야 한다.
FROM employees
WHERE department_id=20 or department_id=60;

--intersect(교집합)
SELECT department_id, first_name, last_name
FROM employees
WHERE department_id=20 or department_id=40
INTERSECT
SELECT department_id, first_name, last_name --가져오는 column의 데이터가 같아야 한다.
FROM employees
WHERE department_id=20 or department_id=60;

--minus(차집합)
SELECT department_id, first_name, last_name
FROM employees
WHERE department_id=20 or department_id=40
MINUS
SELECT department_id, first_name, last_name --가져오는 column의 데이터가 같아야 한다.
FROM employees
WHERE department_id=20 or department_id=60;

--=================================================
SQL(structured query language)합수
1.단일행함수 : 행 하나당 하나의 결과를 출력(문자함수, 숫자함수, 날짜함수, 변환함수, 일반함수)
2.복수행함수 : 행 여러 개당 하나의 결과를 출력한다.(합계, 평균, 최대, 최소, 갯수) --여러 행을 대상으로 해서 결과가 나옴
--=================================================
--SELECT문에서는 반드시 테이블명을 명시해야 한다.
--그래서 SELECT절에 식이나 특정함수를 이용해서 결과값을 가져올 때
--사용할 수 있는 DUAL이라는 테이블을 제공하고 있다. (상기 첫번째 줄의 조건을 만족시켜야 하기 때문이다)
SELECT 3+1
FROM dual; --가상의 테이블 같은 개념인 듯

SELECT sysdate
FROM dual;

=====================================
--단일행
--문자함수
--단어의 첫글자만 대문자로 변경해 주는 함수이다.

SELECT initcap('korea hello')
FROM dual;

SELECT upper('korea')
FROM dual;

SELECT first_name, upper(first_name),
        last_name, upper(last_name)
FROM employees;

--모든 문자를 소문자로 변경해주는 함수이다.
SELECT lower('KOREA')
FROM dual;

SELECT first_name, lower(first_name),
        last_name, lower(last_name)
FROM employees;
========================================
SELECT first_name, salary
FROM employees
WHERE upper(first_name) like upper('%Ja%') -- 크... 지렸다..

--문자의 길이를 리턴해주는 함수
SELECT length('korea')
FROM dual;

SELECT length('한국')
FROM dual;

--문자의 길이를 바이트로 구해서 리턴해주는 함수
SELECT lengthb('korea')
FROM dual;

SELECT lengthb('한국')
FROM dual;
-------------------------------[
CREATE TABLE user1(
    data varchar2(5)
);

INSERT INTO user1(data)
VALUES('korea');

INSERT INTO user1(data)
VALUES('한국'); -- 6byte가 필요하므로 오류 발생

--특정범위의 문자를 추출해주는 함수이다.
--substr('문자', 시작위치, 갯수)
SELECT substr('oracle test', 1, 4) --여기서 마지막 4는 갯수를 의미. java는 미만이었다.
FROM dual;

SELECT substr('oracle test', -3, 4) --뒤에서 세번째부터 4개
FROM dual;

SELECT substr('오라클 테스트', 3, 4) --공백도 문자1개로 인식함
FROM dual;

SELECT substrb('oracle test', 2, 4) --영어는 어차피 1바이트씩 먹음
FROM dual;

SELECT substrb('오라클 테스트', 4, 4)
FROM dual;

--특정문자의 인텍스를 추출해주는 함수
SELECT instr('korea', 'or')
FROM dual;

SELECT instr('한국자바', '자')
FROM dual;

--특정문자의 바이트 인텍스를 추출해주는 함수
SELECT instrb('korea', 'or')
FROM dual;

SELECT instrb('한국자바', '자')
FROM dual;

--주어진 문자열에서 왼쪽으로 특정문자를 채우는 함수
SELECT lpad('korea', 8, '*')
FROM dual;

--주어진 문자열에서 오른쪽으로 특정문자를 채우는 함수
SELECT rpad('korea', 8, '*')
FROM dual;

--주어진 문자열에서 왼쪽의 특정문자를 삭제하는 함수
SELECT ltrim('***korea', '*')
FROM dual;

--주어진 문자열에서 오른쪽의 특정문자를 삭제하는 함수
SELECT rtrim('korea***', '*')
FROM dual;

--주어진 문자열에서 양쪽 특정문자를 삭제하는 함수
SELECT trim('*' from '**korea***')
FROM dual;

--주어진 문자열에서 오른쪽의 공백제거
SELECT length(rtrim('korea   ')) -- 공백제거 여부를 length함수로 확인
FROM dual;

--주어진 문자열에서 양쪽의 공백제거
SELECT length(trim(' ' from '   korea   '))
FROM dual;

--또는
SELECT length(trim('   korea   '))
FROM dual; --이게 더 효율적!

--주어진 문자의 아스키 코드값을 구하는 함수

SELECT ascii('A')
FROM dual;

--주어진 아스키 코드값의 문자를 구하는 함수
SELECT chr(65)
FROM dual;

--주어진 문자를 연결하는 함수
SELECT concat('java', 'jsp')
FROM dual;

SELECT 'java' || 'jsp'
FROM dual;

---------------
숫자함수
---------------
--3.55을 소수점 1의 자리까지 구하시오(반올림)
SELECT round(3.55, 1)
FROM dual;

SELECT round(42523.55, -1)
FROM dual;

SELECT round(42523.55, 0)
FROM dual;

--256.78 무조건 올림한다.(올림)
SELECT ceil(256.78)
FROM dual;

--289.78에서 소수이하는 무조건 버린다.(버림)
SELECT floor(289.78)
FROM dual;

--2의 3승 (거듭제곱)
SELECT power(2,3)
FROM dual;


--25d의 제곱근
SELECT sqrt(25)
FROM dual;

--나머지
SELECT mod (10, 3)
FROM dual;


----------
날짜함수
-----------
--현재 시스템에서 제공해주는 오늘의 날짜 구하는 함수
SELECT sysdate
FROM dual;

SELECT sysdate+1
FROM dual;

-첫번째 인자의 달에 두번째 인자값을 더한 날짜를 반환
SELECT add_months(sysdate, 10) --10개월을 더함
FROM dual;

======================================================
변환형 함수
숫자              문자          날짜
to_number() <-> to_char() <->   to_date()   --숫자와 날짜는 직접적으로 못 바꾼다. 문자가 중개자 역할
=======================================================
-- 1 숫자 -> 문자
-- 첫번째 인자값을 두번째 인자값의 형식으로 변환해주는 함수
SELECT to_char(2532, '99999,999.9') --소수점 자릿수는 9를 쓰든, 0을 쓰든 데이터가 없으면 0으로 표시해줌
FROM dual;

SELECT to_char(2532, '009,999.00')
FROM dual; --9는 실제 데이터가 없으면 무시, 0은 찍어줌. 친절한 놈.

--각 나라의 통화를 표현해 줄 때 L기호를 사용
SELECT to_char(2532, 'L999,999.99')
FROM dual;

--2 날짜 -> 문자
SELECT to_char(sysdate, 'yyyy-mm-dd hh:mi:ss day')
FROM dual;

SELECT to_char(sysdate, 'yyyy-mm-dd hh:mi:ss dy')
FROM dual;

SELECT to_char(sysdate, 'yyyy-mm-dd hh24:mi:ss dy')
FROM dual;

------------------------------------
to_number()
문자 -> 숫자
------------------------------------
SELECT '253' || '12'
FROM dual;

SELECT concat('253', '12')
FROM dual;

SELECT '253'+'12' --자바랑 다르다!
FROM dual;

SELECT to_number('253') + to_number('12')
FROM dual;

-------------------------
to_date()
문자 -> 날짜
-------------------------
SELECT to_date('2013-10-14') --이거다!!
FROM dual;

SELECT first_name, hire_date
FROM employees;
============================================================================
-- hire_date(입사일)을 이용해서
--'홍길동님은 2003년 1월 3일에 입사했습니다'로 출력하는 query를 작성하시오

SELECT first_name || '님은 '
        || to_char(hire_date, 'yyyy') || '년 '        
        || ltrim(to_char(hire_date, 'mm'), '0') || '월 ' 
        || ltrim(to_char(hire_date, 'dd'), '0') || '일에 입사했습니다.'  
        AS 입사일 --컬럼명 설정
FROM employees;

--alias 에서 ""를 씀.

--------------------------------------
일반함수
nvl()
--------------------------------------
--nvl(컬럼, 대체값) : 첫번째 인자값이 null이면 0으로 대체해서 출력한다.
--대체할 값이 숫자이면 두번째 인자값에 숫자를 지정한다.
--대체할 값이 문자이면 두번째 인자값에 문자를 지정한다.
--대체할 값이 날짜이면 두번째 인자값에 날짜를 지정한다.

--commission_pct컬럼의 값이 null인 경우 0으로 대체해서 출력
SELECT commission_pct, nvl(commission_pct, 0)
FROM employees;

SELECT first_name, manager_id, nvl(to_char(manager_id), 'ceo') --숫자를 일단 문자로 바꿔야
FROM employees;

--nvl2(컬럼, 대체1, 대체2) : 컬럼의 값이 null이 아니면, 대체1로, null이면 대체2로 출력
SELECT commission_pct, nvl2(commission_pct, 1, 0)
FROM employees;

-----------------------------------
일반함수
decode()
-----------------------------------
--decode(컬럼 또는 연산이나 함수의 결과, 조건1, 값1, 조건2, 값2, 조건3, 값3, 그 밖의 값)
--department_id 값이 10이면 'AA', 20이면 'BB', 30이면 'CC', 그 밖의 값은 'DD'
--java의 switch_case문과 비슷
--컬럼의 값이 조건의 값과 정확히 일치해야 한다.

SELECT first_name, department_id,
        decode(department_id, 10, 'ACCOUNTING', 20, 'RESEARCH', 30, 'SALES', 40, 'OPERATIONS', 'OTHERS')
        as CODE -- 이 분이 바로 alias. 영문이므로 "" 필요없다. 나중에 이걸 가지고 데이터를 불러오게 됨. 협업에서 중요할 듯.        
FROM employees;

--직급이 'PR_REP' 인 사원은 5%, 'SA_MAN'인 사원은 10%, 'AC_MGR'인 사원은 15%, 'PU_CLERK' 인 사원은 20%를 인상
SELECT job_id, salary,
        decode(job_id,
        'PR_REP', salary*1.05,
        'SA_MAN', salary*1.1,
        'AC_MGR', salary*1.15,
        'PU_CLERK', salary*1.2,
        salary)
        as newsal
FROM employees;

-----------------------------
일반함수
case()
-----------------------------
case when 조건1 then 결과1 -- 조건은 논리값이 나오면 된다.
    when 조건2 then 결과2
    when 조건3 then 결과3
    else 결과n
end

자바의 다중 if~else제어문과 비슷하다.
--위 예제를 case문으로 처리하면..
SELECT first_name, department_id,
    case when department_id=10 then 'ACCOUNTING'
        when department_id=20 then 'RESEARCH'
        when department_id=30 then 'SALES'
        when department_id=40 then 'OPERATIONS'
        else 'others'
    end as code
FROM employees;

--입사일에서 월이 1-3이면 '1사분기', 4-6이면 '2사분기', 7-9이면 '3사분기', 10-12이면 '4사분기'로 처리하고
--first_name, hire_date, 분기로 출력하시오

SELECT first_name, hire_date, 
    case when substr(to_char(hire_date), 4, 2) <=03 then '1사분기' --substr('문자', 시작위치, 갯수)
       when substr(to_char(hire_date), 4, 2) <=06 then '2사분기'
       when substr(to_char(hire_date), 4, 2) <=09 then '3사분기'
    else '4사분기'
    end as new
FROM employees;

--선생님
SELECT first_name, hire_date, 
    case when to_char(hire_date, 'mm') <=3 then '1사분기' --substr('문자', 시작위치, 갯수)
       when to_char(hire_date, 'mm') <=6 then '2사분기'
       when to_char(hire_date, 'mm') <=9 then '3사분기'
    else '4사분기'
    end as "분기" --한글은 쌍따옴표 해야
FROM employees;

----------------------------
그룹함수(복수함수)
----------------------------
--max(컬럼) : 최대값
SELECT max(salary) --자바랑 달리 인자값을 여러 개 지정 가능(자바는 두 개)
FROM employees;

--min(컬럼) : 최소값
SELECT min(salary)
FROM employees; --결과 행이 하나만 나온다. 이게 중요하다.

SELECT count(commission_pct) --이 컬럼에서 null값을 제외한 데이터가 있는 행의 갯수를 리턴
as count
FROM employees;

SELECT count(*) --무조건 테이블에 저장돼 있는 데이터가 있는 행의 갯수를 리턴
as count
FROM employees;

--sum(컬럼) : 합계
SELECT sum(salary)
FROM employees;

--avg(컬럼) : 평균
SELECT avg(salary)
FROM employees;

SELECT to_char(avg(salary), '99999,999.9')
FROM employees;


SELECT first_name, count(*) --행이 107개, 1개 -- 출력되는 행의 갯수가 동일해야 한다.
FROM employees;
--단일함수와 복합함수는 병존할 수 없다.

--집계함수와 단순컬럼은 함께 사용할 수 없다.(출력되는 레코드 수가 다르기 때문)
--이런 경우 group절과 having 절을 쓰면 된다.

SELECT first_name, count(*)
FROM employees;

==============================================================================================
--그룹함수와 단순컬럼을 사용하기 위해서는, 단순컬럼을 그룹화해야 한다.(Group by)
--각 부서별 사원의 수를 구해야 하는 경우
SELECT department_id, count(*)
FROM employees
GROUP BY department_id --단순컬럼을 가지고 그룹을 지어준다.
ORDER BY department_id; --지정 안하면 오름차순, 이때 널 값은 맨 밑

--50이하인 부서에 대해서 null이 아닌 부서별의 직원수를 출력하시오.
SELECT department_id, count(*)
FROM employees
WHERE department_id is not null
GROUP BY department_id
HAVING department_id <=50 --그룹에 대한 조건은 having 절에서 처리한다.
ORDER BY department_id;

--부서별 최소급여, 최대급여를 출력하시오. (부서별 오름차순)
SELECT department_id as "부서" , min(salary) as min, max(salary) as max --alias는 이렇게 써야.
FROM employees
GROUP BY department_id
ORDER BY department_id;

--업부멸(job_id) 급여합계를 출력하시오.
SELECT job_id, sum(salary) as "급여합계"
FROM employees
GROUP BY job_id
ORDER BY job_id;
















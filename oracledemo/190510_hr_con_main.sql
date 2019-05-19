--테이블에서 컬럼에 해당하는 데이터를 검색하라.

SELECT colunm1, column2, n column3
FROM table명;

SELECT Job_Id, Job_title, min_salary, max_salary
FROM jobs;

SELECT * FROM jobs;

/*
컬럼명, 테이블에 별칭을 지정할 수 있다.
별칭(alias)으로 한글이나 영문공백을 사용할 때는  " "(따옴표)를 지정한다.
*/

SELECT salary, salary*10 FROM employees;
SELECT salary, salary*10 AS bonus FROM employees; --alias를 준 경우
SELECT salary, salary*10 AS "b o n u s" FROM employees; --공백은 묶어줘야
SELECT salary, salary*10 AS 보너스 FROM employees; --한글은 안 묶어줘오 됨

SELECT last_name || '님의 월급은' || salary || '입니다.' AS name FROM employees; -- 문자열 연결 ||

SELECT first_name FROM employees;
--column 중복값 제거
SELECT DISTINCT first_name FROM employees; --중복제거는 한 번만 사용해야(데이터 자체를 없애는 건 아닌 듯)

SELECT DISTINCT first_name, last_name FROM employees;

--select 입력순서 (셀, 프, 왜, 그, 래, 요)
SELECT 컬럼명, 컬럼명
FROM 테이블명 (여기까지 필수)
WHERE 컬럼명 = '값'
GROUP BY 컬럼명
HAVING 컬럼명 = '값'
ORDER BY 컬럼명 desc;

--select 해석순서
FROM 테이블명 (여기까지 필수)
WHERE 컬럼명 = '값'
GROUP BY 컬럼명
HAVING 컬럼명 = '값'
SELECT 컬럼명, 컬럼명
ORDER BY 컬럼명 desc;

--employees테이블에서 salary이 3000미만일 때의
--first_name, salalry을 출력하라.

SELECT first_name, salary
FROM employees
WHERE salary<3000;

--emplyee테이블에서 first_name컬럼의 값이 'David' 아닐 때의
--first_name, salary을 출력하시오.

SELECT first_name, salary
FROM employees
WHERE first_name != 'David'; -- 오라클에서 같다는 =

SELECT first_name, salary
FROM employees
WHERE first_name <> 'David'; -- 다르다로 <>쓰기도
--where절에는 결과값으로 논리값이 나와야. -- 이건 좀 아닌 거 같다. 그냥 해당 조건을 만족시키면 된다.

--&&(and) || (or)
--employees테이블에서 salary이 3000, 9000, 17000일때 first_name, hire_date, salary을 출력하라.

SELECT first_name, hire_date, salary
FROM employees
WHERE salary = 3000 or salary = 9000 or salary = 17000; -- 여기서 대입이 아니라 같다는 의미

-- IN의 활용
SELECT first_name, hire_date, salary
FROM employees
WHERE salary IN(3000,9000,17000);

--employees 테이블에서 salary이 3000부터 5000까지일 때의 first_name, hire_name, salary을 출력하라.
SELECT first_name, hire_date, salary
FROM employees
WHERE salary>=3000 AND salary<=5000;

SELECT first_name, hire_date, salary
FROM employees
WHERE salary BETWEEN 3000 AND 5000;

--employees테이블에서 job_id가 'IT_PROG'이 아닐 때 first_name, email, job_id을 출력하라.
SELECT  first_name, email, job_id
FROM employees
WHERE job_id <> 'IT_PROG'; -- WHERE NOT(job_id = 'IT_PROG');

---------------------------------------------
SELECT first_name, hire_date, salary
FROM employees
WHERE NOT (salary BETWEEN 3000 AND 5000);

SELECT first_name, hire_date, salary
FROM employees
WHERE salary NOT BETWEEN 3000 AND 5000;
---------------------------------------------
SELECT first_name, salary, commission_pct
FROM employees
WHERE commission_pct IS null; --null을 비교연산자를 사용하지 못한다. is를 사용해야.

SELECT first_name, salary, commission_pct
FROM employees
WHERE commission_pct IS not null;

--포함은 like 연산자
SELECT first_name, salary, email
FROM employees
WHERE first_name LIKE '%der%'; -- der로 끝나는// %der% der이 중간에 // der% der로 끝나는
-- %는 모든. ?는 자바에서 임의의 문자. 오라클에서는 _
SELECT first_name, salary, email
FROM employees
WHERE first_name LIKE 'A_%exander';

-- =는 완전히 같아야 함

/*
WHERE절에서 사용된 연산자 3가지 종류
1. 비교연산자 : = > >= < <= != <> ^=(다르다)
2. SQL연산자 : BETWEEN a AND b, IN, LIKE, IS NULL
3. 논리연산자 : AND, OR, NOT

우선순위
1. 괄호()
2. NOT연산자
3. 비교연산자, SQL 연산자
4. AND
5. OR
*/
===========================================================================
--employees 테이블에서 job_id을 오른차순을
--first_name, email, job_id을 출력

SELECT first_name, email, job_id
FROM employees
ORDER BY job_id ASC; -- 별도로 명시하지 않으면 오른차순으로 인식

----------------------------------------------------------------
SELECT department_id, first_name, salary
FROM employees
ORDER BY department_id ASC, first_name DESC; --쉬표로 구분!
----------------------------------------------------------------
SELECT first_name, salary, hire_date
FROM employees
ORDER BY hire_date DESC;
----------------------------------------------------------------
SELECT first_name, job_id, salary
FROM employees
WHERE job_id = 'FI_ACCOUNT'
ORDER BY salary DESC;

SELECT * FROM TAB;


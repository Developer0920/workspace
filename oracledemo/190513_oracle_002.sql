=========================================================================
조인(join) : 여러 개의 테이블에서 원하는 데이터를 추출해 주는 쿼리문

join은 oracle제품에서 사용되는 oracle용 join이 있고
모든 제품에서 공통적으로 사용되는 표준(ansi) join이 있다.
=========================================================================
--오라클과 표준 두 가지를 알아야.

1 cartesian product(카티션 곱) 조인 : 테이블 행의 갯수만큼 출력해 주는 조인이다.

(1) oracle용 cartesian product
    SELECT department_id, first_name, employees.job_id, job_title --job_id의 경우 두 테이블에 다 존재. 따라서 별도로 표기를 해줘야 한다.
    FROM employees, jobs;
    
    --근데 길다.. 따라서.. 
    --카티션 곱 조인
    SELECT department_id, first_name, e.job_id, job_title 
    FROM employees e, jobs j; --여기서 축약형을 표시하는 것 (107*19 = 2033개의 행이 만들어짐)
    
(2) ansi용 cartesian product (cross join)
    SELECT e.department_id, e.first_name, e.job_id, j.job_title
    FROM employees e cross join jobs j;
    
2 equi join (ansi : inner join)
    가장 많이 사용되는 조인방법으로 조인 대상이 되는 두 테이블에서
    공통적으로 존재하는 컬럼의 값이 일치되는 행을 연결하여 결과를 생성(추출)하는 방법이다.
    
(1) oracle equi join
SELECT  e.department_id, e.first_name, e.job_id,
        j.job_id, j.job_title
FROM employees e, jobs j
WHERE e.job_id = j.job_id -- 일반적으로 관계설정이 돼 있음.. 각각 foreign key, primary key로 돼 있음. 안 돼 있어도 두 개의 컬럼에 입력된 데이터가 같으면 가능하다.
-- null이 0개이므로 총 107개 출력해줌

SELECT job_id
FROM employees
WHERE job_id is null; --0개

(2) ansi용 equi join(inner join)
SELECT  e.department_id, e.first_name, e.job_id,
        j.job_id, j.job_title
FROM employees e inner join jobs j
ON e.job_id = j.job_id; --조인을 WHERE에서 하지 않음. 이렇게 별도로 작성

-------------------------------------------------------------------------------
--employees와 departments테이블에서 사원번호(employee_id), 부서번호(department_id), 부서명(department_name)을 검색하시오.
-------------------------------------------------------------------------------
SELECT e.employee_id, e.department_id, d.department_name --부서번호는 아무데서나 가져와도 됨
FROM employees e, departments d
WHERE e.department_id = d.department_id; --106개 추출

SELECT department_id
FROM employees
WHERE department_id is null; -- 역시나 null이 하나 있었다!

-----------------------------------------------
--employees와 jobs테이블에서 사원번호(employee_id), 업무번호(job_id), 업무명(job_title)을 검색하시오.

SELECT e.employee_id, e.job_id ,j.job_title
FROM employees e, jobs j
WHERE e.job_id = j.job_id;

--job_id가 'FI_MGR'인 사원이 속한 급여(salary)의 최소값(min_salary), 최대값(max_salary)을 출력하시오.
SELECT e.first_name, j.job_id, e.salary, j.min_salary, j.max_salary
FROM employees e, jobs j
WHERE e.job_id = j.job_id
    AND e.job_id = 'FI_MGR';
    
--부서가 'seattle' 에 있는 부서에서 근무하는 직원들의 first_name, hire_date, department_name, city를
--출력하는 SELECT문장을 작성
SELECT e.first_name, e.hire_date, d.department_name, l.city
FROM locations l, employees e, departments d
WHERE e.department_id = d.department_id
    AND l.location_id = d.location_id
    AND l.city = 'Seattle';
    
--ansi버전
SELECT e.first_name, e.hire_date, d.department_name, l.city
FROM employees e inner join departments d
        on e.department_id = d.department_id
    inner join locations l
        on d.location_id = l.location_id
WHERE l.city = 'Seattle';

--20번 부서의 이름과 그 부서에 근무하는 사원의 이름(first_name)을 출력
SELECT d.department_name, e.first_name
FROM departments d, employees e
WHERE d.department_id = e.department_id
    AND d.department_id = 20;
    
--1400, 1500번 위치의 도시 이름과 그곳에 있는 부서의 이름을 출력하시오.
SELECT l.location_id, city, department_name
FROM locations l, departments d
WHERE l.location_id = d.location_id
    AND l.location_id IN(1400, 1500);

3. NATURAL JOIN
    NATURAL JOIN은 두 테이블 간의 동일한 이름을 갖는 모든 컬럼들에 대해 EQUI(=) JOIN을 수행한다.
    그리고 SQL Server에서는 지원하지 않는 기능이다.
    
    SELECT first_name, salary, department_id, department_name
    FROM employees natural join departments --쓰진 않음. 그냥 알아만 둘 것
    
4. non_equi join --일치하는 게 아니라, 어떤 범위
 (=)연산자를 제외한 >=, <=, >, < 등의 연산자를 이용해서 조건을 지정하는 조인방법이다.
 
  SELECT e.first_name, e.salary, j.min_salary, j.max_salary, j.job_title
  FROM employees e, jobs j
  WHERE e.job_id = j.job_id  
  AND e.salary >= j.min_salary
  AND e.salary <= j.max_salary;
  
(2)ansi용 non_equi join
 SELECT e.first_name, e.salary, j.min_salary, j.max_salary, j.job_title
  FROM employees e join jobs j
  ON e.job_id = j.job_id
    AND e.salary >= j.min_salary
    AND e.salary <= j.max_salary; 
    
5.outer join --전체상품에 대한 판매량 데이터 추출하는 경우
    한쪽 테이블에는 데이터가 있고 다른 반대쪽에는 데이터가 없는 경우에
    데이터가 있는 테이블의 내용을 모두 가져오는 조인이다.
    
    (1) oracle 용 outer join --일치되는 게 없지만 가져오고 싶은 경우
    SELECT e.first_name, e.salary, d.department_id, e.department_id
    FROM employees e, departments d
    WHERE e.department_id = d.department_id
    ORDER BY e.employee_id; --106개를 가져옴. 근데.. NULL값이 있는 것도 가져오고 싶다. 이럴 때..
    
    SELECT e.first_name, e.salary, d.department_id, e.department_id
    FROM employees e, departments d
    WHERE e.department_id = d.department_id(+) --NULL로 돼 있는 걸 가져올 때.. 같이 딸려오는 것도 NULL로 가져옴. Kimberely 참조.
    ORDER BY e.employee_id; --이게 left조인이다. ㅅㅂ 좆같이 만들어 놨네..
    
    --반대로 하면..
    SELECT e.first_name, e.salary, d.department_id, e.department_id
    FROM employees e, departments d
    WHERE e.department_id(+) = d.department_id -- (+)된 곳은 데이터를 전부 가져온다.
    ORDER BY e.employee_id;
    
 (2) ansi용 outer join   --처음 예제랑 같음
    SELECT e.first_name, e.salary, d.department_id, e.department_id
    FROM employees e left outer join departments d
    ON e.department_id = d.department_id -- (+)된 곳은 데이터를 전부 가져온다.??
    ORDER BY e.employee_id;
    
    --반대로 하면..
    SELECT e.first_name, e.salary, d.department_id, e.department_id
    FROM employees e right outer join departments d
    ON e.department_id = d.department_id -- ansi랑 oracle이랑 반대다.
    ORDER BY e.employee_id;
    
    
6. self join --상사에 대한 정보 찾기는 동일한 테이블 내에서 이루어진다. 두 개의 테이블로 나눠서 생각할 것!
하나의 테이블을 두 개의 테이로 설정해서 사용하는 조인방법
    (1) oracle용 self join
    SELECT e.employee_id as "사원번호",
            e.first_name as "사원이름",
            e.manager_id as "관리자번호",
            m.first_name as "대장"
    FROM employees e, employees m -- 크....
    WHERE e.manager_id = m.employee_id
    
    (2) ansi용 self join
    SELECT e.employee_id as "사원번호",
            e.first_name as "사원이름",
            e.manager_id as "관리자번호",
            m.first_name as "대장"
    FROM employees e join employees m -- 크....
    ON e.manager_id = m.employee_id
    
    
==========================================================================================
-----------------------------------------------------------------------------------------
서브쿼리(subquery)
 하나의 SQL문안에 포함되어 있는 또 다른 SQL문을 말한다.
 서브쿼리는 알려지지 않은 기준을 이용한 검색을 위해 사용한다.
 서브쿼리는 메인쿼리가 서브쿼리를 포함하는 종속적인 관계이다.
 서브쿼리는 메인쿼리의 컬럼을 모두 사용할 수 있지만 메인쿼리는 서브쿼리의 컬럼을 사용할 수 없다. 
 질의 결과에 서브쿼리 컬럼을 표시해야 한다면 조인방식으로 변환하거나 함수, 스칼라 서브쿼리(scarar subquery)등을 사용해야 한다. 
 조인은 집합간의 곱(Product)의 관계이다. 
 
외부 쿼리 (메인쿼리)
 :일반 쿼리를 의미합니다.
2)스칼라 서브쿼리
 :SELECT 절에 쿼리가 사용되는 경우로, 함수처럼 레코드당 정확히 하나의 값만을 반환하는 서브쿼리입니다.
3)인라인 뷰
 :FROM 절에 사용되는 쿼리로, 원하는 데이터를 조회하여 가상의 집합을 만들어 조인을 수행하거나 가상의 집합을 다시 조회할 때 사용합니다.

--1)일반적인 서브쿼리는 where절에 사용.

서브쿼리를 사용할 때 다음 사항에 주의
  서브쿼리를 괄호로 감싸서 사용한다. 
  서브쿼리는 단일 행(Single Row) 또는 복수 행(Multiple Row) 비교 연산자와 함께 사용 가능하다. 
  단일 행 비교 연산자는 서브쿼리의 결과가 반드시 1건 이하이어야 하고 복수 행 비교 연산자는 서브쿼리의 결과 건수와 상관 없다. 
  서브쿼리에서는 ORDER BY를 사용하지 못한다. 
  ORDER BY절은 SELECT절에서 오직 한 개만 올 수 있기 때문에 ORDER BY절은 메인쿼리의 마지막 문장에 위치해야 한다.
  

서브 쿼리 사용가능한 위치
SELECT, FROM, WHERE, HAVING,ORDER BY 
INSERT문의 VALUES,
UPDATE문의 SET, CREATE문

서브쿼리의 종류는 동작하는 방식이나 반환되는 데이터의 형태에 따라 분류할 수 있다.
1 동작하는 방식에 따른 서브쿼리 분류
  Un-Correlated(비연관) : 서브쿼리가 메인쿼리 컬럼을 가지고 있지 않는 형태의 서브쿼리이다. --지금까지 했던 것
          메인쿼리에 값(서브쿼리가 실행된 결과)를 제공하기 위한 목적으로  주로 사용한다.
  Correlated(연관) : 서브쿼리가 메인쿼리 칼럼을 가지고 있는 형태의 서브쿼리이다. --아직 안 봄
          일반적으로 메인쿼리가 먼저 수행되어 읽혀진 데이터를 서브쿼리에서 조건이 맞는지 확인
	  하고자 할 때 주로 사용된다.  (EXISTS서브쿼리는 항상 연관 서브쿼리로 사용된다. 조건을 만족하는 1건만 찾으면
	  추가 검색을 하지 않는다.)
2 반환되는 데이터의 형태에 따른 서브쿼리 종류
  Single Row(단일행 서브쿼리) : 서브쿼리의 실행결과가 항상 1건 이하인 서브쿼리를 의미한다. 
          단일행 서브쿼리는 단일 행 비교 연산자와 함께 사용된다.
	  단일 행 비교 연산자는 =, <, <=, >, >=, <>이 있다.
  Multi Row(다중행 서브쿼리) : 서브쿼리의 실행 결과가 여러 건인 서브쿼리를 의미한다. 
          다중 행 서브쿼리는 다중 행 비교 연산자와 함께 사용된다. 
	  다중 행 비교 연산자에는 in, all, any, some, exists가 있다.
	      in : 메인쿼리의 비교조건('='연산자로 비교할 경우)이 서브쿼리의 결과 중에서
               하나라도 일치하면 참이다.
           any,some : 메인 쿼리의 비교 조건이 서브 쿼리의 검색 결과와 하나 이상이 일치하면
                참이다.
           all : 메인 쿼리의 비교 조건이 서브 쿼리의 검색 결과와 모든 값이 일치하면 참이다.
           exists : 메인 쿼리의 비교 조건이 서브 쿼리의 결과 중에서 만족하는 값이 하나라도
               존재하면 참이다.
  Multi Column(다중칼럼 서브쿼리) : 서브쿼리의 실행 결과로 여러 컬럼을 반환한다.
          메인쿼리의 조건절에 여러 컬럼을 동시에 비교할 수 있다. 
	  서브쿼리와 메인쿼리에서 비교하고자 하는 컬럼 갯수와 컬럼의 위치가 동일해야 한다.
============================================================================================================== 


SELECT first_name, last_name
FROM employees
WHERE first_name = 
    (SELECT first_name --결과는 하나여야 한다. 반드시 괄호를 써줘야 한다.
    FROM employee)

----------------------------------------------
--Lex 근무하는 부서명을 출력하시오.
SELECT department_id
FROM employees
WHERE first_name='Lex'

SELECT department_name
FROM departments
WHERE department_id =90;

----------------------------------
--조인을 활용 --일단 내가 할 줄 아는 것을 가지고 하자.
SELECT department_name
FROM departments d, employees e
WHERE e.department_id = d.department_id
    AND e.first_name = 'Lex'

--서브쿼리를 활용
SELECT department_name
FROM departments
WHERE department_id =
    (SELECT department_id
    FROM employees
    WHERE first_name='Lex');
    
--Lex와 같은 부서에 근무하는 사원 이름과 부서번호를 출력하시오.
SELECT first_name, department_id
FROM employees
WHERE department_id = 
    (SELECT department_id
    FROM employees
    WHERE first_name = 'Lex');
    
    
--'Lex' 와 동일한 업무(job_id)를 가진 사원의 이름(first_name), 업무(job_title), 입사일(hire_date)을 출력하시오.
SELECT job_id
FROM employees
WHERE first_name = 'Lex'


SELECT first_name, job_title, hire_date
FROM employees e, jobs j
WHERE e.job_id = j.job_id
    AND e.job_id =  -- j를 써도 됨. 중요한 건 뭐든 안 쓰면 안 됨.
        (SELECT job_id
        FROM employees
        WHERE first_name = 'Lex');

-- 'IT'에 근무하는 사원의 이름, 부서번호를 출력하시오.

SELECT first_name, department_id
FROM employees
WHERE department_id = 
        (SELECT department_id
        FROM departments
        WHERE department_name = 'IT'); --이게 좀 더 직관적인 듯

--'Bruce'보다 급여를 많이 받는 사원이름, 부서명, 급여를 출력하시오.
SELECT first_name, department_name, salary
FROM employees e, departments d
WHERE e.department_id = d.department_id
AND salary >
    (SELECT salary --비교연산자와 서브쿼리를 함께 사용하려면 서브쿼리의 '결과행' 이 하나여야 한다. 그럴 때는 in, or, some, any를 사용한다.
    FROM employees
    WHERE first_name = 'Bruce') --일반적으로 이게 하나가 아니다. 또 다른 Bruce가 입사할 수 있다. 따라서 primary key가 설정된 컬럼을 쓰는 게 좋다.
ORDER BY salary;
-----------------------------------------

--in
--Steven과 같은 부서에서 근무하는 사원의 이름, 급여, 입사일을 출력
SELECT first_name, salary, hire_date
FROM employees
WHERE department_id in( -- 이렇게 in을 쓰는 거다. 언제? 서브쿼리의 결과행이 여려 개 일 때.
    SELECT department_id
    FROM employees
    WHERE first_name = 'Steven');

--부서별로 가장 급여를 많이 받는 사원의 이름, 급여, 부서번호를 출력하시오.
SELECT first_name, salary, department_id
FROM employees
WHERE (department_id, salary) in (
--이렇게 묶어줘야 한다.
                                    SELECT department_id, max(salary) -- max(salary) 그룹을 지을 수 있는 조건
                                    FROM employees
                                    GROUP BY department_id
                                    /*ORDER BY department_id*/); --서브쿼리에서는 order by를 쓰면 안 된다.
                                    --메인쿼리와 서브쿼리의 결과열의 갯수가 같아야 함
=========================================================================================================================
--all
--30소속된 사원들중에서 급여를 가장 많이 받는 사원보다 더 많은 급여를 받는 사원의
--이름, 급여, 입사일을 출력하시오.(all)
--(서브쿼리에서 max()함수를 사용하지 않는다.)

SELECT first_name, salary, hire_date
FROM employees
WHERE salary > all( -- 이 조건을 모두 만족하는
                    SELECT salary
                    FROM employees
                    WHERE department_id = 30);
                    -- 서브쿼리의 결과행이 여러 개일 때 이걸 모두 만족하는 결과값을 출력하라. 이놈아.

--any                    
--부서번호가 30번인 사원들이 받는 최저급여보다 높은 급여를 받는 사원의 이름,
--급여, 입사일을 출력하시오. (min()함수를 사용하지 않는다.) (any)
SELECT first_name, salary, hire_date
FROM employees
WHERE salary > any(
                    SELECT salary
                    FROM employees
                    WHERE department_id = 30); --기가 막히네...


----exist
--20번 부서에 속한 사원이 있으면 사원들의 사원명, 입사일, 급여, 부서번호를 출력하시오
--무조건 있으면 true
SELECT first_name, hire_date, salary, department_id
FROM employees
WHERE exists (SELECT department_id -- 있니 없니? --대량의 데이터에서 셀렉트해서 가져올 때 사용
            FROM employees
            WHERE department_id = 20); -- 20000이면 F이므로 출력 결과가 없음.
--상사가 있는 경우 또는 없는 경우. 이런 식으로 사용.


            
            


        
        
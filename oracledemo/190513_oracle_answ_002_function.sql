------------------------------
--문제
------------------------------
1) 모든사원에게는 상관(Manager)이 있다. 하지만 employees테이블에 유일하게 상관이
   없는 로우가 있는데 그 사원(CEO)의 MGR컬럼값이 NULL이다. 상관이 없는 사원을
   출력하되 MGR컬럼값 NULL 대신 CEO로 출력하시오.
    SELECT manager_id, nvl(to_char(manager_id),'CEO')
    FROM employees
    ORDER BY manager_id desc;

2) 가장최근에 입사한 사원의 입사일과 가장오래된 사원의 입사일을 구하시오.
   SELECT max(hire_date), min(hire_date)
   FROM employees;
 
3) 부서별로 커미션을 받는 사원의 수를 구하시오.
   SELECT department_id, count(commission_pct)
   FROM employees
   WHERE commission_pct is not null
   GROUP BY department_id;
   
4) 부서별 최대급여가 10000이상인 부서만 출력하시오.   
  SELECT department_id,max(salary) 
  FROM employees 
  GROUP BY department_id
  HAVING max(salary)>=10000
  ORDER BY department_id;

5) employees 테이블에서 직종이 'IT_PROG'인 사원들의 급여평균을 구하는 SELECT문장을 기술하시오
   SELECT job_id,avg(salary)
   FROM employees
   WHERE job_id='IT_PROG'
   GROUP BY job_id;

6) employees 테이블에서 직종이 'FI_ACCOUNT' 또는 'AC_ACCOUNT' 인 사원들 중 최대급여를  구하는    SELECT문장을 기술하시오   
   SELECT max(salary)
   FROM employees
   WHERE job_id in('FI_ACCOUNT','AC_ACCOUNT');
  

7) employees 테이블에서 50부서의 최소급여를 출력하는 SELECT문장을 기술하시오
    SELECT min(salary) 
    FROM employees 
    WHERE department_id = 50;
    
8) employees 테이블에서 아래의 결과처럼 입사인원을 출력하는 SELECT문장을 작성하여라
   <출력:  2001		2002		2003
   	   1             7                6   >
   		   
   SELECT sum(decode(to_char(hire_date,'yyyy'),'2001',1,0)) as "2001",
   sum(decode(to_char(hire_date,'yyyy'),'2002',1,0)) as "2002",
   sum(decode(to_char(hire_date,'yyyy'),'2003',1,0)) as "2003"
   FROM	 employees;
    
9) employees 테이블에서 각 부서별 인원이 10명 이상인 부서의 부서코드,
  인원수,급여의 합을 구하는  SELECT문장을 작성하여라
   
  SELECT department_id, count(*), sum(salary)
  FROM employees
  GROUP BY department_id
  HAVING count(*)>=10;
  
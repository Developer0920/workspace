=========================================================================
조인(join) : 여러 개의 테이블에서 원하는 데이터를 추출해 주는 쿼리문

join은 oracle제품에서 사용되는 oracle용 join이 있고
모든 제품에서 공통적으로 사용되는 표준(ansi) join이 있다.
=========================================================================
--오라클과 표준 두 가지를 알아야.

1 cartesian product(카티션 곱) 조인 : 테이블 행의 갯수만큼 출력해 주는 조인이다.

1) oracle용 cartesian product
    SELECT department_id, first_name, employees.job_id, job_title --job_id의 경우 두 테이블에 다 존재. 따라서 별도로 표기를 해줘야 한다.
    FROM employees, jobs;
    
    --근데 길다.. 따라서.. 
    --카티션 곱 조인
    SELECT department_id, first_name, e.job_id, job_title 
    FROM employees e, jobs j; --여기서 축약형을 표시하는 것 (107*19 = 2033개의 행이 만들어짐)

SELECT *
FROM departments
WHERE lower(department_name) Like LOWER('%der%');

SELECT * FROM mem;  

CREATE TABLE mem (
    num number,
    name varchar(50),
    age number,
    loc varchar2(100)
);

CREATE SEQUENCE mem_num_seq
START WITH 1
INCREMENT BY 1
Nocache
NOCYCLE;


INSERT INTO mem VALUES(mem_num_seq.nextval, '홍길동', 30, '서울');
commit;

select * from employees;



SELECT b.*
FROM ((SELECT rownum as rm, a.* 
       FROM (SELECT *
            FROM employees
            ORDER BY employee_id ) a)
        ) b
WHERE b.rm >=31 AND b.rm<=35


��(view)
1) �������� ���̺��� �ٰ��� ������ ���� ���̺��� �ǹ��Ѵ�.
2) �⺻���̺��� �Ļ��� ��ü�μ� �⺻���̺� ���� �ϳ��� �������̴�.
3) ����ڿ��� �־��� �並 ���ؼ� �⺻ ���̺��� ���������� ����ϰ� �Ѵ�.
4) �並 �����ϱ� ���� ���������� �����͸� �����ϰ� �ִ� �������� ���̺��� �����ؾ� �ϴ¿� �̸� �⺻ ���̺��̶� �Ѵ�.

-�������� �� �ڵ� ����

--sys, system���� �����ؼ� 'HR' ������ �־��� ���� Ȯ��
SELECT * FROM DBA_SYS_PRIVS
WHERE grantee = 'HR'; --�ý��۰������� ���� �ش� ������ ������ Ȯ��. �並 �����ϱ� ���ؼ�.

--���࿡ 'HR' ������ view������ ������ �Ʒ��� ���� ����
sql> grant create view to hr; --hr ������ view ���� �ο�
--------------------------------------------------------------------------------------------
SELECT * FROM employees
WHERE employee_id=100;

/*���� ���� ���� �����͸� �˻��ϱ� ���ؼ� select������ ��� ����ϴµ�, �̴� �۾��� ���ŷο��� �ʷ�.
�̷� ������ �ذ��ϱ� ���� ���� ������ ��(VIEW)�̴�. */

--���� ����ϴ� select ������ ��� �����Ѵ�.
CREATE VIEW emp_view --���� ������ �̿��ؼ� �並 ������
AS
SELECT * FROM employees
WHERE employee_id = 100; --�䰡 �����Ǿ���.

SELECT * FROM emp_view; --� ����ڿ��� view�� �����ϴ� ������ �ο��ϸ�.. ������ �÷����� ������ �� �ְ� �ȴ�.

--������ emp_view ���� ������ Ȯ���Ѵ�.
DESC emp_view;

-- USER_VIEW data dictionary���� ���̺� �̸�(��)�� �ؽ�Ʈ(�並 ������ �� ����� ������) ���
SELECT view_name, text
FROM user_views;

/*select & from emp_view���� ���Ǹ� �ϸ� ����Ŭ�� user_views ����Ÿ ��ųʸ����� emp_view�� �� �̸��� ã�Ƽ� �̸� ������ �� �����
���� �������� ����� text���� �����Ų��. */

CREATE TABLE emp_copy
AS SELECT * FROM employees; --���������� �̿��ؼ� ���̺� ������, �������� ���� ������ �� ��. --�÷��������� �� �� �״�� �����´�.
-- primary key �� �� �����´�. .. not null�� �����´�. �ֳ��ϸ� not null�� �÷��������� ������ �ֱ� ����.
-- primary key�� �÷� �������� �����ϸ�?
-- �÷��������� ������ not null�� �����´�. (���� �߿��� �� �ƴ�)

SELECT * FROM emp_copy;
DESC emp_copy;
DESC employees;

CREATE VIEW emp_view101
AS
SELECT first_name FROM emp_copy
SELECT * FROM emp_view101;

WHERE employee_id = 100;

SELECT * FROM emp_view100;

--�並 ���� ���� ���̺� ���Ե� �����ϴ�.
--emp_view100�� ���ڵ� ����
INSERT INTO emp_view100(employee_id, first_name, last_name, email, hire_date, job_id)
VALUES(10, 'John', 'Tom', 'john@daum.net', sysdate, 'AC_VP');

SELECT * FROM emp_view100; --employee_id = 100 �� ���� �������� ������ 10���� �� ��Ÿ��.
SELECT * FROM emp_copy
WHERE employee_id = 10;

-- �並 ����ϴ� ����
-- 1) Ư�� ���� ���������� ��
-- 2) �������� �����ؼ� ������ �� ���



UPDATE emp_view100
SET first_name = 'Park'
WHERE employee_id = 100;

SELECT * FROM emp_copy;
SELECT * FROM emp_view100;
SELECT * FROM employees;

DELETE from emp_view100
WHERE employee_id = 100;

�並 ����ϴ� ����
1) �����ϰ� �� �������� ��� �����ϸ� ������ �ܼ�ȭ��ų �� �ִ�.
2) ���ȿ� �����ϴ�.

���� ����
 : �並 �����ϱ� ���� ���� �⺻ ���̺��� ������ ���� �ܼ���(simple view)�� ���պ�� �����Ѵ�.

�ܼ� ��
 : �並 �����ϱ� ���� �⺻���̺� �ϳ� ���
-- ������ �÷����� ������ ���� �ִ�.
-- ��� ��� �� ���� �÷����� ������� �ʰ� ���⼭ ������ ��¸��� ����Ѵ�.
CREATE VIEW emp_view10(�����ȣ, �̸�, �μ���ȣ)
AS
SELECT employee_id, first_name, department_id
FROM emp_copy
WHERE department_id = 10;

SELECT * FROM emp_view10;

SELECT �����ȣ, �̸�, �μ���ȣ
FROM emp_view10;

SELECT employee_id, first_name, department_id
FROM emp_view10; --ORA-00904: "DEPARTMENT_ID": invalid identifier �̷��� ���. �ٷ� �̷� ������ ������ �����Ǵ� ��!!

----------------------------
SELECT * FROM DBA_SYS_PRIVS
WHERE grantee= 'HR'; --hr������ �־��� ����
----------------------------

���պ�
 : �� ���� �� �� �� �̻��� �⺻ ���̺�� ���� (�Ϲ������� ����)
 CREATE TABLE dept_copy
 AS
 SELECT * FROM departments;
 
 --�� ���� �⺻ ���̺�� emp_dept_join �� ����
 CREATE VIEW emp_dept_join
 AS
 SELECT e.employee_id, e.first_name, d.department_name --SELECT�� ������ �並 �����ϴ� �Ŵ�.
 FROM emp_copy e, dept_copy d
 WHERE e.department_id = d.department_id;
 
 --emp_dept_join �� ��ȸ
 SELECT * FROM emp_dept_join; --�̷��� ������ ���� �並 ������ ��ȸ�� �ϸ� �۾��� ������ ����.
 
 --�� ��ųʸ� �˻�
 SELECT view_name, text from user_views;
 
 --�並 ������ ����. 
 DROP VIEW emp_view;
 SELECT * FROM emp_view; --ORA-00942: table or view does not exist
 
 --�� ����
 CREATE VIEW emp_dept_join2
 AS
 SELECT e.employee_id, e.first_name, d.department_name 
 FROM emp_copy e, dept_copy d 
 WHERE e.department_id = d.department_id;
 
 --�������� �ʴ� ���̺�
 SELECT * FROM emp; --ORA-00942: table or view does not exist
 
 --emp���̺��� �������� �����Ƿ� �����߻�
 CREATE VIEW emp_view2
 AS
 SELECT * FROM emp; --ORA-00942: table or view does not exist
 
 �並 ������ �� �����ϴ� FORCE/NOFORCE�ɼ�
  : �⺻������ �並 ������ ������ �⺻���̺��� �ִٴ� ���� �Ͽ� �������� �ۼ��Ѵ�.
   ������ �⺻ ���̺��� �������� �ʴ� ��쿡�� �並 ������ �� �ֵ�. �� ������ FORCE �ɼ��� �����Ǿ� �־�� �Ѵ�.
   Ư���� ������ ������ NOFORCE�ɼ��� �����Ǿ� �ִ� ������ �����Ѵ�.
 
 /*���� �������� �ʴ� emp�⺻���̺�� emp_view2�並 �����Ѵ�. ����� �������.
  �⺻���̺��� ������ �ݵ�� �� ������ FORCE�ɼ��� �����ؾ� �Ѵ�. */
  
  
 CREATE FORCE VIEW emp_view2
 AS
 SELECT * FROM emp;
 
 SELECT * FROM emp_view2;
 
 CREATE TABLE emp
 AS
 SELECT employee_id, first_name, salary
 FROM employees;
 
--------------------------------------------------------------------
 WITH CHECK OPTION
  : ������ �並 ���ؼ� �⺻���̺� ����� ������ ������ ���ϵ��� with check option ���� -- �̳� ���� ��
  
drop view emp_view200;
drop view emp_copy200;


CREATE TABLE emp_copy200
AS
SELECT employee_id, first_name, salary
FROM employees
WHERE employee_id = 200;


SELECT * FROM emp_view200;


CREATE VIEW emp_view200
AS
SELECT employee_id, first_name, salary
FROM emp_copy200
WHERE employee_id = 200;

--first_name�� ���� �����
UPDATE emp_view200
SET first_name = 'korea'
WHERE employee_id = 200;

SELECT * FROM emp_view200;
SELECT * FROM emp_copy200;
SELECT employee_id, first_name, salary
FROM employees
WHERE employee_id = 200;

UPDATE emp_view200
SET employee_id = 200
WHERE first_name = 'sample';
  
UPDATE emp_view200
SET employee_id = 500
WHERE first_name = 'korea';

 
DROP view emp_view300;

CREATE VIEW emp_view300
AS
SELECT employee_id, first_name, salary
FROM emp_copy200
WHERE employee_id = 500 WITH CHECK OPTION;

SELECT * FROM emp_view300;

--���� �Ұ���
UPDATE emp_view300
SET employee_id = 30
WHERE first_name = 'korea'; --ORA-01402: view WITH CHECK OPTION where-clause violation

UPDATE emp_view300
SET first_name = 'sample'
WHERE employee_id = 500; -- employee_id�� ������ �Ұ����� ��



CREATE VIEW emp_view400
AS
SELECT employee_id, first_name, salary
FROM emp_copy200
WHERE employee_id = 500 AND first_name = 'sample'  WITH CHECK OPTION;

UPDATE emp_view400
SET first_name = 'first'
WHERE employee_id = 500;

UPDATE emp_view400
SET employee_id = 900
WHERE first_name = 'sample'; -- �� �� ������ �� ����.

SELECT * FROM emp_view400;

DROP VIEW emp_view400

----------------------------------------------
WITH READ ONLY
 : �信 DML�� �����Ͽ� �⺻ ���̺��� ������ �� ���� ���
 
DROP TABLE emp_copy600;
 
CREATE TABLE emp_copy600
AS
SELECT employee_id, first_name, salary
FROM employees
WHERE employee_id = 100;

SELECT * FROM emp_copy600;

DROP TABLE emp_view600;

CREATE VIEW emp_view600
AS
SELECT *
FROM emp_copy600
WHERE employee_id = 100 WITH READ ONLY;

SELECT * FROM emp_view600;

--�����߻�  ORA-42399: cannot perform a DML operation on a read-only view
INSERT INTO emp_view600(employee_id, first_name, salary)
VALUES(20, 'aee', 500000);

--�����߻�
UPDATE emp_view600
SET first_name = 'test'
WHERE employee_id = 100;

--�����߻�
DELETE FROM emp_view600
WHERE employee_id = 100;

--constraint �� ��ü�� �ƴϴ�.

-- CREATE�� �����ϴ� ��.. TABLE, VIEW, ���� �������� ����. �ڵ���ȣ����
-----------------------------------------------------
 ������(sequence)
   ���̺� ���� ������ ���ڸ� �ڵ����� �����ϴ� �ڵ���ȣ �߻��̹Ƿ� ��������
   �⺻ Ű�� ����ϸ� ������� �δ��� ���� �� �ִ�.

   create sequence ��������
     start with  n - ������ ���۹�ȣ
     increment by n  -������ ����ġ
     nocache  -cache�� �޸𸮻��� ���������� �����ϰ� �ϴµ� �⺻���� 20�̴�.
              -nocache�� �޸𸮻��� �������� �������� �ʴ´�.
     nocycle  - cycle�� ������ ���������� �ִ밪���� ������ �Ϸ��ϸ� start with
                �ɼǿ� ������ ���۰����� �ٽ� �������� �����Ѵ�.
              - nocycle��  ������ �Ϸ�Ǹ� ������ �����Ѵ�.

    maxvalue n;- �������� ������ �ִ� �ִ밪�� �����Ѵ�.
              maxvalue�� �⺻���� ascending�϶� 1027��, descending �϶� -1�̴�.
-------------------------------------------------------------------------- 
DROP TABLE emp10;

CREATE TABLE emp10(
num number,
name varchar2(20)
);

CREATE SEQUENCE emp10_num_seq
START WITH 1
INCREMENT BY 1
NOCACHE 
NOCYCLE;

--currval : ���� ������ - nextval�� ������ ���� ��밡��
SELECT emp10_num_seq.currval FROM dual; --�������� �� ���� ���� �� �����Ƿ� ������ ���.
--�������� �����ϰ� nextval�� �� �� �̻� ����ؾ� �̰� ����� �� ����.

--�޸𸮻󿡼� ������ ���� �����ϰ� �ϰڴ�.. �̷� ��� cashe��.

--nextval : ���� ������
INSERT INTO emp10 values(emp10_num_seq.nextval, 'ggg');

SELECT * FROM emp10;

=====================================================================================================
-- ���ѿ� ���ؼ� �˾ƺ���. ������ �ϳ��� ��ü. CREATE ���

SHOW USER;
����� ����
/*����ڰ��� user01, ��й�ȣ tiger�� ���� ����� ������ �����ϳ� �����߻�, ����� ������ �ý��۰����ڿ��Ը� ������ ����. */

CREATE USER user01 identified by tiger; --01031. 00000 -  "insufficient privileges"





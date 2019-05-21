=========================================================================
����(join) : ���� ���� ���̺��� ���ϴ� �����͸� ������ �ִ� ������

join�� oracle��ǰ���� ���Ǵ� oracle�� join�� �ְ�
��� ��ǰ���� ���������� ���Ǵ� ǥ��(ansi) join�� �ִ�.
=========================================================================
--����Ŭ�� ǥ�� �� ������ �˾ƾ�.

1 cartesian product(īƼ�� ��) ���� : ���̺� ���� ������ŭ ����� �ִ� �����̴�.

(1) oracle�� cartesian product
    SELECT department_id, first_name, employees.job_id, job_title --job_id�� ��� �� ���̺� �� ����. ���� ������ ǥ�⸦ ����� �Ѵ�.
    FROM employees, jobs;
    
    --�ٵ� ���.. ����.. 
    --īƼ�� �� ����
    SELECT department_id, first_name, e.job_id, job_title 
    FROM employees e, jobs j; --���⼭ ������� ǥ���ϴ� �� (107*19 = 2033���� ���� �������)
    
(2) ansi�� cartesian product (cross join)
    SELECT e.department_id, e.first_name, e.job_id, j.job_title
    FROM employees e cross join jobs j;
    
2 equi join (ansi : inner join)
    ���� ���� ���Ǵ� ���ι������ ���� ����� �Ǵ� �� ���̺���
    ���������� �����ϴ� �÷��� ���� ��ġ�Ǵ� ���� �����Ͽ� ����� ����(����)�ϴ� ����̴�.
    
(1) oracle equi join
SELECT  e.department_id, e.first_name, e.job_id,
        j.job_id, j.job_title
FROM employees e, jobs j
WHERE e.job_id = j.job_id -- �Ϲ������� ���輳���� �� ����.. ���� foreign key, primary key�� �� ����. �� �� �־ �� ���� �÷��� �Էµ� �����Ͱ� ������ �����ϴ�.
-- null�� 0���̹Ƿ� �� 107�� �������

SELECT job_id
FROM employees
WHERE job_id is null; --0��

(2) ansi�� equi join(inner join)
SELECT  e.department_id, e.first_name, e.job_id,
        j.job_id, j.job_title
FROM employees e inner join jobs j
ON e.job_id = j.job_id; --������ WHERE���� ���� ����. �̷��� ������ �ۼ�

-------------------------------------------------------------------------------
--employees�� departments���̺��� �����ȣ(employee_id), �μ���ȣ(department_id), �μ���(department_name)�� �˻��Ͻÿ�.
-------------------------------------------------------------------------------
SELECT e.employee_id, e.department_id, d.department_name --�μ���ȣ�� �ƹ������� �����͵� ��
FROM employees e, departments d
WHERE e.department_id = d.department_id; --106�� ����

SELECT department_id
FROM employees
WHERE department_id is null; -- ���ó� null�� �ϳ� �־���!

-----------------------------------------------
--employees�� jobs���̺��� �����ȣ(employee_id), ������ȣ(job_id), ������(job_title)�� �˻��Ͻÿ�.

SELECT e.employee_id, e.job_id ,j.job_title
FROM employees e, jobs j
WHERE e.job_id = j.job_id;

--job_id�� 'FI_MGR'�� ����� ���� �޿�(salary)�� �ּҰ�(min_salary), �ִ밪(max_salary)�� ����Ͻÿ�.
SELECT e.first_name, j.job_id, e.salary, j.min_salary, j.max_salary
FROM employees e, jobs j
WHERE e.job_id = j.job_id
    AND e.job_id = 'FI_MGR';
    
--�μ��� 'seattle' �� �ִ� �μ����� �ٹ��ϴ� �������� first_name, hire_date, department_name, city��
--����ϴ� SELECT������ �ۼ�
SELECT e.first_name, e.hire_date, d.department_name, l.city
FROM locations l, employees e, departments d
WHERE e.department_id = d.department_id
    AND l.location_id = d.location_id
    AND l.city = 'Seattle';
    
--ansi����
SELECT e.first_name, e.hire_date, d.department_name, l.city
FROM employees e inner join departments d
        on e.department_id = d.department_id
    inner join locations l
        on d.location_id = l.location_id
WHERE l.city = 'Seattle';

--20�� �μ��� �̸��� �� �μ��� �ٹ��ϴ� ����� �̸�(first_name)�� ���
SELECT d.department_name, e.first_name
FROM departments d, employees e
WHERE d.department_id = e.department_id
    AND d.department_id = 20;
    
--1400, 1500�� ��ġ�� ���� �̸��� �װ��� �ִ� �μ��� �̸��� ����Ͻÿ�.
SELECT l.location_id, city, department_name
FROM locations l, departments d
WHERE l.location_id = d.location_id
    AND l.location_id IN(1400, 1500);

3. NATURAL JOIN
    NATURAL JOIN�� �� ���̺� ���� ������ �̸��� ���� ��� �÷��鿡 ���� EQUI(=) JOIN�� �����Ѵ�.
    �׸��� SQL Server������ �������� �ʴ� ����̴�.
    
    SELECT first_name, salary, department_id, department_name
    FROM employees natural join departments --���� ����. �׳� �˾Ƹ� �� ��
    
4. non_equi join --��ġ�ϴ� �� �ƴ϶�, � ����
 (=)�����ڸ� ������ >=, <=, >, < ���� �����ڸ� �̿��ؼ� ������ �����ϴ� ���ι���̴�.
 
  SELECT e.first_name, e.salary, j.min_salary, j.max_salary, j.job_title
  FROM employees e, jobs j
  WHERE e.job_id = j.job_id  
  AND e.salary >= j.min_salary
  AND e.salary <= j.max_salary;
  
(2)ansi�� non_equi join
 SELECT e.first_name, e.salary, j.min_salary, j.max_salary, j.job_title
  FROM employees e join jobs j
  ON e.job_id = j.job_id
    AND e.salary >= j.min_salary
    AND e.salary <= j.max_salary; 
    
5.outer join --��ü��ǰ�� ���� �Ǹŷ� ������ �����ϴ� ���
    ���� ���̺��� �����Ͱ� �ְ� �ٸ� �ݴ��ʿ��� �����Ͱ� ���� ��쿡
    �����Ͱ� �ִ� ���̺��� ������ ��� �������� �����̴�.
    
    (1) oracle �� outer join --��ġ�Ǵ� �� ������ �������� ���� ���
    SELECT e.first_name, e.salary, d.department_id, e.department_id
    FROM employees e, departments d
    WHERE e.department_id = d.department_id
    ORDER BY e.employee_id; --106���� ������. �ٵ�.. NULL���� �ִ� �͵� �������� �ʹ�. �̷� ��..
    
    SELECT e.first_name, e.salary, d.department_id, e.department_id
    FROM employees e, departments d
    WHERE e.department_id = d.department_id(+) --NULL�� �� �ִ� �� ������ ��.. ���� �������� �͵� NULL�� ������. Kimberely ����.
    ORDER BY e.employee_id; --�̰� left�����̴�. ���� ������ ����� ����..
    
    --�ݴ�� �ϸ�..
    SELECT e.first_name, e.salary, d.department_id, e.department_id
    FROM employees e, departments d
    WHERE e.department_id(+) = d.department_id -- (+)�� ���� �����͸� ���� �����´�.
    ORDER BY e.employee_id;
    
 (2) ansi�� outer join   --ó�� ������ ����
    SELECT e.first_name, e.salary, d.department_id, e.department_id
    FROM employees e left outer join departments d
    ON e.department_id = d.department_id -- (+)�� ���� �����͸� ���� �����´�.??
    ORDER BY e.employee_id;
    
    --�ݴ�� �ϸ�..
    SELECT e.first_name, e.salary, d.department_id, e.department_id
    FROM employees e right outer join departments d
    ON e.department_id = d.department_id -- ansi�� oracle�̶� �ݴ��.
    ORDER BY e.employee_id;
    
    
6. self join --��翡 ���� ���� ã��� ������ ���̺� ������ �̷������. �� ���� ���̺�� ������ ������ ��!
�ϳ��� ���̺��� �� ���� ���̷� �����ؼ� ����ϴ� ���ι��
    (1) oracle�� self join
    SELECT e.employee_id as "�����ȣ",
            e.first_name as "����̸�",
            e.manager_id as "�����ڹ�ȣ",
            m.first_name as "����"
    FROM employees e, employees m -- ũ....
    WHERE e.manager_id = m.employee_id
    
    (2) ansi�� self join
    SELECT e.employee_id as "�����ȣ",
            e.first_name as "����̸�",
            e.manager_id as "�����ڹ�ȣ",
            m.first_name as "����"
    FROM employees e join employees m -- ũ....
    ON e.manager_id = m.employee_id
    
    
==========================================================================================
-----------------------------------------------------------------------------------------
��������(subquery)
 �ϳ��� SQL���ȿ� ���ԵǾ� �ִ� �� �ٸ� SQL���� ���Ѵ�.
 ���������� �˷����� ���� ������ �̿��� �˻��� ���� ����Ѵ�.
 ���������� ���������� ���������� �����ϴ� �������� �����̴�.
 ���������� ���������� �÷��� ��� ����� �� ������ ���������� ���������� �÷��� ����� �� ����. 
 ���� ����� �������� �÷��� ǥ���ؾ� �Ѵٸ� ���ι������ ��ȯ�ϰų� �Լ�, ��Į�� ��������(scarar subquery)���� ����ؾ� �Ѵ�. 
 ������ ���հ��� ��(Product)�� �����̴�. 
 
�ܺ� ���� (��������)
 :�Ϲ� ������ �ǹ��մϴ�.
2)��Į�� ��������
 :SELECT ���� ������ ���Ǵ� ����, �Լ�ó�� ���ڵ�� ��Ȯ�� �ϳ��� ������ ��ȯ�ϴ� ���������Դϴ�.
3)�ζ��� ��
 :FROM ���� ���Ǵ� ������, ���ϴ� �����͸� ��ȸ�Ͽ� ������ ������ ����� ������ �����ϰų� ������ ������ �ٽ� ��ȸ�� �� ����մϴ�.

--1)�Ϲ����� ���������� where���� ���.

���������� ����� �� ���� ���׿� ����
  ���������� ��ȣ�� ���μ� ����Ѵ�. 
  ���������� ���� ��(Single Row) �Ǵ� ���� ��(Multiple Row) �� �����ڿ� �Բ� ��� �����ϴ�. 
  ���� �� �� �����ڴ� ���������� ����� �ݵ�� 1�� �����̾�� �ϰ� ���� �� �� �����ڴ� ���������� ��� �Ǽ��� ��� ����. 
  �������������� ORDER BY�� ������� ���Ѵ�. 
  ORDER BY���� SELECT������ ���� �� ���� �� �� �ֱ� ������ ORDER BY���� ���������� ������ ���忡 ��ġ�ؾ� �Ѵ�.
  

���� ���� ��밡���� ��ġ
SELECT, FROM, WHERE, HAVING,ORDER BY 
INSERT���� VALUES,
UPDATE���� SET, CREATE��

���������� ������ �����ϴ� ����̳� ��ȯ�Ǵ� �������� ���¿� ���� �з��� �� �ִ�.
1 �����ϴ� ��Ŀ� ���� �������� �з�
  Un-Correlated(�񿬰�) : ���������� �������� �÷��� ������ ���� �ʴ� ������ ���������̴�. --���ݱ��� �ߴ� ��
          ���������� ��(���������� ����� ���)�� �����ϱ� ���� ��������  �ַ� ����Ѵ�.
  Correlated(����) : ���������� �������� Į���� ������ �ִ� ������ ���������̴�. --���� �� ��
          �Ϲ������� ���������� ���� ����Ǿ� ������ �����͸� ������������ ������ �´��� Ȯ��
	  �ϰ��� �� �� �ַ� ���ȴ�.  (EXISTS���������� �׻� ���� ���������� ���ȴ�. ������ �����ϴ� 1�Ǹ� ã����
	  �߰� �˻��� ���� �ʴ´�.)
2 ��ȯ�Ǵ� �������� ���¿� ���� �������� ����
  Single Row(������ ��������) : ���������� �������� �׻� 1�� ������ ���������� �ǹ��Ѵ�. 
          ������ ���������� ���� �� �� �����ڿ� �Բ� ���ȴ�.
	  ���� �� �� �����ڴ� =, <, <=, >, >=, <>�� �ִ�.
  Multi Row(������ ��������) : ���������� ���� ����� ���� ���� ���������� �ǹ��Ѵ�. 
          ���� �� ���������� ���� �� �� �����ڿ� �Բ� ���ȴ�. 
	  ���� �� �� �����ڿ��� in, all, any, some, exists�� �ִ�.
	      in : ���������� ������('='�����ڷ� ���� ���)�� ���������� ��� �߿���
               �ϳ��� ��ġ�ϸ� ���̴�.
           any,some : ���� ������ �� ������ ���� ������ �˻� ����� �ϳ� �̻��� ��ġ�ϸ�
                ���̴�.
           all : ���� ������ �� ������ ���� ������ �˻� ����� ��� ���� ��ġ�ϸ� ���̴�.
           exists : ���� ������ �� ������ ���� ������ ��� �߿��� �����ϴ� ���� �ϳ���
               �����ϸ� ���̴�.
  Multi Column(����Į�� ��������) : ���������� ���� ����� ���� �÷��� ��ȯ�Ѵ�.
          ���������� �������� ���� �÷��� ���ÿ� ���� �� �ִ�. 
	  ���������� ������������ ���ϰ��� �ϴ� �÷� ������ �÷��� ��ġ�� �����ؾ� �Ѵ�.
============================================================================================================== 


SELECT first_name, last_name
FROM employees
WHERE first_name = 
    (SELECT first_name --����� �ϳ����� �Ѵ�. �ݵ�� ��ȣ�� ����� �Ѵ�.
    FROM employees)

----------------------------------------------
--Lex �ٹ��ϴ� �μ����� ����Ͻÿ�.
SELECT department_id
FROM employees
WHERE first_name='Lex'

SELECT department_name
FROM departments
WHERE department_id =90;

----------------------------------
--������ Ȱ�� --�ϴ� ���� �� �� �ƴ� ���� ������ ����.
SELECT department_name
FROM departments d, employees e
WHERE e.department_id = d.department_id
    AND e.first_name = 'Lex'

--���������� Ȱ��
SELECT department_name
FROM departments
WHERE department_id =
    (SELECT department_id
    FROM employees
    WHERE first_name='Lex');
    
--Lex�� ���� �μ��� �ٹ��ϴ� ��� �̸��� �μ���ȣ�� ����Ͻÿ�.
SELECT first_name, department_id
FROM employees
WHERE department_id = 
    (SELECT department_id
    FROM employees
    WHERE first_name = 'Lex');
    
    
--'Lex' �� ������ ����(job_id)�� ���� ����� �̸�(first_name), ����(job_title), �Ի���(hire_date)�� ����Ͻÿ�.
SELECT job_id
FROM employees
WHERE first_name = 'Lex'


SELECT first_name, job_title, hire_date
FROM employees e, jobs j
WHERE e.job_id = j.job_id
    AND e.job_id =  -- j�� �ᵵ ��. �߿��� �� ���� �� ���� �� ��.
        (SELECT job_id
        FROM employees
        WHERE first_name = 'Lex');

-- 'IT'�� �ٹ��ϴ� ����� �̸�, �μ���ȣ�� ����Ͻÿ�.

SELECT first_name, department_id
FROM employees
WHERE department_id = 
        (SELECT department_id
        FROM departments
        WHERE department_name = 'IT'); --�̰� �� �� �������� ��

--'Bruce'���� �޿��� ���� �޴� ����̸�, �μ���, �޿��� ����Ͻÿ�.
SELECT e.first_name, d.department_name, e.salary
FROM employees e, departments d
WHERE e.department_id = d.department_id
AND salary >
    (SELECT salary --�񱳿����ڿ� ���������� �Բ� ����Ϸ��� ���������� '�����' �� �ϳ����� �Ѵ�. �׷� ���� in, or, some, any�� ����Ѵ�.
    FROM employees
    WHERE first_name = 'Bruce') --�Ϲ������� �̰� �ϳ��� �ƴϴ�. �� �ٸ� Bruce�� �Ի��� �� �ִ�. ���� primary key�� ������ �÷��� ���� �� ����.
ORDER BY salary;
-----------------------------------------

--in
--Steven�� ���� �μ����� �ٹ��ϴ� ����� �̸�, �޿�, �Ի����� ���
SELECT first_name, salary, hire_date
FROM employees
WHERE department_id in( -- �̷��� in�� ���� �Ŵ�. ����? ���������� ������� ���� �� �� ��.
    SELECT department_id
    FROM employees
    WHERE first_name = 'Steven');

--�μ����� ���� �޿��� ���� �޴� ����� �̸�, �޿�, �μ���ȣ�� ����Ͻÿ�.
SELECT first_name, salary, department_id
FROM employees
WHERE (department_id, salary) in (
--�̷��� ������� �Ѵ�.
                                    SELECT department_id, max(salary) -- max(salary) �׷��� ���� �� �ִ� ����
                                    FROM employees
                                    GROUP BY department_id
                                    /*ORDER BY department_id*/); --�������������� order by�� ���� �� �ȴ�.
                                    --���������� ���������� ������� ������ ���ƾ� ��
=========================================================================================================================
--all
--30�Ҽӵ� ������߿��� �޿��� ���� ���� �޴� ������� �� ���� �޿��� �޴� �����
--�̸�, �޿�, �Ի����� ����Ͻÿ�.(all)
--(������������ max()�Լ��� ������� �ʴ´�.)

SELECT first_name, salary, hire_date
FROM employees
WHERE salary > all( -- �� ������ ��� �����ϴ�
                    SELECT salary
                    FROM employees
                    WHERE department_id = 30);
                    -- ���������� ������� ���� ���� �� �̰� ��� �����ϴ� ������� ����϶�. �̳��.

--any                    
--�μ���ȣ�� 30���� ������� �޴� �����޿����� ���� �޿��� �޴� ����� �̸�,
--�޿�, �Ի����� ����Ͻÿ�. (min()�Լ��� ������� �ʴ´�.) (any)
SELECT first_name, salary, hire_date
FROM employees
WHERE salary > any(
                    SELECT salary
                    FROM employees
                    WHERE department_id = 30); --�Ⱑ ������...


----exist
--20�� �μ��� ���� ����� ������ ������� �����, �Ի���, �޿�, �μ���ȣ�� ����Ͻÿ�
--������ ������ true
SELECT first_name, hire_date, salary, department_id
FROM employees
WHERE exists (SELECT department_id -- �ִ� ����? --�뷮�� �����Ϳ��� ����Ʈ�ؼ� ������ �� ���
            FROM employees
            WHERE department_id = 20); -- 20000�̸� F�̹Ƿ� ��� ����� ����.
--��簡 �ִ� ��� �Ǵ� ���� ���. �̷� ������ ���.





(2019_05_15)
---------------------------------------------------------------
Top-N ��������
    ������ ���� ������ �� ����Ѵ�.
    <, <=�����ڸ� ����� �� �ִ�. �� �񱳵Ǵ� ���� 1�� ���� =�� �����ϴ�.
    order by���� ����� �� �ִ�.
    FROM ���� �����.
---------------------------------------------------------------
-- �޿��� ���� ���� ���� 3���� �˻��Ͻÿ�.
SELECT emp.*
FROM   (SELECT first_name, salary --�� ���������� ���� ������ ���̺�� ���ȴ� --�ζ��� �� -- ���� ������ first_name�� salary�� ����� �� ����
        FROM employees
        ORDER BY salary desc) emp
WHERE rownum/*����Ŭ��*/ <=3;

-------------
SELECT emp.*
FROM   (SELECT first_name, salary 
        FROM employees
        ORDER BY salary desc) emp
WHERE rownum<=8
MINUS
SELECT emp.*
FROM   (SELECT first_name, salary 
        FROM employees
        ORDER BY salary desc) emp
WHERE rownum<=3;

--������ ���
SELECT e.*
FROM ((SELECT emp.*, rownum as rm
        FROM   (SELECT first_name, salary 
                FROM employees
                ORDER BY salary desc) emp)
    ) e
WHERE rm >=4 AND rm<=8 --����Ŭ���� Ư�� ������ ����Ϸ��� top-n ���������� ���.
--���θ� ���� ����� Ȯ����Ѿ� �� ��


---------------------------------------------------------------------------------------
--�� �� �Ի��� ���� ��ȸ�ϵ� �Ի��� ���� ���� ���� ���� 3���� �޸� ��µǵ��� �Ͻÿ�.
-- <���: ��       �Ի��ڼ� >

SELECT e.*
FROM 
    (SELECT to_char(hire_date, 'mm') as "��", count(*) as "�Ի��ڼ�"
    FROM employees
    GROUP BY to_char(hire_date, 'mm')
    ORDER BY "�Ի��ڼ�" desc) e
WHERE rownum <=3
ORDER BY "��"



--����� ����
--������ �÷��� ���������� WHERE������ ����ϴ��� ����
-- ������� ��������
: ������������ ���������� �÷��� �����Ѵ�.(���������� ���� �����Ѵ�.)
  ���������� �������� ������ �࿡ ���ؼ� ���������� �� ���� �����Ѵ�.
  <�Ʒ� ���� ó������>
  1st : �ٱ��� ������ ù° row�� ���Ͽ�
  2nd : ���� �������� �ڽ��� �����ִ� �μ��� MAX salary�� ���Ͽ� true�̸� �ٱ��� �÷����� ��ȯ�ϰ�, false�̸� ���� ������.
  3rd : �ٱ��� ������ �� ��° row�� ���Ͽ� ���������� �����Ͽ�, �̷��� �ٱ��� ������ ������ row���� �����Ѵ�.
  
  ---�μ��� �ְ� �޿��� �޴� ����� ����Ͻÿ�.
  /*6*/ SELECT first_name, salary, department_id
  /*1*/ FROM employees e --������������ ����� �� �ֵ��� Ư������ �ִ� ��
  /*5*/ WHERE salary = (
  /*4*/         SELECT max(salary)
  /*2*/         FROM employees
  /*3*/         WHERE department_id = e.department_id) -- employees���̺��� �� ���� �ŷ� �� �� --self join �ϰ� ����� ��
  /*7*/ ORDER BY department_id;
  
  SELECT employee_id, first_name, salary, department_id 
                FROM employees
                WHERE e.employee_id = manager_id); -- �̰� ������Ų�ٴ� �� ���ϰ� �ִٴ� ��
  -- �����ڰ� �ִ� ����� ���� ���
  SELECT employee_id, first_name, manager_id
  FROM employees e
  WHERE exists (SELECT 'x'
                FROM employees
                WHERE e.manager_id = employee_id); --���̺��� �� ���� ����� ��ü������ ����� ��! --�̰� �����Ѵٴ� ��..  �������� ����� ��


--�μ��� IT�� ������ �� ����� ���� �����(first_name),
--�μ���ȣ(department_id),
--�μ���(department_name)�� ����Ͻÿ�(in)

SELECT e.first_name, e.department_id, d.department_name
FROM employees e, departments d
WHERE E.Department_Id = D.Department_Id -- �ϴ� equal�� �����͸� �����ͼ�, ǥ�� �������� ����
    AND e.department_id in (SELECT department_id
                            FROM departments
                            WHERE department_name like '%IT%')
    
    
--Toronto ���ÿ� �ٹ��ϴ� ������� �޴� �ּұ޿����� ���� �޴� �����
--first_name, city, salary�� ����Ͻÿ�(any)
--Totonto�� ����

SELECT first_name, city, salary
FROM employees e, departments d, locations l
WHERE e.department_id = d.department_id
    AND d.location_id = l.location_id
    AND e.salary > any     
                    (SELECT e.salary
                    FROM employees e, locations l, departments d --�̷��� �����ϰ� ��� �ϳ�...
                    WHERE e.department_id = d.department_id
                        AND d.location_id = l.location_id
                        AND l.city = 'Toronto')
    AND l.city <> 'Toronto'
    
--�޿��� ���� 5~10������ �����, �Ի���, �޿��� ����Ͻÿ�.(Top-N)

SELECT b.*
FROM (SELECT sdesc.*, rownum as rn
        FROM
            (SELECT first_name, hire_date, salary      --1. �������� ����� > 2. rownum �����ϱ� > 3. FROM�� �����ϱ�
            FROM employees
            ORDER BY salary desc) sdesc) b
WHERE  b.rn >= 5 AND b.rn <=10


(SELECT sdesc.*, rownum as rm
FROM
        (SELECT first_name, salary      --1. �������� ����� > 2. rownum �����ϱ� > 3. FROM�� �����ϱ�
        FROM employees
        ORDER BY salary desc) sdesc) rn



SELECT e.*
FROM ((SELECT emp.*, rownum as rm
        FROM   (SELECT first_name, salary 
                FROM employees
                ORDER BY salary desc) emp)
    ) e
WHERE rm >=4 AND rm<=8



-----------------------
�׽�Ʈ
-----------------------
CREATE TABLE emp01(
    empno NUMBER PRIMARY KEY,
    ename VARCHAR2(20) NOT NULL,
    job VARCHAR2(9) UNIQUE,
    deptno NUMBER(2) REFERENCES dept(depto)
    );
        
        
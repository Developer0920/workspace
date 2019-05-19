--���̺��� �÷��� �ش��ϴ� �����͸� �˻��϶�.

SELECT colunm1, column2, n column3
FROM table��;

SELECT Job_Id, Job_title, min_salary, max_salary
FROM jobs;

SELECT * FROM jobs;

/*
�÷���, ���̺� ��Ī�� ������ �� �ִ�.
��Ī(alias)���� �ѱ��̳� ���������� ����� ����  " "(����ǥ)�� �����Ѵ�.
*/

SELECT salary, salary*10 FROM employees;
SELECT salary, salary*10 AS bonus FROM employees; --alias�� �� ���
SELECT salary, salary*10 AS "b o n u s" FROM employees; --������ �������
SELECT salary, salary*10 AS ���ʽ� FROM employees; --�ѱ��� �� ������� ��

SELECT last_name || '���� ������' || salary || '�Դϴ�.' AS name FROM employees; -- ���ڿ� ���� ||

SELECT first_name FROM employees;
--column �ߺ��� ����
SELECT DISTINCT first_name FROM employees; --�ߺ����Ŵ� �� ���� ����ؾ�(������ ��ü�� ���ִ� �� �ƴ� ��)

SELECT DISTINCT first_name, last_name FROM employees;

--select �Է¼��� (��, ��, ��, ��, ��, ��)
SELECT �÷���, �÷���
FROM ���̺�� (������� �ʼ�)
WHERE �÷��� = '��'
GROUP BY �÷���
HAVING �÷��� = '��'
ORDER BY �÷��� desc;

--select �ؼ�����
FROM ���̺�� (������� �ʼ�)
WHERE �÷��� = '��'
GROUP BY �÷���
HAVING �÷��� = '��'
SELECT �÷���, �÷���
ORDER BY �÷��� desc;

--employees���̺��� salary�� 3000�̸��� ����
--first_name, salalry�� ����϶�.

SELECT first_name, salary
FROM employees
WHERE salary<3000;

--emplyee���̺��� first_name�÷��� ���� 'David' �ƴ� ����
--first_name, salary�� ����Ͻÿ�.

SELECT first_name, salary
FROM employees
WHERE first_name != 'David'; -- ����Ŭ���� ���ٴ� =

SELECT first_name, salary
FROM employees
WHERE first_name <> 'David'; -- �ٸ��ٷ� <>���⵵
--where������ ��������� ������ ���;�. -- �̰� �� �ƴ� �� ����. �׳� �ش� ������ ������Ű�� �ȴ�.

--&&(and) || (or)
--employees���̺��� salary�� 3000, 9000, 17000�϶� first_name, hire_date, salary�� ����϶�.

SELECT first_name, hire_date, salary
FROM employees
WHERE salary = 3000 or salary = 9000 or salary = 17000; -- ���⼭ ������ �ƴ϶� ���ٴ� �ǹ�

-- IN�� Ȱ��
SELECT first_name, hire_date, salary
FROM employees
WHERE salary IN(3000,9000,17000);

--employees ���̺��� salary�� 3000���� 5000������ ���� first_name, hire_name, salary�� ����϶�.
SELECT first_name, hire_date, salary
FROM employees
WHERE salary>=3000 AND salary<=5000;

SELECT first_name, hire_date, salary
FROM employees
WHERE salary BETWEEN 3000 AND 5000;

--employees���̺��� job_id�� 'IT_PROG'�� �ƴ� �� first_name, email, job_id�� ����϶�.
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
WHERE commission_pct IS null; --null�� �񱳿����ڸ� ������� ���Ѵ�. is�� ����ؾ�.

SELECT first_name, salary, commission_pct
FROM employees
WHERE commission_pct IS not null;

--������ like ������
SELECT first_name, salary, email
FROM employees
WHERE first_name LIKE '%der%'; -- der�� ������// %der% der�� �߰��� // der% der�� ������
-- %�� ���. ?�� �ڹٿ��� ������ ����. ����Ŭ������ _
SELECT first_name, salary, email
FROM employees
WHERE first_name LIKE 'A_%exander';

-- =�� ������ ���ƾ� ��

/*
WHERE������ ���� ������ 3���� ����
1. �񱳿����� : = > >= < <= != <> ^=(�ٸ���)
2. SQL������ : BETWEEN a AND b, IN, LIKE, IS NULL
3. �������� : AND, OR, NOT

�켱����
1. ��ȣ()
2. NOT������
3. �񱳿�����, SQL ������
4. AND
5. OR
*/
===========================================================================
--employees ���̺��� job_id�� ����������
--first_name, email, job_id�� ���

SELECT first_name, email, job_id
FROM employees
ORDER BY job_id ASC; -- ������ ������� ������ ������������ �ν�

----------------------------------------------------------------
SELECT department_id, first_name, salary
FROM employees
ORDER BY department_id ASC, first_name DESC; --��ǥ�� ����!
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


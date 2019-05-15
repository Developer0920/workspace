  ---------------------------------
  ����
 ---------------------------------
1) department_id�� 60�� �μ��� ���ø��� �˾Ƴ��� SELECT������ ����Ͻÿ�

SELECT city
FROM locations
WHERE location_id = (
        SELECT location_id
        FROM departments
        WHERE department_id = 60 )
  
    
2)����� 107�� ����� �μ�������,167���� �޿����� ���� ������� ���,�̸�(first_name),�޿��� ����Ͻÿ�.

SELECT employee_id, first_name, salary
FROM employees
WHERE department_id = (
                        SELECT department_id
                        FROM employees
                        WHERE employee_id = 107)
    AND salary > (    
                    SELECT salary
                    FROM employees
                    WHERE employee_id = 167)

    
                  
3) �޿���պ��� �޿��� ���Թ޴� ������� Ŀ�̼��� �޴� ������� ���,�̸�(first_name),�޿�,Ŀ�̼� �ۼ�Ʈ�� ����Ͻÿ�.

SELECT employee_id, first_name, salary, commission_pct
FROM employees
WHERE commission_pct is not null
    AND salary < (    
                    SELECT avg(salary)
                    FROM employees)
   
   
4)�� �μ��� �ּұ޿��� 20�� �μ��� �ּұ޿����� ���� �μ��� ��ȣ�� �׺μ��� �ּұ޿��� ����Ͻÿ�.

SELECT department_id as "�μ���ȣ", min(salary) as "�ּұ޿�"
FROM employees
GROUP BY department_id
HAVING min(salary) > (
                        SELECT min(salary)
                        FROM employees
                        WHERE department_id = 20)
ORDER BY "�μ���ȣ"                    

    
5) �����ȣ�� 177�� ����� ��� ������ ���� ����� ����̸�(first_name)�� ������(job_id)�Ͻÿ�.   

SELECT first_name, job_id
FROM employees
WHERE job_id = (
                SELECT job_id
                FROM employees
                WHERE employee_id = 177)
  
  
6) �ּ� �޿��� �޴� ����� �̸�(first_name), ��� ����(job_id) �� �޿�(salary)�� ǥ���Ͻÿ�(�׷��Լ� ���).

SELECT first_name, job_id, salary
FROM employees
WHERE salary = (
                SELECT min(salary)
                FROM employees)

--�׷��Լ� ���� ��


				
7)������ ��� �޿��� ���� ����  ����(job_id)�� ã�� ����(job_id)�� ��� �޿��� ǥ���Ͻÿ�.
SELECT e.*
FROM
        (SELECT aa.*, rownum as rn
        FROM 
                (SELECT job_id, avg(salary) as "��ձ޿�"
                FROM employees
                GROUP BY job_id
                ORDER BY "��ձ޿�") aa) e
WHERE rn = 1
					  
8) �� �μ��� �ּ� �޿��� �޴� ����� �̸�(first_name), �޿�(salary), �μ���ȣ(department_id)�� ǥ���Ͻÿ�.

SELECT first_name, salary, department_id
FROM employees 
WHERE salary in (SELECT min(salary)
                    FROM employees
                    GROUP BY department_id)



9)��� ������ ���α׷���(IT_PROG)�� ��� ������� �޿��� �����鼭 
������ ���α׷���(IT_PROG)�� �ƴ� 
������� �����ȣ(employee_id), �̸�(first_name), 
��� ����(job_id), �޿�(salary))�� ����Ͻÿ�.



10)���������� ���� ��� ����� �̸��� ǥ���Ͻÿ�.





  
  
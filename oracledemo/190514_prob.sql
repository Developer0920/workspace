 ----------------------------------------------
 ����
 ----------------------------------------------
 
1)EMPLOYEES ���̺��� �Ի��� ��(hire_date) ���� �ο����� ��ȸ�Ͻÿ� . 
  <���: ��        ������   >
  
  SELECT to_char(hire_date, 'mm') as "�Ի��� ��", count(employee_id) as "�ο���"
  FROM employees  
  GROUP BY to_char(hire_date, 'mm')
  ORDER BY to_char(hire_date, 'mm')
  


2)�� �μ����� �ٹ��ϴ� �������� ��ȸ�ϴ� SQL ��ɾ �ۼ��Ͻÿ�. 
��, �������� 5�� ������ �μ� ������ ��µǾ�� �ϸ� �μ������� ���� ������ �ִٸ� �μ��� ��<�̹�ġ�ο�>�� �̶�� ���ڰ� ��µǵ��� �Ͻÿ�. 
�׸��� ��°���� �������� ���� �μ����� ��µǾ�� �մϴ�.

SELECT nvl(d.department_name, '<�̹�ġ�ο�>') as "�μ���", count(employee_id) as "������"
FROM employees e, departments d
WHERE e.department_id = d.department_id(+)
GROUP BY d.department_name
HAVING count(employee_id)<=5
ORDER BY "������";


3)�� �μ� �̸� ���� 2005�� ������ �Ի��� �������� �ο����� ��ȸ�Ͻÿ�.
 <��� :    �μ���      �Ի�⵵   �ο���  >
 
 SELECT d.department_name, to_char(e.hire_date, 'yyyy'), count(e.employee_id)
 FROM departments d, employees e
 WHERE d.department_id = e.department_id
    AND to_char(e.hire_date,'yyyy') < '2005'  
 GROUP BY department_name, to_char(e.hire_date,'yyyy')
 
 
 
 


4)��å(job_title)���� 'Manager'�� �����̵� ����� �̸�(first_name), ��å(job_title), �μ���(department_name)�� ��ȸ�Ͻÿ�.

SELECT first_name as "�̸�", job_title as "��å", department_name as "�μ���"
FROM employees e, departments d, jobs j
WHERE e.department_id = d.department_id
    AND e.job_id = j.job_id
    AND j.job_title like '%Manager%'


5)'Executive' �μ��� �ӿ� �ִ� �������� ������ �̸��� ��ȸ�Ͻÿ�. 
��, �����ڰ� ���� ������ �ִٸ� �� ���� ������ ��°���� ���Խ��Ѿ� �մϴ�.
 <��� : �μ���ȣ ������  �����ڸ�  >
 
 SELECT e.first_name as "������", m.first_name as "�����"
 FROM employees e, employees m, departments d
 WHERE e.manager_id = m.employee_id(+)
    AND e.department_id = d.department_id   
    AND d.department_name = 'Executive'
------------------------------
����
------------------------------
1) ��������Դ� ���(Manager)�� �ִ�. ������ employees���̺� �����ϰ� �����
   ���� �ο찡 �ִµ� �� ���(CEO)�� MGR�÷����� NULL�̴�. ����� ���� �����
   ����ϵ� MGR�÷��� NULL ��� CEO�� ����Ͻÿ�.
   
  SELECT first_name , nvl(to_char(manager_id), 'ceo')
  FROM employees;       


2) �����ֱٿ� �Ի��� ����� �Ի��ϰ� ��������� ����� �Ի����� ���Ͻÿ�.

SELECT max(hire_date), min(hire_date)
FROM employees;  
 
 
3) �μ����� Ŀ�̼��� �޴� ����� ���� ���Ͻÿ�.

SELECT count(commission_pct)
FROM employees;
   
   
4) �μ��� �ִ�޿��� 10000�̻��� �μ��� ����Ͻÿ�.

SELECT department_id , max(salary)
FROM employees
WHERE salary >= 10000
GROUP BY department_id;
  

5) employees ���̺��� ������ 'IT_PROG'�� ������� �޿������ ���ϴ� SELECT������ ����Ͻÿ�

SELECT job_id, avg(salary)
FROM employees
GROUP BY job_id
HAVING job_id = 'IT_PROG';
   

6) employees ���̺��� ������ 'FI_ACCOUNT' �Ǵ� 'AC_ACCOUNT' �� ����� �� �ִ�޿���  ���ϴ� SELECT������ ����Ͻÿ�  

   SELECT job_id, max(salary)
   FROM employees  
   GROUP BY job_id
   HAVING job_id = 'FI_ACCOUNT' OR job_id = 'AC_ACCOUNT';
  

7) employees ���̺��� 50�μ��� �ּұ޿��� ����ϴ� SELECT������ ����Ͻÿ�

SELECT department_id, min(salary)
FROM employees
GROUP BY department_id
HAVING department_id = 50;
   
    
8) employees ���̺��� �Ʒ��� ���ó�� �Ի��ο��� ����ϴ� SELECT������ �ۼ��Ͽ���
    <���:  2001		2002		2003
   	     1          7                6   >
         

SELECT sum(decode(to_char(hire_date,'yyyy'),'2001',1,0)) as "2001",
   sum(decode(to_char(hire_date,'yyyy'),'2002',1,0)) as "2002",
   sum(decode(to_char(hire_date,'yyyy'),'2003',1,0)) as "2003"
   FROM	 employees;



   		   
   
    
9) employees ���̺��� �� �μ��� �ο��� 10�� �̻��� �μ��� �μ��ڵ�,
  �ο���,�޿��� ���� ���ϴ�  SELECT������ �ۼ��Ͽ���
  
  SELECT department_id, sum(department_id) + count(first_name) + sum(salary)
  FROM employees  
  GROUP BY department_id  
  HAVING count(first_name) >=10;
   
  
  
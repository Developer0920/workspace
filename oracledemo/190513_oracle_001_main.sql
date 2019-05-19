<���տ�����>
- �� �̻��� query����� �ϳ��� ����� �����Ѵ�. --������ �����ؼ� ���ϴ� ����� ������
- select�� ���� ������ ���ƾ� �Ѵ�.
 ù��° select�� 2���̸� �ι�° select�� 2������ �Ѵ�.
 - Ÿ���� ��ġ�ؾ� �Ѵ�.
  ���� ��� character�̸� character�̾�� �Ѵ�.

<���տ����� ����>
union(������) - �ߺ����� ���ŵ� �� query
union all(������) - �ߺ����� ���Ե� �� query��
intersect(������) - �� query�� �������� ��
minus(������) - ù ��° query�� �ִ� �� �� �� ��° query�� ���� �� ǥ��

<���տ����� �������>
- ���� �ٸ� ���̺��� ������ ������ ����� ��ȯ�ϱ� ���ؼ� -- column���� �޶� ��������� ������ ���´� ���ƾ� �Ѵ�.
- ���� ���� ���̺��� ���� �ٸ� ���Ǹ� �����Ͽ� ����� ��ġ�� ���ؼ�


--=====================
--union (������) : �̰� ��¥ ������
SELECT department_id, first_name, last_name
FROM employees
WHERE department_id=20 or department_id=40
UNION
SELECT department_id, first_name, last_name --�������� column�� �����Ͱ� ���ƾ� �Ѵ�.(�÷����� �޶� ��)
FROM employees
WHERE department_id=20 or department_id=60;

--union all(������) : ��ġ�� �� �� �� �� ������
SELECT department_id, first_name, last_name
FROM employees
WHERE department_id=20 or department_id=40
UNION ALL
SELECT department_id, first_name, last_name --�������� column�� �����Ͱ� ���ƾ� �Ѵ�.
FROM employees
WHERE department_id=20 or department_id=60;

--intersect(������)
SELECT department_id, first_name, last_name
FROM employees
WHERE department_id=20 or department_id=40
INTERSECT
SELECT department_id, first_name, last_name --�������� column�� �����Ͱ� ���ƾ� �Ѵ�.
FROM employees
WHERE department_id=20 or department_id=60;

--minus(������)
SELECT department_id, first_name, last_name
FROM employees
WHERE department_id=20 or department_id=40
MINUS
SELECT department_id, first_name, last_name --�������� column�� �����Ͱ� ���ƾ� �Ѵ�.
FROM employees
WHERE department_id=20 or department_id=60;

--=================================================
SQL(structured query language)�ռ�
1.�������Լ� : �� �ϳ��� �ϳ��� ����� ���(�����Լ�, �����Լ�, ��¥�Լ�, ��ȯ�Լ�, �Ϲ��Լ�)
2.�������Լ� : �� ���� ���� �ϳ��� ����� ����Ѵ�.(�հ�, ���, �ִ�, �ּ�, ����) --���� ���� ������� �ؼ� ����� ����
--=================================================
--SELECT�������� �ݵ�� ���̺���� ����ؾ� �Ѵ�.
--�׷��� SELECT���� ���̳� Ư���Լ��� �̿��ؼ� ������� ������ ��
--����� �� �ִ� DUAL�̶�� ���̺��� �����ϰ� �ִ�. (��� ù��° ���� ������ �������Ѿ� �ϱ� �����̴�)
SELECT 3+1
FROM dual; --������ ���̺� ���� ������ ��

SELECT sysdate
FROM dual;

=====================================
--������
--�����Լ�
--�ܾ��� ù���ڸ� �빮�ڷ� ������ �ִ� �Լ��̴�.

SELECT initcap('korea hello')
FROM dual;

SELECT upper('korea')
FROM dual;

SELECT first_name, upper(first_name),
        last_name, upper(last_name)
FROM employees;

--��� ���ڸ� �ҹ��ڷ� �������ִ� �Լ��̴�.
SELECT lower('KOREA')
FROM dual;

SELECT first_name, lower(first_name),
        last_name, lower(last_name)
FROM employees;
========================================
SELECT first_name, salary
FROM employees
WHERE upper(first_name) like upper('%Ja%') -- ũ... ���ȴ�..

--������ ���̸� �������ִ� �Լ�
SELECT length('korea')
FROM dual;

SELECT length('�ѱ�')
FROM dual;

--������ ���̸� ����Ʈ�� ���ؼ� �������ִ� �Լ�
SELECT lengthb('korea')
FROM dual;

SELECT lengthb('�ѱ�')
FROM dual;
-------------------------------[
CREATE TABLE user1(
    data varchar2(5)
);

INSERT INTO user1(data)
VALUES('korea');

INSERT INTO user1(data)
VALUES('�ѱ�'); -- 6byte�� �ʿ��ϹǷ� ���� �߻�

--Ư�������� ���ڸ� �������ִ� �Լ��̴�.
--substr('����', ������ġ, ����)
SELECT substr('oracle test', 1, 4) --���⼭ ������ 4�� ������ �ǹ�. java�� �̸��̾���.
FROM dual;

SELECT substr('oracle test', -3, 4) --�ڿ��� ����°���� 4��
FROM dual;

SELECT substr('����Ŭ �׽�Ʈ', 3, 4) --���鵵 ����1���� �ν���
FROM dual;

SELECT substrb('oracle test', 2, 4) --����� ������ 1����Ʈ�� ����
FROM dual;

SELECT substrb('����Ŭ �׽�Ʈ', 4, 4)
FROM dual;

--Ư�������� ���ؽ��� �������ִ� �Լ�
SELECT instr('korea', 'or')
FROM dual;

SELECT instr('�ѱ��ڹ�', '��')
FROM dual;

--Ư�������� ����Ʈ ���ؽ��� �������ִ� �Լ�
SELECT instrb('korea', 'or')
FROM dual;

SELECT instrb('�ѱ��ڹ�', '��')
FROM dual;

--�־��� ���ڿ����� �������� Ư�����ڸ� ä��� �Լ�
SELECT lpad('korea', 8, '*')
FROM dual;

--�־��� ���ڿ����� ���������� Ư�����ڸ� ä��� �Լ�
SELECT rpad('korea', 8, '*')
FROM dual;

--�־��� ���ڿ����� ������ Ư�����ڸ� �����ϴ� �Լ�
SELECT ltrim('***korea', '*')
FROM dual;

--�־��� ���ڿ����� �������� Ư�����ڸ� �����ϴ� �Լ�
SELECT rtrim('korea***', '*')
FROM dual;

--�־��� ���ڿ����� ���� Ư�����ڸ� �����ϴ� �Լ�
SELECT trim('*' from '**korea***')
FROM dual;

--�־��� ���ڿ����� �������� ��������
SELECT length(rtrim('korea   ')) -- �������� ���θ� length�Լ��� Ȯ��
FROM dual;

--�־��� ���ڿ����� ������ ��������
SELECT length(trim(' ' from '   korea   '))
FROM dual;

--�Ǵ�
SELECT length(trim('   korea   '))
FROM dual; --�̰� �� ȿ����!

--�־��� ������ �ƽ�Ű �ڵ尪�� ���ϴ� �Լ�

SELECT ascii('A')
FROM dual;

--�־��� �ƽ�Ű �ڵ尪�� ���ڸ� ���ϴ� �Լ�
SELECT chr(65)
FROM dual;

--�־��� ���ڸ� �����ϴ� �Լ�
SELECT concat('java', 'jsp')
FROM dual;

SELECT 'java' || 'jsp'
FROM dual;

---------------
�����Լ�
---------------
--3.55�� �Ҽ��� 1�� �ڸ����� ���Ͻÿ�(�ݿø�)
SELECT round(3.55, 1)
FROM dual;

SELECT round(42523.55, -1)
FROM dual;

SELECT round(42523.55, 0)
FROM dual;

--256.78 ������ �ø��Ѵ�.(�ø�)
SELECT ceil(256.78)
FROM dual;

--289.78���� �Ҽ����ϴ� ������ ������.(����)
SELECT floor(289.78)
FROM dual;

--2�� 3�� (�ŵ�����)
SELECT power(2,3)
FROM dual;


--25d�� ������
SELECT sqrt(25)
FROM dual;

--������
SELECT mod (10, 3)
FROM dual;


----------
��¥�Լ�
-----------
--���� �ý��ۿ��� �������ִ� ������ ��¥ ���ϴ� �Լ�
SELECT sysdate
FROM dual;

SELECT sysdate+1
FROM dual;

-ù��° ������ �޿� �ι�° ���ڰ��� ���� ��¥�� ��ȯ
SELECT add_months(sysdate, 10) --10������ ����
FROM dual;

======================================================
��ȯ�� �Լ�
����              ����          ��¥
to_number() <-> to_char() <->   to_date()   --���ڿ� ��¥�� ���������� �� �ٲ۴�. ���ڰ� �߰��� ����
=======================================================
-- 1 ���� -> ����
-- ù��° ���ڰ��� �ι�° ���ڰ��� �������� ��ȯ���ִ� �Լ�
SELECT to_char(2532, '99999,999.9') --�Ҽ��� �ڸ����� 9�� ����, 0�� ���� �����Ͱ� ������ 0���� ǥ������
FROM dual;

SELECT to_char(2532, '009,999.00')
FROM dual; --9�� ���� �����Ͱ� ������ ����, 0�� �����. ģ���� ��.

--�� ������ ��ȭ�� ǥ���� �� �� L��ȣ�� ���
SELECT to_char(2532, 'L999,999.99')
FROM dual;

--2 ��¥ -> ����
SELECT to_char(sysdate, 'yyyy-mm-dd hh:mi:ss day')
FROM dual;

SELECT to_char(sysdate, 'yyyy-mm-dd hh:mi:ss dy')
FROM dual;

SELECT to_char(sysdate, 'yyyy-mm-dd hh24:mi:ss dy')
FROM dual;

------------------------------------
to_number()
���� -> ����
------------------------------------
SELECT '253' || '12'
FROM dual;

SELECT concat('253', '12')
FROM dual;

SELECT '253'+'12' --�ڹٶ� �ٸ���!
FROM dual;

SELECT to_number('253') + to_number('12')
FROM dual;

-------------------------
to_date()
���� -> ��¥
-------------------------
SELECT to_date('2013-10-14') --�̰Ŵ�!!
FROM dual;

SELECT first_name, hire_date
FROM employees;
============================================================================
-- hire_date(�Ի���)�� �̿��ؼ�
--'ȫ�浿���� 2003�� 1�� 3�Ͽ� �Ի��߽��ϴ�'�� ����ϴ� query�� �ۼ��Ͻÿ�

SELECT first_name || '���� '
        || to_char(hire_date, 'yyyy') || '�� '        
        || ltrim(to_char(hire_date, 'mm'), '0') || '�� ' 
        || ltrim(to_char(hire_date, 'dd'), '0') || '�Ͽ� �Ի��߽��ϴ�.'  
        AS �Ի��� --�÷��� ����
FROM employees;

--alias ���� ""�� ��.

--------------------------------------
�Ϲ��Լ�
nvl()
--------------------------------------
--nvl(�÷�, ��ü��) : ù��° ���ڰ��� null�̸� 0���� ��ü�ؼ� ����Ѵ�.
--��ü�� ���� �����̸� �ι�° ���ڰ��� ���ڸ� �����Ѵ�.
--��ü�� ���� �����̸� �ι�° ���ڰ��� ���ڸ� �����Ѵ�.
--��ü�� ���� ��¥�̸� �ι�° ���ڰ��� ��¥�� �����Ѵ�.

--commission_pct�÷��� ���� null�� ��� 0���� ��ü�ؼ� ���
SELECT commission_pct, nvl(commission_pct, 0)
FROM employees;

SELECT first_name, manager_id, nvl(to_char(manager_id), 'ceo') --���ڸ� �ϴ� ���ڷ� �ٲ��
FROM employees;

--nvl2(�÷�, ��ü1, ��ü2) : �÷��� ���� null�� �ƴϸ�, ��ü1��, null�̸� ��ü2�� ���
SELECT commission_pct, nvl2(commission_pct, 1, 0)
FROM employees;

-----------------------------------
�Ϲ��Լ�
decode()
-----------------------------------
--decode(�÷� �Ǵ� �����̳� �Լ��� ���, ����1, ��1, ����2, ��2, ����3, ��3, �� ���� ��)
--department_id ���� 10�̸� 'AA', 20�̸� 'BB', 30�̸� 'CC', �� ���� ���� 'DD'
--java�� switch_case���� ���
--�÷��� ���� ������ ���� ��Ȯ�� ��ġ�ؾ� �Ѵ�.

SELECT first_name, department_id,
        decode(department_id, 10, 'ACCOUNTING', 20, 'RESEARCH', 30, 'SALES', 40, 'OPERATIONS', 'OTHERS')
        as CODE -- �� ���� �ٷ� alias. �����̹Ƿ� "" �ʿ����. ���߿� �̰� ������ �����͸� �ҷ����� ��. �������� �߿��� ��.        
FROM employees;

--������ 'PR_REP' �� ����� 5%, 'SA_MAN'�� ����� 10%, 'AC_MGR'�� ����� 15%, 'PU_CLERK' �� ����� 20%�� �λ�
SELECT job_id, salary,
        decode(job_id,
        'PR_REP', salary*1.05,
        'SA_MAN', salary*1.1,
        'AC_MGR', salary*1.15,
        'PU_CLERK', salary*1.2,
        salary)
        as newsal
FROM employees;

-----------------------------
�Ϲ��Լ�
case()
-----------------------------
case when ����1 then ���1 -- ������ ������ ������ �ȴ�.
    when ����2 then ���2
    when ����3 then ���3
    else ���n
end

�ڹ��� ���� if~else����� ����ϴ�.
--�� ������ case������ ó���ϸ�..
SELECT first_name, department_id,
    case when department_id=10 then 'ACCOUNTING'
        when department_id=20 then 'RESEARCH'
        when department_id=30 then 'SALES'
        when department_id=40 then 'OPERATIONS'
        else 'others'
    end as code
FROM employees;

--�Ի��Ͽ��� ���� 1-3�̸� '1��б�', 4-6�̸� '2��б�', 7-9�̸� '3��б�', 10-12�̸� '4��б�'�� ó���ϰ�
--first_name, hire_date, �б�� ����Ͻÿ�

SELECT first_name, hire_date, 
    case when substr(to_char(hire_date), 4, 2) <=03 then '1��б�' --substr('����', ������ġ, ����)
       when substr(to_char(hire_date), 4, 2) <=06 then '2��б�'
       when substr(to_char(hire_date), 4, 2) <=09 then '3��б�'
    else '4��б�'
    end as new
FROM employees;

--������
SELECT first_name, hire_date, 
    case when to_char(hire_date, 'mm') <=3 then '1��б�' --substr('����', ������ġ, ����)
       when to_char(hire_date, 'mm') <=6 then '2��б�'
       when to_char(hire_date, 'mm') <=9 then '3��б�'
    else '4��б�'
    end as "�б�" --�ѱ��� �ֵ���ǥ �ؾ�
FROM employees;

----------------------------
�׷��Լ�(�����Լ�)
----------------------------
--max(�÷�) : �ִ밪
SELECT max(salary) --�ڹٶ� �޸� ���ڰ��� ���� �� ���� ����(�ڹٴ� �� ��)
FROM employees;

--min(�÷�) : �ּҰ�
SELECT min(salary)
FROM employees; --��� ���� �ϳ��� ���´�. �̰� �߿��ϴ�.

SELECT count(commission_pct) --�� �÷����� null���� ������ �����Ͱ� �ִ� ���� ������ ����
as count
FROM employees;

SELECT count(*) --������ ���̺� ����� �ִ� �����Ͱ� �ִ� ���� ������ ����
as count
FROM employees;

--sum(�÷�) : �հ�
SELECT sum(salary)
FROM employees;

--avg(�÷�) : ���
SELECT avg(salary)
FROM employees;

SELECT to_char(avg(salary), '99999,999.9')
FROM employees;


SELECT first_name, count(*) --���� 107��, 1�� -- ��µǴ� ���� ������ �����ؾ� �Ѵ�.
FROM employees;
--�����Լ��� �����Լ��� ������ �� ����.

--�����Լ��� �ܼ��÷��� �Բ� ����� �� ����.(��µǴ� ���ڵ� ���� �ٸ��� ����)
--�̷� ��� group���� having ���� ���� �ȴ�.

SELECT first_name, count(*)
FROM employees;

==============================================================================================
--�׷��Լ��� �ܼ��÷��� ����ϱ� ���ؼ���, �ܼ��÷��� �׷�ȭ�ؾ� �Ѵ�.(Group by)
--�� �μ��� ����� ���� ���ؾ� �ϴ� ���
SELECT department_id, count(*)
FROM employees
GROUP BY department_id --�ܼ��÷��� ������ �׷��� �����ش�.
ORDER BY department_id; --���� ���ϸ� ��������, �̶� �� ���� �� ��

--50������ �μ��� ���ؼ� null�� �ƴ� �μ����� �������� ����Ͻÿ�.
SELECT department_id, count(*)
FROM employees
WHERE department_id is not null
GROUP BY department_id
HAVING department_id <=50 --�׷쿡 ���� ������ having ������ ó���Ѵ�.
ORDER BY department_id;

--�μ��� �ּұ޿�, �ִ�޿��� ����Ͻÿ�. (�μ��� ��������)
SELECT department_id as "�μ�" , min(salary) as min, max(salary) as max --alias�� �̷��� ���.
FROM employees
GROUP BY department_id
ORDER BY department_id;

--���θ�(job_id) �޿��հ踦 ����Ͻÿ�.
SELECT job_id, sum(salary) as "�޿��հ�"
FROM employees
GROUP BY job_id
ORDER BY job_id;
















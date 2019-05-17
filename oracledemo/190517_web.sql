SELECT * FROM DBA_SYS_PRIVS
WHERE grantee= 'HR'; --hr������ �־��� ����


SHOW USER;


--�ý��� ������ �����ϱ� ���� �ý��� �����ڷ� ����
SQL> conn system/a1234

--���� �ý��۰����� �����̱� ������ �ٸ� ����ڰ��� ���������ϹǷ� �������
CREATE USER user01 identified by tiger;
SHOW USER;



����� ���� : �ý��۱��Ѱ� ��ü�������� ���еȴ�

 �����ͺ��̽� �����ڰ� ������ �ý��۱���
 1) create user : ���Ӱ� ����ڸ� �����ϴ� ����
 2) drop user : ����ڸ� �����ϴ� ����
 3) drop any table : ������ ���̺��� ������ �� �ִ� ����
 4) query rewrite : �������ۼ��� �� �� �ִ� ����
 5) backup any table : ������ ���̺��� ����� �� �ִ� ����

 �Ϲ� ����ڰ� �����ͺ��̽��� �����ϴ� ����
 1) create session : �����ͺ��̽��� �����Ҽ� �ִ� ���� --connect�� ����� �� ����.
 2) create table : ����� ��Ű������ ���̺��� ������ �� �ִ� ����
 3) create view : ����� ��Ű������ �並 ������ �� �ִ� ����
 4) create sequence : ����� ��Ű������ �������� ������ �� �ִ� ����
 5) create procedure : ����� ��Ű������ ���ν���(�Լ�)�� �����Ҽ� �ִ� ����


--����ڿ��� ���� �ο��ϱ� ���� grant ��ɾ�
--grant system_privilege to user_name;

--user01����ڿ��� �����ͺ��̽� ���ٱ��� �ο�
grant create session to user01;

conn user01/tiger;

show user;

select * from hr.employees; --�ý����� �̰� ����! user01�� hr�� ���� �����Ϳ� ������ �� ����.
 
grant create table to user01;
alter user user01 default tablespace users quota unlimited on users; --�����ͺ��̽� ��Ű���� �ʿ��� �ٷ�

/*user02 ������ �����ͺ��̽� ���ٱ��� �ο��� WITH ADMIN OPTION�� �����ϰ� �Ǹ�
���� ����� �������� �ٸ� ����ڿ��� ������ �ο��� �� �ִ�.*/

CREATE USER user02 identified by tiger;

grant create session to user02 WITH ADMIN OPTION;
grant create view to user02 WITH ADMIN OPTION;

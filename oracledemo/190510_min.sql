select * from user_constraints;
desc test; --���̺��� ������ Ȯ���� ��

alter table test ADD job VARCHAR2(20);

SELECT * FROM test;

ALTER TABLE test RENAME COLUMN data2 to salary;

INSERT INTO test values(1000, 50, null, null);

ALTER TABLE test MODIFY job VARCHAR2(30);

DESC test;

ALTER TABLE test ADD grade NUMBER(1);
DESC test;
SELECT * FROM test;
UPDATE test SET grade = 10  WHERE data1=1000;

ALTER TABLE test MODIFY grade NUMBER(2);
INSERT INTO test VALUES(2000,30,'SALEMAN',2);
ALTER TABLE test MODIFY grade NUMBER(1); -- �̹� ū ���� ���� ���¿��� ũ�⸦ ���̸� ���� �߻�

--�����Ͱ� ���� ���� ���� ����
--�����Ͱ� �ִ� ���, CHAR�� VARCHAR2�� ���氡��

INSERT INTO test(data1, salary, job) values(3000, 40, 'CLARK');
ALTER TABLE test MODIFY grade NUMBER(2) default 0; --defautl �� ����

INSERT INTO test(data1, salary, job) VALUES (4000,50,'RESEARCH'); --0���� ä����


--DROP�� �÷� ��ü�� �������Ƿ� �÷� ���� �����͵� ������.

AlTER TABLE test DROP COLUMN job;
DeSC test;

SELECT * FROM test;

ALTER TABLE test ADD CONSTRAINTS test_data1_pk PRIMARY KEY(data1);

SELECT constraint_name, table_name FROM USER_CONSTRAINTS WHERE table_name = 'TEST';

--�������Ǹ� ����

ALTER TABLE test RENAME CONSTRAINTS test_data1_pk TO test_dental_pk_new;

SELECT constraint_name, table_name FROM USER_CONSTRAINTS WHERE table_name = 'TEST';

--�������� ���� : ���� �� ���� ���� ��

ALTER TABLE test DROP CONSTRAINT test_dental_pk_new;

--��Ȱ��

ALTER TABLE test SET UNUSED (GRADE);

SELECT * FROM test; -- ��Ȱ����
DESC test; --���������� �� ����
SELECT * FROM user_tables;
SELECT * FROM user_unused_col_tabs;

--���̺�� ���� (���� ��� ���� �� ��)
ALTER TABLE test RENAME TO test_new;
SELECT * FROM test;
SELECT * FROM test_new;
SELECT table_name FROM user_tables;

-- delete, drop, truncate
/* delete�� commit�� �� �ϸ� �ǻ츱 �� �ִ�. drop�� �ϴ� ���� commit�� �Ź���(auto commit).
truncate : deleteó�� �����ʹ� �� �������� ������ ���� ������ commit�� �ȴ�. ���� �ǻ츱�� �ִ�
����� ����.*/

--���̺����
CREATE TABLE customer(
id VARCHAR2(20) PRIMARY KEY,
pwd VARCHAR2(20) NOT NULL,
name VARCHAR2(20) NOT NULL,
phone NUMBER NOT NULL
);


--INSERT, SELECT����
INSERT INTO customer VALUES('kd_hong', 'pass01', 'ȫ�浿', '01055557777');
SELECT * FROM customer;

--��°��
kd_hong	pass01	ȫ�浿	1055557777 --������ Ÿ���� �����̱� �����̴�.

--����
ALTER TABLE customer MODIFY phone VARCHAR2(11); --�� �ȴ�.. Ȯ��

--���̺����
CREATE TABLE member(
id VARCHAR2(20) PRIMARY KEY,
pwd VARCHAR2(20) NOT NULL,
name VARCHAR2(20) NOT NULL,
phone VARCHAR2(11) NOT NULL
);

--���Ÿ�� ���̺�
CREATE TABLE buy2(
no NUMBER PRIMARY KEY,
item VARCHAR2(20) NOT NULL,
mem VARCHAR2(20),
bdata DATE DEFAULT SYSDATE, --date�� �ƴ϶� data�� ��� ������
FOREIGN KEY (mem) REFERENCES member(id) ON DELETE SET NULL
);

INSERT INTO member VALUES('ardor1216', 'asdf1234', 'lee', '01075980217');
INSERT INTO buy(no, item, mem) VALUES('11', 'asdf1212', 'ardor1216'); --�⺻Ű�� foreign key�� ���� ���ƾ� �Ѵ�.

CREATE TABLE mem_tbl(
no number,
id VARCHAR2(20),
pw VARCHAR2(20) NOT NULL,
phone VARCHAR2(11) NOT NULL,
CONSTRAINTS �������Ǹ� PRIMARY KEY(no, id) --����Ű ����
);






sql> conn user01/tiger

CREATE TABLE tdata( --ũ.. ���̺� �����̵ȴ�.
id number
)

INSERT INTO tdata values(10);

SELECT * FROM tdata; -- ��.. �����ͷ� ����.

/*
1. system, sys�� ����
2. ����� ���� ���� -- user01, tiger
3. DB���� ���� �ο� :  grant create session .. -> conn �� ����
4. ���̺� ���� ���� �ο� : grant create table.. -> create table�� ����
*/

--resource �� role. ������ ���� ��. resource�� ���ؼ� �ѹ濡 �� �� ����.

--

CREATE VIEW tdata_view
AS
SELECT *
FROM tdata;

select * from tdata;
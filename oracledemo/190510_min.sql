select * from user_constraints;
desc test; --테이블의 구조를 확인할 때

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
ALTER TABLE test MODIFY grade NUMBER(1); -- 이미 큰 값을 넣은 상태에서 크기를 줄이면 오류 발생

--데이터가 없는 경우는 변경 가능
--데이터가 있는 경우, CHAR와 VARCHAR2는 변경가능

INSERT INTO test(data1, salary, job) values(3000, 40, 'CLARK');
ALTER TABLE test MODIFY grade NUMBER(2) default 0; --defautl 값 설정

INSERT INTO test(data1, salary, job) VALUES (4000,50,'RESEARCH'); --0으로 채워짐


--DROP은 컬럼 자체가 없어지므로 컬럼 안의 데이터도 지워짐.

AlTER TABLE test DROP COLUMN job;
DeSC test;

SELECT * FROM test;

ALTER TABLE test ADD CONSTRAINTS test_data1_pk PRIMARY KEY(data1);

SELECT constraint_name, table_name FROM USER_CONSTRAINTS WHERE table_name = 'TEST';

--제약조건명 변경

ALTER TABLE test RENAME CONSTRAINTS test_data1_pk TO test_dental_pk_new;

SELECT constraint_name, table_name FROM USER_CONSTRAINTS WHERE table_name = 'TEST';

--제약조건 수정 : 삭제 후 새로 만들 것

ALTER TABLE test DROP CONSTRAINT test_dental_pk_new;

--비활성

ALTER TABLE test SET UNUSED (GRADE);

SELECT * FROM test; -- 비활성됨
DESC test; --구조에서도 안 보임
SELECT * FROM user_tables;
SELECT * FROM user_unused_col_tabs;

--테이블명 변경 (변경 대상간 비교해 볼 것)
ALTER TABLE test RENAME TO test_new;
SELECT * FROM test;
SELECT * FROM test_new;
SELECT table_name FROM user_tables;

-- delete, drop, truncate
/* delete은 commit을 안 하면 되살릴 수 있다. drop은 하는 순간 commit이 돼버림(auto commit).
truncate : delete처럼 데이터는 다 지워지고 구조는 남아 있으며 commit이 된다. 따라서 되살릴수 있는
방법은 없다.*/

--테이블생성
CREATE TABLE customer(
id VARCHAR2(20) PRIMARY KEY,
pwd VARCHAR2(20) NOT NULL,
name VARCHAR2(20) NOT NULL,
phone NUMBER NOT NULL
);


--INSERT, SELECT구문
INSERT INTO customer VALUES('kd_hong', 'pass01', '홍길동', '01055557777');
SELECT * FROM customer;

--출력결과
kd_hong	pass01	홍길동	1055557777 --데이터 타입이 숫자이기 때문이다.

--수정
ALTER TABLE customer MODIFY phone VARCHAR2(11); --안 된다.. 확인

--테이블생성
CREATE TABLE member(
id VARCHAR2(20) PRIMARY KEY,
pwd VARCHAR2(20) NOT NULL,
name VARCHAR2(20) NOT NULL,
phone VARCHAR2(11) NOT NULL
);

--구매목록 테이블
CREATE TABLE buy2(
no NUMBER PRIMARY KEY,
item VARCHAR2(20) NOT NULL,
mem VARCHAR2(20),
bdata DATE DEFAULT SYSDATE, --date가 아니라 data로 줘야 생성됨
FOREIGN KEY (mem) REFERENCES member(id) ON DELETE SET NULL
);

INSERT INTO member VALUES('ardor1216', 'asdf1234', 'lee', '01075980217');
INSERT INTO buy(no, item, mem) VALUES('11', 'asdf1212', 'ardor1216'); --기본키와 foreign key의 값이 같아야 한다.

CREATE TABLE mem_tbl(
no number,
id VARCHAR2(20),
pw VARCHAR2(20) NOT NULL,
phone VARCHAR2(11) NOT NULL,
CONSTRAINTS 제약조건명 PRIMARY KEY(no, id) --복합키 설정
);






SELECT * FROM emp;

INSERT INTO EMP VALUES(7369,'SMITH','CLERK',7902,'1980-12-17',800,null,20);
INSERT INTO EMP VALUES(7499,'ALLEN','SALESMAN',7698,'1981-02-20',1600,300,30);
INSERT INTO EMP VALUES(7521,'WARD','SALESMAN',7698,'1981-02-22',1250,200,30);
INSERT INTO EMP VALUES(7566,'JONES','MANAGER',7839,'1981-04-02',2975,30,20);
INSERT INTO EMP VALUES(7654,'MARTIN','SALESMAN',7698,'1981-09-28',1250,300,30);
INSERT INTO EMP VALUES(7698,'BLAKE','MANAGER',7839,'1981-04-01',2850,null,30);
INSERT INTO EMP VALUES(7782,'CLARK','MANAGER',7839,'1981-06-01',2450,null,10);
INSERT INTO EMP VALUES(7788,'SCOTT','ANALYST',7566,'1981-10-09',3000,null,20);
INSERT INTO EMP VALUES(7839,'KING','PRESIDENT',null,'1981-11-17',5000,3500,10);
INSERT INTO EMP VALUES(7844,'TURNER','SALESMAN',7698,'1981-09-08',1500,0,30);
INSERT INTO EMP VALUES(7876,'ADAMS','CLERK',7788,'1983-01-12',1100,null,20);
INSERT INTO EMP VALUES(7900,'JAMES','CLERK',7698,'1981-10-03',950,null,30);
INSERT INTO EMP VALUES(7902,'FORD','ANALYST',7566,'1981-10-03',3000,null,10);
INSERT INTO EMP VALUES(7934,'MILLER','CLERK',7782,'1982-01-23',1300,null,10);
--DELETE FROM emp; 테이블 전체 삭제
commit; -- 테이블의 데이터를 실채화 시키는 명령
SELECT * FROM emp;


CREATE TABLE DEPT

(DEPTNO number,
DNAME VARCHAR2(14),
LOC VARCHAR2(13));

INSERT INTO DEPT VALUES (10,'ACCOUNTING','NEW YORK');
INSERT INTO DEPT VALUES (20,'RESEARCH','DALLAS');
INSERT INTO DEPT VALUES (30,'SALES','CHICAGO');
INSERT INTO DEPT VALUES (40,'OPERATIONS','BOSTON');
SELECT * FROM DEPT;


CREATE TABLE BONUS
(
ENAME VARCHAR2(10),
JOB VARCHAR2(9),
SAL number,
comm number);

CREATE TABLE SALGRADE
(GRADE number,
LOSAL number,
HISAL number);

INSERT INTO SALGRADE VALUES(1,700,1200);
INSERT INTO SALGRADE VALUES(2,1201,1400);
INSERT INTO SALGRADE VALUES(3,1401,2000);
INSERT INTO SALGRADE VALUES(4,2001,3000);
INSERT INTO SALGRADE VALUES(5,3001,9999);

SELECT * FROM SALGRADE;


SELECT * from user_tables;

SELECT table_name from user_tables;

--//////////////////////////////////////////////////
select * from dept;
alter table dept add PRIMARY key(deptno); -- 수정한다 dept에 기본키를 추가한다.


CREATE TABLE emp01(
    empno NUMBER PRIMARY KEY
    ,ename VARCHAR2(20) NOT NULL
    ,job VARCHAR2(9) UNIQUE
    ,deptno NUMBER(2) REFERENCES dept(deptno)--dept 기본키가 지정이 안됨 외국어키로 설정
    );
-- PRIMARY KEY , R NOT  u UNIQUe c NULL
SELECT * FROM user_constraints;
--USER_CONSTRAINTS 테이블에서 확인

CREATE TABLE emp02(
    empno NUMBER CONSTRAINTS EMP02_EMPNO_PK PRIMARY KEY
    ,ename VARCHAR2(20) CONSTRAINTS EMP02_ENAME_NN NOT NULL
    ,job VARCHAR2(9) CONSTRAINTS EMP02_JOB_UK UNIQUE
    ,deptno NUMBER(2) CONSTRAINTS EMP02_DEPTNO_FK REFERENCES dept(deptno)--dept 기본키가 지정이 안됨 외국어키로 설정
    );
--DROP TABLE emp02;
SELECT * FROM user_constraints WHERE table_name='EMP02';
select * from emp02;
select * from dept;


CREATE TABLE emp03(
    empno NUMBER 
    ,ename VARCHAR2(20) NOT NULL
    ,job VARCHAR2(9) 
    ,deptno NUMBER(2)
    ,PRIMARY KEY(empno)
    ,UNIQUE(job)
    ,FOREIGN KEY(deptno)REFERENCES dept(deptno)--dept 기본키가 지정이 안됨 외국어키로 설정
    );
    
SELECT * FROM user_constraints;


CREATE TABLE emp04(
    empno NUMBER 
    ,ename VARCHAR2(20) constraints emp04_ename_nn NOT NULL
    ,job VARCHAR2(9) 
    ,deptno NUMBER(2)
    ,constraints emp04_empno_pk PRIMARY KEY(empno)
    ,constraints emp04_job_uk UNIQUE(job)
    ,constraints emp04_deptno_fk foreign key(deptno) REFERENCES dept(deptno)--dept 기본키가 지정이 안됨 외국어키로 설정
);

SELECT * FROM user_constraints
WHERE table_name='EMP04';

--ORA-01400: cannot insert NULL into ("SCOTT"."EMP04"."ENAME") null값이 들어가면 안된다.
insert into emp04(empno,ename,job,deptno)
values(7369,'SMITH','SALEMAN',10);
DELETE from emp04;
SELECT * from emp04;

insert into emp04
values(7370,'TOM','CLARK',20);

--ORA-00001: unique constraint (SCOTT.EMP04_JOB_UK) violated 유니크에 해당하는 컬럼에 중복된 값을 넣게 해서 오류가 남.
insert into emp04
values(7372,'JOHN','CLARK',10);

CREATE TABLE test(
    data1 number,
    data2 number check(data2 >=1 AND data2<=99)
    );

insert into test(data1, data2)
values(100,50);

--ORA-02290: check constraint (SCOTT.SYS_C007019) violated    check에서 제시한 범위보다 오버 되서 오류가 뜬다.
insert into test(data1, data2)
values(200,150);

--ORA-00906: missing left parenthesis   uniq문을 새로 설정한 값에 해당하지않은 값이 이미 들어있기 때문에 오류난다.
SELECT * from test;
delete from test;
alter table test add constraint test_ck_data1 
check (data1 in(1000,2000,3000,4000));

insert into test
values(1000,50);

insert into test
values(2000,60);

select * from test;
select * from emp04;

ORA-02292: integrity constraint (SCOTT.EMP04_DEPTNO_FK) violated - child record found
delete from dept
where deptno=10;

delete from dept
where deptno=40;

DROP TABLE parenttbl;
create table parenttbl(
name varchar2(30) constraint publ_name_pk primary key
);

create table test1(
no number(4) primary key,
name varchar2(30) 
constraint test1_name_pk references parenttbl(name) on delete cascade
);

insert into parenttbl
values ('홍길동');

insert into parenttbl
values('모모랜드');
insert into test1
values (10, '홍길동');

select * from parenttbl;
select * from test1;
delete from parenttbl;
where name ='홍길동'; -- 둘다 지워짐


create table test2(
no number(4) primary key,
name varchar2(30) constraint test2_pk references parenttbl(name) on delete set null
);
--DROP TABLE test2;
select * from parenttbl;

insert into test2
values(20, '모모랜드');
select * from parenttbl;
select * from test2;
delete from parenttbl;
commit;
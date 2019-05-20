create user user03 identified by tiger;

--user03계정에 connect, resource 를 권한 부여
grant connect, resource to user03;

--데이터딕셔너리인 dict테이블에서 role을 검색

SELECT * FROM dict
where table_name like '%ROLE%';

--mrole 생성 --role 생성은 system 계정에서 해야 함
create role mrole;

--mrole롤을 user03계정에 권한 부여
grant mrole to user03;
grant select on hr.emp to user03;

SELECT * FROM hr.emp;

revoke mrole from user03;
revoke select on hr.emp from user03;

--mrole를 제거한다.
drop role mrole;


=================================================================
--user04 사용자 생성
create user user04 identified by tiger;

--일단, 데이터베이스 접근 권한을 줘보자.
GRANT CREATE SESSION TO user04 with admin option;

GRANT CREATE TABLE TO user04;
alter user user04 default tablespace users quota unlimited on users;

--크기값 별도 설정

/*SQL> create user user04 identified by tiger
default tablespace users temporary tablespace temp
quota 1M on users;
=> user04 사용자 생성시 table space 설정*/



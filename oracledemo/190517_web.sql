SELECT * FROM DBA_SYS_PRIVS
WHERE grantee= 'HR'; --hr계정에 주어진 권한


SHOW USER;


--시스템 계정을 생성하기 위해 시스템 관리자로 접속
SQL> conn system/a1234

--현재 시스템관리자 상태이기 때문에 다른 사용자계정 생성가능하므로 정상실행
CREATE USER user01 identified by tiger;
SHOW USER;



사용자 권한 : 시스템권한과 객체권한으로 구분된다

 데이터베이스 관리자가 가지는 시스템권한
 1) create user : 새롭게 사용자를 생성하는 권한
 2) drop user : 사용자를 삭제하는 권한
 3) drop any table : 임의의 테이블을 삭제할 수 있는 권한
 4) query rewrite : 질의재작성을 할 수 있는 권한
 5) backup any table : 임의의 테이블을 백업할 수 있는 권한

 일반 사용자가 데이터베이스를 관리하는 권한
 1) create session : 데이터베이스에 접속할수 있는 권한 --connect를 사용할 수 있음.
 2) create table : 사용자 스키마에게 테이블을 생성할 수 있는 권한
 3) create view : 사용자 스키마에게 뷰를 생성할 수 있는 권한
 4) create sequence : 사용자 스키마에게 시퀀스를 생성할 수 있는 권한
 5) create procedure : 사용자 스키마에게 프로시저(함수)를 생성할수 있는 권한


--사용자에게 권한 부여하기 위한 grant 명령어
--grant system_privilege to user_name;

--user01사용자에게 데이터베이스 접근권한 부여
grant create session to user01;

conn user01/tiger;

show user;

select * from hr.employees; --시스템은 이게 가능! user01은 hr이 만든 데이터에 접근할 수 없다.
 
grant create table to user01;
alter user user01 default tablespace users quota unlimited on users; --데이터베이스 아키텍쳐 쪽에서 다룸

/*user02 계정에 데이터베이스 접근권한 부여시 WITH ADMIN OPTION을 지정하게 되면
현재 사용자 계정으로 다른 사용자에게 권한을 부여할 수 있다.*/

CREATE USER user02 identified by tiger;

grant create session to user02 WITH ADMIN OPTION;
grant create view to user02 WITH ADMIN OPTION;

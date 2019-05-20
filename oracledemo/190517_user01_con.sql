sql> conn user01/tiger

CREATE TABLE tdata( --크.. 테이블 생성이된다.
id number
)

INSERT INTO tdata values(10);

SELECT * FROM tdata; -- 오.. 데이터로 들어간다.

/*
1. system, sys로 접속
2. 사용자 계정 생성 -- user01, tiger
3. DB접근 권한 부여 :  grant create session .. -> conn 이 가능
4. 테이블 생성 권한 부여 : grant create table.. -> create table이 가능
*/

--resource 는 role. 권한을 묶은 것. resource를 통해서 한방에 줄 수 있음.

--

CREATE VIEW tdata_view
AS
SELECT *
FROM tdata;

select * from tdata;

show user;



=======================================================
SELECT * FROM emp; --접근불가
/*select문 실행을 하지만 에러발생. 이유는 emp객체에 접근할 수 있는 권한이 없다.
emp객체는 hr계정 소유이다. 자기 소유가 아닌 다른 계정의 소유객체에 접근하지 위해서는
반드시 접근 권한을 받아야 한다. */

--권한부여 후
SELECT * FROM emp; --역시 에러가 남
SELECT * FROM hr.emp; --이렇게 써야 한다. 내 것이 아니기 때문이다.

/*select실행 시 emp객체의 소유자인 hr을 명시했기 때문에 정상실햄됨.*/


SELECT * FROM user_tab_privs_recd;

/*에러발생 즉 user01계정에 부여된 emp객체를 조외하는 select명령문이 철회되었기 때문*/
SELECT * FROM hr.emp;


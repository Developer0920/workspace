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
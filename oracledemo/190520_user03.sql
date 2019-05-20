show user;

CREATE TABLE mytable(
    id number,
    name varchar2(50)
);

INSERT INTO mytable VALUES(10, 'min');
SELECT * FROM mytable;

SELECT * FROM dict;


--데이터딕셔너리인 dict테이블에서 role을 검색

SELECT * FROM dict
where table_name like '%ROLE%';

--현재 계정에서 생성된 테이블 볼 때 -- USER_TABLES

commit;

set role all; -- 이제 이걸 해줘야 함. 기본 role 이외에는 전부 disable이기 때문.
SELECT * FROM hr.emp;

SELECT * FROM user_tab_privs_recd;

--롤에 부여된 권한 확인하고 롤 회수하기
select * from role_tab_privs
where table_name in('EMP');

--현재 사용자에게 부여된 롤 권한 확인
SELECT * FROM user_role_privs;



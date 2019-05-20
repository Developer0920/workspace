create table sawon(
     id varchar2(10),
     name varchar2(20)
);

--user03은.. 바로 테이블 생성이 됨. user04는 에러가 뜬다.
--user03에게는 role을 가지고 권한을 부여. 이 경우는 alter user를 안 해줘도 된다.
--tablespace를 설정해 줘야.


drop table sawon;

SELECT * FROM sawon;

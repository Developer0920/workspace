-----------------------------------------------------------------------
오라클에서 제공되는 명령어
1.DQL(Data Query Language 데이터 질의어) :
 데이터를 검색해서 추출할 때 사용된다.(select)

2.DML(Data Maniplulation Language 데이터 조작어) :
 데이터는 추가, 수정, 삭제, 병합해주는 명령어들이다.
 (insert, update, delete, merge)

3.DDL(Date Definition Language 데이터 정의어) :
 테이블의 구조를 정의, 변경해주는 명령어들이다.
(create, drop, alter, truncate)

4.DCL(Data Control Language 데이터 제어어) :
 사용자의 권한을 부여, 제거해주는 명령어들이다. (grant, revoke)

5.TCL(Transcation Control Language 트랜잭션 처리어) :
 트랜잭션 설정, 취소를 처리해주는 명령어들이다.
 (commit, rollback, savepoint)
-----------------------------------------------------------------------
-- CREATE문 에서도 서브쿼리를 사용할 수 있다.

-- 이미 만들어져 있는 테이블의 구조만 복사해서 와보자.

DROP TABLE emp01;

--테이블 구조를 복사
CREATE TABLE emp01
AS
SELECT first_name, salary
FROM employees; --employees 테이블에서 first_name, salary를 가지고 emp01테이블을 생성하라. 이렇게 하면 데이터와 구조를 복사해서 옴

SELECT *
FROM emp01;

CREATE TABLE emp01
AS
SELECT first_name, salary
FROM employees
WHERE 1=0; --employees 테이블에서 1=0일 때, first_name과 salary를 가지고 와라. 일부러 이렇게 하는 것. 1=0 일 수 없으므로. 크!!

--테이블에 레코드를 삽입
INSERT INTO 테이블(컬럼1, 컬럼2)
VALUES ('값1', 값2);

INSERT INTO emp01(first_name, salary) -- (first_name, salary) 는 생략가능
VALUES('candy', 5000);

--묵시적 null값과 명시적 null값
--테이블 모든 컬럼에 데이터를 삽입할 때는 컬럼명을 생략할 수 있다.

INSERT INTO emp01
VALUES ('Steven', 4000);

--null값이 입력될 수 있는지 확인해 보자.
DESC emp01; --테이블의 구조를 확인할 때 사용

--묵시적 NULL 삽입 방법
INSERT INTO emp01(first_name)
VALUES ('Lex'); --여기서 하나가 비는데, 이곳에 null값이 들어감

--명시적 Null 삽입방법
INSERT INTO emp01
VALUES ('Paran', null);

SELECT *
FROM emp01;

--------------------------------------------------
테이블의  내용을 수정하는 명령어이다.
UPDATE 테이블명
SET 컬럼1=값1, 컬럼2=값2
WHERE 컬럼=값;
---------------------------------------------------
--emp01테이블의 first_name 컬럼의 값이 'candy'일 때
--salary컬럼의 값을 8000으로 수정하라.
UPDATE emp01
SET salary = 8000
WHERE first_name = 'candy';

----------------------------------------------------
DELETE
DELETE FROM 테이블명 WHRER 컬럼=값; --삭제할 때는 특정 컬럼만 삭제가 안 됨. 레코드 단위로 삭제가 가능. 따라서 컬럼을 지정하는 자리가 없다.
----------------------------------------------------
DELETE FROM emp01
WHERE first_name = 'candy';

--컬럼 자체를 밀어버릴려면 drop을 써야. 또는 null값을 줄 것






==================================================================================================
트랜잭션(Transaction)
1 트랜잭션 정의
  -한번에 수행되어야 할 데이터베이스의 일련의 Read와
   Write 연산을 수행하는 단위
  -하나의 논리적 기능을 수행하기 위한 작업의 단위로서
  데이터베이스의 일관된 상태를 또 다른 일관된 상태로
  변환시킴
  
  트랜잭션시작-> 수정->삭제->삽입 -> 트랜잭션종료
  하나의 작업이 시작해서 정상적으로 종료될때까지의 과정을 말한다.
  (논리적인 작업단위)
  
  은행(ATM)->기계 카드삽입-> 기계가 카드를 읽음->
  인출금액 입력-> 비밀번호 입력-> 기계에서 출금액 처리
  -> 출금금액 제공-> 카드제공
  
  <트랜잭션 시작>
  -데이터베이스에 처음 접속했을 때
  -하나 또는 여러 개의 DML문이 실행된후 commit 또는 rollback
   문이 실행된 직후
  
   <트랜잭션 종료>
  - commit 또는 rollback문이 실행될 때
  - DDL 또는 DCL문이 실행될 때 --auto commit이 되기 때문이다.
  - 정상적으로 데이터베이스를 종료할 때
  - 비정상적으로 데이터베이스를 종료할 때
  
2 트랜잭션 안전성 확보를 위한 ACID
  1) ACID정의 
     -데이터베이스에서 논리적인 작업단위인 트랜잭션이
       안전하게 수행되는 것을 보장하는 특성집합
  2) ACID의 필요성
     -다중 사용자 환경 대응 :동일데이터-다중작업환경에서의
          데이터 처리 정확성 보장
     -안전한 트랜잭션 수행을 통한 데이터베이스 무결성 유지
  3) 트랜잭성 구성요소 (ACID)   
    Atomicity(원자성):
     -트랜잭션은 한 개 이상의 동작을 논리적으로 한 개의 --쇼핑몰에서 잔고가 부족할 경우 결제가 안 되게 함. 이 때 앞에 단계까지 다 취소되어야. 이게 트랜잭션.
      작업단위(single unit of work)로서 분해가
      불가능한 최소의 단위
     -연산 전체가 성공적으로 처리되거나 또는 한 가지라도
      실패할 경우 전체가 취소되어 무결성을 보장
      (All or Nothing)
    Consistency(일관성):
    -트랜잭션이 실행을 성공적으로 완료하면 언제나 모순 없이
     일관성 있는 데이터베이스 상태를 보존함
    - 테이블의 데이타는 갱신되고 그에 따른 인덱스는 갱신되지 않는 등의 부정합이 있어선 않된다.
    Isolation(고립성,독립성):
    -트랜잭션이 실행 중에 생성하는 연산의 중간 결과를
     다른 트랜잭션이 접근할 수 없음
   -커밋된 트랜잭션은 장애가 발생해도 데이타가 복구되여야 한다는 특성.
  Durability(영속성,지속성,내구성):
    -성공이 완료된 트랜잭션의 결과를 영구적으로 데이터베이스에
     저장됨     
==========================================================================================

commit;

INSERT INTO emp01
VALUES ('Beta', 7000);

SELECT * FROM emp01; -- 하지만.. 커맨드창에서는 안 나옴. 왜냐하면 메모리에만 저장돼 있기 때문. 이걸 DB에 저장되도록 해야 한다. 그게 바로 commit

INSERT INTO emp01
VALUES ('John', 2000);
--DML 명령어들은 다시 취소를 할 수 있다.
--트랜잭션...
--중간에 중간점(save point)을 이용해서 여기까지만 취소를 할 수도 있음.

SAVEPOINT sp;

DELETE FROM emp01
WHERE first_name = 'Beta'; -- John을 삭제해야 하는데 Beta를 삭제함. 이걸 되돌려 보자.

ROLLBACK TO sp;

SELECT * FROM emp01; --되돌리기 완료

DELETE FROM emp01
WHERE first_name = 'John';

--자동커밋을 해보자.
CREATE TABLE emp02(
    emp_id number primary key,
    first_name varchar2(50),
    salary number
); --이건 auto commit 이 된다. DDL과 DCL(?)

SELECT * FROM emp02;

A세션
 INSERT INTO emp02 VALUES (1, 'park', 9000);
 select * from emp02
 
B세션
 INSERT INTO emp02 values(1, 'park', 9000); --웨이팅 상태가 뜸
 /*A세션에서 입력중인 데이터는 입력할 수 없다. waiting상태가 된다. (LOCK상태 발생) */
 
A세션
 COMMIT; -- 이 순간 B에서 오류가 뜸
 
B세션
 --A세션이 commit이 발생되면 B세션은 해당 행에 대한 LOCK상태가 해제되면서 
 --오류 발생 ORA-00001: unique constraint (HR.SYS_C007052) violated
 
B세션
 SQL > insert into emp02 values(1, 'park', 9000);
 --ORA-00001: unique constraint (HR.SYS_C007052) violated
 INSERT INTO emp02 VALUES (2, 'dong', 8000);
 
A세션
insert into emp02 values(1, 'park', 9000);
/*'B세션에서 입력중인 데이터는 입력할 수 없다. waiting상태가 된다.(LOCK상태 발생) */

B세션
SQL > rollback; --A세션에서 쪽에서 데이터가 입력됨.


 



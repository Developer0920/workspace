뷰(view)
1) 물리적인 테이블을 근거한 논리적인 가상 테이블을 의미한다.
2) 기본테이블에서 파생된 객체로서 기본테이블에 대한 하나의 쿼리문이다.
3) 사용자에게 주어진 뷰를 통해서 기본 테이블을 제한적으로 사용하게 한다.
4) 뷰를 생성하기 위해 실제적으로 데이터를 저장하고 있는 물리적인 테이블이 존재해야 하는에 이를 기본 테이블이라 한다.

-서브쿼리 손 코딩 연습

--sys, system으로 접근해서 'HR' 계정에 주어진 권한 확인
SELECT * FROM DBA_SYS_PRIVS
WHERE grantee = 'HR'; --시스템계정으로 가서 해당 계정의 권한을 확인. 뷰를 생성하기 위해서.

--만약에 'HR' 계정에 view권한이 없으면 아래와 같이 실행
sql> grant create view to hr; --hr 계정에 view 권한 부여
--------------------------------------------------------------------------------------------
SELECT * FROM employees
WHERE employee_id=100;

/*위의 경우와 같이 데이터를 검색하기 위해서 select문장을 계속 사용하는데, 이는 작업의 번거로움을 초래.
이런 문제를 해결하기 위해 나온 개념이 뷰(VIEW)이다. */

--자주 사용하는 select 쿼리를 뷰로 생성한다.
CREATE VIEW emp_view --서브 쿼리를 이용해서 뷰를 생성함
AS
SELECT * FROM employees
WHERE employee_id = 100; --뷰가 생성되었다.

SELECT * FROM emp_view; --어떤 사용자에게 view에 접근하는 권한을 부여하면.. 지정한 컬럼에만 접근할 수 있게 된다.

--생성된 emp_view 뷰의 구조를 확인한다.
DESC emp_view;

-- USER_VIEW data dictionary에서 테이블 이름(뷰)과 텍스트(뷰를 생성할 때 사용한 쿼리문) 출력
SELECT view_name, text
FROM user_views;

/*select & from emp_view으로 질의를 하면 오라클은 user_views 데이타 딕셔너리에서 emp_view인 뷰 이름을 찾아서 이를 정의할 때 기술한
서브 쿼리문이 저장된 text값을 실행시킨다. */

CREATE TABLE emp_copy
AS SELECT * FROM employees; --서브쿼리를 이용해서 테이블 생성시, 제약조건 등은 적용이 안 됨. --컬럼레벨에서 준 건 그대로 가져온다.
-- primary key 는 안 가져온다. .. not null만 가져온다. 왜냐하면 not null은 컬럼레벨에서 지정해 주기 때문.
-- primary key를 컬럼 레벨에서 지정하면?
-- 컬럼레벨에서 지정한 not null만 가져온다. (별로 중요한 건 아님)

SELECT * FROM emp_copy;
DESC emp_copy;
DESC employees;

CREATE VIEW emp_view101
AS
SELECT first_name FROM emp_copy
SELECT * FROM emp_view101;

WHERE employee_id = 100;

SELECT * FROM emp_view100;

--뷰를 통해 실제 테이블에 삽입도 가능하다.
--emp_view100에 레코드 삽입
INSERT INTO emp_view100(employee_id, first_name, last_name, email, hire_date, job_id)
VALUES(10, 'John', 'Tom', 'john@daum.net', sysdate, 'AC_VP');

SELECT * FROM emp_view100; --employee_id = 100 의 값만 가져오기 때문에 10번이 안 나타남.
SELECT * FROM emp_copy
WHERE employee_id = 10;

-- 뷰를 사용하는 목적
-- 1) 특정 열로 접근제한할 때
-- 2) 쿼리문이 복잡해서 압축할 때 사용



UPDATE emp_view100
SET first_name = 'Park'
WHERE employee_id = 100;

SELECT * FROM emp_copy;
SELECT * FROM emp_view100;
SELECT * FROM employees;

DELETE from emp_view100
WHERE employee_id = 100;

뷰를 사용하는 이유
1) 복잡하고 긴 쿼리문을 뷰로 정의하면 접근을 단순화시킬 수 있다.
2) 보안에 유리하다.

뷰의 종류
 : 뷰를 정의하기 위해 사용된 기본 테이블의 갯수에 따라 단순뷰(simple view)와 복합뷰로 구분한다.

단순 뷰
 : 뷰를 정의하기 위해 기본테이블 하나 사용
-- 가상의 컬러명을 지정할 수도 있다.
-- 결과 출력 시 실제 컬럼명을 출력하지 않고 여기서 정의한 출력명을 출력한다.
CREATE VIEW emp_view10(사원번호, 이름, 부서번호)
AS
SELECT employee_id, first_name, department_id
FROM emp_copy
WHERE department_id = 10;

SELECT * FROM emp_view10;

SELECT 사원번호, 이름, 부서번호
FROM emp_view10;

SELECT employee_id, first_name, department_id
FROM emp_view10; --ORA-00904: "DEPARTMENT_ID": invalid identifier 이렇게 뜬다. 바로 이런 식으로 보안이 유지되는 것!!

----------------------------
SELECT * FROM DBA_SYS_PRIVS
WHERE grantee= 'HR'; --hr계정에 주어진 권한
----------------------------

복합뷰
 : 뷰 생성 시 두 개 이상의 기본 테이블로 생성 (일반적으로 조인)
 CREATE TABLE dept_copy
 AS
 SELECT * FROM departments;
 
 --두 개의 기본 테이블로 emp_dept_join 뷰 생성
 CREATE VIEW emp_dept_join
 AS
 SELECT e.employee_id, e.first_name, d.department_name --SELECT를 가지고 뷰를 생성하는 거다.
 FROM emp_copy e, dept_copy d
 WHERE e.department_id = d.department_id;
 
 --emp_dept_join 뷰 조회
 SELECT * FROM emp_dept_join; --이렇게 생성해 놓은 뷰를 가지고 조회를 하면 작업이 간단해 진다.
 
 --뷰 딕셔너리 검색
 SELECT view_name, text from user_views;
 
 --뷰를 삭제해 보자. 
 DROP VIEW emp_view;
 SELECT * FROM emp_view; --ORA-00942: table or view does not exist
 
 --뷰 생성
 CREATE VIEW emp_dept_join2
 AS
 SELECT e.employee_id, e.first_name, d.department_name 
 FROM emp_copy e, dept_copy d 
 WHERE e.department_id = d.department_id;
 
 --존재하지 않는 테이블
 SELECT * FROM emp; --ORA-00942: table or view does not exist
 
 --emp테이블이 존재하지 않으므로 오류발생
 CREATE VIEW emp_view2
 AS
 SELECT * FROM emp; --ORA-00942: table or view does not exist
 
 뷰를 생성할 때 지정하는 FORCE/NOFORCE옵션
  : 기본적으로 뷰를 생성할 때에는 기본테이블이 있다는 존재 하에 쿼리문을 작성한다.
   하지만 기본 테이블이 존재하지 않는 경우에도 뷰를 생성할 수 있따. 이 때에는 FORCE 옵션이 지정되어 있어야 한다.
   특별한 설정이 없으면 NOFORCE옵션이 지정되어 있는 것으로 간주한다.
 
 /*실제 존재하지 않는 emp기본테이블로 emp_view2뷰를 생성한다. 결과는 정상실행.
  기본테이블이 없으면 반드시 뷰 생성시 FORCE옵션을 설정해야 한다. */
  
  
 CREATE FORCE VIEW emp_view2
 AS
 SELECT * FROM emp;
 
 SELECT * FROM emp_view2;
 
 CREATE TABLE emp
 AS
 SELECT employee_id, first_name, salary
 FROM employees;
 
--------------------------------------------------------------------
 WITH CHECK OPTION
  : 생성된 뷰를 통해서 기본테이블에 저장된 데이터 변경을 못하도록 with check option 설정 -- 겁나 좋은 것
  
drop view emp_view200;
drop view emp_copy200;


CREATE TABLE emp_copy200
AS
SELECT employee_id, first_name, salary
FROM employees
WHERE employee_id = 200;


SELECT * FROM emp_view200;


CREATE VIEW emp_view200
AS
SELECT employee_id, first_name, salary
FROM emp_copy200
WHERE employee_id = 200;

--first_name의 값이 변경됨
UPDATE emp_view200
SET first_name = 'korea'
WHERE employee_id = 200;

SELECT * FROM emp_view200;
SELECT * FROM emp_copy200;
SELECT employee_id, first_name, salary
FROM employees
WHERE employee_id = 200;

UPDATE emp_view200
SET employee_id = 200
WHERE first_name = 'sample';
  
UPDATE emp_view200
SET employee_id = 500
WHERE first_name = 'korea';

 
DROP view emp_view300;

CREATE VIEW emp_view300
AS
SELECT employee_id, first_name, salary
FROM emp_copy200
WHERE employee_id = 500 WITH CHECK OPTION;

SELECT * FROM emp_view300;

--변경 불가능
UPDATE emp_view300
SET employee_id = 30
WHERE first_name = 'korea'; --ORA-01402: view WITH CHECK OPTION where-clause violation

UPDATE emp_view300
SET first_name = 'sample'
WHERE employee_id = 500; -- employee_id만 변경이 불가능한 것



CREATE VIEW emp_view400
AS
SELECT employee_id, first_name, salary
FROM emp_copy200
WHERE employee_id = 500 AND first_name = 'sample'  WITH CHECK OPTION;

UPDATE emp_view400
SET first_name = 'first'
WHERE employee_id = 500;

UPDATE emp_view400
SET employee_id = 900
WHERE first_name = 'sample'; -- 둘 다 변경할 수 없다.

SELECT * FROM emp_view400;

DROP VIEW emp_view400

----------------------------------------------
WITH READ ONLY
 : 뷰에 DML을 적용하여 기본 테이블을 변경할 수 없는 기능
 
DROP TABLE emp_copy600;
 
CREATE TABLE emp_copy600
AS
SELECT employee_id, first_name, salary
FROM employees
WHERE employee_id = 100;

SELECT * FROM emp_copy600;

DROP TABLE emp_view600;

CREATE VIEW emp_view600
AS
SELECT *
FROM emp_copy600
WHERE employee_id = 100 WITH READ ONLY;

SELECT * FROM emp_view600;

--오류발생  ORA-42399: cannot perform a DML operation on a read-only view
INSERT INTO emp_view600(employee_id, first_name, salary)
VALUES(20, 'aee', 500000);

--오류발생
UPDATE emp_view600
SET first_name = 'test'
WHERE employee_id = 100;

--오류발생
DELETE FROM emp_view600
WHERE employee_id = 100;

--constraint 는 객체가 아니다.

-- CREATE로 생성하는 것.. TABLE, VIEW, 이제 시퀀스를 보자. 자동번호생성
-----------------------------------------------------
 시퀀스(sequence)
   테이블 내의 유일한 숫자를 자동으로 생성하는 자동번호 발생이므로 시퀀스를
   기본 키로 사용하면 사용자의 부담을 줄일 수 있다.

   create sequence 시퀀스명
     start with  n - 시퀀스 시작번호
     increment by n  -시퀀스 증가치
     nocache  -cache는 메모리상의 시퀀스값을 관리하게 하는데 기본값이 20이다.
              -nocache은 메모리상의 시퀀스를 관리하지 않는다.
     nocycle  - cycle은 지정된 시퀀스값이 최대값까지 증가를 완료하면 start with
                옵션에 지정된 시작값에시 다시 시퀀스를 시작한다.
              - nocycle은  증가가 완료되면 에러를 유발한다.

    maxvalue n;- 시퀀스가 가질수 있는 최대값을 지정한다.
              maxvalue의 기본값은 ascending일때 1027승, descending 일때 -1이다.
-------------------------------------------------------------------------- 
DROP TABLE emp10;

CREATE TABLE emp10(
num number,
name varchar2(20)
);

CREATE SEQUENCE emp10_num_seq
START WITH 1
INCREMENT BY 1
NOCACHE 
NOCYCLE;

--currval : 현재 시퀀스 - nextval을 수행한 다음 사용가능
SELECT emp10_num_seq.currval FROM dual; --시퀀스를 한 번도 생성 안 했으므로 오류가 뜬다.
--시퀀스를 생성하고 nextval을 한 번 이상 사용해야 이걸 사용할 수 있음.

--메모리상에서 시퀀스 값을 관리하게 하겠다.. 이런 경우 cashe로.

--nextval : 다음 시퀀스
INSERT INTO emp10 values(emp10_num_seq.nextval, 'ggg');

SELECT * FROM emp10;

=====================================================================================================
-- 권한에 대해서 알아보자. 유저도 하나의 객체. CREATE 사용

SHOW USER;
사용자 관리
/*사용자계정 user01, 비밀번호 tiger를 사진 사용자 생성을 생성하나 오류발생, 사용자 계정은 시스템관리자에게만 권한이 있음. */

CREATE USER user01 identified by tiger; --01031. 00000 -  "insufficient privileges"





-- 부속질의(Subquery) - 서브쿼리 - nester query (중첩쿼리)
-- 실행순서: where 절의 부속질의를 먼저 처리하고 전체질의를 수행한다.

use bookstore;

select * from book;

-- 가장 비싼 도서명을 조회하세요
select bookname, max(price)
from book;

-- 35000을 리턴하는 select문을 넣어줌
select bookname
from book
where price = 35000;

select bookname
from book
where price = (
	select max(price) from book
);
-- 서브쿼리는 sql문이므로 결과는 테이블로 반환, 단일행 - 단일형(1x1), 다중행 - 단일열(N x 1), 단일행 - 다중열(1 x N), 다중행 - 다중열(N x N)

-- 도서를 구매한 적이 있는 고객의 이름을 검색하시오.
SELECT name
FROM Customer
WHERE custid IN (SELECT custid FROM Orders); -- 여러개의 튜플이 있으면 in으로 처리가 가능

-- select * from orders;
select custid from orders order by custid; -- {1,2,3,4} 고객번호를 이용해서 customer 테이블에서 고객의 이름을 찾는다. n x 1

select * from book where publisher = '대한미디어';

select * from orders where custid = 5;

select name from customer where custid in(
	select custid from orders where bookid in (
		select bookid from book where publisher = '대한미디어'
    )
);



select avg(price)
from book
group by publisher;

-- b1, b2는 튜플 변수
select bookname from Book b1 where b1.price > (
	select avg(b2.price)
    from book b2
    where b1.publisher = b2.publisher
);

-- 2-13 도서의 판매액 평균보다 자신의 구매액 평균이 더 높은 고객의 이름
-- 1. 도서의 판매액 평균값을 구한다. 2. 평균값보다 초과인 구매고객별 평균을 구하여 비교 3. 해당 고객의 이름 출력.
-- select salesprice 

-- 서비쿼리부터 우선 작성
select avg(o1.saleprice) from orders o1;
select avg(o2.saleprice) from orders o2 where c1.custid = o2.custid;
select name
	from customer c1
		where (select avg(o2.saleprice) from orders o2 where c1.custid = o2.custid) >
			(select avg(o1.saleprice) from orders o1);
            
select * from book;
select * from orders;

-- select name
-- from customer
-- where custid = (
-- 	select custid
--     from orders
--     group by saleprice
--     having avg(saleprice) < any(
-- 		select saleprice
--         from orders
-- 		group by custid
--     )
-- );
select name
from customer c, orders o
where c.custid = o.custid
group by c.custid
having avg(o.saleprice) > (select avg(saleprice) from orders);


select custid, saleprice
        from orders;

CREATE TABLE usertbl -- 회원 테이블
( userID  	CHAR(8) NOT NULL PRIMARY KEY, -- 사용자 아이디(PK)
  name    	VARCHAR(10) NOT NULL, -- 이름
  birthYear   INT NOT NULL,  -- 출생년도
  addr	  	CHAR(2) NOT NULL, -- 지역(경기,서울,경남 식으로 2글자만입력)
  mobile1	CHAR(3), -- 휴대폰의 국번(011, 016, 017, 018, 019, 010 등)
  mobile2	CHAR(8), -- 휴대폰의 나머지 전화번호(하이픈제외)
  height    	SMALLINT,  -- 키
  mDate    	DATE  -- 회원 가입일
);
CREATE TABLE buytbl -- 회원 구매 테이블(Buy Table의 약자)
(  num 		INT AUTO_INCREMENT NOT NULL PRIMARY KEY, -- 순번(PK)
   userID  	CHAR(8) NOT NULL, -- 아이디(FK)
   prodName 	CHAR(6) NOT NULL, --  물품명
   groupName 	CHAR(4)  , -- 분류
   price     	INT  NOT NULL, -- 단가
   amount    	SMALLINT  NOT NULL, -- 수량
   FOREIGN KEY (userID) REFERENCES usertbl(userID)
);

INSERT INTO usertbl VALUES('LSG', '이승기', 1987, '서울', '011', '1111111', 182, '2008-8-8');
INSERT INTO usertbl VALUES('KBS', '김범수', 1979, '경남', '011', '2222222', 173, '2012-4-4');
INSERT INTO usertbl VALUES('KKH', '김경호', 1971, '전남', '019', '3333333', 177, '2007-7-7');
INSERT INTO usertbl VALUES('JYP', '조용필', 1950, '경기', '011', '4444444', 166, '2009-4-4');
INSERT INTO usertbl VALUES('SSK', '성시경', 1979, '서울', NULL  , NULL      , 186, '2013-12-12');
INSERT INTO usertbl VALUES('LJB', '임재범', 1963, '서울', '016', '6666666', 182, '2009-9-9');
INSERT INTO usertbl VALUES('YJS', '윤종신', 1969, '경남', NULL  , NULL      , 170, '2005-5-5');
INSERT INTO usertbl VALUES('EJW', '은지원', 1972, '경북', '011', '8888888', 174, '2014-3-3');
INSERT INTO usertbl VALUES('JKW', '조관우', 1965, '경기', '018', '9999999', 172, '2010-10-10');
INSERT INTO usertbl VALUES('BBK', '바비킴', 1973, '서울', '010', '0000000', 176, '2013-5-5');
INSERT INTO buytbl VALUES(NULL, 'KBS', '운동화', NULL   , 30,   2);
INSERT INTO buytbl VALUES(NULL, 'KBS', '노트북', '전자', 1000, 1);
INSERT INTO buytbl VALUES(NULL, 'JYP', '모니터', '전자', 200,  1);
INSERT INTO buytbl VALUES(NULL, 'BBK', '모니터', '전자', 200,  5);
INSERT INTO buytbl VALUES(NULL, 'KBS', '청바지', '의류', 50,   3);
INSERT INTO buytbl VALUES(NULL, 'BBK', '메모리', '전자', 80,  10);
INSERT INTO buytbl VALUES(NULL, 'SSK', '책'    , '서적', 15,   5);
INSERT INTO buytbl VALUES(NULL, 'EJW', '책'    , '서적', 15,   2);
INSERT INTO buytbl VALUES(NULL, 'EJW', '청바지', '의류', 50,   1);
INSERT INTO buytbl VALUES(NULL, 'BBK', '운동화', NULL   , 30,   2);
INSERT INTO buytbl VALUES(NULL, 'EJW', '책'    , '서적', 15,   1);
INSERT INTO buytbl VALUES(NULL, 'BBK', '운동화', NULL   , 30,   2);

SELECT * FROM usertbl;
SELECT * FROM buytbl;

-- buytbl 체이블을 참고하여 사용자가 구매한 물품의 개수를 조회하시오
SELECT userid "사용자 아이디", sum(price * amount) "회원별 총 구매액"
FROM buytbl
group by userid; 

select userid, price
from buytbl
group by userid;

select * from buytbl;

select count(*) from usertbl;
select count(mobile1) from usertbl;

select * from usertbl;

select userId, sum(price * amount) '회원별 총구매액'
FROM buytbl
group by userid
having sum(price*amount) > 1000;


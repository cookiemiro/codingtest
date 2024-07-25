use bookstore;
SELECT phone
FROM Customer
WHERE name = "김연아";

select * from customer where name = '김연아';

SELECT bookname, publisher
FROM book
WHERE price >= 10000;

SELECT * FROM book;

select distinct publisher from book order by publisher;

select bookid, bookname, price from book where price < 20000;

SELECT * FROM book WHERE price >= 10000 and price <=20000;

SELECT * FROM book WHERE price between 10000 and 20000;

SELECT publisher
 FROM BOOK WHERE PUBLISHER IN("굿스포츠", "대한미디어");

SELECT bookname, publisher FROM BOOK WHERE bookname  LIKE'축구의 역사';

select bookname, publisher from book where bookname like '%축구';

SELECT * FROM BOOK ORDER BY price, bookname;

SELECT * FROM BOOK ORDER BY price DESC, PUBLISHER ASC;

select SUM(saleprice) as 총매출 from orders;
select SUM(saleprice) 총매출 from orders;


select SUM(saleprice) as "김연아 고객님의 구매금액" from orders where custid = 2;

SELECT SUM(saleprice) as 총매출, AVG(saleprice) as 평균값, 
		MIN(saleprice), MAX(saleprice)
FROM orders;

SELECT COUNT(*) FROM orders;

SELECT COUNT(distinct publisher) FROM BOOK;

select count(ifnull(saleprice, 0)) from orders;

select * from orders;

SELECT custid, COUNT(*) as 도서수량, SUM(saleprice) as 총판매액
FROM orders
GROUP BY custid
order by orderid;

SELECT custid, COUNT(*) as 도서수량, SUM(saleprice) as 총판매액
FROM orders
WHERE saleprice >= 8000 order by custid;

SELECT custid, COUNT(*) as 도서수량, SUM(saleprice) as 총판매액
FROM orders
WHERE saleprice >= 8000 group by custid having count(*) >= 2;

-- 1.
select bookid, bookname from book where bookid = 1;
-- 2.
select bookid, bookname, price from book where price >= 20000;
-- 3.
select sum(saleprice) as '총구매액'
from orders
where custid = 1;
-- 4.
select count(bookid)
from orders
where custid = 1
group by custid;

-- 2-1.
select count(bookid)
from book
where publisher = '마당서점';

select * from book;

-- 2-2.
select count(distinct publisher)
from book;

-- 2-3
select custid, name, address from customer;

-- 2-4
select orderid, bookid , saleprice, orderdate
from orders
where orderdate between '2024-07-04' and '2024-07-07';
-- str_to_date(), date() => 함수를 사용하면 성능향상이 있다.

-- 2-5
select bookid from orders where orderdate not between '2024-07-04' and '2024-07-07';

-- 2-6
select name, address from customer where name like "김%";

-- 2-7
-- select 

select * from customer, orders; -- 두 테이블을 아무 조건없이 연결한 결과 관계대수 : 카티션 프로덕트 연산 5 x 10

-- 한 행에 대해 다른 테이블을 모두 매핑
select count(custid) from customer;
select count(orderid) from orders;

-- 조인(join) : 한 체이블의 행을 다른 테이블의 행에 연결하여 두 개 이상의 테이블을 결합하는 연산
SELECT * 
FROM customer, orders
WHERE Customer.custid = orders.custid order by customer.name;

select name, saleprice
from customer, orders
where orders.custid = customer.custid order by customer.custid desc;

select name, sum(orders.saleprice)
from customer, orders
where customer.custid = orders.custid
group by customer.name
order by customer.name;

SELECT customer.name, book.bookname, book.price
FROM customer, book, orders
WHERE customer.custid = orders.custid and orders.bookid = book.bookid;

select customer.name, book.bookname
from customer, book, orders
where customer.custid = orders.custid and orders.bookid = book.bookid and book.price = 20000;

-- Outer 조인 (외부조인)

select * from customer;
select * from orders order by custid;

select customer.name, book.bookname, book.bookid
from customer, book, orders
where customer.custid = orders.custid and orders.bookid = book.bookid;

select customer.name, orders.saleprice
from customer left outer join orders on customer.custid = orders.custid;
-- where customer.custid = orders.custid and orders.bookid = book.bookid;

select count(book.publisher)
from customer, orders, book
where customer.custid = orders.custid and orders.bookid = book.bookid and customer.name = '박지성';

select book.bookname, price, price - saleprice
from customer, orders, book
where customer.custid = orders.custid and orders.bookid = book.bookid and customer.name = '박지성';

select distinct bookname
from customer, orders, book
where customer.custid = orders.custid and orders.bookid = book.bookid and customer.name <> '박지성';
select userId, name
from usertbl
where birthYear >= 1970 and height >=182;

select userId, name
from usertbl
where birthYear >= 1970 or height >=182;

select *
from usertbl
where height between 180 and 183;

select *
from usertbl
where addr in('경남', '전남', '경북'); -- 연속적인 값이 아닌 이산적인 값을 위해 IN 연산자 사용

-- 필터
select *
from usertbl
where name like '김%';

-- 서브쿼리 ANY / ALL / SOME

select * from usertbl;

select name, height from usertbl where height > 177;

select name, height from usertbl where height > (
	select height from usertbl where name = '김경호'
);

-- 지역(addr)이 '경남'인 회원의 사람의 키보다 키가 크거나 같은 회원의 이름을 조회하세요 (키가 173보다 크거나 같은 또는 170보다 크거나 같은 회원을 출력)
select name, height from usertbl where addr = '경남';

-- any(some과 같기 때문에 , some(잘 안 씀) : or
select name, height from usertbl where height >= some (select height from usertbl where addr = '경남'); -- or

-- all : and
select name, height from usertbl where height >= all (select height from usertbl where addr = '경남'); -- and

select name, height from usertbl where height = any (select height from usertbl where addr = '경남'); -- in 연산과 동일

-- 서브쿼리는 테이블을 복사할대 많이 활용됨 복제시, 데이터는 그대로 복제해 오지만 제약조건은 복제하지 않는다.
-- usertbl2의 userid를 pk로 설정하는 alter 명령어를 작성하세요.
create table usertbl2 (select * from usertbl);
select * from usertbl2;

alter table usertbl2 add constraint pk_usertbl2 primary key(userid);
-- 1.
select concat(e.first_name, ' ', e.last_name) 이름, d.department_id 부서번호, d.department_name 부서명
from employees e, departments d
where e.department_id = d.department_id;

-- 모든 사원이기 때문에 outer join으로 변경
select concat(e.first_name, ' ', last_name) as 이름, d.department_id as 부서번호, d.department_name as 부서이름
-- select *
from employees e left outer join departments d on e.department_id = d.department_id
where e.department_id is null
order by e.employee_id;

-- 2.
select departments.department_name, departments.department_id, locations.city
from locations, departments
where locations.location_id = departments.location_id and department_id = 80;

-- 3.
select concat(employees.first_name, ' ', employees.last_name) 이름, departments.department_name 부서명, locations.location_id 위치번호, locations.street_address 도시명, employees.commission_pct
from employees, departments, locations
where employees.department_id = departments.department_id and departments.location_id = locations.location_id and employees.commission_pct is not null;

-- 4.
select concat(e.first_name, ' ', e.last_name) 이름,  d.department_name 부서명
from employees e, departments d
where e.department_id = d.department_id and e.first_name like '%a%' and e.last_name like '%a%' ;

select * from regions;
select * from locations;
select * from countries;

-- 5.
select concat(e.first_name, ' ', e.last_name) 이름, j.job_title 업무, d.department_id 부서번호, d.department_name 부서명
from employees e, jobs j, departments d, locations l
where e.department_id = d.department_id and e.job_id = j.job_id and l.location_id = d.location_id and l.city = 'Toronto';

select * from employees;

-- 6.
select concat(e.first_name, ' ', e.last_name) Employee, e.employee_id Emp, concat(m.first_name, ' ', m.last_name) Manager, m.manager_id Mgr
from employees e, employees m
where e.manager_id = m.employee_id;

select * from employees;

-- 7.
select * from employees where manager_id is null order by employee_id;

-- 8. 지정한 사원의 이름, 부서 번호와 지정한 사원과 동일한 부서에서 근무하는 모든 사원을 조회하세요.
-- select concat(e2.first_name, ' ', e2.last_name) as 지정사원이름, e2.department_id,  concat(e1.first_name, ' ', e1.last_name) as 같은부서사원
-- from employees e1
-- where e1.department_id = (
-- 	select department_id
--     from employees e2
--     where e2.last_name = 'Kochhar'
-- );

select concat(e1.first_name, ' ', e1.last_name) as 지정사원이름, e1.department_id,  concat(e2.first_name, ' ', e2.last_name) as 같은부서사원
-- select *
from employees e1, employees e2
where e1.last_name = 'Kochhar' and e1.department_id = e2.department_id and e1.last_name <> e2.last_name;

select * from employees where department_id = 90;

-- 9. Job_grades 테이블을 생성하고 모든 사원의 이름, 업무, 부서이름, 급여, 급여등급을 조회하세요.
select * from job_grades;

select concat(e.first_name, ' ', e.last_name) as 이름, j.job_title 업무, d.department_name 부서이름, jg.grade_level 금여등급
from employees e, departments d, jobs j, job_grades jg
where e.department_id = d.department_id and e.job_id = j.job_id and e.salary between jg.lowest_sal and jg.highest_sal
order by jg.grade_level desc;

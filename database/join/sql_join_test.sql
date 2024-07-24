-- 1.
select concat(e.first_name, ' ', e.last_name) 이름, d.department_id 부서번호, d.department_name 부서명
from employees e, departments d
where e.department_id = d.department_id;

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

-- 8.
-- select 
-- from employees e, departments d
-- where 
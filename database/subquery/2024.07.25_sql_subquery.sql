use hr;

-- 1
select salary from employees where last_name = 'Tucker';

select concat(e.first_name, ' ', e.last_name) as Name, j.job_title 업무, e.salary 급여
from employees e, jobs j
where e.salary > (
	select salary
    from employees
    where last_name = 'Tucker'
) and e.job_id = j.job_id
order by e.salary;

-- 2
select job_id, min(salary)
from employees
group by job_id;

select concat(first_name, ' ', last_name) as Name, min(salary) 급여, department_id 부서번호, j.job_title 업무
from employees, jobs j
where salary = any (
	select min(salary)
    from employees
    group by job_id
) and employees.job_id = j.job_id
group by j.job_title;

-- 3
select avg(salary), job_title
from employees join jobs on employees.job_id = jobs.job_id
where job_title like '%Clerk'
group by department_id
order by avg(salary);

select * from jobs where job_title like '%Clerk';

select concat(e.first_name, ' ', e.last_name) as Name, e.salary 급여, e.department_id 부서번호, j.job_title 업무
from employees e, jobs j
where e.salary > any (
	select avg(e2.salary)
	from employees e2
    where e.department_id = e2.department_id
    group by department_id
) and e.job_id = j.job_id
order by e.salary;

-- 4
select city
from locations
where city like 'O%';

select e.employee_id as 사번, concat(e.first_name, ' ', e.last_name) as 이름, e.job_id as 업무, e.hire_date as 입사일, l.city as 도시
from employees e, departments d, locations l
where l.city in (
	select city
    from locations
    where city like 'O%'
)
and e.department_id = d.department_id and d.location_id = l.location_id
order by e.hire_date;

-- 5
select avg(salary * 12)
from employees
group by department_id;

select concat(e1.first_name, ' ', e1.last_name) as Name,
	e1.job_id as 업무,
    e1.salary as 급여,
    e1.department_id as 부서번호,
    e3.av_sal as 'Department Avg Salary'
from employees e1 left outer join (
	select department_id, avg(salary) as av_sal
    from employees
    group by department_id
) e3 on e1.department_id = e3.department_id
order by e1.department_id;

select count(e1.employee_id)
from employees e1 left outer join (
	select department_id, avg(salary) as av_sal
    from employees
    group by department_id
) e3 on e1.department_id = e3.department_id;

-- 6
select salary
from employees
where last_name = 'Kochhar';

select * from employees order by salary desc;

select employee_id as 사원번호,  concat(first_name, ' ', last_name) as 이름, job_id 담당업무, salary as 급여
from employees
where salary > (
	select salary
	from employees
	where last_name = 'Kochhar'
)
order by salary;

-- 7
select avg(salary)
from employees;

select employee_id as 사원번호,  concat(first_name, ' ', last_name) as 이름, job_id 담당업무, salary as 급여
from employees
where salary < (
	select avg(salary)
	from employees
)
order by salary desc;

-- 8
select min(salary)
from employees
where department_id = 100
group by department_id;

select *
from employees
group by department_id
having min(salary) > any (
	select min(salary)
	from employees
	where department_id = 100
	group by department_id
)
order by salary;

-- 9
select min(salary), employee_id as 사원번호,  concat(first_name, ' ', last_name) as 이름, job_id 업무, department_id as 부서번호
from employees
group by job_id
order by job_id;

select * from employees;

-- 10
select min(salary), department_id
from employees
group by department_id
order by salary;

select * from employees order by salary desc;
select * from employees where department_id = 100 order by salary;

select d.department_id 부서번호, d.department_name 부서명
from employees e1, departments d
where e1.department_id = d.department_id
group by e1.department_id
having min(e1.salary) > any (
	select min(salary)
	from employees
	where department_id = 100
	group by department_id
);

-- 11
select concat(first_name, ' ', last_name) as 이름, e.job_id as 업무, department_name as 부서명, city as 근무지
from employees e, departments d, locations l
where e.job_id = 'SA_MAN'
	and e.department_id = d.department_id
	and d.location_id = l.location_id;
    
-- 12
select manager_id, count(employee_id)
from employees
group by manager_id;

select * from employees;

select e1.employee_id as 사원번호, concat(first_name, ' ', last_name) as 이름
from employees e1 inner join (
	select manager_id, count(manager_id) as cnt
	from employees 
	group by manager_id
) e2 on e1.employee_id = e2.manager_id
order by cnt desc
limit 1;

-- 13
select job_id
from employees
where employee_id = 123;

select salary
from employees
where employee_id = 192;

select e.employee_id as 사원번호,
	concat(first_name, ' ', last_name) as 이름,
    job_title as 직업,
	e.job_id as 업무,
    salary as 급여
from employees e inner join jobs j on e.job_id = j.job_id
where salary > (
	select salary
	from employees
	where employee_id = 192
) and e.job_id = (
	select job_id
	from employees
	where employee_id = 123
)
order by salary;

-- 14
select min(salary)
from employees
where department_id = 50
group by department_id;

select  employee_id as 사원번호,
	concat(first_name, ' ', last_name) as 이름,
	job_id as 업무,
    hire_date as 입사일,
    salary as 급여,
    department_id as 부서번호
from employees
where salary > any (
	select min(salary)
	from employees
	where department_id = 50
	group by department_id
) and department_id <> 50
order by salary;

-- 15
select max(salary)
from employees
where department_id = 50
group by department_id;

select  employee_id as 사원번호,
	concat(first_name, ' ', last_name) as 이름,
	job_id as 업무,
    hire_date as 입사일,
    salary as 급여,
    department_id as 부서번호
from employees
where salary > any (
	select max(salary)
	from employees
	where department_id = 50
	group by department_id
) and department_id <> 50
order by salary;
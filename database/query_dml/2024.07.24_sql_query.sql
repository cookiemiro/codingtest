-- 1-0.
select employee_id, concat(first_name, ' ', last_name) as Name, salary, job_title, manager_id
from employees, jobs
where employees.job_id = jobs.job_id;

-- 1-1.
select concat(first_name, ' ', last_name) as Name, job_title as Job, salary as Salary, ((salary * 12) + 100) as 'Increased Ann_Salary',
	(salary + 100) * 12 as 'Increased Salary'
from employees,  jobs
where employees.job_id = jobs.job_id;

-- 1-2
select concat(last_name, ': 1 Year Salary = $', salary) as '1 Year Salary'
from employees;

-- 1-3
select distinct j.job_title, e.department_id
from employees e, jobs j
where e.job_id = j.job_id
group by e.department_id;

-- 2-0
select concat(first_name, ' ', last_name) as Name, salary as 급여
from employees
where salary between 7000 and 10000
order by salary;

-- 2-1
select concat(first_name, ' ', last_name) as 'e and o Name'
from employees
where last_name like '%e%' or last_name like '%o%';

-- 2-2
select hire_date from employees;
-- select만 사용가능?
-- select now();
-- select current_date();

select concat(first_name, ' ', last_name) as Name, employee_id 사원번호, hire_date 고용일자
from employees
where hire_date between '1996-05-20' and '1997-05-20'
order by hire_date;

-- 2-3
select concat(first_name, ' ', last_name) as Name,
    salary as 급여,
    job_id as 업무,
    commission_pct as 수당율
from employees
where commission_pct is not null;

-- 3-0
select employee_id as 사번,
	concat(first_name, ' ', last_name) as Name,
    salary as 급여,
    round(salary * (1 + 0.123)) as '인상된 급여'
from employees
where department_id = 60;

-- 3-1
select concat(last_name, ' ', first_name, 'is a ', upper(job_id)) as 'Employee JOBs'
from employees
where last_name like '%s';


-- 3-2
select * from employees;

select concat(first_name, ' ', last_name) as Name,
	salary as 급여,
	if (commission_pct is not null,
		concat('Salary + Commission ', salary * 12 * (1 + commission_pct)),
        concat('Salary only ', salary * 12)
    ) as  'salary percent status'
from employees
order by 'annual Salary' desc;

-- select concat(first_name, ' ', last_name) Name,  salary,
-- case 
-- when commission_pct is not null then 'Salary + Commission'
-- else 'Salary only'
-- end as SalarywithCommission,
-- salary * (1 + ifnull(commission_pct,0)) *12 'Annual Salary'
-- from employees
-- order by 'Annual Salary' desc;

-- 3-3
select concat(first_name, ' ', last_name) as Name,
	hire_date as 입사일,
    dayname(hire_date),
    case weekday(hire_date) 
    when '0' then '월요일'
    when '1' then '화요일'
    when '2' then '수요일'
    when '3' then '목요일'
    when '4' then '금요일'
    when '5' then '토요일'
    when '6' then '일요일'
    end as 입사요일
from employees
order by CASE 입사요일
    WHEN '월요일' THEN 2
    WHEN '화요일' THEN 3
    WHEN '수요일' THEN 4
    WHEN '목요일' THEN 5
    WHEN '금요일' THEN 6
    WHEN '토요일' THEN 7
    WHEN '일요일' THEN 1
    END ASC;
-- dayofweek각 숫자가 반환되기에 더 효율적임

-- 4-0
select * from employees;

select count(employee_id)
from employees
where manager_id is not null;

-- 4-1
select concat('$', format(sum(salary), 0)) as 급여합계,
concat('$', format(avg(salary), 0)) as '급여 편균',
concat('$', format(max(salary), 0)) as '급여 최대값',
concat('$', format(min(salary), 0)) as '급여 최소값'
from employees
where department_id is not null
group by department_id
order by department_id; 

-- 4-2
select job_id as 업무, avg(salary) as 급여평균
from employees
where job_id not like '%CLERK%'
group by job_id
having avg(salary) > 10000
order by 급여평균 desc;
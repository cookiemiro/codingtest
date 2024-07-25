use hr;

-- 0.
select 'Han-Bit' as '회사명' ,concat(e.first_name, ' ', e.last_name) as 'Name', j.job_title as '업무', d.department_name as '부서명', l.city as '도시명'
from employees e, departments d, locations l, jobs j
where l.city = 'Oxford' and e.department_id = d.department_id and d.location_id = l.location_id and j.job_id = e.job_id;

-- 1.

# Write your MySQL query statement below
select uni.unique_id ,e.name from employees e left join EmployeeUNI uni on e.id=uni.id;
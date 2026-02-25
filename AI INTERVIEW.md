# DatabaseTesting

DQL-Select</br>
DDL-create,alter,drop,rename,truncate</br>
DML-updat,insert,delete</br>
DCL-grant,revoke</br>
TCL-commit,savepoint,rollback</br>

#### 1)Display table in proper format
set  lines 200 <br>
 set pages 200<br>

#### 2)select employee with deptno 10,20
select *  from emp where deptno in(10,20);

#### 2)select employee with deptno 10 and 20 ,WHERE AND HAVING CLAUSE
SELECT deptno, COUNT(*) AS total_employees </br>
FROM employees </br>
WHERE deptno IN (10, 20) </br>
GROUP BY deptno; </br>

#### 3)select employee with  salary between 2000 and 3000
select sal from emp between 2000 and 3000;
#### 4)select distinct deptno
select distinct deptno from emp;
#### 5) select  total no of records and total depts 
select count(*) , count(deptno) from emp;
#### 6) find max sal by dept  having sal greater than 3000
select max(sal) from emp</br>
group by job</br>
having max(sal)>3000


#### 7)deptno having more than 4 employees
select deptno from emp</br>
Group by deptno</br>
having count(*) >4

#### 7)select even employee id
SELECT * FROM EMPLOYEE  </br>
WHERE id IN(SELECT id FROM EMPLOYEE WHERE id%2 = 0); </br>

#### 8)Create table products
Create Table Products </br>
(ProdId Number(4) Primary key, </br>
ProdName Varchar(10) Not Null, </br>
Qty Number(3) Check(qty>0) </br>
);

#### 9)find all tables
Select * from tab;

#### 10)add  column model_no in products table
Alter table products </br>
Add model_no varchar(10) Not NULL;

#### 11)show structure of table
Desc products;
#### 12)create row
insert into products </br>
Values(1,’laptop’,4,23);	

#### 13)update row value
Update emp </br>
Set sal=sal+200 </br>
Where empno=7302;

#### 14)delete a value
delete from products where prodid=2;

#### 15)roll back has no effect after commit

#### 16) select 3rd highest salary
select * from emp a </br>
where 2=(select count(distinct(b.sal)) from emp b </br>
where a.sal < b.sal);
</br>
</br>
SELECT *  </br>
FROM  emp  </br>
ORDER BY sal DESC </br>
LIMIT 1 OFFSET 2; </br>

#### 17)bottom 3 salaries
select * from emp a </br>
where 2>=(select count(distinct(b.sal)) from emp b </br>
where a.sal > b.sal);

#### 18)top(highest) 3 salaries
select * from emp a </br>
where 2>=(select count(distinct(b.sal)) from emp b </br>
where a.sal < b.sal);

#### 19) display top 2 records
Select *  from emp </br>
Where  rownum <=2;


#### 20) Finds any values that have "e" in any position
select * from emp 
WHERE ename LIKE '%e%'  ;

#### 21) Find employee whose 3rd letter start with e
SELECT * FROM employees WHERE name LIKE '__e%';

#### 22) Find duplicate records
SELECT empid, COUNT(*) as cnt
FROM emp
GROUP BY empid
HAVING COUNT(empid) > 1;

#### 22) Find records created today

SELECT userid
FROM user
WHERE DATE(creationdate) BETWEEN CURDATE() - INTERVAL 1 DAY AND CURDATE();

SELECT userid
FROM user
WHERE DATE(creationdate) = CURDATE();

### Joins
#### 1)inner join
select a.ename , b.dname </br>
From emp a , dept b </br>
Where a.deptno=b.deptno; </br>
-------------------------------------------- </br>
SELECT emp.ename , dept.dname </br>
FROM emp </br>
INNER JOIN dept </br>
ON emp.deptno= dept.deptno; </br>

#### 2)right outer join
select a.ename , b.dname </br>
From emp a , dept b </br>
Where a.deptno(+)=b.deptno;

-------------------------------------------- </br>
SELECT emp.ename , dept.dname </br>
FROM emp </br>
RIGHT OUTER JOIN dept ON emp.deptno= dept.deptno;

#### 3) left outer join
select a.ename , b.dname </br>
From emp a , dept b </br>
Where a.deptno=b.deptno(+);

#### 4)self join(emp with their manager name)
select a.ename "empname",b.ename "mgrname" </br>
from emp a ,emp b </br>
where a.mgr=b.empno;

#### 5)3 table join
select a.ename, b. loc, c.clerkname </br>
from emp a, dept b ,deptclerk c </br>
where a.deptno=b.deptno </br>
and b.loc=c.loc

![capture](https://user-images.githubusercontent.com/24494133/51387929-ddda1700-1b4d-11e9-9551-f607e35bef14.PNG)

Data integrity testing aims to identify any anomalies or inconsistencies in the data, such as missing values, incorrect data types, invalid references, or violated constraints. It helps ensure that the data is reliable, accurate, and suitable for its intended purpose.

Here are some common types of data integrity tests in SQL:

Nullability Testing: This test checks whether the columns that are supposed to allow null values actually allow them, and vice versa. It ensures that the data meets the requirements for mandatory and optional fields.

Data Type Testing: This test ensures that the data stored in each column adheres to the specified data type. For example, a column defined as an integer should only contain numeric values, and a date column should contain valid date formats.

Constraint Testing: Constraints, such as primary key, foreign key, unique key, and check constraints, define rules and relationships within a database. Constraint testing verifies that these rules are enforced correctly and that the data adheres to the defined constraints.

Referential Integrity Testing: This test checks the consistency of relationships between tables using foreign keys. It ensures that foreign key values in one table match the primary key values in the referenced table, preventing orphaned or invalid data.

Business Rule Testing: In addition to database-specific constraints, business rules may be defined to enforce specific requirements or logic. Data integrity testing includes validating the data against these business rules to ensure that it aligns with the expected criteria.


![image](https://github.com/user-attachments/assets/5ed81b51-49a1-471c-88fc-d86ffbe9bfbe)
 </br>
![image](https://github.com/user-attachments/assets/ade08df1-0790-4fbf-9bb3-c5187073eb59)
 </br>
![image](https://github.com/user-attachments/assets/07eec0c9-22f0-42dc-b145-26a216dea46d)
</br>
![image](https://github.com/user-attachments/assets/2e562644-6a43-4cf4-a430-267af324cada)




 

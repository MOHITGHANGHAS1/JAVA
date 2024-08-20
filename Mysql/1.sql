show databases;
use ncu;
drop database ncu;
drop database university;
create database company;
use company;

drop database company;

show table status;
show tables;

select*from department;
select*from employee;


create table employee ( 
fname varchar(15) not null,
 minit char ,
 lname varchar(15) not null,
 ssn char(9) not null,
 bdate date,
 address varchar(30),
sex char,
salary decimal(10,2),
super_ssn char(9), 
dno int not null,
primary key (ssn),
foreign key(super_ssn)references employee(ssn),
foreign key(dno)references department(dnumber));

insert into employee (fname,minit,lname,ssn,bdate,address,sex,salary,super_ssn,dno) 
values('aman','k','prasad','12','121212','centercity','m',12000,'12',295);  
insert into employee (fname,minit,lname,ssn,bdate,address,sex,salary,super_ssn,dno) 
values('rajat','k','prasad','13','121212','centercity','m',12000,'13',295);
insert into employee (fname,minit,lname,ssn,bdate,address,sex,salary,super_ssn,dno) 
values ('John', 'C', 'Smith', '14', '121212', '123 Main St', 'M', 50000, '14', 295);

drop table employee;
drop table department;


create table department( 
dname varchar(15) not null, 
dnumber integer not null, 
mgr_ssn char(15) not null,
mgr_start_date date,
primary key(dnumber),
unique key(dname)
);
insert into department (dname,dnumber,mgr_ssn,mgr_start_date) 
values ('cse', '295', 'B', '121212');
insert into department (dname,dnumber,mgr_ssn,mgr_start_date) 
values ('sql', '247', 'C', '121212');
insert into department (dname,dnumber,mgr_ssn,mgr_start_date) 
values ('research', '5', 'D', '121212');




create table dept_locations(
dnumber int not null,
dlocation varchar(15) not null,
primary key (dnumber,dlocation),
foreign key(dnumber) references department(dnumber));

insert into dept_locations(dnumber,dlocation)values(295,"Gurgaon");
insert into dept_locations(dnumber,dlocation)values(247,"Noida");


create table project(
pname varchar(15) not null,
pnumber int not null,
plocation varchar(15),
dnum int not null,
primary key(pnumber),
unique(pname),
foreign key (dnum) references department (dnumber));

insert into project(pnumber,pname,dnum,plocation)values(1,"bookride",295,"Gurgaon");
insert into project(pnumber,pname,dnum,plocation)values(2,"todo",247,"Stafford");


create table works_on(
essn char(9) not null,
pno int not null,
hours decimal(3,1) not null,
primary key(essn,pno),
foreign key(essn) references employee(ssn),
foreign key(pno) references project(pnumber));


create table dependent(
essn char(9) not null,
dependent_name varchar(15) not null,
sex char,
badate date,
relationship varchar(8),
primary key (essn,dependent_name),
foreign key (essn) references employee(ssn));

/*1st*/
select Bdate, Address from Employee where Fname = 'John' and Minit = 'C' and Lname = 'Smith';

/*2nd*/
select Fname, Minit, Lname, Address from Employee join Department on Dno = Dnumber where Dname = 'Research';

/*3rd*/
select Pnumber from 
    Project 
    join Department  on Dnumber = Dnumber
    join Employee  on ssn = mgr_Ssn
where 
    Plocation = 'Stafford';

/*4th*/
select 
    E.Ssn as Employee_Ssn,
    D.Dname as Department_Name
from 
    Employee E
    cross join Department D;
    
/*5th*/
select * from department where Dnumber=5;

/*6th*/
select distinct Salary from Employee;

/*8th*/
select * from Employee where Address = "Gurgaon";

/*9th*/
select * from Employee where Bdate = "121212";


select * from Employee;
select * from department;
select * from Dept_locations;
select * from Project;


-- 1st
select Bdate, Address from Employee where Fname = 'John' and Minit = 'C' and Lname = 'Smith';

-- 2nd
select Fname, Minit, Lname, Address from Employee join Department on Dno = Dnumber where Dname = 'Research';

-- 3rd
select Pnumber,Dnum ,Lname ,Address ,Bdate from Project join Department on Dnum = Dnumber join Employee  on Ssn1 = Ssn where Plocation = 'Stafford';

-- 4th
select Ssn ,Dname from Employee join Department ;

-- 5th
select * from department where Dnumber=5;

-- 6th
select distinct Salary from Employee;

-- 8th
select * from Employee where Address = "Gurgaon";

-- 9th
select * from Employee where Bdate = "4-6-2004";





































  


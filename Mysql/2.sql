/* Experiment 3*/

create database company1;
use company1;
drop database company1;
show databases;

create table Employee (
    Fname char(15) not null,
    Minit char,
    Lname char(15) not null,
    Ssn char(9) not null,
    Bdate varchar(20),
    Address char(30),
    Sex char(1),  
    Salary decimal(10,2) ,
    Super_ssn char(9),
    Dno int not null,
    check (Salary>1000),
    primary key(Ssn)
);

insert into employee (Fname, Minit, Lname, Ssn, Bdate, Address, Sex, Salary, Super_ssn, Dno) values ("Yash", "A", "Sharma", "B", "4-6-2004", "Gurgaon", "M", 100000, "a", 5);
insert into employee (Fname, Minit, Lname, Ssn, Bdate, Address, Sex, Salary, Super_ssn, Dno) values ("Akul", "B", "Shrivastava", "C", "5-7-2002", "Stafford", "M", 100000, "B", 6);
insert into Employee (Fname, Minit, Lname, Ssn, Bdate, Address, Sex, Salary, Super_ssn, Dno) values ('John', 'C', 'Smith', 'D', '5-3-2006', '123 Main St', 'M', 50000, '20000', 1);


create table Department (
    Dname char(15) not null,
    Dnumber int not null,
    Ssn1 char(9) not null,
    Mgr_start_date char(20) not null,
    primary key(Dnumber),
    foreign key(Ssn1) references Employee(Ssn),  
    unique(Dname)
);

insert into Department(Dname, Dnumber, Ssn1, Mgr_start_date) values ("CSE", 295, "B", "2-5-2060");
insert into Department(Dname, Dnumber, Ssn1, Mgr_start_date) values ("SOL", 247, "C", "2-5-2050");
insert into Department (Dname, Dnumber, Ssn1, Mgr_start_date) values ('Research', 5, 'D', '5-3-2004');



/* Experiment 4*/


create table Dept_locations(
Dnumber int not null,
Dlocation varchar(20) not null,
primary key (Dnumber , Dlocation),
foreign key(Dnumber) references Department(Dnumber)
);

insert into Dept_Locations(Dnumber,Dlocation)values(295,"Gurgaon");
insert into Dept_Locations(Dnumber,Dlocation)values(247,"Noida");


create table Project(
Pnumber int not null,
Pname varchar(20) not null,
Dnum int not null,
Plocation varchar(20) not null,
primary key (Pnumber),
foreign key(Dnum) references Department(Dnumber)
);

insert into Project(Pnumber,Pname,Dnum,Plocation)values(1,"bookride",295,"Gurgaon");
insert into Project(Pnumber,Pname,Dnum,Plocation)values(2,"todo",247,"Stafford");


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


/*Experinment-5 */
use  company1;
create table sectors (sector_id int(10) not null 
                      , sector_name varchar(255)
                       ,primary key (sector_id));
			
 create table packages (pack_id int(10) not null,
						speed int(10),
                        Start_date date ,
                        monthly_payment int(10),
                        sector_id int(10),
                        primary key (pack_id),
                        foreign key (sector_id) references sectors(sector_id));

create table customers ( customer_id int(10) not null,
                         first_name varchar(250),
                         last_name varchar(255),
                         birth_date date,
                         join_date date,
                         city varchar(255),
                         pack_id int(10),
                         state varchar(255),
                         primary key (customer_id),
                         foreign key (pack_id) references packages(pack_id));
                         
                         

create table pack_grades (grade_id int(10) not null,
                          grade_name varchar(255),
                          min_price int(10) ,
                          max_price int(10),
                          primary key (grade_id));
                          
                          
 INSERT INTO sectors (sector_id, sector_name) VALUES
(1, 'Technology'),
(2, 'Finance'),
(3, 'Healthcare');

INSERT INTO packages (pack_id, speed, Start_date, monthly_payment, sector_id) VALUES
(101, 100, '2024-03-01', 50, 1),
(102, 200, '2024-03-05', 70, 2),
(103, 50, '2024-03-10', 40, 3);

INSERT INTO customers (customer_id, first_name, last_name, birth_date, join_date, city, pack_id, state) VALUES
(1, 'John', 'Doe', '1990-05-15', '2024-03-01', 'New York', 101, 'NY'),
(2, 'Alice', 'Smith', '1985-08-20', '2024-03-02', 'Los Angeles', 102, 'CA'),
(3, 'Bob', 'Johnson', '1978-12-10', '2024-03-03', 'Chicago', 103, 'IL');

INSERT INTO pack_grades (grade_id, grade_name, min_price, max_price) VALUES
(1, 'Basic', 30, 50),
(2, 'Standard', 60, 80),
(3, 'Premium', 90, 120);                         
                          
                          
 -- 1st
 SELECT customers.first_name, customers.last_name, customers.pack_id, packages.speed 
FROM packages 
JOIN customers ON packages.pack_id = customers.pack_id;

-- 2nd
SELECT first_name, last_name, pack_id AS package_number, speed AS internet_speed 
FROM customers 
INNER JOIN packages ON customers.pack_id = packages.pack_id 
WHERE customers.pack_id IN (22, 27) 
ORDER BY last_name ASC;


-- 3rd
SELECT p.pack_id AS package_number, p.speed AS internet_speed, p.monthly_payment, s.sector_name 
FROM packages p 
INNER JOIN sectors s ON p.sector_id = s.sector_id;

-- 4th
SELECT c.first_name, c.last_name, p.pack_id AS package_number, p.speed AS internet_speed, p.monthly_payment, s.sector_name 
FROM customers c 
INNER JOIN packages p ON c.pack_id = p.pack_id 
INNER JOIN sectors s ON p.sector_id = s.sector_id;

-- 5th
SELECT c.first_name, c.last_name, p.pack_id AS package_number, p.speed AS internet_speed, p.monthly_payment, s.sector_name 
FROM customers c 
INNER JOIN packages p ON c.pack_id = p.pack_id 
INNER JOIN sectors s ON p.sector_id = s.sector_id 
WHERE s.sector_name = 'Business';

-- 6th
SELECT c.last_name, c.first_name, c.join_date, p.pack_id AS package_number, p.speed AS internet_speed, s.sector_name 
FROM customers c 
INNER JOIN packages p ON c.pack_id = p.pack_id 
INNER JOIN sectors s ON p.sector_id = s.sector_id 
WHERE s.sector_name = 'Private' AND YEAR(c.join_date) = 2006;

-- 7th
SELECT p.pack_id AS package_number, p.speed AS internet_speed, p.monthly_payment, pg.grade_name AS package_grade 
FROM packages p 
INNER JOIN pack_grades pg ON p.monthly_payment BETWEEN pg.min_price AND pg.max_price;

-- 8th
SELECT c.first_name, c.last_name, p.speed AS internet_speed, p.monthly_payment 
FROM customers c 
INNER JOIN packages p ON c.pack_id = p.pack_id;

-- 9th
SELECT c.last_name, c.first_name, c.pack_id 
FROM customers c 
WHERE c.pack_id = (SELECT pack_id FROM customers WHERE first_name = 'Amado' AND last_name = 'Taylor');

-- 10th
SELECT pack_id AS package_number, speed AS internet_speed 
FROM packages 
WHERE speed = (SELECT speed FROM packages WHERE pack_id = 10);

































select * from Employee;
select * from department;
select * from Dept_locations;
select * from Project;


drop table employee;
drop table department;
drop table Dept_locations;
drop table Project;
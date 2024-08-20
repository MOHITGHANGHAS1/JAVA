create database productdb;
use productdb;
create table product ( productId int(10) , productPrice int(10) , productBrand varchar(20) , productUrl varchar(20)  );
insert into product( productId, productPrice, productBrand, productUrl , productAvailibility ) values("1","100","rupa","url");
select *from product;





create database recipe;
use recipe;
CREATE TABLE Recipe (
    id VARCHAR(255) PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    description TEXT,
    ingredients TEXT,
    price DOUBLE,
    calories INT,
    recipeType CHAR(1)
);
select*from recipe;













create database taskmanagement;
use taskmanagement;

CREATE TABLE Task (
    tid VARCHAR(255) PRIMARY KEY,
    tname VARCHAR(255) NOT NULL,
    tdescription TEXT,
    tcost VARCHAR(255),
    tdeadline varchar(255)
    );
    

CREATE TABLE Project (
    pid VARCHAR(255) PRIMARY KEY,
    pname VARCHAR(255) NOT NULL,
    pdescription TEXT,
    pcost VARCHAR(255),
    pdeadline varchar(255));
    

CREATE TABLE Assignee (
    aid VARCHAR(255) PRIMARY KEY,
    aname VARCHAR(255) NOT NULL
    );
    
    select*from Task;
    select*from Project;
    select*from Assignee;
    
    drop table Task;
    drop table Project;
    drop table Assignee;
    
    
    
    
    
    
    
    
    
    
    
    
Create database  hb_moviebookingapp;
use hb_moviebookingapp;
describe movie_table;
select * from movie_table;

drop table movie_table;
    
    
    
    
    
    
Create database  hb_moviebookingapp2;
use hb_moviebookingapp2;
describe movie_table;
select * from movie_table;

drop table movie_table;



    
    
    
    
    
    
    
    
    
Create database  movie_aop;
use movie_aop;

    
    

show databases;
Create database  healthcare;
use healthcare;  
drop database healthcare;
describe user_table;
describe doctor_table;

select * from user_table;
select * from patient_table;
select * from doctor_table;
select * from prescription_table;
select * from appointment_table;
select * from medicalrecord_table;
select * from medication_table;
select * from pharmacy_table;
select * from inventory_table;
select * from  deliveries_table;

drop table user_table;
drop table patient_table;
drop table doctor_table;
DROP TABLE prescription_table;
DROP TABLE medicalrecord_table;
drop table appointment_table;
drop table medication_table;
drop table pharmacy_table;
drop table inventory_table;
drop table deliveries_table;
    
    
    
    
    
    

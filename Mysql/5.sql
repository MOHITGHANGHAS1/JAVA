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

    



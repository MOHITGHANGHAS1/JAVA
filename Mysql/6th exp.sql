DROP DATABASE IF EXISTS one;
CREATE DATABASE one;
USE one;

-- Create the necessary tables
CREATE TABLE Employees (
    Ssn CHAR(9) PRIMARY KEY,
    Lname VARCHAR(20),
    Fname VARCHAR(20),
    Sex CHAR(1), -- Adding the Sex column to the Employees table
    Salary DECIMAL(8, 2),
    Dno INT
);

CREATE TABLE Departments (
    Dnumber INT PRIMARY KEY,
    Dname VARCHAR(20),
    Mgr_ssn CHAR(9),
    FOREIGN KEY (Mgr_ssn) REFERENCES Employees(Ssn)
);

CREATE TABLE Projects (
    Pnumber INT PRIMARY KEY,
    Pname VARCHAR(20),
    Dnum INT,
    FOREIGN KEY (Dnum) REFERENCES Departments(Dnumber)
);

CREATE TABLE Works_On (
    Essn CHAR(9),
    Pno INT,
    Hours DECIMAL(5,2),
    FOREIGN KEY (Essn) REFERENCES Employees(Ssn),
    FOREIGN KEY (Pno) REFERENCES Projects(Pnumber)
);

CREATE TABLE Dependents (
    Essn CHAR(9),
    Dependent_name VARCHAR(20),
    Sex CHAR(1),
    FOREIGN KEY (Essn) REFERENCES Employees(Ssn)
);

-- Insert sample data into the tables
INSERT INTO Employees VALUES ('123456789', 'Smith', 'John', 'M', 30000, 5);
-- Add more Employees as needed

INSERT INTO Departments VALUES (5, 'Research', '123456789');
-- Add more Departments as needed

INSERT INTO Projects VALUES (1, 'ProjectX', 5);
-- Add more Projects as needed

INSERT INTO Works_On VALUES ('123456789', 1, 32.5);
-- Add more Works_On records as needed

INSERT INTO Dependents VALUES ('123456789', 'John', 'M');

-- Add more Dependents as needed

use one;
-- Find the sum of the salaries of all employees, the maximum salary, the minimum salary, and the average salary.
SELECT SUM(Salary) AS Total_Salary,
       MAX(Salary) AS Max_Salary,
       MIN(Salary) AS Min_Salary,
       AVG(Salary) AS Avg_Salary
FROM Employees;
-- Find the sum of the salaries of all employees of the ‘Research’ department, as well as the maximum salary, the minimum salary, and the average salary in this department.
SELECT SUM(E.Salary) AS Total_Salary_Research,
       MAX(E.Salary) AS Max_Salary_Research,
       MIN(E.Salary) AS Min_Salary_Research,
       AVG(E.Salary) AS Avg_Salary_Research
FROM Employees E
JOIN Departments D ON E.Dno = D.Dnumber
WHERE D.Dname = 'Research';
-- Retrieve the total number of employees in the company.
SELECT COUNT(*) AS Total_Employees
FROM Employees;
-- Retrieve the number of employees in the ‘Research’ department.
SELECT COUNT(*) AS Employees_in_Research
FROM Employees E
JOIN Departments D ON E.Dno = D.Dnumber
WHERE D.Dname = 'Research';
-- Count the number of distinct salary values in the database.
SELECT COUNT(DISTINCT Salary) AS Distinct_Salary_Values
FROM Employees;

-- For each department, retrieve the department number, the number of employees in the department, and their average salary.
SELECT D.Dnumber,
       COUNT(E.Ssn) AS Num_Employees,
       AVG(E.Salary) AS Avg_Salary
FROM Departments D
LEFT JOIN Employees E ON D.Dnumber = E.Dno
GROUP BY D.Dnumber;

-- For each project, retrieve the project number, the project name, and the number of employees who work on that project.
SELECT P.Pnumber,
       P.Pname,
       COUNT(W.Essn) AS Num_Employees
FROM Projects P
LEFT JOIN Works_On W ON P.Pnumber = W.Pno
GROUP BY P.Pnumber, P.Pname;

-- For each project on which more than two employees work, retrieve the project number, the project name, and the number of employees who work on the project.
SELECT P.Pnumber,
       P.Pname,
       COUNT(W.Essn) AS Num_Employees
FROM Projects P
JOIN Works_On W ON P.Pnumber = W.Pno
GROUP BY P.Pnumber, P.Pname
HAVING COUNT(W.Essn) > 2;

-- For each project, retrieve the project number, the project name, and the number of employees from department 5 who work on the project.
SELECT P.Pnumber,
       P.Pname,
       COUNT(W.Essn) AS Num_Employees
FROM Projects P
JOIN Works_On W ON P.Pnumber = W.Pno
JOIN Employees E ON W.Essn = E.Ssn
WHERE E.Dno = 5
GROUP BY P.Pnumber, P.Pname;

-- For each department that has more than five employees, retrieve the department number and the number of its employees who are making more than $40,000.
SELECT E.Dno AS Department_Number,
       COUNT(*) AS Num_Employees_Over_40k
FROM Employees E
WHERE E.Salary > 40000
GROUP BY E.Dno
HAVING COUNT(*) > 5;
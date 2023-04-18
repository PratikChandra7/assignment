CREATE TABLE employee(
    empname VARCHAR NOT NULL,
    empid INT PRIMARY KEY,
    empage INT,
    empsalary REAL
);

INSERT INTO employee(empname,empid,empage,empsalary)
VALUES ('Pratik',01,22,1000);
INSERT INTO employee(empname,empid,empage,empsalary)
VALUES ('Ram',02,23,2000);


UPDATE employee SET empname='John' WHERE empid=02;

SELECT * FROM employee;

DELETE FROM employee WHERE empid=01;
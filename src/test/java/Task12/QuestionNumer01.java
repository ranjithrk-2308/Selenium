package Task12;

public class QuestionNumer01 {
	/* 
	 * 
	 * create database Employee;
use  Employee;
CREATE TABLE Empl (
    empno INT PRIMARY KEY,
    ename VARCHAR(50),
    job VARCHAR(50),
    mgr INT,
    hiredate DATE,
    sal DECIMAL(10, 2),
    comm DECIMAL(10, 2),
    deptno INT
);
INSERT INTO Empl (empno, ename, job, mgr, hiredate, sal, comm, deptno) VALUES
(8369, 'SMITH', 'CLERK', NULL, '1991-02-20', 600.00, NULL, 20),
(8499, 'ANYA', 'SALESMAN', 8698, '1991-02-22', 1600.00, 300.00, 30),
(8521, 'SETH', 'SALESMAN', 8698, '1990-12-18', 1250.00, 500.00, 30),
(8566, 'MAHADEVAN', 'MANAGER', 8839, '1991-04-02', 2985.00, NULL, 20),
(8654, 'MOMIN', 'SALESMAN', 8696, '1991-09-28', 1250.00, 1400.00, 30),
(8698, 'BINA', 'MANAGER', 8839, '1991-05-01', 2850.00, NULL, 30),
(8882, 'SHIVANSH', 'MANAGER', 8839, '1991-06-09', 2450.00, NULL, 10),
(8888, 'SCOTT', 'ANALYST', 8566, '1992-12-09', 3000.00, NULL, 20),
(8839, 'AMIR', 'PRESIDENT', NULL, '1991-11-18', 5000.00, NULL, 10),
(8844, 'KULDEEP', 'SALESMAN', 8698, '1991-09-08', 1500.00, 0.00, 30);

select * from empl;
select ename, sal from empl where sal >= 2000;
select ename,job from empl where comm is NULL;
select ename,sal from empl where sal not between 2500 and 4000;
select ename,job,sal from empl where mgr is NULL;
select ename from empl where substring (ename , 3 , 1) = 'A';
select ename from empl where ename LIKE '%T';

*/

}

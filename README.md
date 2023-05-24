Installation Note - How to install and run the Software 
Prerequisite

NetBeans Ver 6.9 and MySQL 5.1 or higher version must be installed on the PC to run the program. 

Database Installation

The software project is distributed with a backup copy of a Database named QUIZ with required tables. Some dummy records are also present in the tables for testing purposes, which can be deleted before inserting real data. A sql script Quizdb.sql is provided for this purpose.
To install database from Quizdb.sql, simply follow the following procedure.
<u>Step 1:</ul> Reset the MySql password and make new root password (raj), if any other password is given by launching MySQL Server Instance config wizard (StartðProgramsðMySQLðMySQL server instance Config wizard ).
Give current password and new password as “raj” for root.
Step 2:  
Copy the lib.sql file in C:\Program files\Mysql\MySql server 5.1\Bin folder.
Step 3:
Load MySQL and create database named Quiz.
Mysql> create database Quiz;
Step 4:  
Go to the DOS prompt (StartðRun ð type cmd and press enter) and go to the following folder using CD command of DOS.
C:\.....> CD C:\Program files\Mysql\MySql server 5.1\Bin
Step 5: 
Type the following command on above DOS prompt.
C:\….\bin> mysql -u root -pkvuc Quizy  <quizdb.sql
This will create a library database with tables and records at target machine.
Note:
1. Don’t give space between –p and your password.
2. The quizdb.sql  file must be present in Bin folder.
How to run the Program 
To run the software open NetBeans and open the project (File ð Open) and browse the Quiz project from the location where the Quiz project folder exist. After loading the project choose Run command to run the program.

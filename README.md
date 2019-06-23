# ddd
领域驱动设计小探

## 数据库初始化
```mysql
show databases;
create database ddd default character set 'utf8mb4';
use ddd;
create table student (id int primary key auto_increment, name varchar(16), age int);

insert into student (name, age) values ("小木", 18);
select * from student;
create table course (id int primary key auto_increment, course_name varchar(64), student_id int);
insert into course(course_name, student_id) values ("english",1);
select * from course;
create table student_course (id int primary key auto_increment, course_id int, student_id int);
insert into student_course values(1,1,1);

select a.id, a.student_id, b.name from student_course a left join student b on  a.student_id = b.id; 
select a.id, a.student_id, b.name, a.course_id, c.course_name from student_course a left join student b on  a.student_id = b.id  left join course c on a.course_id = c.id where a.student_id = '1'; 
```
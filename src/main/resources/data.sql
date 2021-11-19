insert into student(id,name)
values(20001,'Fatou');
insert into student(id,name)
values(20002,'Diop');
insert into student(id,name)
values(20003,'Leila');


insert into course(id, name, created_date, last_updated_date)
values(10001,'JPA in 50 Steps', sysdate(), sysdate());
insert into course(id, name, created_date, last_updated_date)
values(10002,'Spring in 50 Steps', sysdate(), sysdate());
insert into course(id, name, created_date, last_updated_date)
values(10003,'Spring Boot in 100 Steps', sysdate(), sysdate());




--insert into review(id,rating,description, course_id)
--values(50001,'5', 'Great Course', 10001);
--insert into review(id,rating,description, course_id)
--values(50002,'4', 'Wonderful Course', 10003);
--insert into review(id,rating,description, course_id)
--values(50003,'5', 'Awesome Course', 10001);


--ManyToMany

insert into student_course(student_id, course_id)
values(20001,10001);
insert into student_course(student_id, course_id)
values(20002,10001);
insert into student_course(student_id, course_id)
values(20003,10001);
insert into student_course(student_id, course_id)
values(20001,10003);

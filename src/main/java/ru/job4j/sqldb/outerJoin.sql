create table departments(
    id serial primary key,
    name varchar(255)
);

create table employees(
    id serial primary key,
    name varchar(255),
    departments_id int references departments(id)
);

insert into departments(name) values ('Полиция'),('Пожарная'),('Скорая помощь'),('МЧС');
insert into employees(name, departments_id) values ('Сергей', 1);
insert into employees(name, departments_id) values ('Борис', 2);
insert into employees(name, departments_id) values ('Анна', 3);
insert into employees(name, departments_id) values ('Георгий', null);
insert into employees(name, departments_id) values ('Павел', null);
insert into employees(name, departments_id) values ('Эля', 3);


select * from departments d left join employees e
on d.id = e.department_id;

select * from employees e right join departments d
on e.department_id = d.id;

select * from departments d full join employees e
on d.id = e.department_id;

select * from departments d cross join employees e;

select * from departments d left join employees e
on d.id = e.department_id
where e.department_id is null;

select * from departments d left join employees e
on d.id = e.department_id;

select * from departments d right join employees e
on e.department_id = d.id;


create table teens(
    id serial primary key,
    name varchar(255),
    gender text
);

insert into teens(name, gender)
values('Маша', 'Ж'),
      ('Вика', 'Ж'),
      ('Аня', 'Ж'),
      ('Дима', 'М'),
      ('Сергей', 'М'),
      ('Коля', 'М');

select t1.name, t2.name from teens t1 cross join teens t2
where t1.gender != t2.gender and t1.gender != 'М';
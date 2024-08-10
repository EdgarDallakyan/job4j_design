create table employees (
    id serial primary key,,
    name text,
    department text,
    salary int
);

insert into employees(name, department, salary)
values ('James', 'Police', 1000);
insert into employees(name, department, salary)
values ('John', 'Ambulance', 400);
insert into employees(name, department, salary)
values ('Michael', 'Firefighters', 600);
insert into employees(name, department, salary)
values ('Johnathon', '911', 500);

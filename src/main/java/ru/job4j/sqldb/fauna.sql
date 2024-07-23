create table fauna
(
    id             serial primary key,
    name_aml           text,
    avg_age        int,
    discovery_date date
);

insert into fauna(name_aml,avg_age, discovery_date)
values ('whale', 14610, '1632-09-01');
insert into fauna(name_aml,avg_age, discovery_date)
values ('lion', 4380, '1758-11-22');
insert into fauna(name_aml,avg_age, discovery_date)
values ('zebra', 10592, '1766-08-11');
insert into fauna(name_aml,avg_age, discovery_date)
values ('crocodile', 32872, '1888-06-28');
insert into fauna(name_aml,avg_age, discovery_date)
values ('fish', 1192, '1900-12-30');
insert into fauna(name_aml,avg_age, discovery_date)
values ('tiger', 7562, '1985-01-19');

select * from fauna;
select * from fauna where name like '%fish%';
select * from fauna where avg_age > 10000 and avg_age < 21000;
select * from fauna where discovery_date is null;
select * from fauna where discovery_date < '1950-01-01'

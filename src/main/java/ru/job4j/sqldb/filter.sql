create table type(
    id serial primary key,
    name varchar(255)
);

create table product(
    id serial primary key,
    name varchar(255),
    type_id int references type(id),
    expired_date date,
    price int
);

insert into type(name) values ('Рыба'), ('Молочные'), ('Мясо') ('Овощи'), ('Сыр'), ('Фрукты'), ('Мороженое');
insert into product(name, type_id, expired_date, price) values
('Cудак', 1, '2024-11-09', 1000), ('Cёмга', 1, '2024-11-18', 1600);
insert into product(name, type_id, expired_date, price) values
('Сметана', 2, '2024-08-21', 95), ('Масло', 2, '2024-08-20', 190);
insert into product(name, type_id, expired_date, price) values
('Телятина', 3, '2024-09-10', 900), ('Свинина', 3, '2024-08-12', 500);
insert into product(name, type_id, expired_date, price) values
('Лук', 4, '2024-12-24', 30), ('Морковь', 4, '2024-12-03', 70);
insert into product(name, type_id, expired_date, price) values
('Сыр с орехами', 5, '2024-09-25', 250), ('Сыр с плесенью', 5, '2024-09-05', 1000);
insert into product(name, type_id, expired_date, price) values
('Арбуз', 6, '2024-08-08', 100), ('Абрикос', 6, '2024-08-06', 90);
insert into product(name, type_id, expired_date, price) values
('Мороженое плодово-ягодное', 7, '2024-10-05', 125), ('Мороженое Эскимо', 7, '2024-10-15', 190);



select * from product p join type t
on p.type_id = t.id
where type_id = 6;

select * from product where name like '%Мороженое%';

select * from product where expired_date < current_date;

select * from product where price = (select max(price) from product);

select t.name, count(p.type_id)
from product p join type t
on p.type_id = t.id
group by t.name;

select p.name
from product p join type t
on p.type_id = t.id
where t.name = 'Сыр' or t.name = 'Молочные';

select t.name, count(p.type_id)
from product p join type t
on p.type_id = t.id
group by t.name
having count(p.type_id) < 10;

select * from product p join type t
on p.type_id = t.id;
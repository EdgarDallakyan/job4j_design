create table car_bodies(
    id serial primary key,
    name varchar(255)
);

create table car_engines(
    id serial primary key,
    name varchar(255)
);

create table car_transmissions(
    id serial primary key,
    name varchar(255)
);

create table cars(
    id serial primary key,
    name varchar(255),
    body_id int references car_bodies(id),
    engine_id int references car_engines(id),
    transmission_id int references car_transmissions(id)
);

insert into car_bodies(name) values ('Седан'),('Хэтчбек'),('Пикап'),('Внедорожник');
insert into car_engines(name) values ('Бензиновый'),('Дизельный'),('Электрические'),('Газовый');
insert into car_transmissions(name) values ('Механическая'),('Автоматическая'),('Робот'),('Вариатор');

insert into cars(name, body_id, engine_id, transmission_id) values ('Авто_1', 1, 1, 3);
insert into cars(name, body_id, engine_id, transmission_id) values ('Авто_2', 1, 1, 1);
insert into cars(name, body_id, engine_id, transmission_id) values ('Авто_3', 4, 2, 2);
insert into cars(name, body_id, engine_id, transmission_id) values ('Авто_4', 2, 3, 3));


select c.name список_машин, b.name кузов, e.name двигатель, t.name as коробка_передач
from cars c
join car_bodies b on c.body_id = b.id
join car_engines e on c.engine_id = e.id
join car_transmissions t on c.transmission_id = t.id;

select b.name
from car_bodies b left join cars c
on b.id = c.body_id
where c.body_id is null;

select e.name
from car_engines e left join cars c
on e.id = c.engine_id
where c.engine_id is null;

select t.name
from car_transmissions t left join cars c
on t.id = c.transmission_id
where c.transmission_id is null;




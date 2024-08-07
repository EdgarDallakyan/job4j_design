create table devices
(
    id    serial primary key,
    name  varchar(255),
    price float
);

create table people
(
    id   serial primary key,
    name varchar(255)
);

create table devices_people
(
    id        serial primary key,
    device_id int references devices (id),
    people_id int references people (id)
);

insert into devices(name, price) values ('Смартфон', 22999), ('Планшет', 39999), ('Смарт-часы', 8599), ('Наушники', 2399);
insert into people(name) values ('Саша'), ('Боря'), ('Аня'), ('Настя'),;
insert into devices_people(device_id, people_id) values (1, 1), (1, 2), (1, 3);
insert into devices_people(device_id, people_id) values (2, 1), (2,2), (2,3);
insert into devices_people(device_id, people_id) values (3, 1), (3, 2);
insert into devices_people(device_id, people_id) values (4, 3), (4, 4);

select avg(price) from devices;

select p.name, avg(dev.price)
from people p
join devices_people as dp
on p.id= dp.people_id
join devices dev
on dp.device_id = dev.id
group by p.name;

select p.name, avg(dev.price)
from people p
join devices_people as dp
on p.id= dp.people_id
join devices dev
on dp.device_id = dev.id
group by p.name
having avg(dev.price) > 5000;
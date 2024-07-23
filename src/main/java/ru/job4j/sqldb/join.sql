create table sports_car(
    id serial primary key,
    name_car varchar(255)
);

create table driver(
    id serial primary key,
    name_driver varchar(255),
    sports_car_id int references sports_car (id)
);

insert into sports_car(name_car) values ('Ferrari');
insert into sports_car(name_car) values ('Mersedes');
insert into sports_car(name_car) values ('Aston Martin');


insert into driver(name_driver, sports_car_id) values ('Sebastian Vettel', 1);
insert into driver(name_driver, sports_car_id) values ('Lewis Hamilton', 2);
insert into driver(name_driver, sports_car_id) values ('Fernando Alonsol', 3);

select * from driver join sports_car sc on driver.sports_car_id = sc.id;
select d.name_driver, sc.name_car from driver as d join sports_car as sc on d.sports_car_id = sc.id;
select d.name_driver as Гонщик, sc.name_car as Марка_автомобиля from driver as d join sports_car as sc on d.sports_car_id = sc.id;




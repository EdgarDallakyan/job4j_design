create view cars_view
as
select c.name as name_car,
        b.name as name_bodie,
        e.name as name_engine,
        t.name as name_transmission
from cars c
    join car_bodies b on c.body_id = b.id
    join car_engines e on c.engine_id = e.id
    join car_transmissions t on c.transmission_id = t.id;

select * from cars_view
where name_bodie LIKE 'null';

select name_car from cars_view
where name_engine LIKE 'Бензиновый';

select name_bodie, count(name_bodie) from cars_view
group by name_bodie;
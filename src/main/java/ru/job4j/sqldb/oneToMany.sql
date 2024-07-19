create table cars(
    id serial primary key,
    model varchar(255),
    person_id int references person(id)
);
create table person(
    id serial primary key,
    name_person varchar(255)
);
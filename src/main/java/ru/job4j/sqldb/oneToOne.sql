create table document_for_car(
    id serial primary key,
    seria int,
    number int,
    model varchar(255)
);

create table person(
    id serial primary key,
    person_name varchar(255),
    document_id int references document_for_car(id)
);
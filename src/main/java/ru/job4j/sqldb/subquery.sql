CREATE TABLE customers
(
    id         serial primary key,
    first_name text,
    last_name  text,
    age        int,
    country    text
);

insert into customers(first_name, last_name, age, country)
values ('Jack', 'Aflek', 30, 'USA');
insert into customers(first_name, last_name, age, country)
values ('Ann', 'Shulz', 23, 'Germany');
insert into customers(first_name, last_name, age, country)
values ('Robert', 'Foden', 19, 'Great Britain');
insert into customers(first_name, last_name, age, country)
values ('Paul', 'Jefren', 26, 'France');
insert into customers(first_name, last_name, age, country)
values ('Victoria', 'Romanova', 21, 'Russia');

select * from customers
where age in (select min(age) from customers);


CREATE TABLE orders
(
    id          serial primary key,
    amount      int,
    customer_id int references customers (id)
);

insert into orders(amount, customer_id) values (100, 1);
insert into orders(amount, customer_id) values (150, 2);
insert into orders(amount, customer_id) values (200, 5);
insert into orders(amount, customer_id) values (350, 3);
insert into orders(amount, customer_id) values (120, 1);

select * from customers
where id not in (select customer_id from orders);
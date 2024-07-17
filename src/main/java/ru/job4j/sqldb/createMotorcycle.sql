create table motorcycle (
	id serial primary key,
	model text,
	price integer,
	imported_product boolean
);
insert into motorcycle(model, price, imported_product) values ('Ural', 860000, false);
select * from motorcycle;
update motorcycle set model = 'Suzuki', price = 2500000, imported_product = true;
delete from motorcycle;

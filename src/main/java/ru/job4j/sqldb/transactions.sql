create table books(
	id serial primary key,
	name text,
	author text,
	date_release int
);

insert into books (name, author, date_release)
values ('Hamlet', 'Shakespeare', 1599);
insert into books (name, author, date_release)
values('1984', 'Orwell', 1948);
insert into books (name, author, date_release)
values('Sherlock Holmes', 'Doyle', 1866);
insert into books (name, author, date_release)
values('Harry Potter', 'Rowling', 1980);
insert into books (name, author, date_release)
values('Casino Royale', 'Fleming', 1899);

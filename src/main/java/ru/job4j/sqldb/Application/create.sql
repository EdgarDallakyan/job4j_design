create table role (
    id serial primary key,
    name_role varchar(255)
);

create table users (
    id serial primary key,
    name_users varchar(255),
	role_id int references role(id)
);

create table rules (
    id serial primary key,
    name_rulse varchar(255)
);

create table roles_rules (
    id serial primary key,
    role_id int references role(id),
	rule_id int references rules(id)
);

create table categories (
    id serial primary key,
    name_categories varchar(255)
);

create table states (
    id serial primary key,
    name_states varchar(255)
);

create table items (
    id serial primary key,
    name_items varchar(255),
	user_id int references users(id),
	category_id int references categories(id),
	state_id int references states(id)
);

create table comments (
    id serial primary key,
    name_comments varchar(255),
	item_id int references items(id)
);

create table attachs (
    id serial primary key,
    name_attachs varchar(255),
	item_id int references items(id)
);
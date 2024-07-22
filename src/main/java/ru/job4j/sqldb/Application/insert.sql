insert into role(name_role) values ('developer');
insert into users(name_users, role_id) values ('Egor', 1);
insert into rules(name_rulse) values ('Complete');
insert into roles_rules(role_id, rule_id) values (1, 1);
insert into categories(name_categories) values ('private');
insert into states(name_states) values ('OK');
insert into items(name_items, user_id, category_id, state_id) values ('Item1', 1, 1, 1);
insert into comments(name_comments, item_id) values ('comments1', 1);
insert into attachs (name_attachs, item_id) values ('attachs1', 1);
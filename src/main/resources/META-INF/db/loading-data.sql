insert into domain (id, name) values (1, 'Database');
insert into domain (id, name) values (2, 'LDAP');

insert into "user" (id, name, username, password, domain_id, lastAccess) values (1, 'Cal Lightman', 'cal', '123', 1, now());
insert into "user" (id, name, username, password, domain_id, lastAccess) values (2, 'Gillian Foster', 'gillian', '123', 1, now());
insert into "user" (id, name, username, password, domain_id, lastAccess) values (3, 'Ria Torres', 'ria', '123', 1, now());
insert into "user" (id, name, username, password, domain_id, lastAccess) values (4, 'Eli Locker', 'eli', '123', 1, now());
insert into "user" (id, name, username, password, domain_id, lastAccess) values (5, 'Emily Lightman', 'emily', '123', 1, now());

create table employee (
    id serial primary key not null,
    name varchar(2000),
    surname varchar(2000),
    inn varchar(12),
    date_of_hiring timestamp
);

create table person (
    id serial primary key not null,
    login varchar(2000),
    password varchar(2000),
    employee_id int references employee (id) ON DELETE SET NULL
);

insert into person (login, password) values ('parsentev', '123');
insert into person (login, password) values ('ban', '123');
insert into person (login, password) values ('ivan', '123');
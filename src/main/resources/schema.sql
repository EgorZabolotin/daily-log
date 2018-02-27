create table person
(
    id integer auto_increment not null,
    login varchar(255) not null,
    first_name varchar(255) not null,
    last_name  varchar(255) not null,
    middle_name  varchar(255),
    primary key(id),
    unique key unique_login (login)
);

create table task
(
    id integer auto_increment not null,
    user_id integer not null references person(id),
    name varchar(1024),
    description varchar,
    create_date timestamp default CURRENT_TIMESTAMP not null,
    modify_date timestamp,
    is_closed boolean
);

create table sub_task
(
    id integer auto_increment not null,
    task_id integer not null references task(id),
    name varchar(1024),
    description varchar,
    create_date timestamp default CURRENT_TIMESTAMP not null,
    modify_date timestamp,
    is_closed boolean
);

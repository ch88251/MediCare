create table department
(
    id bigint generated always as identity primary key,
    name varchar(64) not null unique,
    slug varchar(64) not null unique,
    tagline varchar(128) not null,
    description text not null,
    image_url varchar(256) not null
);

create table feature
(
    id bigint generated always as identity primary key,
    name varchar(256) not null unique
);

create table department_feature
(
    department_id bigint not null,
    feature_id bigint not null,
    position int not null,
    primary key (department_id, position),
    foreign key (department_id) references department(id) on delete cascade,
    foreign key (feature_id) references feature(id)
);

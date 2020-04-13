 create table tbl_employees (
       id  bigserial not null,
        email varchar(200) not null,
        first_name varchar(255),
        last_name varchar(255),
        primary key (id)
    );
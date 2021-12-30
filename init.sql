drop database testProj;

create database testProj;

use testProj;

create table user(
	user_id int not null auto_increment,
    login varchar(60),
    password varchar(60),
    primary key(user_id)
);

create table role(
	role_id int auto_increment not null,
	role_name varchar(60),
    primary key(role_id)
);

create table message_box(
	message_box_id int auto_increment not null,
    name varchar(100),
    message varchar(250),
	primary key(message_box_id)
);

create table user_role(
	user_id int,
    role_id int
);

alter table user_role Add constraint
	FK_user_role_role foreign key(role_id)
    references role(role_id)
		ON UPdate cascade
        ON delete set null; 

alter table user_role Add constraint
	FK_user_role_User foreign key(user_id)
    references user(user_id)
		ON UPdate cascade
        ON delete set null;
        
        
insert role
(role_name)
values
("ROLE_USER"),
("ROLE_MODERATOR"),
("ROLE_ADMIN");

delete from role;
select * from role;


drop database if exists maven_${user.name};
create database maven_${user.name};
use maven_${user.name};

create table test ( 
	id int(1) unsigned auto_increment primary key,
	subject varchar(255)
);

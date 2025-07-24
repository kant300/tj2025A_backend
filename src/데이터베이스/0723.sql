drop database if exists mydb0723;
create database mydb0723;
use mydb0723;
create table user(
	uno int auto_increment , -- 회원번호
    uname varchar(30) not null ,
    uage int default 10 , 
    constraint primary key( uno )     
);

# day18 -> userDao 에서 사용할 sql 샘플
# 1.
insert into user(uname,uage) values( '유재석' , 40 );

# 2.
insert into user(uname,uage) values( ? , ? ); 

select * from user;
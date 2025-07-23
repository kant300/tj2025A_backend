drop database if exists list8;
create database list8;
use list8;

create table waiting(
wno int auto_increment ,
wphone varchar(13) not null unique ,
wcount int not null,
constraint primary key( wno )
);

# 샘플
insert into waiting( wphone , wcount ) values( '010-1111-1111' , 2 );
insert into waiting( wphone , wcount ) values( '010-1234-5678' , 3 );
insert into waiting( wphone , wcount ) values( '010-9876-5432' , 5 );
insert into waiting( wphone , wcount ) values( '010-2345-6789' , 1 );
insert into waiting( wphone , wcount ) values( '010-8765-4321' , 7 );
insert into waiting( wphone , wcount ) values( '010-1122-3344' , 2 );
insert into waiting( wphone , wcount ) values( '010-5566-7788' , 8 );
insert into waiting( wphone , wcount ) values( '010-9900-1122' , 4 );
insert into waiting( wphone , wcount ) values( '010-3344-5566' , 6 );
insert into waiting( wphone , wcount ) values( '010-7788-9900' , 9 );
insert into waiting( wphone , wcount ) values( '010-0011-2233' , 2 );
insert into waiting( wphone , wcount ) values( '010-4455-6677' , 5 );
insert into waiting( wphone , wcount ) values( '010-8899-0011' , 10 );
insert into waiting( wphone , wcount ) values( '010-2233-4455' , 1 );
insert into waiting( wphone , wcount ) values( '010-6677-8899' , 3 );
insert into waiting( wphone , wcount ) values( '010-1010-2020' , 7 );

select * from waiting;
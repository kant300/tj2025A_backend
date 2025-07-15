# db day02
# 데이터베이스는 여러개의 테이블(표) 저장할 수있다.

# [1] 데이터베이스 생성
create database mydb0715;
# [2] 데이터베이스 사용/활성화
use mydb0715;
# [3] 현재 활성화된 데이테베이스 안에 테이블/표 생성
# create(생성한다) , table(표) , test1(표이름) 
#( 정의시작 ,  )정의 끝 , 필드명(아무거나 속성명) , int(속성의 타입)
create table test1( 필드명 int );
# [4] 현재 활성화된 데이터베이스의 테이블 목록 조회
show tables;

# 2개 이상의 속성을 정의할때 : , 쉼표로 구분한다. 
create table test2( 필드명1 int , 필드명2 double );

# [5] 현재 활성화된 데이터베이스내 테이블 삭제 
drop table test1;
# 만약에 테이블이 존재하면 삭제
drop table if exists test1;

# [6] MYSQL 데이터 타입
# 다야한 테이터 타입 이용한 테이블 생성
create table test3( # 테이블 정의 시작
	# 속성명 타입 , 속성명 타입
    정수필드1 tinyint , 정수필드2 smallint  , 정수필드3 mediumint , 
    정수필드4 int		, 정수필드5 bigint 	, 정수필드6 int unsigned ,
    실수필드1 float	, 실수필드2 double 	, 실수필드3 decimal , 
    날짜필드1 date 	, 시간필드2 time 		, 날짜시간필드3 datetime ,
    문자필드1 char 	, 문자필드2 varchar(3) , 
    문자필드3 text	, 문자필드4 longtext ,
    논리필드1 bool # 마지막 속성 끝에는 ,쉼표 붙이지 않는다.
); # 테이블 정의 끝
show tables;
# select * form 테이블명;
select *from test3;


-- [1] SQL 주석
# 한줄주석 
-- 한줄주석 
/*
여러줄 주석
*/

-- [2] SQL 명령어 작성 방법
-- 1. SQL 문법을 작성한다. 2. SQL 문법 끝에 ;(세미콜론)으로 마친다.
show databases;
-- [3] SQL 명령어 실행 방법
-- 1. 단위실행(;) : 실행할 명령문에 커서를 두고 ctrl+enter 혹은 상단메뉴 번개(I)아이콘 클릭
-- 2. 전체실행 : 현재 파일내 모든 명령어(문장) 실행(위에서아래로) ctrl+shift+enter 혹은 상단메뉴 번개 아이콘 클릭
-- [4] 실행 결과 보는법
-- 1. 실행후 메뉴 하단에 [ result grid ] 혹은 [ output ] 창 확인하여 명령문 결과확인한다.
-- [5] 데이터베이스 관련 주요 명령어
# 1.데이터베이스가 저장된 로컬 경로 확인방법
show variables like 'datadir'; #마지막에 세미콜론 잊지말기
# C:\ProgramData\MySQL\MySQL Server 8.0\Data , 내 컴퓨터에 db 서버 로컬 경로

# 2. DB서버내 데이터베이스를 생성하기
# create(생성한다 뜻) , database(자료집합소) , my0714(아무거나:DB이름)
create database mydb0714; # 실핼할 명령문에 [마우스]커서를 두고 ctrl+enter
# 주의할 점 : 실행후 하단에 [output]창 확인하면 'xxxxx';database exists 이미 존재하는 DB명

# 3. DB서버내 데이터베이스를 삭제하기
# drop(버린다는 뜻) , my0714((삭제할 db명)
drop database mydb0714;	#두번 실행하면 'xxxxx';database dosen't exist 존재하지 않는 DB명

# 4. DB서버내 데이터베이스가 *존재*하면 삭제하기
# if(만약에 뜻) , exists(존재하다 뜻)
drop database if exists mydb0714; # 여려번 실행해도 오류가 없다.

# 5. DB서버내 데이터베이스 목록보기
# show(보다 뜻) , databases (데이터베이스 목록)
show databases; #[grid result] 창에서 확인

# 6. DB서버내 사용할 데이터베이스 (사용) 활성화 하기 , 여려 db중에 SQL 사용할 DB 꼭 선택
# use(사용하다 뜻)
use mydb0714;

# UI 에서 데이터베이스 확인 : 워크벤치 왼쪽 메뉴 [navigator] -> [새로고침]아이콘 클릭
# 진하게 표시된 데이터베이스가 현재 (사용)활성화 된 상태 뜻

# 예제1 : 데이터베이스 기본 세팅/준비
drop database if exists test0714;	#'test0714' 이름의 데이터베이스가 존재하면 삭제하기
create database test0714;			#'test0714' 이름으로 데이터베이스 생성하기
show databases; 					# DB서버내 모든 데이터베이스 목로보기
use test0714;						# 'test0714' 이름의 데이터베이스 (사용) 활성화하기alter

# 현재 파일을 저장하는 방법 : ctrl+s






1. 데이터베이스 언어
 - DDL(Data Definition Language) : CREATE, ALTER, DROP    ==> CAD

 1) alter 문법
  https://dev.mysql.com/doc/refman/8.0/en/table.html

  help alter
  help alter table;

ALTER TABLE 테이블명(tbl_name)
    [alter_option [, alter_option] ...]
    [partition_options]

     ADD : 추가필드명 자료형 옵션 [FIRST | AFTER col_name]
     DROP : 삭제 필드명
     CHANGE : 수정할필드명(테이블명) => 이전필드명 새로운필드명 자료형 옵션
     MODIFY : 수정필드명 자료형 옵션
     RENAME : 새로운 테이블이름

  #1) 필드 추가
     alter table userinfo add uno int;
     alter table userinfo add uno2 int first; --> 맨앞에
     alter table userinfo add email varchar(100) after name;  --> name 뒤에

        mysql> desc userinfo;
        +-------+--------------+------+-----+---------+----------------+
        | Field | Type         | Null | Key | Default | Extra          |
        +-------+--------------+------+-----+---------+----------------+
        | uno2  | int          | YES  |     | NULL    |                |
        | no    | int          | NO   | PRI | NULL    | auto_increment |
        | name  | varchar(100) | NO   |     | NULL    |                |
        | email | varchar(100) | YES  |     | NULL    |                |
        | age   | int          | NO   |     | NULL    |                |
        | uno   | int          | YES  |     | NULL    |                |
        +-------+--------------+------+-----+---------+----------------+
        6 rows in set (0.00 sec)

  #2) 필드 삭제
     alter table userinfo drop uno;
     desc userinfo;
     alter table userinfo drop uno2;

        mysql> desc userinfo;
        +-------+--------------+------+-----+---------+----------------+
        | Field | Type         | Null | Key | Default | Extra          |
        +-------+--------------+------+-----+---------+----------------+
        | no    | int          | NO   | PRI | NULL    | auto_increment |
        | name  | varchar(100) | NO   |     | NULL    |                |
        | email | varchar(100) | YES  |     | NULL    |                |
        | age   | int          | NO   |     | NULL    |                |
        +-------+--------------+------+-----+---------+----------------+
        4 rows in set (0.00 sec)

  #3) 필드 수정(CHANGE) - 필드명, 자료형 옵션 수정
    > alter table userinfo change oldname newname 자료형 옵션
      alter table userinfo change email  email2 varchar(50);
       mysql> desc userinfo;
        +--------+--------------+------+-----+---------+----------------+
        | Field  | Type         | Null | Key | Default | Extra          |
        +--------+--------------+------+-----+---------+----------------+
        | no     | int          | NO   | PRI | NULL    | auto_increment |
        | name   | varchar(100) | NO   |     | NULL    |                |
        | email2 | varchar(50)  | YES  |     | NULL    |                |
        | age    | int          | NO   |     | NULL    |                |
        +--------+--------------+------+-----+---------+----------------+
        4 rows in set (0.00 sec)

      alter table userinfo change email2  email varchar(50); ※email2 => email 바꾸기
        mysql> desc userinfo;
        +-------+--------------+------+-----+---------+----------------+
        | Field | Type         | Null | Key | Default | Extra          |
        +-------+--------------+------+-----+---------+----------------+
        | no    | int          | NO   | PRI | NULL    | auto_increment |
        | name  | varchar(100) | NO   |     | NULL    |                |
        | email | varchar(50)  | YES  |     | NULL    |                |
        | age   | int          | NO   |     | NULL    |                |
        +-------+--------------+------+-----+---------+----------------+
        4 rows in set (0.00 sec)

  #4) 필드 수정(modify) - 자료형 옵션 수정 ( add, drop, change | modify )
     alter table userinfo modify email varchar(20) not null;

        mysql> desc userinfo;
        +-------+--------------+------+-----+---------+----------------+
        | Field | Type         | Null | Key | Default | Extra          |
        +-------+--------------+------+-----+---------+----------------+
        | no    | int          | NO   | PRI | NULL    | auto_increment |
        | name  | varchar(100) | NO   |     | NULL    |                |
        | email | varchar(20)  | NO   |     | NULL    |                |
        | age   | int          | NO   |     | NULL    |                |
        +-------+--------------+------+-----+---------+----------------+
        4 rows in set (0.00 sec)
     
     alter table userinfo drop email;
       mysql> desc userinfo;
        +-------+--------------+------+-----+---------+----------------+
        | Field | Type         | Null | Key | Default | Extra          |
        +-------+--------------+------+-----+---------+----------------+
        | no    | int          | NO   | PRI | NULL    | auto_increment |
        | name  | varchar(100) | NO   |     | NULL    |                |
        | age   | int          | NO   |     | NULL    |                |
        +-------+--------------+------+-----+---------+----------------+
        3 rows in set (0.00 sec)

  #5) 테이블명 수정 - ( add, drop, change | modify, nename )  
     alter table userinfo rename users;
       mysql> desc users;
        +-------+--------------+------+-----+---------+----------------+
        | Field | Type         | Null | Key | Default | Extra          |
        +-------+--------------+------+-----+---------+----------------+
        | no    | int          | NO   | PRI | NULL    | auto_increment |
        | name  | varchar(100) | NO   |     | NULL    |                |
        | age   | int          | NO   |     | NULL    |                |
        +-------+--------------+------+-----+---------+----------------+
        3 rows in set (0.00 sec)

  -- 1. 테이블 준비
  -- mysql> desc userinfo;
   create table userinfo(
    no        int               not null   primary key  auto_increment,
    name    varchar(100)        not null ,
    age      int                not null
);

    mysql> desc userinfo;
    +-------+--------------+------+-----+---------+----------------+
    | Field | Type         | Null | Key | Default | Extra          |
    +-------+--------------+------+-----+---------+----------------+
    | no    | int          | NO   | PRI | NULL    | auto_increment |
    | name  | varchar(100) | NO   |     | NULL    |                |
    | age   | int          | NO   |     | NULL    |                |
    +-------+--------------+------+-----+---------+----------------+
    3 rows in set (0.00 sec)


   >>>> 연습문제1)
    [001]  다음과 같이 테이블을 준비하시오    >> alter_coffee
    mysql> desc alter_coffee;
    +--------+-------------+------+-----+---------+-------+
    | Field  | Type        | Null | Key | Default | Extra |
    +--------+-------------+------+-----+---------+-------+
    | cno    | int(11)     | YES  |     | NULL    |       |
    | cname  | varchar(20) | YES  |     | NULL    |       |
    | cprice | int(11)     | YES  |     | NULL    |       |
    +--------+-------------+------+-----+---------+-------+
    3 rows in set (0.00 sec)

    create table alter_coffee(
        cno       int,      
        cname varchar(20),
        cprice int
    );  

    [002] 다음과 같이 DB와 테이블을 수정하시오  [TABLE명 : alter_coffee] -  ALTER TABLE
    연습문제1) cno, cname,cprice필드를 ( not null )으로 수정
      > DDL : create, drop, alter
      > alter table 테이블명
        (추가 : add, 삭제 : drop, 수정 : chang (modify, rename))

       ==> ALTER TABLE alter_coffee change cno cno int not null;
       ==> // ALTER TABLE alter_coffee modify cno int not null;
       ==> ALTER TABLE alter_coffee modify cname varchar(20) not null;
       ==> ALTER TABLE alter_coffee modify cprice int not null;

    연습문제2) 쿠폰필드  cgift    문자열고정(10)  미필수로 추가
       ==> ALTER TABLE alter_coffee add cgift char(10);

    연습문제3) 쿠폰필드  cgift를  ccoupon으로 바꾸기  (modify / change)
       ==> ALTER TABLE alter_coffee change cgift ccoupon char(10);
            mysql> desc  alter_coffee;
            +---------+-------------+------+-----+---------+-------+
            | Field   | Type        | Null | Key | Default | Extra |
            +---------+-------------+------+-----+---------+-------+
            | cno     | int         | NO   |     | NULL    |       |
            | cname   | varchar(20) | NO   |     | NULL    |       |
            | cprice  | int         | NO   |     | NULL    |       |
            | ccoupon | char(10)    | YES  |     | NULL    |       |
            +---------+-------------+------+-----+---------+-------+
            4 rows in set (0.00 sec)

    연습문제4) 쿠폰필드 ccoupon삭제 (drop)
       ==> ALTER TABLE alter_coffee drop ccoupon;
            mysql> desc  alter_coffee;
            +--------+-------------+------+-----+---------+-------+
            | Field  | Type        | Null | Key | Default | Extra |
            +--------+-------------+------+-----+---------+-------+
            | cno    | int         | NO   |     | NULL    |       |
            | cname  | varchar(20) | NO   |     | NULL    |       |
            | cprice | int         | NO   |     | NULL    |       |
            +--------+-------------+------+-----+---------+-------+
            3 rows in set (0.00 sec)

    연습문제5) cno를 cprice뒤로이동 (modify / change)
       ==> ALTER TABLE alter_coffee modify cno int not null after cprice; 
       ==> ALTER TABLE alter_coffee change cno cno int not null after cprice;
            mysql> desc  alter_coffee;
            +--------+-------------+------+-----+---------+-------+
            | Field  | Type        | Null | Key | Default | Extra |
            +--------+-------------+------+-----+---------+-------+
            | cname  | varchar(20) | NO   |     | NULL    |       |
            | cprice | int         | NO   |     | NULL    |       |
            | cno    | int         | NO   |     | NULL    |       |
            +--------+-------------+------+-----+---------+-------+
            3 rows in set (0.00 sec)

    연습문제6) cno를 맨위로 (modify / change)
      ==> ALTER TABLE alter_coffee modify cno int not null first;
      ==> ALTER TABLE alter_coffee change cno cno int not null first;

    연습문제7) cno를 primary key 추가
      ==> ALTER TABLE alter_coffee modify cno int not null primary key;
      ==> ALTER TABLE alter_coffee change cno cno int not null primary key;
      ==> ALTER TABLE alter_coffee add primary key(cno);
            mysql> desc  alter_coffee;
            +--------+-------------+------+-----+---------+-------+
            | Field  | Type        | Null | Key | Default | Extra |
            +--------+-------------+------+-----+---------+-------+
            | cname  | varchar(20) | NO   |     | NULL    |       |
            | cprice | int         | NO   |     | NULL    |       |
            | cno    | int         | NO   | PRI | NULL    |       |
            +--------+-------------+------+-----+---------+-------+
            3 rows in set (0.00 sec)

      ==> ALTER TABLE alter_coffee drop primary key;

    연습문제8) alter_coffee테이블의 이름을 alter_coffee2로 바꾸기
       ==> ALTER TABLE alter_coffee rename alter_coffee2;

    연습문제9) 다음과 같이 최종본으로 테이블만들기
    mysql> desc alter_coffee2;
    +--------+-------------+------+-----+---------+----------------+
    | Field  | Type        | Null | Key | Default | Extra          |
    +--------+-------------+------+-----+---------+----------------+
    | cno    | int(11)     | NO   | PRI | NULL    | auto_increment |
    | cname  | varchar(20) | NO   |     | NULL    |                |
    | cprice | int(11)     | NO   |     | NULL    |                |
    +--------+-------------+------+-----+---------+----------------+
    3 rows in set (0.00 sec)


    create table alter_coffee2(
        cno       int      not null,      
        cname varchar(20)  not null,
        cprice int  not null
    );
    ==> ALTER TABLE alter_coffee2 modify cno int not null auto_increment primary key first;


/*

    | ADD [COLUMN] col_name column_definition
            [FIRST | AFTER col_name]
    | ADD [COLUMN] (col_name column_definition,...)
    | ADD {INDEX | KEY} [index_name]
            [index_type] (key_part,...) [index_option] ...
    | ADD {FULLTEXT | SPATIAL} [INDEX | KEY] [index_name]
            (key_part,...) [index_option] ...
    | ADD [CONSTRAINT [symbol]] PRIMARY KEY
            [index_type] (key_part,...)
            [index_option] ...
    | ADD [CONSTRAINT [symbol]] UNIQUE [INDEX | KEY]
            [index_name] [index_type] (key_part,...)
            [index_option] ...
    | ADD [CONSTRAINT [symbol]] FOREIGN KEY
            [index_name] (col_name,...)
            reference_definition
    | ADD [CONSTRAINT [symbol]] CHECK (expr) [[NOT] ENFORCED]
    | DROP {CHECK | CONSTRAINT} symbol
    | ALTER {CHECK | CONSTRAINT} symbol [NOT] ENFORCED
    | ALGORITHM [=] {DEFAULT | INSTANT | INPLACE | COPY}
    | ALTER [COLUMN] col_name {
            SET DEFAULT {literal | (expr)}
        | SET {VISIBLE | INVISIBLE}
        | DROP DEFAULT
        }
    | ALTER INDEX index_name {VISIBLE | INVISIBLE}
    | CHANGE [COLUMN] old_col_name new_col_name column_definition
            [FIRST | AFTER col_name]
    | [DEFAULT] CHARACTER SET [=] charset_name [COLLATE [=] collation_name]
    | CONVERT TO CHARACTER SET charset_name [COLLATE collation_name]
    | {DISABLE | ENABLE} KEYS
    | {DISCARD | IMPORT} TABLESPACE
    | DROP [COLUMN] col_name
    | DROP {INDEX | KEY} index_name
    | DROP PRIMARY KEY
    | DROP FOREIGN KEY fk_symbol
    | FORCE
    | LOCK [=] {DEFAULT | NONE | SHARED | EXCLUSIVE}
    | MODIFY [COLUMN] col_name column_definition
            [FIRST | AFTER col_name]
    | ORDER BY col_name [, col_name] ...
    | RENAME COLUMN old_col_name TO new_col_name
    | RENAME {INDEX | KEY} old_index_name TO new_index_name
    | RENAME [TO | AS] new_tbl_name
    | {WITHOUT | WITH} VALIDATION
    }

partition_options:
    partition_option [partition_option] ...

    partition_option: {
      ADD PARTITION (partition_definition)
    | DROP PARTITION partition_names
    | DISCARD PARTITION {partition_names | ALL} TABLESPACE
    | IMPORT PARTITION {partition_names | ALL} TABLESPACE
    | TRUNCATE PARTITION {partition_names | ALL}
    | COALESCE PARTITION number
    | REORGANIZE PARTITION partition_names INTO (partition_definitions)
    | EXCHANGE PARTITION partition_name WITH TABLE tbl_name [{WITH | WITHOUT} VALIDATION]
    | ANALYZE PARTITION {partition_names | ALL}
    | CHECK PARTITION {partition_names | ALL}
    | OPTIMIZE PARTITION {partition_names | ALL}
    | REBUILD PARTITION {partition_names | ALL}
    | REPAIR PARTITION {partition_names | ALL}
    | REMOVE PARTITIONING
    }

key_part: {col_name [(length)] | (expr)} [ASC | DESC]

index_type:
    USING {BTREE | HASH}

    index_option: {
        KEY_BLOCK_SIZE [=] value
    | index_type
    | WITH PARSER parser_name
    | COMMENT 'string'
    | {VISIBLE | INVISIBLE}
}

table_options:
    table_option [[,] table_option] ...

    table_option: {
        AUTOEXTEND_SIZE [=] value
    | AUTO_INCREMENT [=] value
    | AVG_ROW_LENGTH [=] value
    | [DEFAULT] CHARACTER SET [=] charset_name
    | CHECKSUM [=] {0 | 1}
    | [DEFAULT] COLLATE [=] collation_name
    | COMMENT [=] 'string'
    | COMPRESSION [=] {'ZLIB' | 'LZ4' | 'NONE'}
    | CONNECTION [=] 'connect_string'
    | {DATA | INDEX} DIRECTORY [=] 'absolute path to directory'
    | DELAY_KEY_WRITE [=] {0 | 1}
    | ENCRYPTION [=] {'Y' | 'N'}
    | ENGINE [=] engine_name
    | ENGINE_ATTRIBUTE [=] 'string'
    | INSERT_METHOD [=] { NO | FIRST | LAST }
    | KEY_BLOCK_SIZE [=] value
    | MAX_ROWS [=] value
    | MIN_ROWS [=] value
    | PACK_KEYS [=] {0 | 1 | DEFAULT}
    | PASSWORD [=] 'string'
    | ROW_FORMAT [=] {DEFAULT | DYNAMIC | FIXED | COMPRESSED | REDUNDANT | COMPACT}
    | SECONDARY_ENGINE_ATTRIBUTE [=] 'string'
    | STATS_AUTO_RECALC [=] {DEFAULT | 0 | 1}
    | STATS_PERSISTENT [=] {DEFAULT | 0 | 1}
    | STATS_SAMPLE_PAGES [=] value
    | TABLESPACE tablespace_name [STORAGE {DISK | MEMORY}]
    | UNION [=] (tbl_name[,tbl_name]...)
    }

*/

mysql> create database userinfo;
mysql> use mbasic;
mysql> create table userinfo(
    no        int            not null   primary  key  auto_increment,
    name    varchar(100)     not null ,
    age      int             not null
);

mysql> desc userinfo;
+-------+--------------+------+-----+---------+----------------+
| Field | Type         | Null | Key | Default | Extra          |
+-------+--------------+------+-----+---------+----------------+
| no    | int          | NO   | PRI | NULL    | auto_increment |
| name  | varchar(100) | NO   |     | NULL    |                |
| age   | int          | NO   |     | NULL    |                |
+-------+--------------+------+-----+---------+----------------+
3 rows in set (0.00 sec)


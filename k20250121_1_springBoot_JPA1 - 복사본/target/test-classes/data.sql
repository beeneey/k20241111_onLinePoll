-- GenerationType 값에 상관없이 insert sql 명령 실행
-- insert into member (id, name, email, create_date, update_date) values (1, '홍길동', 'hong@mbcit.com', now(), now());
-- insert into member (id, name, email, create_date, update_date) values (2, '임꺽정', 'lim@mbcit.com', now(), now());
-- insert into member (id, name, email, create_date, update_date) values (3, '장길산', 'jang@mbcit.com', now(), now());
-- insert into member (id, name, email, create_date, update_date) values (4, '일지매', 'il@mbcit.com', now(), now());
-- insert into member (id, name, email, create_date, update_date) values (5, '홍길동', 'gildong@mbcit.com', now(), now());
-- insert into member (id, name, email, create_date, update_date) values (6, '홍길동', 'hong@mbcit.com', now(), now());

-- GenerationType 값이 IDENTITY일 경우 insert sql 명령 실행
-- id 필드는 AUTO_INCREMENT가 자동으로 1씩 증가시켜 입력하므로 id 필드는 입력하지 않는다.
-- insert into member (name, email, create_date, update_date) values ('홍길동', 'hong@mbcit.com', now(), now());
-- insert into member (name, email, create_date, update_date) values ('임꺽정', 'lim@mbcit.com', now(), now());
-- insert into member (name, email, create_date, update_date) values ('장길산', 'jang@mbcit.com', now(), now());
-- insert into member (name, email, create_date, update_date) values ('일지매', 'il@mbcit.com', now(), now());
-- insert into member (name, email, create_date, update_date) values ('홍길동', 'gildong@mbcit.com', now(), now());
-- insert into member (name, email, create_date, update_date) values ('홍길동', 'hong@mbcit.com', now(), now());

-- GenerationType 값이 SEQUENCE, TABLE, AUTO일 경우 insert sql 명령 실행
-- drop sequence member_id_seq;
-- create sequence member_id_seq start with 1 increment by 1;
-- insert into member (id, name, email, create_date, update_date) values (nextval('member_id_seq'), '홍길동', 'hong@mbcit.com', now(), now());
-- insert into member (id, name, email, create_date, update_date) values (nextval('member_id_seq'), '임꺽정', 'lim@mbcit.com', now(), now());
-- insert into member (id, name, email, create_date, update_date) values (nextval('member_id_seq'), '장길산', 'jang@mbcit.com', now(), now());
-- insert into member (id, name, email, create_date, update_date) values (nextval('member_id_seq'), '일지매', 'il@mbcit.com', now(), now());
-- insert into member (id, name, email, create_date, update_date) values (nextval('member_id_seq'), '홍길동', 'gildong@mbcit.com', now(), now());
-- insert into member (id, name, email, create_date, update_date) values (nextval('member_id_seq'), '홍길동', 'hong@mbcit.com', now(), now());

-- @Table, @Column 어노테이션을 적용한 경우 insert sql 명령 실행
insert into member2 (id, name, email, nick, create_date, update_date) values (nextval('member_id_seq'), '홍길동', 'hong@mbcit.com', '도적넘1', now(), now());
insert into member2 (id, name, email, nick, create_date, update_date) values (nextval('member_id_seq'), '임꺽정', 'lim@mbcit.com', '도적넘2', now(), now());
insert into member2 (id, name, email, nick, create_date, update_date) values (nextval('member_id_seq'), '장길산', 'jang@mbcit.com', '도적넘3', now(), now());
insert into member2 (id, name, email, nick, create_date, update_date) values (nextval('member_id_seq'), '일지매', 'il@mbcit.com', '도적넘4', now(), now());
insert into member2 (id, name, email, nick, create_date, update_date) values (nextval('member_id_seq'), '홍길동', 'gildong@mbcit.com', '도적넘5', now(), now());
insert into member2 (id, name, email, nick, create_date, update_date) values (nextval('member_id_seq'), '홍길동', 'hong2@mbcit.com', '도적넘6', now(), now());















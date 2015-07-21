create database CBC default charset='utf8';

use CBC;

drop table if exists transaction;
drop table if exists work_transaction_detail;
drop table if exists work_transaction_category;
drop table if exists work_transaction_record;
create table transaction(
	id      varchar(32) not null,
	work_transaction_id varchar(32) not null,
	user_id varchar(32) not null,
	remind              int, 
	status				int,
	update_time         BigInt,
  	create_time         BigInt,
  	is_deleted          int,
  	primary key(id)
);

create table work_transaction_detail(
	id                  varchar(32) not null,
	name                varchar(30),
	transaction_cate_id varchar(32),
	secure_department_id varchar(32),
	secure_level        int,
	facilitator         varchar(50),
	first_trial_deadline int,
	response_deadline    int,
	arrive_deadline		 int,
	handle_deadline      int,
	remark              varchar(100),
	update_time         BigInt,
  	create_time         BigInt,
  	is_deleted          int,
  	primary key(id)
);

create table work_transaction_category(
	id                  varchar(32) not null,
	name                varchar(30),
	update_time         BigInt,
  	create_time         BigInt,
  	is_deleted          int,
  	primary key(id)
);

create table work_transaction_record(
	id                  varchar(32) not null,
	from_user_id		varchar(32) not null,
	to_user_id			varchar(32) not null,
	message                varchar(50),
	status                 int,
	update_time         BigInt,
  	create_time         BigInt,
  	is_deleted          int,
  	primary key(id)
);

create database CBC default charset='utf8';

use CBC;

drop table if exists message;

create table message(
	id      			varchar(32) not null,
	content				varchar(255),
	operator_id			varchar(32),
	update_time         BigInt,
	create_time         BigInt,
	is_deleted          int,
	primary key(id)
);

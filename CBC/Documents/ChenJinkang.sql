create database CBC default charset='utf8';

use CBC;

drop table if exists return_order;
drop table if exists return_record;


create table return_order(
	  id                   varchar(32) not null,
  	return_man_id       varchar(32) not null,
  	goods_order_id      varchar(32) not null,
  	update_time         BigInt,
  	create_time         BigInt,
  	is_deleted          int,
  	primary key(id)
);

create table return_record(
  	id               varchar(32) not null,
  	return_order_id  varchar(32) not null,
  	goods_id         varchar(32) not null,
  	operator_id      varchar(32) not null,

  	want_return_num  int,
  	real_return_num  int,
  	status           int,
  	/*0表示待受理
   	 1表示已受理
  	*/
  	update_time         BigInt,
  	create_time         BigInt,
  	is_deleted          int,
  	primary key(id)
);

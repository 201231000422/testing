/*  数据库每个表必有的几个数据   *
 *  id              varchar(32), *
 *  update_time     BigInt,      *
 *  create_time     BigInt,      *
 *  is_deleted      int,         *
 *  primary key(id)              */

create database if not exists CBC default charset='utf8';

use CBC

drop table if exists user;

drop table if exists department;

drop table if exists goods;

drop table if exists goods_quota;

drop table if exists goods_category;

drop table if exists goods_order;

drop table if exists goods_order_item;

drop table if exists in_storage;

drop table if exists out_storage;

drop table if exists vendor;

drop table if exists return_order;

drop table if exists return_record;

drop table if exists transaction;

drop table if exists work_transaction_detail;

drop table if exists work_transaction_category;

drop table if exists work_transaction_record;

drop table if exists message;

#KC
create table user 
(
  id                  varchar(32) not null,
  account             varchar(255) not null,
  password            varchar(255) not null,
  name                varchar(255),
  phone               varchar(255),
  department_id       varchar(32),
  update_time         BigInt,
  create_time         BigInt,
  is_deleted          int,
  primary key(id)
);

create table department
(
  id                  varchar(32) not null,
  name                varchar(255) not null,
  level               int not null,
  parent_id           varchar(32),
  update_time         BigInt,
  create_time         BigInt,
  is_deleted          int not null default 0,
  primary key(id)
);

#bizhi
create table goods
(
  id                 varchar(32) not null,
  name               varchar(30) not null,
  is_ordered         int,
  g_category_id      varchar(32),
  dist_way           int,
  unit_price         double not null,
  amount             int,
  is_cen_dist        int,
  cen_time           BigInt,
  level              int,
  dist_principle     int,
  remark             varchar(255),
  unit               varchar(8),  # 建议varchar。提，份，包，支，块，个，盒，瓶，根，卷，箱，本，
  update_time        BigInt,
  create_time        BigInt,
  is_deleted         int,
  primary key (id)
);

create table goods_quota
(
  id                  varchar(32) not null,
  goods_id            varchar(32) not null,
  dep_id              varchar(32) not null,
  quota               int default 0,  # 默认0，表示无限额
  update_time         BigInt,
  create_time         BigInt,
  is_deleted          int,
  primary key(id)
);

create table goods_category
(
  id                  varchar(32) not null,
  name                varchar(32),
  parent_id           varchar(32),
  update_time         BigInt,
  create_time         BigInt,
  is_deleted          int,
  primary key (id)
);

create table goods_order
(
   id                   varchar(32) not null,
   status               int not null, #待确认，待配货，待发货，已完成
   operator_id          varchar(32),
   send_time            BigInt,   #期望发货日期
   remark               varchar(255),
   receive_time         BigInt,
   update_time          BigInt,
   create_time          BigInt,
   is_deleted           int,
   primary key (id)
);

create table goods_order_item
(
   id                   varchar(32) not null,
   goods_order_id       varchar(32) not null,
   goods_id             varchar(32) not null,
   goods_num            int,
   total_money          double,
   update_time          BigInt,
   create_time          BigInt,
   is_deleted           int,
   primary key(id)
);

create table in_storage
(
   id                   varchar(32) not null,
   goods_id             varchar(32) not null,
   operator_id          varchar(32) not null,
   amount               int,
   in_type              int,
   description          varchar(255),
   vendor_id            varchar(255),
   update_time          BigInt,
   create_time          BigInt,
   is_deleted           int,
   primary key(id)
);

create table out_storage
(
   id                   varchar(32) not null,
   goods_id             varchar(32) not null,
   operator_id          varchar(32) not null,
   amount               int,
   out_type             int,
   description          varchar(255),
   vendor_id            varchar(255),
   update_time          BigInt,
   create_time          BigInt,
   is_deleted           int,
   primary key(id)
);

create table vendor
(
   id                   varchar(32) not null,
   vendor_name          varchar(255),
   address              varchar(255),
   post_code            varchar(255),
   vendor_phone        varchar(255),
   chief_man            varchar(255),
   chief_man_phone      varchar(255),
   update_time          BigInt,
   create_time          BigInt,
   is_deleted           int,
   primary key(id)
);

#jinkang
create table return_order(
    id                  varchar(32) not null,
    return_man_id       varchar(32) not null,
    goods_order_id      varchar(32) not null,
    update_time         BigInt,
    create_time         BigInt,
    is_deleted          int,
    primary key(id)
);

create table return_record(
    id                  varchar(32) not null,
    return_order_id     varchar(32) not null,
    goods_id            varchar(32) not null,
    operator_id         varchar(32) not null,
    want_return_num     int,
    real_return_num     int,
    status              int,
    update_time         BigInt,
    create_time         BigInt,
    is_deleted          int,
    primary key(id)
);

#siyuan
create table transaction(
  id      varchar(32) not null,
  work_transaction_id varchar(32) not null,
  user_id varchar(32) not null,
  remind              int, 
  status        int,
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
  arrive_deadline    int,
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
    create_time       BigInt,
    is_deleted        int,
    primary key(id)
);

create table work_transaction_record(
  id                  varchar(32) not null,
  from_user_id        varchar(32) not null,
  to_user_id          varchar(32) not null,
  message             varchar(50),
  status              int,
  update_time         BigInt,
  create_time         BigInt,
  is_deleted          int,
  primary key(id)
);


#tang
create table message
(
   id                   varchar(32) not null,
   content              varchar(255),
   operator_id          varchar(32),
   update_time          BigInt,
   create_time          BigInt,
   is_deleted           int,
   primary key (id)
);


insert into department(id,name,level,parent_id,update_time,create_time,is_deleted) values(replace(UUID(),"-",""),'最高权限',0,null,UNIX_TIMESTAMP()*1000,UNIX_TIMESTAMP()*1000,0);

insert into department(id,name,level,parent_id,update_time,create_time,is_deleted) values(replace(UUID(),"-",""),'行长',1,null,UNIX_TIMESTAMP()*1000,UNIX_TIMESTAMP()*1000,0);

insert into department(id,name,level,parent_id,update_time,create_time,is_deleted) values(replace(UUID(),"-",""),'网管中心',2,null,UNIX_TIMESTAMP()*1000,UNIX_TIMESTAMP()*1000,0);

insert into department(id,name,level,parent_id,update_time,create_time,is_deleted) values(replace(UUID(),"-",""),'配送中心',3,null,UNIX_TIMESTAMP()*1000,UNIX_TIMESTAMP()*1000,0);

insert into user(id,account,password,name,phone,department_id,create_time,update_time,is_deleted) values(replace(UUID(),"-",""),'speadmin','speadmin','系统管理员','13562369856',(select id from department where level = 0),UNIX_TIMESTAMP()*1000,UNIX_TIMESTAMP()*1000,0);

insert into user(id,account,password,name,phone,department_id,create_time,update_time,is_deleted) values(replace(UUID(),"-",""),'govadmin','govadmin','行长','13589632156',(select id from department where level = 1),UNIX_TIMESTAMP()*1000,UNIX_TIMESTAMP()*1000,0);

insert into user(id,account,password,name,phone,department_id,create_time,update_time,is_deleted) values(replace(UUID(),"-",""),'netadmin','netadmin','网管中心人员','13532657893',(select id from department where level = 2),UNIX_TIMESTAMP()*1000,UNIX_TIMESTAMP()*1000,0);

insert into user(id,account,password,name,phone,department_id,create_time,update_time,is_deleted) values(replace(UUID(),"-",""),'disadmin','disadmin','配送中心人员','13530145875',(select id from department where level = 3),UNIX_TIMESTAMP()*1000,UNIX_TIMESTAMP()*1000,0);
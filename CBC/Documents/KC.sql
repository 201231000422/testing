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

insert into department(id,name,level,parent_id,update_time,create_time,is_deleted) values(replace(UUID(),"-",""),'最高权限',0,null,UNIX_TIMESTAMP()*1000,UNIX_TIMESTAMP()*1000,0);

insert into department(id,name,level,parent_id,update_time,create_time,is_deleted) values(replace(UUID(),"-",""),'行长',1,null,UNIX_TIMESTAMP()*1000,UNIX_TIMESTAMP()*1000,0);

insert into department(id,name,level,parent_id,update_time,create_time,is_deleted) values(replace(UUID(),"-",""),'网管中心',2,null,UNIX_TIMESTAMP()*1000,UNIX_TIMESTAMP()*1000,0);

insert into department(id,name,level,parent_id,update_time,create_time,is_deleted) values(replace(UUID(),"-",""),'配送中心',3,null,UNIX_TIMESTAMP()*1000,UNIX_TIMESTAMP()*1000,0);

insert into user(id,account,password,name,phone,department_id,create_time,update_time,is_deleted) values(replace(UUID(),"-",""),'speadmin','speadmin','系统管理员','13562369856',(select id from department where level = 0),UNIX_TIMESTAMP()*1000,UNIX_TIMESTAMP()*1000,0);

insert into user(id,account,password,name,phone,department_id,create_time,update_time,is_deleted) values(replace(UUID(),"-",""),'govadmin','govadmin','行长','13589632156',(select id from department where level = 1),UNIX_TIMESTAMP()*1000,UNIX_TIMESTAMP()*1000,0);

insert into user(id,account,password,name,phone,department_id,create_time,update_time,is_deleted) values(replace(UUID(),"-",""),'netadmin','netadmin','网管中心人员','13532657893',(select id from department where level = 2),UNIX_TIMESTAMP()*1000,UNIX_TIMESTAMP()*1000,0);

insert into user(id,account,password,name,phone,department_id,create_time,update_time,is_deleted) values(replace(UUID(),"-",""),'disadmin','disadmin','配送中心人员','13530145875',(select id from department where level = 3),UNIX_TIMESTAMP()*1000,UNIX_TIMESTAMP()*1000,0);
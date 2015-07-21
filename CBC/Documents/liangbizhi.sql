/*  数据库每个表必有的几个数据   *
 *  id              varchar(32), *
 *  update_time     BigInt,      *
 *  create_time     BigInt,      *
 *  is_deleted      int,         *
 *  primary key(id)              */

create database CBC default charset='utf8';

use CBC;

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
  level               int,
  parent_id           varchar(32),
  update_time         BigInt,
  create_time         BigInt,
  is_deleted          int,
  primary key(id)
);

/* the follow contents authored by liangbizhi */


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
  unit               varchar(8),	# 建议varchar。提，份，包，支，块，个，盒，瓶，根，卷，箱，本，
  update_time        BigInt,
  create_time        BigInt,
  is_deleted         int,
  primary key (id)
);
/**
 * 物品限额
 */
create table goods_quota
(
  id                  varchar(32) not null,
  goods_id            varchar(32) not null,
  dep_id              varchar(32) not null,
  quota               int default 0,	# 默认0，表示无限额
  update_time         BigInt,
  create_time         BigInt,
  is_deleted          int,
  primary key(id)
);
/**
 * 物品分类
 */
create table goods_category
(
  id                  varchar(32) not null,
  name                varchar(32),
  parent_id           varchar(32),
  update_time     	  BigInt,
  create_time         BigInt,
  is_deleted          int,
  primary key (id)
);
/**
 * 订单
 */
create table goods_order
(
   id                   varchar(32) not null,
   status               int not null,	#待确认，待配货，待发货，已完成
   operator_id          varchar(32),
   send_time            BigInt,		#期望发货日期
   remark               varchar(255),
   receive_time         BigInt,
   update_time          BigInt,
   create_time          BigInt,
   is_deleted           int,
   primary key (id)
);
/**
 * 订单项
 */
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
/**
 * 入库记录
 */
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
/**
 * 出库记录
 */
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
/**
 * 供应商
 */
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


# chenjinkang


/**
 * 退货订单
 */
create table return_order
(
  id                    varchar(32),
  return_man_id         varchar(32),
  goods_order_id        varchar(32),
  update_time           BigInt,
  create_time           BigInt,
  is_deleted            int,
  primary key(id)
);
/**
 * 退货记录
 */
create table return_record
(
  id                    varchar(32),
  return_order_id       varchar(32),
  goods_id              varchar(32),
  want_return_num       int,
  real_return_num       int,
  status                int,	# 0表示待受理，1表示已受理
  operator_id           varchar(32),
  update_time           BigInt,
  create_time           BigInt,
  is_deleted            int,
  primary key(id)
);
/**
 * 消息
 */
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
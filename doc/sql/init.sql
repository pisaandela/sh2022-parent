create table sh2022.t_address
(
    lock_flag int default 0 null comment '封控类型，123',
    id bigint auto_increment comment '主键ID'
        primary key,
    user_count int null comment '人数',
    sort int null comment '配送顺序',
    address_no varchar(30) null comment '弄',
    floor_no varchar(30) null comment '楼',
    room_no varchar(30) null comment '室',
    build_no varchar(30) null comment '楼栋',
    create_time timestamp default CURRENT_TIMESTAMP not null comment '插入时间',
    village_no varchar(30) null comment '小区编号'
)
    comment '地址表';

create table sh2022.t_address_order
(
    id bigint auto_increment comment '主键ID'
        primary key,
    address_id bigint null comment '地址编号',
    order_no varchar(30) null comment '订单编号'
)
    comment '地址订单关系表';

create table sh2022.t_group
(
    id bigint auto_increment comment '主键ID'
        primary key,
    group_no varchar(30) null comment '团购编号',
    group_name varchar(30) null comment '团购名称',
    product_count int null comment '产品总数',
    group_date date null comment '开团日期',
    create_time timestamp default CURRENT_TIMESTAMP not null comment '插入时间',
    order_count int null comment '订单总数',
    village_no varchar(30) null comment '小区编号'
);

create table sh2022.t_order
(
    id bigint auto_increment comment '主键ID'
        primary key,
    room_id bigint null comment '房间表编号',
    group_no varchar(30) null comment '订单编号',
    user_id bigint null comment '订单用户',
    product_count int default 0 null comment '团购数量',
    user_phone varchar(30) null comment '用户电话',
    user_name varchar(250) null comment '用户姓名',
    product_no varchar(30) null comment '团购产品编号',
    room_no varchar(30) null comment '房间编号',
    address_no varchar(30) null comment '弄',
    floor_no varchar(30) null comment '楼',
    create_time timestamp default CURRENT_TIMESTAMP not null comment '插入时间',
    get_flag int default 0 null comment '是否收到',
    pay_flag int default 0 null comment '是否付款',
    remark varchar(50) null comment '备注',
    order_no varchar(30) null comment '跟团编号'
)
    comment '订单表';

create table sh2022.t_product
(
    id bigint auto_increment comment '主键ID'
        primary key,
    product_no varchar(30) null comment '订单编号',
    product_name varchar(30) null comment '产品名称',
    product_num int null comment '总数',
    create_time timestamp default CURRENT_TIMESTAMP not null comment '插入时间',
    group_no varchar(30) null comment '团购订单编号',
    product_specs varchar(30) null comment '规格',
    product_category varchar(30) null comment '产品分类'
);

create table sh2022.t_room
(
    id bigint auto_increment comment '主键ID'
        primary key,
    address_id bigint null comment '地址表id',
    room_no varchar(30) null comment '室',
    user_count int null comment '人数',
    sort int null comment '顺序',
    create_time timestamp default CURRENT_TIMESTAMP not null comment '插入时间'
)
    comment '房间表';

create table sh2022.t_room_user
(
    id bigint auto_increment comment '主键ID'
        primary key,
    room_id bigint null comment '房间id',
    user_id bigint null comment '人员id',
    sort int null comment '顺序'
)
    comment '房间用户关系表';

create table sh2022.t_user
(
    id bigint auto_increment comment '主键ID'
        primary key,
    user_name varchar(30) null comment '姓名',
    age int null comment '年龄',
    email varchar(50) null comment '邮箱',
    phone_num varchar(30) null comment '电话'
);


INSERT INTO sh2022.t_address (lock_flag, user_count, sort, address_no, floor_no, room_no, build_no, create_time, village_no) VALUES (0, null, 1, '1459', '1', null, '1', '2022-04-16 16:30:24', '1');
INSERT INTO sh2022.t_address (lock_flag, user_count, sort, address_no, floor_no, room_no, build_no, create_time, village_no) VALUES (0, null, 2, '1459', '3', null, '2', '2022-04-16 16:30:24', '1');
INSERT INTO sh2022.t_address (lock_flag, user_count, sort, address_no, floor_no, room_no, build_no, create_time, village_no) VALUES (0, null, 3, '1459', '2', null, '3', '2022-04-16 16:30:24', '1');
INSERT INTO sh2022.t_address (lock_flag, user_count, sort, address_no, floor_no, room_no, build_no, create_time, village_no) VALUES (0, null, 4, '1461', '69', null, '4', '2022-04-16 16:30:24', '1');
INSERT INTO sh2022.t_address (lock_flag, user_count, sort, address_no, floor_no, room_no, build_no, create_time, village_no) VALUES (0, null, 5, '1461', '61', null, '5', '2022-04-16 16:30:24', '1');
INSERT INTO sh2022.t_address (lock_flag, user_count, sort, address_no, floor_no, room_no, build_no, create_time, village_no) VALUES (0, null, 6, '1461', '49', null, '6', '2022-04-16 16:30:24', '1');
INSERT INTO sh2022.t_address (lock_flag, user_count, sort, address_no, floor_no, room_no, build_no, create_time, village_no) VALUES (1, null, 7, '1461', '47', null, '6', '2022-04-16 16:30:24', '1');
INSERT INTO sh2022.t_address (lock_flag, user_count, sort, address_no, floor_no, room_no, build_no, create_time, village_no) VALUES (1, null, 8, '1461', '45', null, '7', '2022-04-16 16:30:24', '1');
INSERT INTO sh2022.t_address (lock_flag, user_count, sort, address_no, floor_no, room_no, build_no, create_time, village_no) VALUES (0, null, 9, '1461', '43', null, '7', '2022-04-16 16:30:24', '1');
INSERT INTO sh2022.t_address (lock_flag, user_count, sort, address_no, floor_no, room_no, build_no, create_time, village_no) VALUES (0, null, 10, '1461', '41', null, '7', '2022-04-16 16:30:24', '1');
INSERT INTO sh2022.t_address (lock_flag, user_count, sort, address_no, floor_no, room_no, build_no, create_time, village_no) VALUES (0, null, 11, '1461', '51', null, '8', '2022-04-16 16:30:24', '1');
INSERT INTO sh2022.t_address (lock_flag, user_count, sort, address_no, floor_no, room_no, build_no, create_time, village_no) VALUES (1, null, 12, '1461', '53', null, '8', '2022-04-16 16:30:24', '1');
INSERT INTO sh2022.t_address (lock_flag, user_count, sort, address_no, floor_no, room_no, build_no, create_time, village_no) VALUES (1, null, 13, '1461', '55', null, '8', '2022-04-16 16:30:24', '1');
INSERT INTO sh2022.t_address (lock_flag, user_count, sort, address_no, floor_no, room_no, build_no, create_time, village_no) VALUES (1, null, 14, '1461', '57', null, '9', '2022-04-16 16:30:24', '1');
INSERT INTO sh2022.t_address (lock_flag, user_count, sort, address_no, floor_no, room_no, build_no, create_time, village_no) VALUES (1, null, 15, '1461', '59', null, '9', '2022-04-16 16:30:24', '1');
INSERT INTO sh2022.t_address (lock_flag, user_count, sort, address_no, floor_no, room_no, build_no, create_time, village_no) VALUES (1, null, 16, '1461', '73', null, '10', '2022-04-16 16:30:24', '1');
INSERT INTO sh2022.t_address (lock_flag, user_count, sort, address_no, floor_no, room_no, build_no, create_time, village_no) VALUES (0, null, 17, '1461', '71', null, '10', '2022-04-16 16:30:24', '1');
INSERT INTO sh2022.t_address (lock_flag, user_count, sort, address_no, floor_no, room_no, build_no, create_time, village_no) VALUES (0, null, 18, '1461', '65', null, '11', '2022-04-16 16:30:24', '1');
INSERT INTO sh2022.t_address (lock_flag, user_count, sort, address_no, floor_no, room_no, build_no, create_time, village_no) VALUES (1, null, 19, '1461', '67', null, '11', '2022-04-16 16:30:24', '1');
INSERT INTO sh2022.t_address (lock_flag, user_count, sort, address_no, floor_no, room_no, build_no, create_time, village_no) VALUES (0, null, 20, '1401', '38', null, '12', '2022-04-16 16:30:24', '1');
INSERT INTO sh2022.t_address (lock_flag, user_count, sort, address_no, floor_no, room_no, build_no, create_time, village_no) VALUES (0, null, 21, '1401', '37', null, '12', '2022-04-16 16:30:24', '1');
INSERT INTO sh2022.t_address (lock_flag, user_count, sort, address_no, floor_no, room_no, build_no, create_time, village_no) VALUES (0, null, 22, '1401', '36', null, '12', '2022-04-16 16:30:24', '1');
INSERT INTO sh2022.t_address (lock_flag, user_count, sort, address_no, floor_no, room_no, build_no, create_time, village_no) VALUES (0, null, 23, '1401', '43', null, '13', '2022-04-16 16:30:24', '1');
INSERT INTO sh2022.t_address (lock_flag, user_count, sort, address_no, floor_no, room_no, build_no, create_time, village_no) VALUES (0, null, 24, '1401', '42', null, '13', '2022-04-16 16:30:24', '1');
INSERT INTO sh2022.t_address (lock_flag, user_count, sort, address_no, floor_no, room_no, build_no, create_time, village_no) VALUES (0, null, 25, '1401', '35', null, '14', '2022-04-16 16:30:24', '1');
INSERT INTO sh2022.t_address (lock_flag, user_count, sort, address_no, floor_no, room_no, build_no, create_time, village_no) VALUES (0, null, 26, '1401', '34', null, '14', '2022-04-16 16:30:24', '1');
INSERT INTO sh2022.t_address (lock_flag, user_count, sort, address_no, floor_no, room_no, build_no, create_time, village_no) VALUES (0, null, 27, '1401', '33', null, '14', '2022-04-16 16:30:24', '1');
INSERT INTO sh2022.t_address (lock_flag, user_count, sort, address_no, floor_no, room_no, build_no, create_time, village_no) VALUES (1, null, 28, '1401', '41', null, '15', '2022-04-16 16:30:24', '1');
INSERT INTO sh2022.t_address (lock_flag, user_count, sort, address_no, floor_no, room_no, build_no, create_time, village_no) VALUES (0, null, 29, '1401', '40', null, '15', '2022-04-16 16:30:24', '1');
INSERT INTO sh2022.t_address (lock_flag, user_count, sort, address_no, floor_no, room_no, build_no, create_time, village_no) VALUES (0, null, 30, '1401', '31', null, '16', '2022-04-16 16:30:24', '1');
INSERT INTO sh2022.t_address (lock_flag, user_count, sort, address_no, floor_no, room_no, build_no, create_time, village_no) VALUES (0, null, 31, '1401', '30', null, '16', '2022-04-16 16:30:24', '1');
INSERT INTO sh2022.t_address (lock_flag, user_count, sort, address_no, floor_no, room_no, build_no, create_time, village_no) VALUES (0, null, 32, '1401', '29', null, '16', '2022-04-16 16:30:24', '1');
INSERT INTO sh2022.t_address (lock_flag, user_count, sort, address_no, floor_no, room_no, build_no, create_time, village_no) VALUES (0, null, 33, '1401', '28', null, '16', '2022-04-16 16:30:24', '1');
INSERT INTO sh2022.t_address (lock_flag, user_count, sort, address_no, floor_no, room_no, build_no, create_time, village_no) VALUES (0, null, 34, '1401', '27', null, '16', '2022-04-16 16:30:24', '1');
INSERT INTO sh2022.t_address (lock_flag, user_count, sort, address_no, floor_no, room_no, build_no, create_time, village_no) VALUES (0, null, 35, '1401', '26', null, '16', '2022-04-16 16:30:24', '1');
INSERT INTO sh2022.t_address (lock_flag, user_count, sort, address_no, floor_no, room_no, build_no, create_time, village_no) VALUES (0, null, 36, '1401', '23', null, '17', '2022-04-16 16:30:24', '1');
INSERT INTO sh2022.t_address (lock_flag, user_count, sort, address_no, floor_no, room_no, build_no, create_time, village_no) VALUES (0, null, 37, '1401', '22', null, '17', '2022-04-16 16:30:24', '1');
INSERT INTO sh2022.t_address (lock_flag, user_count, sort, address_no, floor_no, room_no, build_no, create_time, village_no) VALUES (0, null, 38, '1401', '21', null, '17', '2022-04-16 16:30:24', '1');
INSERT INTO sh2022.t_address (lock_flag, user_count, sort, address_no, floor_no, room_no, build_no, create_time, village_no) VALUES (0, null, 39, '1401', '20', null, '17', '2022-04-16 16:30:24', '1');
INSERT INTO sh2022.t_address (lock_flag, user_count, sort, address_no, floor_no, room_no, build_no, create_time, village_no) VALUES (0, null, 40, '1401', '18', null, '18', '2022-04-16 16:30:24', '1');
INSERT INTO sh2022.t_address (lock_flag, user_count, sort, address_no, floor_no, room_no, build_no, create_time, village_no) VALUES (0, null, 41, '1401', '17', null, '18', '2022-04-16 16:30:24', '1');
INSERT INTO sh2022.t_address (lock_flag, user_count, sort, address_no, floor_no, room_no, build_no, create_time, village_no) VALUES (0, null, 42, '1401', '16', null, '18', '2022-04-16 16:30:24', '1');
INSERT INTO sh2022.t_address (lock_flag, user_count, sort, address_no, floor_no, room_no, build_no, create_time, village_no) VALUES (1, null, 43, '1401', '15', null, '18', '2022-04-16 16:30:24', '1');
INSERT INTO sh2022.t_address (lock_flag, user_count, sort, address_no, floor_no, room_no, build_no, create_time, village_no) VALUES (0, null, 44, '1401', '13', null, '18', '2022-04-16 16:30:24', '1');
INSERT INTO sh2022.t_address (lock_flag, user_count, sort, address_no, floor_no, room_no, build_no, create_time, village_no) VALUES (0, null, 45, '1401', '12', null, '19', '2022-04-16 16:30:24', '1');
INSERT INTO sh2022.t_address (lock_flag, user_count, sort, address_no, floor_no, room_no, build_no, create_time, village_no) VALUES (0, null, 46, '1401', '11', null, '19', '2022-04-16 16:30:24', '1');
INSERT INTO sh2022.t_address (lock_flag, user_count, sort, address_no, floor_no, room_no, build_no, create_time, village_no) VALUES (0, null, 47, '1401', '10', null, '19', '2022-04-16 16:30:24', '1');
INSERT INTO sh2022.t_address (lock_flag, user_count, sort, address_no, floor_no, room_no, build_no, create_time, village_no) VALUES (1, null, 48, '1401', '7', null, '20', '2022-04-16 16:30:24', '1');
INSERT INTO sh2022.t_address (lock_flag, user_count, sort, address_no, floor_no, room_no, build_no, create_time, village_no) VALUES (1, null, 49, '1401', '6', null, '20', '2022-04-16 16:30:24', '1');
INSERT INTO sh2022.t_address (lock_flag, user_count, sort, address_no, floor_no, room_no, build_no, create_time, village_no) VALUES (0, null, 50, '1401', '5', null, '20', '2022-04-16 16:30:24', '1');
INSERT INTO sh2022.t_address (lock_flag, user_count, sort, address_no, floor_no, room_no, build_no, create_time, village_no) VALUES (0, null, 51, '1401', '4', null, '20', '2022-04-16 16:30:24', '1');
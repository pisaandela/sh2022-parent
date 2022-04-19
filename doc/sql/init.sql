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


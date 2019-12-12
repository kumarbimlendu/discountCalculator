create table discount_slab
(
   id integer AUTO_INCREMENT ,
   lower_range varchar(10) not null unique,
   upper_range varchar(10) not null unique,
   discount varchar(5) not null,
   primary key(id)
);
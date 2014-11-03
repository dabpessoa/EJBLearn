------------------------
--- database scripts ---
------------------------

-- create table movie ------
drop table cinematizando.movie;
create table cinematizando.movie (
     id bigserial not null
    ,originaltitle varchar(255)
    ,translatedtitle varchar(255)
    ,release date
    ,synopsis text
);
alter table cinematizando.movie add primary key (id);
----------------------------

-- create table place ----
drop table if exists cinematizando.place;
create table cinematizando.place (
   id bigserial NOT NULL
  ,name character varying(150)
  ,type smallint
);
alter table cinematizando.place add primary key (id);
--------------------------

-- create table session ----
drop table if exists cinematizando.session;
create table cinematizando.session (
   id bigserial NOT NULL
  ,date date
  ,capacity integer
);
alter table cinematizando.session add primary key (id);
--------------------------

-- create table address ----
drop table if exists cinematizando.address;
create table cinematizando.address (
   id bigserial NOT NULL
  ,street character varying(60)
  ,number integer
);
alter table cinematizando.address add primary key (id);
----------------------------

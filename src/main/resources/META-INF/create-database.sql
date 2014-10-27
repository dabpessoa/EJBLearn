create table cinematizando.movie(
    id bigserial
    ,originaltitle varchar(255)
    ,translatedtitle varchar(255)
    ,"release" date
    ,synopsis text
);
alter table cinematizando.movie add primary key (id) ;
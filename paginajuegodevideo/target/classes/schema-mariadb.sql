
/**
 * Author:  gonza
 * Created: 06-12-2020
 */


drop table if exists videojuego;
drop table if exists distribuidor;

create table videojuego(
id int primary key auto_increment,
nombre varchar(200) not null,
descripcion varchar (3000),
imagen_url varchar(500)
);

insert into videojuego
(id,nombre,  descripcion,   imagen_url) values
( 1,'Bioshock Infinite',   'Neque porro quisquam est qui dolorem ipsum quia dolor sit amet',       'https://imagenes.20minutos.es/files/article_amp/uploads/2019/12/10/portada-de-bioshock-infinite.jpeg'            ),
(  2,'Insurgency',   'Neque porro quisquam est qui dolorem ipsum quia dolor sit amet'   , 'https://i.ytimg.com/vi/1nlqH5zReDA/maxresdefault.jpg' ),
(  3,'The witness',   'Neque porro quisquam est qui dolorem ipsum quia dolor sit amet'   , 'https://i.ytimg.com/vi/FI7-AmCzF4A/maxresdefault.jpg' ),
(  4,'Braid',   'Neque porro quisquam est qui dolorem ipsum quia dolor sit amet'   , 'https://siaguanta.com/wp-content/uploads/2019/08/Requisitos-para-instalar-Braid5.jpg' ),
(  5,'Angry Birds',   'Neque porro quisquam est qui dolorem ipsum quia dolor sit amet'   , 'https://www.trecebits.com/wp-content/uploads/2019/03/Angry-Birds-AR.jpg' ),
(  6,'Smash Bros',   'Neque porro quisquam est qui dolorem ipsum quia dolor sit amet'   , 'https://animeclubgt.com/wp-content/uploads/2016/06/253.jpg' ),
(  7,'Star Fox',   'Neque porro quisquam est qui dolorem ipsum quia dolor sit amet'   , 'https://cdn02.nintendo-europe.com/media/images/10_share_images/games_15/gamecube_12/SI_GCN_StarFoxAssault_image1600w.jpg' ),
(  8,'Kirby',   'Neque porro quisquam est qui dolorem ipsum quia dolor sit amet'   , 'https://www.alfabetajuega.com/wp-content/uploads/2018/12/kirby-super-smash-bros-ultimate-screenshot.jpg' );


create table distribuidor(
id int primary key auto_increment, 
nombre varchar (200) not null,
sitio_web varchar(500)
);

insert into distribuidor
(id,nombre, sitio_web) values
(1,'PC','https://as.com/meristation/plataformas/computadora_personal/top/'),
(2,'Nintendo','https://www.nintendo.com/es_LA/');


alter table videojuego
add column distribuidor_id int, 
add foreign key (distribuidor_id) references distribuidor (id);

update videojuego set distribuidor_id = 1 where id in (1,2,3,4,5);
update videojuego set distribuidor_id = 2 where id in (6,7,8);



alter table videojuego
modify distribuidor_id int not null; 


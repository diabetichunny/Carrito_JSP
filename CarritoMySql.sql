create database carrito;

use carrito;

create table Productos(
	id_producto int primary key auto_increment,
	nombre varchar(100) not null,
    descripcion varchar(255) not null,
	img_producto varchar(255) not null,
	id_categoria int not null,
	precio float not null,
	stock int not null
);

DELIMITER //
	CREATE PROCEDURE selectProductos()
	BEGIN
		SELECT * FROM Productos;
	END	
//

DELIMITER //
	CREATE PROCEDURE selectProducto(IN _id_producto int)
	BEGIN
		SELECT * FROMPproductos WHERE id_producto = _id_producto;
	END	
//


Insert Into Productos (nombre, descripcion, img_producto, id_categoria, precio, stock) Values('Dell Latitude 14" 7480','14” FHD Display, i7-7600U 2.80GHz, 16GB DDR4, 256GB SSD, Windows 10 Pro 64' ,'images/products/dell-lat-7480.png', 1, 40000, 10);
Insert Into Productos (nombre, descripcion, img_producto, id_categoria, precio, stock) Values('Dell Latitude 14.1" E6430', 'i5-3320 2.6GHz 8GB 320gb SATA Windows 10 Professional (Certified Refurbished)', 'images/products/dell-lat-E6430.png', 1, 23000, 15);
Insert Into Productos (nombre, descripcion, img_producto, id_categoria, precio, stock) Values('Dell Inspiron 14 7000 Series', 'i7-8550 1 TB a 5400 rpm 16GB RAM', 'images/products/dell-ins-7000.png', 1, 45000, 5);
Insert Into Productos (nombre, descripcion, img_producto, id_categoria, precio, stock) Values('ASUS VivoBook E403NA-US04', 'Dual Core N3350 4GB RAM 64GB eMMC flash storage Windows 10', 'images/products/asus-vivobook-E403NA-US04.png', 1, 15000, 20);
Insert Into Productos (nombre, descripcion, img_producto, id_categoria, precio, stock) Values('ASUS VivoBook S', 'i7-8550U 8GB DDR4 RAM 128GB SSD+1TB HDD 15.6” FHD Windows 10', 'images/products/asus-vivobook-S.png', 1, 43000, 5);

call selectProductos();
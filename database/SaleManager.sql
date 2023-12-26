CREATE DATABASE SalesManager;

USE SalesManager

DROP TABLE Category
DROP TABLE Customer
DROP TABLE Payment_Method
DROP TABLE Product
DROP TABLE Sales
DROP TABLE Supplier

CREATE TABLE Customer (
	id_Customer INT IDENTITY(1,1) PRIMARY KEY NOT NULL,
	customer_name NVARCHAR(50) NOT NULL,
	lastname NVARCHAR(50) NOT NULL,
	mail NVARCHAR(100) NOT NULL,
	phone NVARCHAR(100) NOT NULL,
	adress NVARCHAR(100) NOT NULL,
	city NVARCHAR(50) NOT NULL,
	country NVARCHAR(50) NOT NULL,
	id_Sale INT FOREIGN KEY REFERENCES Sales(id_Sale) NOT NULL
);

CREATE TABLE Sales (
	id_Sale INT IDENTITY(1,1) PRIMARY KEY NOT NULL,
	date_Sale DATE NOT NULL,
	unit_Price MONEY NOT NULL,
	total_Sale MONEY NOT NULL,
	id_product INT FOREIGN KEY REFERENCES Product(id_Product) NOT NULL,
	id_Payment_method INT FOREIGN KEY REFERENCES Payment_Method(id_Payment_Method) NOT NULL,
	shipping_Address NVARCHAR(150) NOT NULL,
	state_Sale NVARCHAR(50) NOT NULL
);

CREATE TABLE Product (
	id_Product INT IDENTITY(1,1) PRIMARY KEY NOT NULL,
	product_Name NVARCHAR(50) NOT NULL,
	product_Description NVARCHAR(200) NOT NULL,
	price MONEY NOT NULL,
	stock INT NOT NULL,
	product_Date DATE NOT NULL,
	product_State NVARCHAR(50) NOT NULL,
	id_Category INT FOREIGN KEY REFERENCES Category(id_Category) NOT NULL,
	id_Supplier INT FOREIGN KEY REFERENCES Supplier(id_Supplier) NOT NULL
);

CREATE TABLE Supplier (
	id_Supplier INT IDENTITY(1,1) PRIMARY KEY NOT NULL,
	company_Name NVARCHAR(50) NOT NULL,
	supplier_Address NVARCHAR(100) NOT NULL,
	city NVARCHAR(50) NOT NULL,
	coutry NVARCHAR(50) NOT NULL,
	phone INT NOT NULL
);

CREATE TABLE Payment_Method (
	id_Payment_Method INT IDENTITY(1,1) PRIMARY KEY NOT NULL,
	payment_Name NVARCHAR(50) NOT NULL,
	card_Number INT NOT NULL,
	country NVARCHAR(100) NOT NULL,
	additional MONEY NOT NULL
);

CREATE TABLE Category (
	id_Category INT IDENTITY(1,1) PRIMARY KEY NOT NULL,
	name_Category NVARCHAR(50) NOT NULL,
	description_Category NVARCHAR(200) NOT NULL
);
GO
CREATE TABLE User_Admin (
	id_User INT IDENTITY(1,1) PRIMARY KEY NOT NULL,
	name_User NVARCHAR(50) NOT NULL,
	user_Password NVARCHAR(50) NOT NULL,
	entri_Date DATE NOT NULL,
	exit_Date DATE NOT NULL
);
GO

CREATE PROCEDURE UserValidate 
	@name NVARCHAR(50),
	@password NVARCHAR(50)
AS 
BEGIN 
	DECLARE @userExist INT
	SELECT @userExist = COUNT(*)
	FROM User_Admin
	WHERE User_Admin.name_User = @name AND User_Admin.user_Password = @password
	IF @userExist > 0
        SELECT 1 AS UsuarioValido
    ELSE
        SELECT 0 AS UsuarioValido
END;

EXEC UserValidate @name = 'Rosie1977', @password = 'aimfgaq'
GO


--TEST--
-- SALES INSERT

insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2023-2-1', 5895, 42425, 1, 4, '12439 Algoma Lane', 'vpgjv');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2023-2-1', 48289, 6419, 2, 10, '6 Old Shore Pass', 'byvup');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2023-2-1', 46546, 23132, 6, 4, '40465 Moulton Street', 'nhubm');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2023-2-1', 41646, 31089, 1, 1, '4367 Helena Lane', 'pcgxz');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2023-2-1', 45468, 39813, 7, 8, '226 Stuart Lane', 'sntkc');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2023-2-1', 49563, 49638, 3, 6, '9 Cottonwood Hill', 'rnaxl');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2023-2-1', 17703, 34041, 7, 8, '53 Nova Drive', 'arydq');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2023-2-1', 9009, 1224, 2, 8, '13618 Melby Junction', 'qjevf');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2023-2-1', 22738, 41535, 3, 6, '3116 Dexter Crossing', 'urdsn');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2023-2-1', 33590, 42730, 2, 3, '802 Pepper Wood Park', 'nakuj');

insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2008-05-08', 7543.05, 3506.56, 2, 7, '26 Rusk Junction', 'En proceso');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2005-09-05', 8347.16, 3184.04, 7, 8, '0 Lindbergh Park', 'Completada');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2001-10-11', 4595.14, 5974.16, 10, 1, '4 Heffernan Street', 'Completada');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2020-11-21', 8403.04, 1701.92, 8, 7, '49 Kedzie Circle', 'Completada');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2007-10-14', 2043.45, 671.3, 7, 5, '64839 Morrow Pass', 'En proceso');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2002-10-06', 2344.88, 4677.73, 5, 1, '6 Merry Place', 'Completada');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2015-09-21', 758.8, 6821.61, 2, 3, '3 Sutteridge Road', 'Cancelada');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2020-07-03', 7141.5, 3305.37, 2, 2, '61895 Clarendon Crossing', 'Abierta');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2004-05-06', 8532.18, 3612.9, 6, 2, '76 Elmside Terrace', 'Completada');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2021-10-16', 9343.6, 1016.08, 5, 10, '0039 Lyons Hill', 'Pendiente');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2020-10-29', 2189.4, 580.69, 4, 7, '2 Dayton Road', 'En proceso');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2004-04-07', 8450.74, 7711.82, 5, 4, '34534 Bowman Alley', 'Pendiente');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2014-09-25', 4088.91, 2637.26, 1, 7, '87313 Northridge Circle', 'Abierta');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2005-03-13', 4948.25, 3359.33, 6, 5, '7 Garrison Parkway', 'En proceso');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2011-04-04', 7395.66, 9892.55, 3, 10, '72661 Kipling Drive', 'Completada');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2006-05-21', 6768.4, 5131.67, 8, 2, '27324 Stoughton Road', 'Cancelada');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2012-02-14', 3903.96, 9612.77, 10, 4, '5 Haas Center', 'Completada');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2018-01-16', 7823.61, 5600.58, 5, 6, '06 Clyde Gallagher Avenue', 'Completada');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2020-09-19', 1906.31, 8882.76, 5, 2, '945 Maple Wood Point', 'En proceso');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2001-10-29', 9803.58, 5983.51, 8, 9, '8939 Hooker Park', 'Cancelada');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2008-03-30', 6137.41, 3121.39, 4, 1, '8808 Larry Center', 'Abierta');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2020-04-09', 6303.84, 2533.65, 3, 9, '8437 Main Hill', 'Abierta');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2006-09-02', 3016.71, 5210.74, 9, 6, '3 Lukken Park', 'Cancelada');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2015-11-28', 7007.96, 1589.83, 3, 8, '3 Kropf Terrace', 'En proceso');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2009-08-17', 471.92, 8618.1, 4, 8, '3646 Kings Hill', 'Pendiente');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2016-08-31', 2015.15, 1291.69, 4, 4, '52 Waywood Way', 'Completada');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2003-07-26', 7830.38, 3002.43, 10, 9, '3 Chive Place', 'Abierta');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2002-09-21', 1949.46, 6802.49, 10, 10, '9559 Thackeray Plaza', 'En proceso');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2004-10-01', 8141.98, 8101.02, 9, 4, '7 American Lane', 'Completada');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2008-06-16', 9276.46, 7235.2, 9, 3, '608 Arrowood Alley', 'Completada');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2019-08-01', 6586.82, 5437.47, 4, 4, '48393 Cascade Place', 'Completada');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2014-08-04', 7529.55, 2490.59, 1, 4, '91195 Scoville Way', 'Completada');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2012-11-07', 9351.9, 3315.51, 4, 2, '994 Loomis Lane', 'Pendiente');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2009-09-24', 2253.4, 735.42, 4, 7, '36 Ryan Lane', 'En proceso');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2017-06-19', 4140.67, 8952.84, 6, 6, '70 Ronald Regan Alley', 'Completada');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2011-09-18', 9514.74, 1196.41, 7, 7, '568 Pleasure Point', 'Abierta');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2015-10-18', 7342.97, 8180.06, 7, 10, '1629 Daystar Street', 'Cancelada');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2021-02-24', 5781.84, 5264.76, 9, 7, '79 Sunnyside Junction', 'Pendiente');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2018-11-27', 4219.82, 8936.04, 10, 2, '66 Clemons Park', 'Abierta');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2002-01-24', 4901.47, 1467.5, 6, 5, '077 Novick Drive', 'En proceso');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2004-02-24', 3228.44, 4523.72, 10, 4, '7210 Harper Trail', 'En proceso');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2006-09-23', 5461.52, 6738.55, 2, 3, '8512 Nova Park', 'Abierta');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2008-11-20', 1179.84, 4352.04, 1, 6, '547 Upham Road', 'Pendiente');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2001-03-23', 8600.07, 7806.75, 3, 7, '70212 Green Lane', 'Pendiente');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2000-01-08', 6745.98, 8301.74, 9, 5, '47837 Carey Drive', 'Cancelada');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2018-12-12', 8532.1, 772.14, 3, 10, '61338 Shoshone Park', 'En proceso');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2015-05-17', 2905.54, 5784.11, 1, 6, '05206 Pepper Wood Place', 'Cancelada');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2013-05-01', 7731.49, 8440.52, 10, 10, '1481 Farmco Center', 'Completada');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2002-01-10', 2972.01, 3816.75, 7, 10, '00967 Merrick Place', 'Pendiente');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2007-08-19', 5953.52, 1375.69, 1, 2, '53 Orin Parkway', 'Completada');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2009-11-02', 3271.56, 5242.11, 1, 5, '63602 Sundown Avenue', 'Completada');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2021-03-14', 3190.51, 6638.21, 4, 5, '2 Huxley Hill', 'Cancelada');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2007-02-11', 4372.15, 3294.16, 9, 8, '33 Gateway Alley', 'Cancelada');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2021-04-02', 1206.11, 5576.76, 1, 4, '4017 Dawn Park', 'Abierta');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2019-04-21', 2395.33, 4252.92, 10, 4, '6 Roxbury Park', 'En proceso');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2018-09-03', 6934.99, 5130.87, 2, 10, '81 Emmet Way', 'Cancelada');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2012-01-30', 4212.98, 3380.37, 7, 1, '655 David Place', 'En proceso');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2020-10-04', 9031.23, 5097.85, 2, 5, '5 Logan Court', 'Cancelada');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2012-09-30', 2174.3, 7854.77, 9, 9, '22159 Moland Hill', 'Cancelada');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2015-05-01', 8865.48, 8525.6, 10, 9, '3 Steensland Drive', 'Completada');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2002-10-03', 3057.24, 6105.04, 2, 10, '396 Harper Way', 'Completada');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2003-06-05', 8242.06, 1056.6, 10, 6, '9 Melby Point', 'Pendiente');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2021-10-27', 6218.74, 6829.69, 4, 10, '67 Duke Plaza', 'Completada');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2001-08-11', 3292.83, 657.89, 9, 4, '5875 Chive Hill', 'Completada');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2001-10-24', 7942.43, 7062.43, 6, 3, '6 Green Center', 'Completada');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2019-04-14', 8360.77, 5805.46, 6, 1, '9026 Goodland Plaza', 'Cancelada');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2021-12-05', 3492.44, 8344.57, 8, 3, '4 Hallows Alley', 'Cancelada');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2002-08-21', 8511.04, 4653.36, 5, 5, '81 Coolidge Street', 'Cancelada');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2020-08-18', 9049.49, 6025.06, 9, 5, '097 Ohio Way', 'Abierta');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2005-10-25', 9579.88, 5920.92, 9, 6, '59438 Kipling Court', 'En proceso');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2004-06-06', 6595.92, 8805.04, 8, 3, '26 Sunbrook Lane', 'Completada');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2017-06-01', 1296.54, 5968.44, 5, 5, '3607 West Parkway', 'Pendiente');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2006-11-21', 3274.47, 3834.65, 4, 3, '06394 Myrtle Crossing', 'Cancelada');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2013-08-24', 6769.6, 9381.69, 9, 10, '092 Lillian Circle', 'Cancelada');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2001-05-31', 5602.14, 3779.6, 9, 8, '13 Erie Street', 'Abierta');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2014-02-18', 7070.52, 953.72, 8, 9, '20 Sommers Alley', 'Cancelada');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2022-06-20', 7447.88, 4120.72, 4, 4, '31134 Hoard Avenue', 'En proceso');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2019-05-12', 428.38, 8123.66, 2, 7, '861 Randy Trail', 'Abierta');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2006-03-17', 6255.15, 9449.51, 7, 4, '427 Stephen Plaza', 'Pendiente');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2009-09-08', 2015.09, 4177.72, 4, 6, '02186 Holmberg Park', 'Abierta');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2009-07-04', 2881.9, 427.62, 4, 2, '6115 Welch Center', 'Abierta');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2017-08-05', 9770.06, 6085.31, 5, 7, '14236 Mccormick Junction', 'Abierta');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2011-07-14', 640.13, 8674.02, 4, 1, '410 Stone Corner Alley', 'Abierta');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2000-11-30', 5422.94, 6807.08, 3, 6, '85 Miller Circle', 'Cancelada');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2018-04-23', 3840.18, 550.1, 4, 9, '8392 Reinke Avenue', 'En proceso');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2004-08-17', 8123.2, 4011.6, 10, 7, '4492 Mccormick Center', 'Abierta');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2022-07-26', 398.17, 9904.4, 4, 1, '2 Scoville Drive', 'En proceso');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2019-05-01', 3554.01, 4373.29, 4, 2, '20254 Luster Point', 'Completada');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2008-11-24', 639.7, 4561.93, 10, 2, '33 Loomis Point', 'Cancelada');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2000-08-02', 5094.81, 8254.23, 9, 1, '873 Banding Way', 'Pendiente');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2014-11-12', 1074.56, 9728.86, 5, 7, '65 Center Junction', 'En proceso');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2002-07-23', 1062.82, 8837.43, 7, 7, '510 Hollow Ridge Court', 'Pendiente');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2015-08-18', 3021.53, 9930.95, 9, 6, '3832 Portage Lane', 'En proceso');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2017-11-14', 7961.99, 7884.68, 5, 4, '02 Bartillon Junction', 'Pendiente');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2019-12-31', 1063.58, 1767.78, 3, 3, '82 Schiller Court', 'Cancelada');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2014-03-18', 1798.93, 2937.77, 6, 7, '21 Sachs Road', 'Completada');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2003-12-11', 2509.62, 7253.24, 6, 2, '01 Dovetail Alley', 'En proceso');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2001-10-17', 8797.24, 3748.79, 7, 8, '1 Northwestern Circle', 'Abierta');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2017-10-14', 2462.01, 9393.9, 10, 3, '187 Little Fleur Parkway', 'Abierta');
insert into Sales (date_Sale, unit_Price, total_Sale, id_product, id_Payment_method, shipping_Address, state_Sale) values ('2017-01-03', 3501.99, 5662.82, 7, 6, '756 Stang Alley', 'En proceso');

-- PRODUCT INSERT

insert into Product (product_Name, product_Description, price, stock, product_Date, product_State, id_Category, id_Supplier) values ('Glove - Cutting', 'uufbe', 38872, 13, '2023-9-1', 'omumu', 6, 2);
insert into Product (product_Name, product_Description, price, stock, product_Date, product_State, id_Category, id_Supplier) values ('Wonton Wrappers', 'dwues', 15491, 12, '2023-9-1', 'vaggy', 5, 5);
insert into Product (product_Name, product_Description, price, stock, product_Date, product_State, id_Category, id_Supplier) values ('Latex Rubber Gloves Size 9', 'duaxo', 39542, 19, '2023-9-1', 'ufkxu', 9, 5);
insert into Product (product_Name, product_Description, price, stock, product_Date, product_State, id_Category, id_Supplier) values ('Brocolinni - Gaylan, Chinese', 'imebt', 22611, 33, '2023-9-1', 'vokkd', 5, 2);
insert into Product (product_Name, product_Description, price, stock, product_Date, product_State, id_Category, id_Supplier) values ('Soup - Knorr, French Onion', 'oaohp', 26337, 9, '2023-9-1', 'wdzbb', 9, 4);
insert into Product (product_Name, product_Description, price, stock, product_Date, product_State, id_Category, id_Supplier) values ('Wine - Rhine Riesling Wolf Blass', 'mgctx', 43686, 19, '2023-9-1', 'piesz', 6, 5);
insert into Product (product_Name, product_Description, price, stock, product_Date, product_State, id_Category, id_Supplier) values ('Steampan - Lid For Half Size', 'fukdt', 63, 40, '2023-9-1', 'ajnzu', 2, 3);
insert into Product (product_Name, product_Description, price, stock, product_Date, product_State, id_Category, id_Supplier) values ('Longos - Chicken Cordon Bleu', 'xszpu', 4624, 45, '2023-9-1', 'spagh', 10, 5);
insert into Product (product_Name, product_Description, price, stock, product_Date, product_State, id_Category, id_Supplier) values ('Wine - Lou Black Shiraz', 'kntcr', 24711, 22, '2023-9-1', 'scjun', 3, 10);
insert into Product (product_Name, product_Description, price, stock, product_Date, product_State, id_Category, id_Supplier) values ('Tomatoes - Vine Ripe, Red', 'udmpg', 10918, 29, '2023-9-1', 'lurpu', 1, 7);

-- CATEGORY INSERT

insert into Category (name_Category, description_Category) values ('Drywall & Acoustical (FED)', 'jjvam');
insert into Category (name_Category, description_Category) values ('RF Shielding', 'bvolw');
insert into Category (name_Category, description_Category) values ('Soft Flooring and Base', 'gyepd');
insert into Category (name_Category, description_Category) values ('RF Shielding', 'bbbsq');
insert into Category (name_Category, description_Category) values ('Waterproofing & Caulking', 'eytka');
insert into Category (name_Category, description_Category) values ('Fire Sprinkler System', 'phmcd');
insert into Category (name_Category, description_Category) values ('Framing (Wood)', 'fhffg');
insert into Category (name_Category, description_Category) values ('Hard Tile & Stone', 'fzxsv');
insert into Category (name_Category, description_Category) values ('Epoxy Flooring', 'isvze');
insert into Category (name_Category, description_Category) values ('Prefabricated Aluminum Metal Canopies', 'hqxvv');

--SUPPLIER INSERT

insert into Supplier (company_Name, supplier_Address, city, coutry, phone) values ('Bubblebox', '834 Dennis Pass', 'Uyen Hung', 'Vietnam', '8797');
insert into Supplier (company_Name, supplier_Address, city, coutry, phone) values ('Cogibox', '83986 Waywood Way', 'Lesozavodsk', 'Russia', '1538');
insert into Supplier (company_Name, supplier_Address, city, coutry, phone) values ('Kimia', '9 Mccormick Hill', 'Bissorã', 'Guinea-Bissau', '5419');
insert into Supplier (company_Name, supplier_Address, city, coutry, phone) values ('Reallinks', '13 Derek Street', 'Sanxixiang', 'China', '9179');
insert into Supplier (company_Name, supplier_Address, city, coutry, phone) values ('Oyoyo', '6 Messerschmidt Way', 'Punta Alta', 'Argentina', '9633');
insert into Supplier (company_Name, supplier_Address, city, coutry, phone) values ('Eire', '14150 Logan Drive', 'Bogovinje', 'Macedonia', '6691');
insert into Supplier (company_Name, supplier_Address, city, coutry, phone) values ('Meetz', '0 Southridge Crossing', 'Yaguaraparo', 'Venezuela', '5094');
insert into Supplier (company_Name, supplier_Address, city, coutry, phone) values ('Miboo', '90712 Muir Circle', 'Węgliniec', 'Poland', '1632');
insert into Supplier (company_Name, supplier_Address, city, coutry, phone) values ('Skilith', '98 Dakota Pass', 'Santa Teresa', 'Nicaragua', '4347');
insert into Supplier (company_Name, supplier_Address, city, coutry, phone) values ('Demizz', '288 Schurz Lane', 'Cam Ranh', 'Vietnam', '2368');

--PAYMENT METHOD INSERT 

insert into Payment_Method (payment_Name, card_Number, country, additional) values ('house.gov', '35768162', 'Indonesia', 187);
insert into Payment_Method (payment_Name, card_Number, country, additional) values ('cafepress.com', '357039', 'Portugal', 288);
insert into Payment_Method (payment_Name, card_Number, country, additional) values ('infoseek.co.jp', '560221', 'Ireland', 275);
insert into Payment_Method (payment_Name, card_Number, country, additional) values ('a8.net', '4905462', 'China', 10);
insert into Payment_Method (payment_Name, card_Number, country, additional) values ('wired.com', '417500', 'Nicaragua', 433);
insert into Payment_Method (payment_Name, card_Number, country, additional) values ('google.co.uk', '490376', 'South Korea', 467);
insert into Payment_Method (payment_Name, card_Number, country, additional) values ('yolasite.com', '35349', 'Indonesia', 243);
insert into Payment_Method (payment_Name, card_Number, country, additional) values ('craigslist.org', '3552', 'Moldova', 260);
insert into Payment_Method (payment_Name, card_Number, country, additional) values ('ihg.com', '354', 'United States', 300);
insert into Payment_Method (payment_Name, card_Number, country, additional) values ('blogs.com', '3540', 'Kuwait', 340);

--CUSTOMER INSERT

insert into Customer (customer_name, lastname, mail, phone, adress, city, country, id_Sale) values ('Meg', 'Blunsen', 'mblunsen0@redcross.org', '319-170-3143', 'mblunsen0@wikimedia.org', 'Ituiutaba', 'Brazil', 9);
insert into Customer (customer_name, lastname, mail, phone, adress, city, country, id_Sale) values ('Merrily', 'Devereu', 'mdevereu1@1und1.de', '261-637-5313', 'mdevereu1@lulu.com', 'Västra Frölunda', 'Sweden', 4);
insert into Customer (customer_name, lastname, mail, phone, adress, city, country, id_Sale) values ('Vikky', 'Matousek', 'vmatousek2@apache.org', '290-990-5323', 'vmatousek2@hatena.ne.jp', 'Panjir', 'Indonesia', 4);
insert into Customer (customer_name, lastname, mail, phone, adress, city, country, id_Sale) values ('Rosella', 'MacLennan', 'rmaclennan3@wufoo.com', '455-621-3038', 'rmaclennan3@seesaa.net', 'Łubniany', 'Poland', 10);
insert into Customer (customer_name, lastname, mail, phone, adress, city, country, id_Sale) values ('Othelia', 'Toderini', 'otoderini4@nhs.uk', '986-635-0068', 'otoderini4@ehow.com', 'Gengcheng', 'China', 9);
insert into Customer (customer_name, lastname, mail, phone, adress, city, country, id_Sale) values ('Gina', 'Laborde', 'glaborde5@oakley.com', '980-217-2404', 'glaborde5@arstechnica.com', 'Banyutengah', 'Indonesia', 10);
insert into Customer (customer_name, lastname, mail, phone, adress, city, country, id_Sale) values ('Pascal', 'Hambling', 'phambling6@networksolutions.com', '604-280-9317', 'phambling6@howstuffworks.com', 'Wutumeiren', 'China', 1);
insert into Customer (customer_name, lastname, mail, phone, adress, city, country, id_Sale) values ('Elissa', 'Gowen', 'egowen7@furl.net', '268-135-5343', 'egowen7@trellian.com', 'Lons-le-Saunier', 'France', 1);
insert into Customer (customer_name, lastname, mail, phone, adress, city, country, id_Sale) values ('Doralyn', 'Rosenwasser', 'drosenwasser8@intel.com', '985-741-2529', 'drosenwasser8@lulu.com', 'Oliveira de Frades', 'Portugal', 6);
insert into Customer (customer_name, lastname, mail, phone, adress, city, country, id_Sale) values ('Glyn', 'Ubank', 'gubank9@guardian.co.uk', '172-380-3128', 'gubank9@nyu.edu', 'Atengmelang', 'Indonesia', 10);

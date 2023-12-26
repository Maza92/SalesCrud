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

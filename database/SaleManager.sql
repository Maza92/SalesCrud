CREATE DATABASE SalesManager;

USE SalesManager

DELETE Sales

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
	country NVARCHAR NOT NULL,
	additional MONEY NOT NULL
);

CREATE TABLE Category (
	id_Category INT IDENTITY(1,1) PRIMARY KEY NOT NULL,
	name_Category NVARCHAR(50) NOT NULL,
	description_Category NVARCHAR(200) NOT NULL
);




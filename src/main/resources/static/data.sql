-- CATEGORIAS
INSERT INTO Category VALUES (1, 'Frutas y verduras', true);
INSERT INTO Category VALUES (2, 'Pastelería', true);
INSERT INTO Category VALUES (3, 'Carnes y pescados', true);
INSERT INTO Category VALUES (4, 'Lácteos y huevos', true);
INSERT INTO Category VALUES (5, 'Bebidas', true);
INSERT INTO Category VALUES (6, 'Licores', true);
INSERT INTO Category VALUES (7, 'Cuidado personal', true);
INSERT INTO Category VALUES (8, 'Despensa', true);

-- PRODUCTOS
INSERT INTO Product(product_id, name, category_id, barcode, sale_price, state, stock) VALUES (1, 'Guayaba Feijoa', 1, '7029 A42 23', 300, true, 500);
INSERT INTO Product(product_id, name, category_id, barcode, sale_price, state, stock) VALUES (2, 'Mango', 1, '0316 R56 01', 2100, true, 250);
INSERT INTO Product(product_id, name, category_id, barcode, sale_price, state, stock) VALUES (3, 'Manzana', 1, '7923 T23 19', 700, true, 130);
INSERT INTO Product(product_id, name, category_id, barcode, sale_price, state, stock) VALUES (4, 'Aguacate', 1, '9322 Q33 02', 2500,true,  98);
INSERT INTO Product(product_id, name, category_id, barcode, sale_price, state, stock) VALUES (5, 'Lechuga', 1, '9742 S22 21', 4000,true,  86);
INSERT INTO Product(product_id, name, category_id, barcode, sale_price, state, stock) VALUES (6, 'Tomate', 1, '0483 R00 97', 290, true, 430);
INSERT INTO Product(product_id, name, category_id, barcode, sale_price, state, stock) VALUES (7, 'Pera', 1, '9999 X10 01', 750, true, 210);
INSERT INTO Product(product_id, name, category_id, barcode, sale_price, state, stock) VALUES (8, 'Apio', 1, '3390 F29 45', 150, true, 115);
INSERT INTO Product(product_id, name, category_id, barcode, sale_price, state, stock) VALUES (9, 'Papaya', 1, '5291 J34 32', 4500,true,  73);
INSERT INTO Product(product_id, name, category_id, barcode, sale_price, state, stock) VALUES (10, 'Limón', 1, '7886 N18 32', 350, true, 425);
INSERT INTO Product(product_id, name, category_id, barcode, sale_price, state, stock) VALUES (11, 'Brownie', 2, '6683 H15 20', 2500,true,  80);
INSERT INTO Product(product_id, name, category_id, barcode, sale_price, state, stock) VALUES (12, 'Pan tajado', 2, '5745 F05 47', 4500, true, 120);
INSERT INTO Product(product_id, name, category_id, barcode, sale_price, state, stock) VALUES (13, 'Torta', 2, '3831 D97 99', 10000,true,  35);
INSERT INTO Product(product_id, name, category_id, barcode, sale_price, state, stock) VALUES (14, 'Tortilla', 2, '4335 Z33 84', 6400,true,  87);
INSERT INTO Product(product_id, name, category_id, barcode, sale_price, state, stock) VALUES (15, 'Tostadas', 2, '6584 M19 25', 4000,true,  45);
INSERT INTO Product(product_id, name, category_id, barcode, sale_price, state, stock) VALUES (16, 'Chocorramo', 2, '4487 S00 97', 2000, true, 105);
INSERT INTO Product(product_id, name, category_id, barcode, sale_price, state, stock) VALUES (17, 'Salmón', 3, '4546 A00 01', 28000,true,  55);
INSERT INTO Product(product_id, name, category_id, barcode, sale_price, state, stock) VALUES (18, 'Punta de anca', 3, '3678 E57 22', 12000,true,  32);
INSERT INTO Product(product_id, name, category_id, barcode, sale_price, state, stock) VALUES (19, 'Posta', 3, '8893 O01 03', 7800,true,  40);
INSERT INTO Product(product_id, name, category_id, barcode, sale_price, state, stock) VALUES (20, 'Costilla de cerdo', 3, '4534 Q12 88', 8600,true,  70);
INSERT INTO Product(product_id, name, category_id, barcode, sale_price, state, stock) VALUES (21, 'Tilapia', 3, '5684 R53 02', 17000,true,  60);
INSERT INTO Product(product_id, name, category_id, barcode, sale_price, state, stock) VALUES (22, 'Merluza', 3, '3523 R04 00', 23000,true,  45);
INSERT INTO Product(product_id, name, category_id, barcode, sale_price, state, stock) VALUES (23, 'Leche de vaca', 4, '2323 T56 33', 2500, true, 500);
INSERT INTO Product(product_id, name, category_id, barcode, sale_price, state, stock) VALUES (24, 'Queso', 4, '7786 K19 56', 4000, true, 300);
INSERT INTO Product(product_id, name, category_id, barcode, sale_price, state, stock) VALUES (25, 'Huevos de gallina feliz', 4, '3478 M74 01', 400, true, 1000);
INSERT INTO Product(product_id, name, category_id, barcode, sale_price, state, stock) VALUES (26, 'Clara de huevo', 4, '7932 R31 46', 3200, true, 200);
INSERT INTO Product(product_id, name, category_id, barcode, sale_price, state, stock) VALUES (27, 'Suero costeño', 4, '5463 W23 33', 9000, true, 110);
INSERT INTO Product(product_id, name, category_id, barcode, sale_price, state, stock) VALUES (28, 'Agua', 5, '8965 I32 11', 2000, true, 600);
INSERT INTO Product(product_id, name, category_id, barcode, sale_price, state, stock) VALUES (29, 'Jugo de naranja', 5, '7445 T87 44', 7400, true, 200);
INSERT INTO Product(product_id, name, category_id, barcode, sale_price, state, stock) VALUES (30, 'Gaseosa Colombiana', 5, '3434 R34 63', 3100, true, 175);
INSERT INTO Product(product_id, name, category_id, barcode, sale_price, state, stock) VALUES (31, 'Jugo de Lulo', 5, '9753 W33 19', 8250, true, 630);
INSERT INTO Product(product_id, name, category_id, barcode, sale_price, state, stock) VALUES (32, 'Tea', 5, '9836 F35 69', 1900, true, 45);
INSERT INTO Product(product_id, name, category_id, barcode, sale_price, state, stock) VALUES (33, 'Cerveza', 6, '3432 G67 21', 2100, true, 800);
INSERT INTO Product(product_id, name, category_id, barcode, sale_price, state, stock) VALUES (34, 'Tequila', 6, '9529 E45 98', 65000, true, 764);
INSERT INTO Product(product_id, name, category_id, barcode, sale_price, state, stock) VALUES (35, 'Ron', 6, '1947 R07 53', 55000, true, 240);
INSERT INTO Product(product_id, name, category_id, barcode, sale_price, state, stock) VALUES (36, 'Aguardiente Antioqueño', 6, '3160 A54 94', 40000, true, 480);
INSERT INTO Product(product_id, name, category_id, barcode, sale_price, state, stock) VALUES (37, 'Vino', 6, '7891 W46 95', 82000, true, 560);
INSERT INTO Product(product_id, name, category_id, barcode, sale_price, state, stock) VALUES (38, 'Crema dental', 7, '6310 C99 73', 7500, true, 200);
INSERT INTO Product(product_id, name, category_id, barcode, sale_price, state, stock) VALUES (39, 'Jabón de manos', 7, '9371 J14 75', 4900,true,  90);
INSERT INTO Product(product_id, name, category_id, barcode, sale_price, state, stock) VALUES (40, 'Enjuague bucal', 7, '1942 T68 01', 12000, true, 105);
INSERT INTO Product(product_id, name, category_id, barcode, sale_price, state, stock) VALUES (41, 'Shampoo', 7, '6789 W01 23', 9300, true, 200);
INSERT INTO Product(product_id, name, category_id, barcode, sale_price, state, stock) VALUES (42, 'Desodorante', 7, '7333 S21 36', 6900,true,  85);
INSERT INTO Product(product_id, name, category_id, barcode, sale_price, state, stock) VALUES (43, 'Arroz', 8, '4676 I83 00', 3500, true, 600);
INSERT INTO Product(product_id, name, category_id, barcode, sale_price, state, stock) VALUES (44, 'Lentejas', 8, '7333 S21 36', 3000, true, 560);
INSERT INTO Product(product_id, name, category_id, barcode, sale_price, state, stock) VALUES (45, 'Harina', 8, '7333 S21 36', 1800, true, 300);
INSERT INTO Product(product_id, name, category_id, barcode, sale_price, state, stock) VALUES (46, 'Sal', 8, '7333 S21 36', 1400, true, 500);
INSERT INTO Product(product_id, name, category_id, barcode, sale_price, state, stock) VALUES (47, 'Aceite', 8, '7333 S21 36', 6500, true, 135);
INSERT INTO Product(product_id, name, category_id, barcode, sale_price, state, stock) VALUES (48, 'Cereal', 8, '4673 K53 98', 7000,true, 75);
INSERT INTO Product(product_id, name, category_id, barcode, sale_price, state, stock) VALUES (49, 'Frijol', 8, '2745 F40 45', 8200, true, 270);
INSERT INTO Product(product_id, name, category_id, barcode, sale_price, state, stock) VALUES (50, 'Café', 8, '6351 R33 92', 7200, true, 400);

-- CLIENTES
INSERT INTO Client(id, name, surname, phone, address, email) VALUES ('4546221', 'Johannes', 'Kepler', 3104583224, 'Cl 3 # 33 - 33', 'kepler@me.com');
INSERT INTO Client(id, name, surname, phone, address, email) VALUES ('2552243', 'Galileo', 'Galilei', 3462257293, 'Cl 1 # 11 - 11', 'gali@leo.com');
INSERT INTO Client(id, name, surname, phone, address, email) VALUES ('983824', 'Nicolás', 'Copernico', 3019392466, 'Cl 2 # 22 - 22', 'nico@cope.com');

-- COMPRA
INSERT INTO Buy VALUES (1, '4546221', '', TO_TIMESTAMP('10/08/1992 17:30:00','DD/MM/YYYY HH24:MI:SS'), 'E', 'P');
INSERT INTO Buy_Product VALUES (1, 1, 10, true, 3000);
INSERT INTO Buy_Product VALUES (1, 36, 1,  true,40000);
INSERT INTO Buy_Product VALUES (1, 27, 1, true, 9000);
INSERT INTO Buy_Product VALUES (1, 49, 2,  true,16400);
INSERT INTO Buy_Product VALUES (1, 24, 1, true, 4000);

-- SE REINICIAN LAS SECUENCIAS SEGÚN LOS DATOS INICIALES
SELECT setval('public.product_product_id_seq', 50, true);
SELECT setval('public.category_category_id_seq', 8, true);
SELECT setval('public.buy_buy_id_seq', 1, true);
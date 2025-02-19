INSERT INTO Categories (category_Id, category_Name) VALUES (1, 'Fast Food');
INSERT INTO Categories (category_Id, category_Name) VALUES (2, 'Desserts');
INSERT INTO Categories (category_Id, category_Name) VALUES (3, 'Beverages');
INSERT INTO Categories (category_Id, category_Name) VALUES (4, 'Healthy Food');
INSERT INTO Categories (category_Id, category_Name) VALUES (5, 'Asian Cuisine');


-- Fast Food
INSERT INTO Products (product_Name, quantity, unit_Price, images, description, discount, sold_Quantity, create_Date, category_Id) VALUES ('Chicken Nuggets', 70, 4.49, 'nuggets.jpg', 'Crunchy chicken nuggets with a side of sauce', 10.0, 250, '2024-02-11 14:20:00', 1);

INSERT INTO Products (product_Name, quantity, unit_Price, images, description, discount, sold_Quantity, create_Date, category_Id) VALUES ('Double Cheeseburger', 40, 6.99, 'double_cheeseburger.jpg', 'A double beef patty with extra cheese', 12.0, 180, '2024-02-13 16:10:00', 1);

-- Desserts
INSERT INTO Products (product_Name, quantity, unit_Price, images, description, discount, sold_Quantity, create_Date, category_Id) VALUES ('Vanilla Ice Cream', 25, 3.49, 'vanilla_icecream.jpg', 'Creamy vanilla-flavored ice cream', 5.0, 220, '2024-02-09 13:00:00', 2);

INSERT INTO Products (product_Name, quantity, unit_Price, images, description, discount, sold_Quantity, create_Date, category_Id) VALUES ('Blueberry Muffin', 35, 2.99, 'blueberry_muffin.jpg', 'Soft muffin with fresh blueberries', 8.0, 160, '2024-02-10 09:30:00', 2);

-- Beverages
INSERT INTO Products (product_Name, quantity, unit_Price, images, description, discount, sold_Quantity, create_Date, category_Id) VALUES ('Iced Coffee', 60, 2.99, 'iced_coffee.jpg', 'Chilled coffee with ice cubes', 5.0, 300, '2024-02-14 08:20:00', 3);

INSERT INTO Products (product_Name, quantity, unit_Price, images, description, discount, sold_Quantity, create_Date, category_Id) VALUES ('Lemonade', 50, 2.49, 'lemonade.jpg', 'Freshly squeezed lemonade with ice', 7.0, 140, '2024-02-12 17:45:00', 3);

-- Healthy Food
INSERT INTO Products (product_Name, quantity, unit_Price, images, description, discount, sold_Quantity, create_Date, category_Id) VALUES ('Caesar Salad', 30, 5.99, 'caesar_salad.jpg', 'Classic Caesar salad with grilled chicken', 10.0, 200, '2024-02-13 12:00:00', 4);

INSERT INTO Products (product_Name, quantity, unit_Price, images, description, discount, sold_Quantity, create_Date, category_Id) VALUES ('Avocado Toast', 25, 4.49, 'avocado_toast.jpg', 'Toasted bread with avocado and poached egg', 5.0, 180, '2024-02-15 10:30:00', 4);

-- Asian Cuisine
INSERT INTO Products (product_Name, quantity, unit_Price, images, description, discount, sold_Quantity, create_Date, category_Id) VALUES ('Sushi Roll', 40, 7.99, 'sushi_roll.jpg', 'Fresh sushi roll with salmon and avocado', 15.0, 190, '2024-02-16 18:10:00', 5);

INSERT INTO Products (product_Name, quantity, unit_Price, images, description, discount, sold_Quantity, create_Date, category_Id) VALUES ('Ramen', 35, 8.99, 'ramen.jpg', 'Japanese ramen with pork and egg', 12.0, 170, '2024-02-17 20:00:00', 5);

-- Thêm sản phẩm mới vào danh mục Fast Food (ngày tạo là hôm nay)
INSERT INTO Products (product_Name, quantity, unit_Price, images, description, discount, sold_Quantity, create_Date, category_Id) VALUES ('Spicy Chicken Sandwich', 50, 6.49, 'spicy_chicken_sandwich.jpg', 'Crispy spicy chicken in a toasted bun', 8.0, 120, NOW(), 1);

-- Thêm sản phẩm mới vào danh mục Desserts
INSERT INTO Products (product_Name, quantity, unit_Price, images, description, discount, sold_Quantity, create_Date, category_Id) VALUES ('Chocolate Lava Cake', 20, 4.99, 'chocolate_lava.jpg', 'Warm chocolate cake with a molten center', 6.0, 90, NOW(), 2);

-- Thêm sản phẩm mới vào danh mục Beverages
INSERT INTO Products (product_Name, quantity, unit_Price, images, description, discount, sold_Quantity, create_Date, category_Id) VALUES ('Matcha Latte', 40, 3.99, 'matcha_latte.jpg', 'Green tea latte with frothy milk', 5.0, 150, NOW(), 3);

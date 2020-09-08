INSERT INTO users(user_id, name, last_name, username, password, email)
VALUES(1, 'Juozas', 'Juozaitis', 'admin', '{bcrypt}$2y$12$JEvdTigIJXo8Ryhs4V/ESeVY7vK68zoZtzknnrIE6WbM8M7Ccm1AO', 'admin@sm.com');

INSERT INTO roles(role_id, role) VALUES(1, 'ADMIN');
INSERT INTO roles(role_id, role) VALUES(2, 'EMPLOYEE');
INSERT INTO roles(role_id, role) VALUES(3, 'CLIENT');

INSERT INTO users_roles(user_id, role_id) VALUES(1, 1);

INSERT INTO categories(category_id, category_name) VALUES(1, 'ELECTRONICS');
INSERT INTO categories(category_id, category_name) VALUES(2, 'FOOD');
INSERT INTO categories(category_id, category_name) VALUES(3, 'HOME');
INSERT INTO categories(category_id, category_name) VALUES(4, 'BOOKS');

INSERT INTO products(product_id, product_name, product_category_category_id, stock, cost_price, trade_price) VALUES (1, 'Laptop LENOVO', 1, 24, 1299.00, 1699.00)
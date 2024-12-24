-- Insert data into the category table
INSERT INTO category (id, description, name) VALUES
                                                 (1, 'Electronics devices and accessories', 'Electronics'),
                                                 (2, 'Clothing and apparel', 'Clothing'),
                                                 (3, 'Kitchen and dining tools', 'Kitchenware'),
                                                 (4, 'Fitness and exercise equipment', 'Fitness'),
                                                 (5, 'Books and literature', 'Books');

-- Insert data into the product table
INSERT INTO product (id, description, name, available_quantity, price, category_id)
VALUES
    (nextval('product_seq'), 'Smartphone with 6.5-inch display', 'Smartphone', 100, 599.99, 1),
    (nextval('product_seq'), 'Noise-cancelling wireless headphones', 'Headphones', 50, 199.99, 1),
    (nextval('product_seq'), 'Men''s cotton t-shirt', 'T-Shirt', 200, 19.99, 2),
    (nextval('product_seq'), 'Stainless steel kitchen knife set', 'Knife Set', 75, 49.99, 3),
    (nextval('product_seq'), 'Yoga mat for fitness exercises', 'Yoga Mat', 150, 29.99, 4),
    (nextval('product_seq'), 'Fiction novel by a bestselling author', 'Novel', 120, 12.99, 5);

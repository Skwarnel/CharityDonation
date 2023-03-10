DROP DATABASE `charity-donation`;
USE `charity-donation`;

CREATE DATABASE `charity-donation` CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci;

INSERT INTO institutions (description, name)
VALUES ('OddNumberInstitution', 'Fundacja "PageRenderCheck"');

INSERT INTO institutions (description, name)
VALUES ('Cel i misja: Pomoc dzieciom z ubogich rodzin.', 'Fundacja "Dbam o Zdrowie"'),
       ('Cel i misja: Pomoc wybudzaniu dzieci ze śpiączki.', 'Fundacja "A kogo"'),
       ('Cel i misja: Pomoc osobom znajdującym się w trudnej sytuacji życiowej.', 'Fundacja “Dla dzieci"'),
       ('Cel i misja: Pomoc dla osób nie posiadających miejsca zamieszkania', 'Fundacja “Bez domu”');


INSERT INTO donations (city, pick_up_comment, pick_up_date, pick_up_time, quantity, street, tel_no, zip_code, institution_id)
VALUES ('Cracow', 'noComment', '2023-03-01', '12:34:04.021', 1, 'streetAddress', '+48555555555', '45-450', 2),
       ('Cracow', 'noComment', '2023-03-01', '12:34:04.021', 2, 'streetAddress', '+48555555555', '45-450', 2),
       ('Cracow', 'noComment', '2023-03-01', '12:34:04.021', 3, 'streetAddress', '+48555555555', '45-450', 2),
       ('Cracow', 'noComment', '2023-03-01', '12:34:04.021', 4, 'streetAddress', '+48555555555', '45-450', 1),
       ('Cracow', 'noComment', '2023-03-01', '12:34:04.021', 5, 'streetAddress', '+48555555555', '45-450', 1),
       ('Cracow', 'noComment', '2023-03-01', '12:34:04.021', 6, 'streetAddress', '+48555555555', '45-450', 3);

INSERT INTO categories (name) VALUES
                                  ('ubrania, które nadają się do ponownego użycia'),
                                  ('ubrania, do wyrzucenia'),
                                  ('zabawki'),
                                  ('książki'),
                                  ('inne');

USE `charity-donation`;

SELECT * FROM donations;

SELECT * FROM donations_categories;

SELECT * FROM institutions;


SELECT * FROM categories;


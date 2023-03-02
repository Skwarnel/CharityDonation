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


SELECT * FROM institutions;
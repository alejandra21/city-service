INSERT INTO city (id, name) VALUES (NEXTVAL('hibernate_sequence'), 'A');
INSERT INTO city (id, name) VALUES (NEXTVAL('hibernate_sequence'), 'B');
INSERT INTO city (id, name) VALUES (NEXTVAL('hibernate_sequence'), 'C');
INSERT INTO city (id, name) VALUES (NEXTVAL('hibernate_sequence'), 'D');
INSERT INTO city (id, name) VALUES (NEXTVAL('hibernate_sequence'), 'E');
INSERT INTO city (id, name) VALUES (NEXTVAL('hibernate_sequence'), 'F');


INSERT INTO cities_connection (city_origin_id, city_destination_id, departure, arrival ) VALUES ((select id from city where name like 'A'),(select id from city where name like 'B'), '2016-06-22 19:10', '2016-06-22 20:10');
INSERT INTO cities_connection (city_origin_id, city_destination_id, departure, arrival ) VALUES ((select id from city where name like 'A'), (select id from city where name like 'C'), '2016-06-22 19:10', '2016-06-22 21:10');
INSERT INTO cities_connection (city_origin_id, city_destination_id, departure, arrival ) VALUES ((select id from city where name like 'B'), (select id from city where name like 'C'), '2016-06-22 19:10', '2016-06-22 22:10');
INSERT INTO cities_connection (city_origin_id, city_destination_id, departure, arrival ) VALUES ((select id from city where name like 'C'), (select id from city where name like 'D'), '2016-06-22 19:10', '2016-06-22 23:10');
 -- Insert 3 dummy records for address table
 INSERT INTO address (id, street, city, state, zip_code) VALUES (1, '123 Main Street', 'London', 'England', 'SW1A 1AA');
 INSERT INTO address (id, street, city, state, zip_code) VALUES (2, '456 High Street', 'Edinburgh', 'Scotland', 'EH1 1YS');
 INSERT INTO address (id, street, city, state, zip_code) VALUES (3, '789 Bridge Street', 'Belfast', 'Northern Ireland', 'BT1 1FY');

 -- Insert 5 dummy records for employee table
 INSERT INTO employee (id, name, email, address_id) VALUES (1, 'Alice Smith', 'alice@gmail.com', 1);
 INSERT INTO employee (id, name, email, address_id) VALUES (2, 'Bob Jones', 'bob@yahoo.com', 2);
 INSERT INTO employee (id, name, email, address_id) VALUES (3, 'Charlie Brown', 'charlie@hotmail.com', 3);

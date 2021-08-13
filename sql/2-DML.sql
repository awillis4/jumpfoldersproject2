-- Data Manipulation Language (DML):
-- used to manipulate data in a database

use practice;

##################
# INSERT COMMAND #
##################

-- insert is used to add new rows of data to a table

describe person;

-- insert using this short form without specifying the column names
insert into person values(null, 'hello', '123456789', current_date(), 'female');
select * from person;

-- suggested to do it this way because it is better practice and you are more likely
-- not to get an error by missing a column entry
insert into person(person_id, person_name, ssn, date_of_birth, gender)
	values(null, 'hello', '123456788', current_date(), 'male');
select * from person;

-- this will return an error
insert into person values('hello', '123456787');
select * from person;

-- this will work because we specify what we are inserting into which columns...
insert into person(person_name, ssn)
	values('hello', '123456786');
select * from person;

-- ...even if we switch up the order of the columns
insert into person(ssn, person_name)
	values('123456785', 'hello');
select * from person;


##################
# UPDATE COMMAND #
##################

-- update is used to modify existing records in a table

-- by specifying the condition, we can update one record
update person set person_name = 'world' where person_id = 2;
select * from person;

-- we can also do so to multiple records with the same condition
update person set person_name = 'hi' where person_name = 'hello';
select * from person;

-- update all records
update person set person_name = 'same name';
select * from person;


##################
# DELETE COMMAND #
##################

-- delete is used to remove existing records from a table

-- specify which records will be deleted based on the where clause
delete from person where person_id = 2;
select * from person;

-- if no where clause, will delete all records from a table
-- this is slower than the truncate command but unlike truncate, but not
-- necessarily permanent
delete from person;
select * from person;





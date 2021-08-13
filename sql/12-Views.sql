-- View:
-- a vitual table
-- resultant of a base table
-- definition bulit on top of other tables or views

use sakila;

#################
#  CREATE VIEW  #
#################

-- simple view
create view view_example
as select * from actor;

select * from view_example;


-- more complex view
-- find all the action films
select * from category;
select * from film;

select * from film_category;

select * from film_category where category_id = 
	(select category_id from category where name = 'Action');
    
select title, description, rating from film where film_id in
	(select film_id from film_category where category_id = 
		(select category_id from category where name = 'Action'));
        
        
create view action_films
as select title, description, rating from film where film_id in
	(select film_id from film_category where category_id = 
		(select category_id from category where name = 'Action'));

select * from action_films;

-- can be more descriptive in select from view
select * from action_films where rating = 'PG-13';
select title from action_films where rating = 'PG';

-- why have views?
-- we can store away complicated queries and call them easily with views
-- as well, its a useful security feature, imagine you are storing sensitive info
-- in a table, you want to be able to let users access certain tables, but not necessarily
-- all the information in the table
-- example: imagine you had an employee table and the security a view can provide



################
#  ALTER VIEW  #
################

alter view view_example
as select * from film;

select * from view_example;



###############
#  DROP VIEW  #
###############

drop view view_example;




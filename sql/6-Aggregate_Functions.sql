-- Aggregate Functions:
-- return a value after performing a calculation on a set of values

use sakila;


#########
# COUNT #
#########

-- will count the number of rows that match the given criteria

-- counts the number of cities that start with an f
select count(city_id) as 'cities that start with an f' 
from city 
where city like 'f%';


###########
#   MAX   #
###########
-- selects the max value in a column

-- find the most expensive rental rate you can get
select max(rental_rate) from film;

-- this will return an error, has to be a column passed as a parameter
# select max(3,4,9) from dual;


###########
#   MIN   #
###########
-- selects the min value in a column

-- find the least expensive rental rate you can get
select min(rental_rate) from film;


###########
#   AVG   #
###########

-- returns the average value for a column, must be numeric

-- find the average rental rate 
select avg(rental_rate) from film;


###########
#   SUM   #
###########

-- returns the sum of a column, must be numeric

-- find the sum of all the rental rates
select sum(rental_rate) from film;



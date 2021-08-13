-- Stored Procedure:
-- subroutine/subprogram stored in a database
-- like functions, they take in parameters and can run numerous sql statments
-- however, unlike functions, do not return a value directly


# tells you what current database you are using
select database();
use sakila;

##################################
# STORED PROCEDURES & DELIMITERS #
##################################

/* 
   delimiter: character or string of characters used to end an SQL statement,
			  the ; is used as a common delimiter in SQL 
              
   problem:   in stored procedures, we need a delimiter to end the procedure, but ; is already
			  used multiple times, so we must use a different delimiter 
*/


# delimiter & stored procedure
delimiter $$
create procedure spExample()
begin
	select * from actor;
    select * from film;
end $$
delimiter ;

# call stored procedure
call spExample();

# must be using the right database in order to call their procedures



#############
# VARIABLES #
#############

use practice;

create table employee 
(
	empl_id int primary key auto_increment,
    empl_name varchar(30),
    hourly_rate double,
    email varchar(50)
);

insert into employee values(null, 'sam', 10, 'sam@mail.com');

select * from employee;

/*
	VARIABLE TYPES:
    
    in    = pass a value to procedure, value can be modified within but modification
			not visible to caller
    out   = passes a value from the procedure back to the caller, starts as a null value
			and value is visible to caller after procedure runs
    inout = can pass a value from the caller, be modified within the procedure and then 
			visible to the caller after procedure runs
*/


delimiter $$
create procedure spAddEmployee(in nameInput varchar(30), 
	in hourlyRateInput double, out salaryOutput double, 
    inout emailInOut varchar(50))
begin
	# create variables inside procedures
    # declare is used to create local variables
    declare email varchar(50);
    
    # calculate salary
    select hourlyRateInput*40*4*12 into salaryOutput;
    
    # format email
    select concat(nameInput,'@',emailInOut) into email;
    select email into emailInOut;
    
    insert into employee 
		values(null, nameInput, hourlyRateInput, emailInOut);
end $$
delimiter ;

# create procedure to add employee
set @nameInput = 'alex';
set @hourlyRateInput = 30;
set @salaryOut = 0;
set @emailInOut = 'gmail.com';

# declare variables to pass to procedure
call spAddEmployee(@nameInput, @hourlyRateInput, @salaryOut, @emailInOut);

select * from employee;

# use variables in procedure
select @nameInput, @hourlyRateInput, @salaryOut, @emailInOut;



################################
# PROCEDURES WITH IF STATEMENT #
################################

delimiter $$
create procedure passwordStrength(in pw varchar(100))
begin
	if (length(pw) < 8) then
		select 'password too weak';
	else
		select 'password is too strong';
	end if;
end $$
delimiter ;

call passwordStrength('vamos');

###############################
# PROCEDURES WITH SWITCH CASE #
###############################

#-- NOTE: MAKE SURE TO DROP PREVIOUS PET TABLE --#

# set up test data
create table animal 
(
	animal_id int not null primary key,
    animal_type varchar(30) not null unique
);

insert into animal values(1, 'dog');
insert into animal values(2, 'cat');
insert into animal values(3, 'rabbit');
insert into animal values(4, 'snake');
insert into animal values(5, 'fish');
insert into animal values(6, 'bird');
insert into animal values(7, 'unknown');

select * from animal;

create table pet 
(
	pet_id int not null primary key auto_increment,
    pet_name varchar(30) not null,
    animal_id int not null,
    foreign key (animal_id) references animal(animal_id)
);

insert into pet values(null, 'tiger', 2);

select * from pet;

# switch case procedure
delimiter $$
create procedure spAddPet(in petName varchar(30), in petType varchar(30))
begin
	declare animalID int;
    
    case
		when (petType = 'dog') then
			select 1 into animalID;
		when (petType = 'cat') then
			select 2 into animalID;
		when (petType = 'rabbit') then
			select 3 into animalID;
		when (petType = 'snake') then
			select 4 into animalID;
		when (petType = 'fish') then
			select 5 into animalID;
		when (petType = 'bird') then
			select 6 into animalID;
		else
			select 7 into animalID;
    end case;
    
    insert into pet values(null, petName, animalID);
end $$
delimiter ;

# use switch case procedure
call spAddPet('worm', 'snake');

select * from pet;


##########################
# PROCEDURES USING WHILE #
##########################

# create procedure
delimiter $$
create procedure spAddIteration(inout num int)
begin
	set @sum = 0;
    
    while(num > 0)
    do
		set @sum = @sum + num;
        set num = num - 1;
    end while;
    
    select @sum into num;
end $$
delimiter ;

# call procedure
set @num = 10;

call spAddIteration(@num);

select @num;



###################
# ALTER PROCEDURE #
###################

--  you can only alter the characteristics of a procedure, you cannot change the
-- parameters or body of the procedure

-- create procedure
delimiter $$
create procedure temp()
comment 'hello'
begin
	select * from person;
end $$
delimiter ;

call temp();

-- made a mistake, alter it
alter procedure temp
	comment 'bye';

##################
# DROP PROCEDURE #
##################

-- drop will delete a procedure

-- since you can't use the alter command to edit the procedure's body or parameters,
-- you will need to drop it then recreate it if you want to make any edits

drop procedure temp;

delimiter $$
create procedure temp()
comment 'hello'
begin
	select * from customer;
end $$
delimiter ;

call temp();



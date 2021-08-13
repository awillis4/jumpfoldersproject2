-- Cursors:
-- control structure that allows you to traverse over records in a database

-- Important Cursor Properties:
-- 1. Asensitive: server may or may not make a copy of its result table
-- 2. Read only: Not updatable
-- 3. Nonscrollable: can traverse only in one direction, can't skip rows

use practice;

create table car
(
	car_id int primary key auto_increment,
    car_color varchar(15),
    car_price double not null
);

insert into car(car_id, car_color, car_price) values(null, 'red', 40000);
insert into car(car_id, car_color, car_price) values(null, 'blue', 30000);
insert into car(car_id, car_color, car_price) values(null, 'grey', 40000);
insert into car(car_id, car_color, car_price) values(null, 'white', 35000);
insert into car(car_id, car_color, car_price) values(null, 'red', 20000);
insert into car(car_id, car_color, car_price) values(null, 'red', 27000);
insert into car(car_id, car_color, car_price) values(null, 'blue', 100000);
insert into car(car_id, car_color, car_price) values(null, 'blue', 55000);
insert into car(car_id, car_color, car_price) values(null, 'red', 40000);
insert into car(car_id, car_color, car_price) values(null, 'black', 150000);
insert into car(car_id, car_color, car_price) values(null, 'grey', 20000);

select * from car;


delimiter $$
create procedure lotValue(out total double)
begin
	-- declare variables with defaults
	declare finished integer default 0;
    declare carValue double default 0;
    
    -- declare cursor
    declare allCars
	cursor for
	select car_price from car;
    
    -- declare not found handler
    declare continue handler for 
		not found set finished = 1;
    
    set @sum = 0;
    
    open allCars;
    
    getPrice: loop
		-- get records for row
		fetch allCars into carValue;
        
        -- break out of loop once finish going through records
        if (finished = 	1) then
			leave getPrice;
		end if;
        
        -- add value to sum
		set @sum = @sum + carValue;       
    
    end loop getPrice;    
    close allCars;
    
    select @sum into total;
    
end $$
delimiter ;

call lotValue(@total);

select @total as 'Car Lot Value';




-- create table student 
-- (
-- 	student_id int primary key auto_increment,
--     first_name varchar(30) not null,
--     last_name varchar(30) not null,
--     email varchar(100) default 'n/a' not null
-- );

-- insert into student(student_id, first_name, last_name) 
-- 	values(null, 'Mattie', 'Flowers');
-- insert into student(student_id, first_name, last_name) 
-- 	values(null, 'Kim', 'Moran');
-- insert into student(student_id, first_name, last_name) 
-- 	values(null, 'Archie', 'Gregory');
-- insert into student(student_id, first_name, last_name, email) 
-- 	values(null, 'Joy', 'Cook', 'cook220@gmail.com');


-- insert into student(student_id, first_name, last_name) 
-- 	values(null, 'Gwen', 'Lambert');
-- insert into student(student_id, first_name, last_name) 
-- 	values(null, 'Phillip', 'Mack');
-- insert into student(student_id, first_name, last_name, email) 
-- 	values(null, 'Suzanne', 'Wong', 'swong@yahoo.com');
-- insert into student(student_id, first_name, last_name) 
-- 	values(null, 'Armando', 'Moss');
-- insert into student(student_id, first_name, last_name) 
-- 	values(null, 'Nicole', 'Lawson');
-- insert into student(student_id, first_name, last_name) 
-- 	values(null, 'Bobby', 'Harmon');
-- insert into student(student_id, first_name, last_name) 
-- 	values(null, 'Guadalupe', 'Kim');
-- insert into student(student_id, first_name, last_name) 
-- 	values(null, 'Corey', 'Reynolds');

-- select * from student;


-- delimiter $$
-- create procedure makeStudentEmails()
-- begin
-- 	-- declare variables
-- 	declare finished integer default 0;
--     declare id int;
--     declare firstName varchar(30);
--     declare lastName varchar(30);
--     
--     -- declare cursor for student emil
--     declare curEmail
-- 	cursor for
-- 	select student_id, first_name, last_name from student where email = 'n/a';
--     
--     -- declare not found handler
--     declare continue handler for 
-- 		not found set finished = 1;
--     
--     open curEmail;
--     
--     setEmail: loop
-- 		-- get records for row
-- 		fetch curEmail into id, firstName, lastName;
--         
--         -- break out of loop once finish going through records
--         if (finished = 	1) then
-- 			leave setEmail;
-- 		end if;
--         
--         -- set email for students
-- 		update student set email = concat(first_name,last_name,'@school.org');
--         
--         
--     end loop setEmail;
--     close curEmail;    
--     
-- end $$
-- delimiter ;

-- select * from student;

-- call makeStudentEmails();

-- select * from student;

-- truncate table student;


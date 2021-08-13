-- Transactional Control Language (TCL):
-- manage transactions in a database, changes made to data by DML statements
-- also allow statements to be grouped together in logical transactions

use practice;

# create table (DDL command)
create table pet(pet_id int, pet_type varchar(100));

# set session so no autocommits completed
set session autocommit = 0;


##########
# COMMIT #
##########

# insert value
insert into pet values(1, 'dog');

# first commit
commit;

# insert values
insert into pet values(2, 'cat');
insert into pet values(3, 'rabbit');

# select all from table
select * from pet;


############
# ROLLBACK #
############

# undo everything till last commit
rollback;
select * from pet;


#######################
# AUTOCOMMIT WITH DDL #
#######################

# truncate is a DDL command so will auto commit
truncate table pet;

# insert value
insert into pet values(2, 'cat');
select * from pet;

# rollback will go back to truncate
rollback;
select * from pet;


#############
# SAVEPOINT #
#############

# insert
savepoint before_insert;
insert into pet values(1, 'dog');
insert into pet values(2, 'cat');

# select all
select * from pet; # 2 records displayed

# delete
savepoint before_delete;
delete from pet where pet_id = 1;

# select all
select * from pet; # 1 record displayed

# update
savepoint before_update;
update pet set pet_type = 'fish' where pet_id = 2;

# select all
select * from pet;

# rollback to beginning
rollback;
select * from pet;

# rollback before update
rollback to before_update;
select * from pet;

# rollback before delete
rollback to before_delete;
select * from pet;

# rollback before insert
rollback to before_insert;
select * from pet;



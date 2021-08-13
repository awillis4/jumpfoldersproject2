-- Data Control Language (DCL):
-- used to control privileges in a database, users are granted read/write permissions to
-- be able to view and/or manipulate data

########
# USER #
########

# create a user
create user 'test1' identified by '123';

create user 'test2' identified by '123';

# drop user
# drop user 'testuser';


#########
# GRANT #
#########

-- grant access to all databases syntax
-- grant all on database.table to 'testuser';

-- grant access to all databases to user
grant all on *.* to 'test1';

-- grant access to sakila database only
# read/write
grant all on sakila.* to 'test1';
# read only
grant select on sakila.* to 'test1';


##########
# REVOKE #
##########

-- revoke access to all databases
-- will run, even if says it's error
revoke select on *.* from 'test1';



-- show grants for current user
show grants for current_user();
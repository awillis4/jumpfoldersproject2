-- Stored Functions:
-- perform an operation and return a single value
-- it can take in prameters but they are all in by default and you cannot
-- specify them as in, out, or inout


delimiter $$
create function funcExample(x1 int, x2 int)
returns int
deterministic
begin
	declare ans int;
    set ans = x1 * x2;
    return ans;
end $$
delimiter ;

select funcExample(2,30);

select now();



-- delimiter $$
-- create function funcNonDet(var int)
-- returns int
-- not deterministic
-- begin
-- 	return ans = round(rand() * var, 0);
-- end $$
-- delimiter ;
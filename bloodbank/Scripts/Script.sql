create database bb;
use bb;
show tables;
select * from country;
insert into country values (2, 'srilanka');
select * from state;
insert into state values (6, 'chimpodia', 2);
select * from blood_details bd ;
INSERT into blood_details values (8 , 'O+', 10);
SELECT  * from account_details ad ;
insert into account_details values (4,'rwdhsdgh@2r@dsgs.com','eggsde54322',993456789,true);
SELECT * from person_details
pd ;
INSERT into person_details values (5, 'vskp','bab','male','aba','ap',2,1,4);
SELECT  * from request_table rt ;
select blooddetai0_.bg_id as bg_id1_1_, blooddetai0_.blood_group as blood_gr2_1_, blooddetai0_.quantity as quantity3_1_ from blood_details blooddetai0_
select accountdet0_.account_id as account_1_0_0_, accountdet0_.email as email2_0_0_, accountdet0_.password as password3_0_0_, accountdet0_.phone as phone4_0_0_, accountdet0_.phoone_privacy as phoone_p5_0_0_ from account_details accountdet0_ where accountdet0_.account_id=2;
drop table request_table ;

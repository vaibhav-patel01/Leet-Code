# Write your MySQL query statement below
SELECT firstName, lastName, city, state From
person LEFT JOIN address ON person.personId =  address.personId;
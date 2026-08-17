# Write your MySQL query statement below
DELETE p1
FROM Person p1
JOIN person p2
WHERE p2.email = p1.email
      AND
      p2.id < p1.id;
--INSERT INTO USER (USERNAME, PASSWORD) VALUES ('fpmoles', 'password');
--INSERT INTO USER (USERNAME, PASSWORD) VALUES ('jdoe', 'foobar');

-- B-crypt (11 times) Hashed versions of the above
-- The “2a” represents the BCrypt algorithm version
-- The “11” represents the strength of the algorithm
--The “dp4wMyuqYE3KSwIyQmWZFe Ub7jCsHAdk7ZhFc0qGw6i5J124imQBi” part is actually the randomly generated salt.
-- Basically, the first 22 characters are salt. The remaining part of the last field is the actual hashed version of the plain text
INSERT INTO USER (USERNAME, PASSWORD) VALUES ('fpmoles', '$2a$11$dp4wMyuqYE3KSwIyQmWZFeUb7jCsHAdk7ZhFc0qGw6i5J124imQBi');
INSERT INTO USER (USERNAME, PASSWORD) VALUES ('jdoe', '$2a$11$3NO32OV1TGjap3xMpAEjmuiizitWuaSwUYz42aMtlxRliwJ8zm4Sm');
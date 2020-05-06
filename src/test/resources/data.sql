--pwd is password
INSERT INTO user(username, password) VALUES ('alex', '$2a$10$wtqc3fmBaqiQq4E9/dHJUuxvTPJ9JYTHjbyYIiYzyJxEL7tiw6SWC');
INSERT INTO user_roles(user_id,roles) VALUES (1, 'ROLE_ADMIN,ROLE_PUBLIC');
INSERT INTO user(username, password) VALUES ('alexp', '$2a$10$wtqc3fmBaqiQq4E9/dHJUuxvTPJ9JYTHjbyYIiYzyJxEL7tiw6SWC');
INSERT INTO user_roles(user_id,roles) VALUES (2, 'ROLE_PUBLIC');
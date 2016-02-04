-- Create the user table if it does not exist

create table if not exists user (username VARCHAR(100) not null , email VARCHAR (100), PRIMARY KEY (username));
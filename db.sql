CREATE DATABASE test;

USE test;

CREATE TABLE todoItem(task_id int not null auto_increment, task_title varchar(50), task_status bool default false, primary key(task_id));

INSERT INTO todoItem values(1,'first task', true);
INSERT INTO todoItem values(2,'second task', true);
INSERT INTO todoItem values(3,'third task', false);
INSERT INTO todoItem values(4,'four task', true);
INSERT INTO todoItem values(5,'fifth task', false);
INSERT INTO todoItem values(6,'sixth task', true);
INSERT INTO todoItem values(7,'seventh task', true);
INSERT INTO todoItem values(8,'eighth task', false);
INSERT INTO todoItem values(9,'ninth task', false);
INSERT INTO todoItem values(10,'tenth task', false);

SELECT * FROM todoItem;


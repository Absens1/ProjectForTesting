BEGIN;

DROP TABLE IF EXISTS Students CASCADE;
CREATE TABLE Students (id bigserial PRIMARY KEY, name VARCHAR(255), mark VARCHAR(255));
INSERT INTO Students (name, mark) VALUES
('Name1', 'Student1'),
('Name2', 'Student2'),
('Name3', 'Student3'),
('Name4', 'Student4'),
('Name5', 'Student5'),
('Name6', 'Student6');

COMMIT;

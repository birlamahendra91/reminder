DROP TABLE IF EXISTS person;

CREATE TABLE person (
                        ID INT AUTO_INCREMENT  PRIMARY KEY,
                        FIRST_NAME VARCHAR(50) NOT NULL,
                        LAST_NAME VARCHAR(50),
                        EMAIL_ID VARCHAR(250) NOT NULL
                   );
INSERT INTO person ( FIRST_NAME,LAST_NAME,EMAIL_ID) VALUES
  ('Aliko','','Aliko@Aliko.com'),
  ('Bill','','Bill@Bill.com'),
  ('Folrunsho','','Folrunsho@Folrunsho.com');

DROP TABLE IF EXISTS Pet;
CREATE TABLE Pet
(
   id INT AUTO_INCREMENT PRIMARY KEY,
   name VARCHAR (16) not null,
   gender VARCHAR (16) not null,
   type VARCHAR (30) NOT NULL,
   species VARCHAR (30) NOT NULL,
   heightft VARCHAR (30) NOT NULL,
   heightin VARCHAR (30) NOT NULL,
   weight VARCHAR (30) NOT NULL,
   age VARCHAR (30) NOT NULL,
   ownername VARCHAR (30) NOT NULL,
   address VARCHAR (30) NOT NULL,
   phone VARCHAR (30) NOT NULL,
   primaryvet VARCHAR (30) NOT NULL,
   primaryvetphone VARCHAR (30) NOT NULL
);

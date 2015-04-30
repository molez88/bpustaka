CREATE TABLE IF NOT EXISTS member (
  id varchar(4) NOT NULL,
  iduser varchar(10) NOT NULL,
  username VARCHAR(10) NULL,
  password VARCHAR(10) NULL,
  fullname VARCHAR(50) NULL,
  address TEXT NULL,
  country VARCHAR(50) NULL,
  email VARCHAR(45) NULL,
  mobileno VARCHAR(45) NULL,
  dateofbirth Date NULL,
  picture VARCHAR(45) NULL,
  status VARCHAR(45) NULL,
  PRIMARY KEY (iduser))
ENGINE = InnoDB;
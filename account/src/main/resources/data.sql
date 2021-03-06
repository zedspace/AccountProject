DROP TABLE IF EXISTS ACCOUNT;

CREATE TABLE ACCOUNT (
  accountNo INT AUTO_INCREMENT  PRIMARY KEY,
  accountStatus boolean NOT NULL,
  balance double NOT NULL,
  overdraft double DEFAULT NULL
);

DROP TABLE IF EXISTS TRANSACTION;

CREATE TABLE TRANSACTION (
  transactionId INT AUTO_INCREMENT  PRIMARY KEY,
  transactionDate datetime NOT NULL,
  tranValue double NOT NULL,
  accountNo INT NOT NULL
);

ALTER TABLE TRANSACTION
ADD FOREIGN KEY (accountNo) REFERENCES ACCOUNT(accountNo);

INSERT INTO ACCOUNT values (1, True,5000,3000);
INSERT INTO ACCOUNT values (2, True,2000,3000);
INSERT INTO ACCOUNT values (3, False,0,3000);
INSERT INTO ACCOUNT values (4, True,0,3000);

INSERT INTO TRANSACTION values (1, '2021-04-23 18:20:00', 200, 1);
INSERT INTO TRANSACTION values (2, '2021-04-24 14:12:23', 500, 1);
INSERT INTO TRANSACTION values (3, '2021-04-24 15:30:00', 500, 2);
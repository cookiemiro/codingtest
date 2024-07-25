use shopdb;
CREATE TABLE shopdb.membertbl (
	memberID CHAR(8) NOT NULL PRIMARY KEY,
    memberName CHAR(5) NOT NULL,
    memberAddress CHAR(20) NULL
);
DESC membertbl;
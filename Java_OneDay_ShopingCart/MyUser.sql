----------여기는 shop----------

CREATE TABLE tbl_product(
    pCode	VARCHAR2(13)	NOT NULL	PRIMARY KEY,
    pName	nVARCHAR2(50),		
    pIitem	VARCHAR2(10),		
    pIPrice	NUMBER	,	
    pOPrice	NUMBER		

);

CREATE TABLE tbl_buyers(
    buId	VARCHAR2(10)	NOT NULL	PRIMARY KEY,
    buName	nVARCHAR2(20),		
    buTel	VARCHAR2(10),		
    buAddr	nVARCHAR2(125)		
);

CREATE TABLE tbl_iolist(
    ioSEQ	VARCHAR2(13)	NOT NULL	PRIMARY KEY,
    ioDate	VARCHAR2(10),		
    ioTime	VARCHAR2(10),		
    ioBuId	VARCHAR2(10),		
    ioPCode	VARCHAR2(13),		    
    ioQuan	NUMBER,		
    ioPrice	NUMBER		
);

INSERT INTO tbl_product( pCode, pName, pIitem,PIPrice, POPrice)
VALUES('0001','칸쵸','과자',1500,2000);

UPDATE tbl_product
SET piitem = '까까';

SELECT * From tbl_product;

INSERT INTO tbl_buyers( buId ,buName ,buTel ,buAddr)
VALUES('0001','홍길동','1111-1111','광주광역시');
SELECT * From tbl_buyers;

INSERT INTO tbl_buyers
WHERE buName LIKE '%' || 홍길동|| '홍길동'; 

CREATE SEQUENCE seq_buyers
START WITH 1   INCREMENT BY 1;
       
      


-- MEMO--
CREATE TABLE tbl_memo(
    m_seq	    NUMBER		PRIMARY KEY,
    m_writer	nVARCHAR2(20),		
    m_date	    VARCHAR2(10),		
    m_subject	nVARCHAR2(20),		
    m_content	nVARCHAR2(400)		

);

INSERT INTO tbl_memo(m_seq , m_writer, m_date, m_subject, m_content)
VALUES(1,'홍길동','23-05-26','메모장','메모메모');

SELECT * FROM tbl_memo;

UPDATE tbl_memo
SET m_writer = '변학도'
WHERE m_seq = 1;

commit;
SELECT * FROM tbl_memo;


package com.hee462.memo.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.hee462.memo.mappers.impl.MemoSQL;
import com.hee462.memo.models.MemoDto;
//연결된것을 토대로 CRUD 만들기
public interface MemoDao {
	@Select(" SELECT * FROM tbl_memo ")
	public List<MemoDto> selectAll();
	
	@Select(" SELECT * FROM tbl_memo WHERE m_seq = #{seq} ")
	public MemoDto findByseq(String seq);
	
	@Delete(" DELETE FROM tbl_memo WHERE m_seq = #{seq} ")
	public int delete(String seq);
	@Insert(MemoSQL.MEMO_INSERT)
	public int insert(MemoDto dto);
	@Update(MemoSQL.MEMO_UPDATE)
	public int update(MemoDto dto);
}

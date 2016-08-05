package com.ex.finalproject.Member;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

@Component(value="memService")
public class MemServiceImple implements MemService {
	
	@Resource(name="sqlSession")
	private SqlSession sqlsession;
	
	public void setSqlsession(SqlSession sqlsession) {
		this.sqlsession = sqlsession;
	}

	@Override
	public void memDelete(String id, String pwd) {
		MemMapper memMapper = sqlsession.getMapper(MemMapper.class);
		memMapper.memDelete(id, pwd);
	}

	@Override
	public void memUpdae(MemberDTO dto) {
		MemMapper memMapper = sqlsession.getMapper(MemMapper.class);
		memMapper.memUpdae(dto);		
	}


	@Override
	public boolean idChk(String id) {
		MemMapper memMapper = sqlsession.getMapper(MemMapper.class);
		return memMapper.idChk(id);
	}

	@Override
	public List<MemberDTO> memAllSelect() {
		MemMapper memMapper = sqlsession.getMapper(MemMapper.class);
		return memMapper.memAllSelect();
	}

	@Override
	public void memAdd(MemberDTO dto) {
		MemMapper memMapper = sqlsession.getMapper(MemMapper.class);
		memMapper.memAdd(dto);
	}

	
	//수정부분
	@Override
	public MemberDTO memInfo(String id) {
		MemMapper memMapper = sqlsession.getMapper(MemMapper.class);
		return memMapper.memInfo(id);
	}
	
	

}

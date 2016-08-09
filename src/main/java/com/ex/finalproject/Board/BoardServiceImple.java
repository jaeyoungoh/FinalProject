package com.ex.finalproject.Board;


import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

@Component(value="boardService")
public class BoardServiceImple implements BoardService {
	
	@Resource(name="sqlSession")
	private SqlSession sqlsession;
	
	public void setSqlsession(SqlSession sqlsession) {
		this.sqlsession = sqlsession;
	}

	@Override
	public void boardAdd(BoardDTO boardDto) {
		BoardMapper boardMapper = sqlsession.getMapper(BoardMapper.class);
		boardMapper.boardAdd(boardDto);
	}
	

}

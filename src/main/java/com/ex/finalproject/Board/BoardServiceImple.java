package com.ex.finalproject.Board;


import java.util.List;

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

	@Override
	public void boardUpdate(BoardDTO boardDto) {
		BoardMapper boardMapper = sqlsession.getMapper(BoardMapper.class);
		boardMapper.boardUpdate(boardDto);
	}

	@Override
	public List<BoardDTO> boardList(int gathering_num) {
		BoardMapper boardMapper = sqlsession.getMapper(BoardMapper.class);
		return boardMapper.boardList(gathering_num);
	}

	@Override
	public void boardDelete(int board_num) {
		BoardMapper boardMapper = sqlsession.getMapper(BoardMapper.class);
		boardMapper.boardDelete(board_num);
	}
	

}

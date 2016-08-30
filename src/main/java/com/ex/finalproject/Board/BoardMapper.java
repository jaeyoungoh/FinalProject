package com.ex.finalproject.Board;

import java.util.List;

public interface BoardMapper {
	
	public void boardAdd(BoardDTO boardDto);
	public void boardUpdate(BoardDTO boardDto);
	public List<BoardDTO> boardList(int gathering_num);
	public void boardDelete(int board_num);
	
}

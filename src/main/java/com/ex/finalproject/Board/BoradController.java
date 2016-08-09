package com.ex.finalproject.Board;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class BoradController {
	
	@Resource
	private BoardService boardService;
	
	public void setGroupService(BoardService boardService) {
		this.boardService = boardService;
	}
	
	@RequestMapping(value="/addBoard.do")
	public void addGroup(BoardDTO boardDto){
		boardDto.setBoard_num(1);
		boardDto.setBoard_title("제목1");
		boardService.boardAdd(boardDto);
	}
}

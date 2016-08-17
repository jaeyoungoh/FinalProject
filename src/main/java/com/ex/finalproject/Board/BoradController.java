package com.ex.finalproject.Board;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
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
	public void addBoard(BoardDTO boardDto){
		boardDto.setBoard_num(1);
		boardDto.setBoard_title("제목1");
		boardService.boardAdd(boardDto);
	}

	@RequestMapping(value="/updateBoard.do")
	public void updateBoard(BoardDTO boardDto){
		boardDto.setBoard_num(2);
		boardDto.setBoard_title("제목1 수정");
		boardService.boardUpdate(boardDto);
	}
/*
	@RequestMapping(value="/File_Test.do")
	public String File_Test(BoardDTO boardDto){

		return "uploadimg";
	}

	@RequestMapping(value="/File_Download.do")
	public void File_Download(HttpServletResponse response)throws Exception{
		System.out.println("여기왔음");
		String filename="1.jpg";

		response.setContentType("application/octet-stream");
		filename = new String(filename.getBytes("UTF-8"), "iso-8859-1");
		response.setHeader("Content-Disposition", "attachment; filename=\""+filename+"\"");
		OutputStream os = response.getOutputStream();
		String path = "F:/Studys/UploadedImages/";
		FileInputStream fis = new FileInputStream(path+ File.separator+filename);
		int n = 0 ;
		byte[] b = new byte[512];
		while ((n = fis.read(b)) != -1) {
			os.write(b, 0, n);
		}
		fis.close();
		os.close();
		
	}
	
*/
}

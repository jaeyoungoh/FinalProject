package com.ex.finalproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ex.finalproject.Board.BoardDTO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
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
}

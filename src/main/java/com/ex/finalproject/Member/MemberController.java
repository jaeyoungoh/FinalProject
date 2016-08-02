package com.ex.finalproject.Member;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MemberController {
	
//	@Resource
//	private MemService MemService;
	
	@RequestMapping(value="/join.do")
	public ModelAndView addMember(MemberDTO dto){
//		public ModelAndView addMember(HttpServletRequest request){
		
//		System.out.println(request.getParameter("id"));
//		System.out.println(request.getParameter("pwd"));
//		System.out.println(request.getParameter("name"));
//		System.out.println(request.getParameter("email"));
		System.out.println(dto.toString());
		return null;
	}
	@RequestMapping(value="/update.do")
	public ModelAndView updateMember(MemberDTO dto){
		
		
		return null;
	}
	@RequestMapping(value="/delete.do")
	public ModelAndView deleteMember(String id, String pwd){
		
		
		return null;
	}
	@RequestMapping(value="/login.do")
	public ModelAndView loginMember(String id, String pwd){
		
		
		return null;
	}
	@RequestMapping(value="/logout.do")
	public ModelAndView logoutMember(String id){
		
		
		return null;
	}
}

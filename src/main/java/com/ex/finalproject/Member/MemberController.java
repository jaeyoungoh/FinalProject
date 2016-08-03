package com.ex.finalproject.Member;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MemberController {
	
	@Resource
	private MemService memService;
	
	public void setMemService(MemService memService) {
		this.memService = memService;
	}
	
	@RequestMapping(value="/join.do")
	public ModelAndView addMember(MemberDTO dto){
		System.out.println(dto.toString());
		memService.memAdd(dto);
		System.out.println("DB 추가 완료");
		
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

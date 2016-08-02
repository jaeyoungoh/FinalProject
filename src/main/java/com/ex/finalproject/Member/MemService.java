package com.ex.finalproject.Member;

import java.util.List;

public interface MemService {
	
	public void memDelete(String id, String pwd);
	public void memUpdae(MemberDTO dto);
	public void memLogin(String id, String pwd);
	public boolean idChk(String id);
	public List<MemberDTO> memAllSelect();
	public MemberDTO memAdd(MemberDTO dto);
	

}

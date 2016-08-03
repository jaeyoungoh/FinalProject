package com.ex.finalproject.Member;

import java.util.List;

public interface MemMapper {
	
	public void memDelete(String id, String pwd);
	public void memUpdae(MemberDTO dto);
	public void memLogin(String id, String pwd);
	public boolean idChk(String id);
	public List<MemberDTO> memAllSelect();
	public void memAdd(MemberDTO dto);

}

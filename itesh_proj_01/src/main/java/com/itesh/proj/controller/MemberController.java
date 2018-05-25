package com.itesh.proj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itesh.proj.domain.Member;
import com.itesh.proj.repository.MemberRepository;

@Controller
@RequestMapping("/member")
public class MemberController {

	@Autowired
	private MemberRepository memberDao;
	
	@RequestMapping("/add")
	@ResponseBody
	public Member add(Member member) {
		Member memberData = memberDao.save(member);
		return memberData;
	}
	
	@RequestMapping("/list")
	@ResponseBody
	public List<Member> list() {
		List<Member> memberList = memberDao.findAll();
		return memberList;
	}
	
	@RequestMapping("/edit/{id}")
	@ResponseBody
	public Member edit(Member member) {
		Member memberData = memberDao.save(member);
		return memberData;
	}
	
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		System.out.println("id="+id);
		
		memberDao.deleteById(id);
		return "redirect:/member/list";
	}
	
}

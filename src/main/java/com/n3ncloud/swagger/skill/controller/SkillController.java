package com.n3ncloud.swagger.skill.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.n3ncloud.swagger.skill.model.Skill;
import com.n3ncloud.swagger.skill.service.SkillService;

@RestController
public class SkillController {
	
	@Autowired
	private SkillService skillService;
	
	@RequestMapping(value="/api/skillList", method=RequestMethod.GET)
	public List<Skill> selectSkill(){
		List<Skill> list = skillService.selectList();
		
		return list;
	}
	
	@RequestMapping(value="/api/insrtSkill", method=RequestMethod.POST)
	public void insertSkill(){
		skillService.insertSkill();		
	}
	
	@RequestMapping(value="/api/updateSkill", method=RequestMethod.PATCH)
	public void updateSkill(){
		skillService.updateSkill();
	}
	
	@RequestMapping(value="/api/deleteSkill", method=RequestMethod.DELETE)
	public void deleteSkill(){
		skillService.deleteSkill();
		
	}
}

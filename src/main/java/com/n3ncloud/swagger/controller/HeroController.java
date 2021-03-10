package com.n3ncloud.swagger.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.n3ncloud.swagger.model.Hero;
import com.n3ncloud.swagger.service.HeroService;

import io.swagger.annotations.ApiOperation;

@RestController
public class HeroController {

	@Autowired
	private HeroService heroService;

	/*
	 * @RequestMapping(value = "/") public String test() { return "index"; }
	 */
	@RequestMapping(value="/api/selectHeroOne", method=RequestMethod.POST)
	public Hero selectHeroOne(@RequestParam(name="id") String id) {
		Hero hero = heroService.selectHeroOne(id);
		return hero;
	}
	
	 @RequestMapping(value="/api/heroList", method=RequestMethod.GET)	  
	 @ApiOperation(value="히어로 리스트",notes="히어로 리스트 기능") 
	 public ArrayList<Hero> selectHero() { 
		 ArrayList<Hero> list = heroService.selectHero();
		 return list; 
	 }
	 
	@RequestMapping(value = "/api/insertHero", method = RequestMethod.POST)
	@ApiOperation(value = "히어로 등록", notes = "히어로 등록 기능")
	public String InsertHero(@RequestParam(name = "id") String id, @RequestParam(name = "name") String name) {
		Hero hero = new Hero(Integer.parseInt(id), name);
		heroService.insertHero(hero);
		return "listPage";
	}

	@RequestMapping(value = "/api/updateHero", method = RequestMethod.PATCH)
	@ApiOperation(value = "히어로 수정", notes = "히어로 수정 기능")
	public void UpdatdHero(@RequestParam(name = "id") int id, @RequestParam(name = "name") String name) {
		Hero hero = new Hero(id, name);
		heroService.updateHero(hero);

	}

	@RequestMapping(value = "/api/deleteHero", method = RequestMethod.DELETE)
	@ApiOperation(value = "히어로 삭제", notes = "히어로 삭제 기능")
	public void deleteHero(@RequestParam(name = "id") int id) {
		heroService.deleteHero(id);
	}

}

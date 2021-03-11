package com.n3ncloud.swagger.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
	public ArrayList<Hero> selectHeroOne(@RequestParam(name="id") String id){
		Hero hero = heroService.selectHeroOne(id);
		System.out.println(hero.toString());
		ArrayList<Hero> list = new ArrayList<Hero>();
		list.add(hero);
		return list;
	}
	
//	 @RequestMapping(value="/api/heroList", method=RequestMethod.GET)	  
//	 @ApiOperation(value="히어로 리스트",notes="히어로 리스트 기능")
//	 //@CrossOrigin(origins="http://localhost:4200/")
//	 public ResponseEntity<List<Hero>> findAll() { 
//		 ArrayList<Hero> list = heroService.findAll();
//		 return new ResponseEntity<List<Hero>>(list, HttpStatus.OK) ; 
//	 }
	
	
	 @RequestMapping(value="/api/heroList", method=RequestMethod.GET)	  
	 @ApiOperation(value="히어로 리스트",notes="히어로 리스트 기능")
	 public ArrayList<Hero> selectHero(){
		 return heroService.selectHero();
	 }
	
	 
	@RequestMapping(value = "/api/insertHero", method = RequestMethod.POST)
	@ApiOperation(value = "히어로 등록", notes = "히어로 등록 기능")
	public void InsertHero(@RequestParam(name = "id") String id, @RequestParam(name = "name") String name) {
		Hero hero = new Hero(Integer.parseInt(id), name);
		//heroService.save(hero);
		heroService.insertHero(hero);
		//new ResponseEntity<Hero>(HttpStatus.OK);
	}

	@RequestMapping(value = "/api/updateHero", method = RequestMethod.PUT)
	@ApiOperation(value = "히어로 수정", notes = "히어로 수정 기능")
	public String UpdatdHero(@RequestParam(name = "id") String id, @RequestParam(name = "name") String name) {
		Hero hero = new Hero(Integer.parseInt(id), name);
		System.out.println("수정 실행");
		heroService.updateHero(hero);
		return id;
	}

	@RequestMapping(value = "/api/deleteHero", method = RequestMethod.DELETE)
	@ApiOperation(value = "히어로 삭제", notes = "히어로 삭제 기능")
	public void deleteHero(@RequestParam(name = "id") int id) {
		heroService.deleteHero(id);
	}

}

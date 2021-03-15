package com.n3ncloud.swagger.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.n3ncloud.swagger.model.Hero;
import com.n3ncloud.swagger.service.HeroService;

@RestController
public class HeroController {

	@Autowired
	private HeroService heroService;
	
	@GetMapping("/api/heroes")
	public List<Hero> findAll() {
		List<Hero> list = heroService.findAll();
		return list;
	}
	
	@GetMapping("/api/hero")
	public ResponseEntity<Hero> selectOne(@RequestParam(name = "id") int id) {
		Optional<Hero> hero = heroService.findById(id);
		return new ResponseEntity<Hero>(hero.get(), HttpStatus.OK);
	}
	
	@PostMapping("/api/saveHero")
	public ResponseEntity<Hero> saveHero(@RequestBody Hero hero) {
		return new ResponseEntity<Hero>(heroService.save(hero), HttpStatus.OK);
	}
	
	@DeleteMapping("/api/removeHero")
	public void deleteHero(@RequestParam(name = "id") int id) {
		heroService.deleteHero(id);
	}
	
	@PutMapping("/api/updateHero")
	public void updateHero(@RequestBody Hero hero) {		
		heroService.updateHero(hero);
	}
	
	/* 마이바티스
	 * @RequestMapping(value = "/api/heroList", method = RequestMethod.GET)
	 * 
	 * @ApiOperation(value = "히어로 리스트", notes = "히어로 리스트 기능") public ArrayList<Hero>
	 * selectHero() { return heroService.selectHero(); }
	 * 
	 * @RequestMapping(value = "/api/selectHeroOne", method = RequestMethod.POST)
	 * public ArrayList<Hero> selectHeroOne(@RequestParam(name = "id") String id) {
	 * Hero hero = heroService.selectHeroOne(id);
	 * System.out.println(hero.toString()); ArrayList<Hero> list = new
	 * ArrayList<Hero>(); list.add(hero); return list; }
	 * 
	 * @RequestMapping(value = "/api/insertHero", method = RequestMethod.POST)
	 * 
	 * @ApiOperation(value = "히어로 등록", notes = "히어로 등록 기능") public void
	 * InsertHero(@RequestParam(name = "id") String id, @RequestParam(name = "name")
	 * String name) { Hero hero = new Hero(Integer.parseInt(id), name); //
	 * heroService.save(hero); heroService.insertHero(hero); // new
	 * ResponseEntity<Hero>(HttpStatus.OK); }
	 * 
	 * @RequestMapping(value = "/api/updateHero", method = RequestMethod.PUT)
	 * 
	 * @ApiOperation(value = "히어로 수정", notes = "히어로 수정 기능") public String
	 * UpdatdHero(@RequestParam(name = "id") String id, @RequestParam(name = "name")
	 * String name) { Hero hero = new Hero(Integer.parseInt(id), name);
	 * System.out.println("수정 실행"); heroService.updateHero(hero); return id; }
	 * 
	 * @RequestMapping(value = "/api/deleteHero", method = RequestMethod.DELETE)
	 * 
	 * @ApiOperation(value = "히어로 삭제", notes = "히어로 삭제 기능") public void
	 * deleteHero(@RequestParam(name = "id") int id) { heroService.deleteHero(id); }
	 */

}

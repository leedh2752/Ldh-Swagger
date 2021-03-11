package com.n3ncloud.swagger.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.n3ncloud.swagger.mapper.HeroMapper;
import com.n3ncloud.swagger.model.Hero;

@Service
public class HeroService {
	@Autowired
	//private HeroRepository heroRepository;
	private HeroMapper heroMapper;

//	public ArrayList<Hero> findAll() {
//		ArrayList<Hero> list = new ArrayList<Hero>();
//		heroRepository.findAll().forEach(e -> list.add(e));
//		return list;
//	}
//
//	public void save(Hero hero) {
//		heroRepository.save(hero);		
//	}
	
	public ArrayList<Hero> selectHero(){
		return heroMapper.selectHero();
	}

	public int insertHero(Hero hero) {
		return heroMapper.insertHero(hero);
	}

	public int updateHero(Hero hero) {
		return heroMapper.updateHero(hero);
	}

	public int deleteHero(int id) {
		return heroMapper.deleteHero(id);
	}

	public Hero selectHeroOne(String id) {
		System.out.println("실행");
		return heroMapper.selectHeroOne(id);
	}

}

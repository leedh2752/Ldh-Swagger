package com.n3ncloud.swagger.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.n3ncloud.swagger.model.Hero;
import com.n3ncloud.swagger.repository.HeroRepository;

@Service
public class HeroService {
	@Autowired
	private HeroRepository heroRepository;
	//private HeroMapper heroMapper;

	//JPA
	public List<Hero> findAll() {
		List<Hero> list = heroRepository.findAll();
		return list;
	}
	
	public Optional<Hero> findById(int id){
		Optional<Hero> hero = heroRepository.findById(id);
		return hero;
	}
	
	public Hero save(Hero hero1) {
		heroRepository.save(hero1);
		return hero1;
	}

	public void deleteHero(int id) {
		heroRepository.deleteById(id);
	}

	public void updateHero(Hero hero) {
		heroRepository.save(hero);
	}
	
	// 마이바티스
//	public ArrayList<Hero> selectHero(){
//		return heroMapper.selectHero();
//	}
//
//	public int insertHero(Hero hero) {
//		return heroMapper.insertHero(hero);
//	}
//
//	public int updateHero(Hero hero) {
//		return heroMapper.updateHero(hero);
//	}
//
//	public int deleteHero(int id) {
//		return heroMapper.deleteHero(id);
//	}
//
//	public Hero selectHeroOne(String id) {
//		System.out.println("실행");
//		return heroMapper.selectHeroOne(id);
//	}

}

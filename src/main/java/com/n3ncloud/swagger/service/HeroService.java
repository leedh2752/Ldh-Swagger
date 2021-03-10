package com.n3ncloud.swagger.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.n3ncloud.swagger.mapper.HeroMapper;
import com.n3ncloud.swagger.model.Hero;

@Service
public class HeroService {
	@Autowired
	private HeroMapper heroMapper;

	public ArrayList<Hero> selectHero() {
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
		return heroMapper.selectHeroOne(id);
	}

}

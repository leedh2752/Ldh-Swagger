package com.n3ncloud.swagger.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.n3ncloud.swagger.model.Hero;

@Repository
@Mapper
public interface HeroMapper {

	public ArrayList<Hero> selectHero();

	public int insertHero(Hero hero);

	public int updateHero(Hero hero);

	public int deleteHero(int id);

	public Hero selectHeroOne(String id);
	
}

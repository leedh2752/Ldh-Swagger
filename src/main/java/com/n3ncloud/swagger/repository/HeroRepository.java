package com.n3ncloud.swagger.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.n3ncloud.swagger.model.Hero;

@Repository
public interface HeroRepository 
//extends JpaRepository<Hero, Long> 
{
	
	public List<Hero> findAll();

}

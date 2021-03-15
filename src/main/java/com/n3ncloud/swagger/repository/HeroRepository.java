package com.n3ncloud.swagger.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.n3ncloud.swagger.model.Hero;

@Repository
public interface HeroRepository extends JpaRepository<Hero, Integer>{
	
	//public List<Hero> findAll();
	
	//public Optional<Hero> findById(int id);

	//public void save(String hero);

}

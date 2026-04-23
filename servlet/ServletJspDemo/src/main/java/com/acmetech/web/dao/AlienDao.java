package com.acmetech.web.dao;

import com.acmetech.web.model.Alien;

public class AlienDao {
	public Alien getAlien(int aid)
	{
		Alien a = new Alien();
		a.setAid(1);
		a.setAname("John");
		a.setTech("Java");
		
		return a;
	}
}

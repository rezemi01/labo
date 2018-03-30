package be.formation.java.repasdom.service;

import java.util.List;

import be.formation.java.repasdom.model.entity.Plat;
import be.formation.java.repasdom.model.entity.TypePlat;

public interface PlatService {

	void create(Plat plat);
	
	void create(String nom, String description, String imageUrl, TypePlat typePlat);
	
	List<Plat> read();
	
	Plat read(Long id);
	
	void update(Long id, Plat plat);
	
	void delete(Long id);
}

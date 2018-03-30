package be.formation.java.repasdom.service;

import java.util.List;

import be.formation.java.repasdom.model.entity.MenuDuJour;

public interface MenuDuJourService {

	void create(MenuDuJour menuDuJour);
	
	List<MenuDuJour> read();
	
	MenuDuJour read(Long id);
	
	void update(Long id, MenuDuJour menuDuJour);
	
	void delete(Long id);
	
}

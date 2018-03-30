package be.formation.java.repasdom.service;

import java.time.LocalDate;
import java.util.List;

import be.formation.java.repasdom.model.entity.Menu;

public interface MenuService {
	
	void create(Menu menu);
	
	List<Menu> read();
	
	Menu read(Long id);
	
	void update(Long id, Menu menu);
	
	void delete(Long id);
	
	void create(String nom, String description, String imageUrl, LocalDate date);
	
	// Retourne la liste des menus que le client peut commander ( >= à la date du jour)
	List<Menu> getMenusToOrder();

	
}

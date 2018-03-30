package be.formation.java.repasdom.service.impl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import be.formation.java.repasdom.model.entity.Menu;
import be.formation.java.repasdom.repository.MenuRepository;
import be.formation.java.repasdom.service.MenuService;

@Service
public class MenuServiceImpl implements MenuService {

	private MenuRepository menuRepository;
	
	public MenuServiceImpl(MenuRepository menuRepository) {
		super();
		this.menuRepository = menuRepository;
	}

	@Override
	public void create(Menu menu) {
		menuRepository.save(menu);
	}

	@Override
	public List<Menu> read() {
		return menuRepository.findAll();
	}

	@Override
	public Menu read(Long id) {
		return menuRepository.findById(id).orElse(null);
	}

	@Override
	public void update(Long id, Menu menu) {
		menu.setId(id);
		menuRepository.save(menu);
	}

	@Override
	public void delete(Long id) {
		menuRepository.deleteById(id);
	}
	
	@Override
	public void create(String nom, String description, String imageUrl, LocalDate date) {
		Menu menu = new Menu();
		menu.setNom(nom);
		menu.setDescription(description);
		menu.setImageUrl(imageUrl);
		menu.setDate(date);
	}
	

	@Override
	public List<Menu> getMenusToOrder() {
		// TODO Auto-generated method stub
		return null;
	}



}

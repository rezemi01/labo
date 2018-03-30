package be.formation.java.repasdom.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import be.formation.java.repasdom.model.entity.MenuDuJour;
import be.formation.java.repasdom.repository.MenuDuJourRepository;
import be.formation.java.repasdom.service.MenuDuJourService;

@Service
public class MenuDuJourServiceImpl implements MenuDuJourService {

	private MenuDuJourRepository menuDuJourRepository;
	
	public MenuDuJourServiceImpl(MenuDuJourRepository menuDuJourRepository) {
		super();
		this.menuDuJourRepository = menuDuJourRepository;
	}

	@Override
	public void create(MenuDuJour menuDuJour) {
		menuDuJourRepository.save(menuDuJour);
	}

	@Override
	public List<MenuDuJour> read() {
		return menuDuJourRepository.findAll();
	}

	@Override
	public MenuDuJour read(Long id) {
		return menuDuJourRepository.findById(id).orElse(null);
	}

	@Override
	public void update(Long id, MenuDuJour menuDuJour) {
		menuDuJour.setId(id);
		menuDuJourRepository.save(menuDuJour);
	}

	@Override
	public void delete(Long id) {
		menuDuJourRepository.deleteById(id);
	}

}

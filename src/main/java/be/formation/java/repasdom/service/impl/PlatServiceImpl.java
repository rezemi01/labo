package be.formation.java.repasdom.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import be.formation.java.repasdom.model.entity.Plat;
import be.formation.java.repasdom.model.entity.TypePlat;
import be.formation.java.repasdom.repository.PlatRepository;
import be.formation.java.repasdom.service.PlatService;

@Service
public class PlatServiceImpl implements PlatService{
	
	private PlatRepository platRepository;
	
	public PlatServiceImpl(PlatRepository platRepository) {
		this.platRepository = platRepository;
	}

	@Override
	public void create(Plat plat) {
		platRepository.save(plat);
	}
	
	@Override
	public List<Plat> read() {
		return platRepository.findAll();
	}

	@Override
	public Plat read(Long id) {
		return platRepository.findById(id).orElse(null);
	}

	@Override
	public void update(Long id, Plat plat) {
		plat.setId(id);
		platRepository.save(plat);
	}

	@Override
	public void delete(Long id) {
		platRepository.deleteById(id);
	}

	@Override
	public void create(String nom, String description, String imageUrl, TypePlat typePlat) {
		Plat plat = new Plat();
		plat.setNom(nom);
		plat.setDescription(description);
		plat.setImageUrl(imageUrl);
		plat.setTypePlat(typePlat);
	}

}

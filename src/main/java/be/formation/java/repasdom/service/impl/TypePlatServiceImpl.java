package be.formation.java.repasdom.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import be.formation.java.repasdom.model.entity.TypePlat;
import be.formation.java.repasdom.repository.TypePlatRepository;
import be.formation.java.repasdom.service.TypePlatService;

@Service
public class TypePlatServiceImpl implements TypePlatService {

	
	private TypePlatRepository typePlatRepository;
	
	public TypePlatServiceImpl(TypePlatRepository typePlatRepository) { this.typePlatRepository = typePlatRepository; }
	
	@Override
	public void create(TypePlat typePlat) {
		typePlatRepository.save(typePlat); 
	}

	@Override
	public List<TypePlat> read() {
		return typePlatRepository.findAll();
	}
	
	@Override
	public TypePlat read(Long id) {
		return typePlatRepository.findById(id).orElse(null);
	}

	@Override
	public void update(Long id, TypePlat typePlat) {
		typePlat.setId(id);
		typePlatRepository.save(typePlat);
	}

	@Override
	public void delete(Long id) {
		typePlatRepository.deleteById(id);
		
	}

	@Override
	public void create(String libelle) {
		
		TypePlat typePlat = new TypePlat();
		typePlat.setLibelle(libelle);
		typePlatRepository.save(typePlat);
		
	}
	
}

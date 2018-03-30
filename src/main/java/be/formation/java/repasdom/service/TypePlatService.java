package be.formation.java.repasdom.service;

import java.util.List;

import be.formation.java.repasdom.model.entity.TypePlat;

public interface TypePlatService {
	
	void create(TypePlat typePlat);
	
	void create(String libelle);
	
	List<TypePlat> read();
	
	TypePlat read(Long id);
	
	void update(Long id, TypePlat typePlat);
	
	void delete(Long id);

}

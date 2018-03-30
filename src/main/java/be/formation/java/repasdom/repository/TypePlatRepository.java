package be.formation.java.repasdom.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import be.formation.java.repasdom.model.entity.TypePlat;

public interface TypePlatRepository extends JpaRepository<TypePlat, Long> {

	TypePlat findByLibelle(String libelle);
	 
}

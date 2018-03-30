package be.formation.java.repasdom.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import be.formation.java.repasdom.model.entity.Menu;

public interface MenuRepository extends JpaRepository<Menu, Long> {

}

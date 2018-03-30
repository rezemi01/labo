package be.formation.java.repasdom.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import be.formation.java.repasdom.model.entity.Menu;
import be.formation.java.repasdom.service.MenuService;

@Controller
public class HomeController {
	
	private final MenuService menuService;

	public HomeController(MenuService menuService) {
		super();
		this.menuService = menuService;
	}
	
	@GetMapping("/RepasDom")
	public String index(Model model) {
		List<Menu> menus = menuService.getMenusToOrder();
		model.addAttribute("menus", menus);
		return "index";
	}

}

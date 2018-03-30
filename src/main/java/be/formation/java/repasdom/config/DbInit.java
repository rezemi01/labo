package be.formation.java.repasdom.config;

import java.time.LocalDate;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Configuration;

import be.formation.java.repasdom.model.entity.TypePlat;
import be.formation.java.repasdom.repository.TypePlatRepository;
import be.formation.java.repasdom.service.MenuDuJourService;
import be.formation.java.repasdom.service.MenuService;
import be.formation.java.repasdom.service.PlatService;
import be.formation.java.repasdom.service.TypePlatService;

@Configuration
public class DbInit implements InitializingBean {

	private final TypePlatService typePlatService;
	private final PlatService platService;
	private final MenuService menuService;
	private final MenuDuJourService menuDuJourService;
	
	private TypePlatRepository typePlatRepository;
	
	
	public DbInit(TypePlatService typePlatService, PlatService platService, MenuService menuService,
			MenuDuJourService menuDuJourService) {
		super();
		this.typePlatService = typePlatService;
		this.platService = platService;
		this.menuService = menuService;
		this.menuDuJourService = menuDuJourService;
	}

	@Override
	public void afterPropertiesSet() throws Exception {

		// Création temporaire des types de plat
		typePlatService.create("Entrée");
		typePlatService.create("Plat principal");
		typePlatService.create("Dessert");
		
		// Création temporaire des plats
		TypePlat typePlat = typePlatRepository.findByLibelle("Entrée");
		platService.create("Carpaccio de boeuf", "Fines tranches de boeuf marinées au gingembre et accompagnées d'une salade de roquette.", "", typePlat);
		platService.create("Soupe de concombre", "Soupe de concombre avec en garniture des oeufs durs.", "https://static.cuisineaz.com/610x610/i129493-soupe-concombre-poivrons.jpeg", typePlat);
		platService.create("Soupe de potiron", "Soupe de potiron, oignons avec de la crème fraîche.", "https://www.marciatack.fr/wp-content/uploads/2015/10/soupe-potiron-450x450-1.jpg", typePlat);
		platService.create("Soupe de poireaux", "Soupe de poireaux, pommes de terre, carottes et oignons, contient de la crème.", "https://image.afcdn.com/recipe/20171205/75841_w420h344c1cx3680cy2456cxt0cyt0cxb7360cyb4912.jpg", typePlat);
		platService.create("Chèvre chaud", "Petit fromage de chèvre et sa salade.", "https://i.pinimg.com/originals/ee/5b/f5/ee5bf5c74504b51d31b666cfada09887.jpg", typePlat);
		platService.create("Farci de la mer sur son lit de salade", "Tomate farcie aux surimis, oeufs, avocat et mayonnaise.", "http://i43.servimg.com/u/f43/09/03/28/48/farcis12.jpg", typePlat);
		typePlat = typePlatRepository.findByLibelle("Plat principal");
		platService.create("Spaghetti bolognèse", "Spaghetti sauce tomate, boeuf, basilic.", "https://image.afcdn.com/recipe/20160419/14652_w1024h768c1cx2420cy1872.jpg", typePlat);
		platService.create("Darne de saumon", "Darne de saumon aux épinards et fromage frais à l'ail et fines herbes.", "http://www.belfoodservice.ch/webautor-data/7/Darne_saumon.jpg", typePlat);
		platService.create("Quiche au bacon", "Quiche aux épinards et bacon.", "http://everydaydishes.com/wp-content/uploads/2015/09/bacon-spinach-quiche-everydaydishes_com-H-1-740x486.jpg", typePlat);
		platService.create("Poulet basquaise", "Poulet au poivrons, tomates, oignons, riz de Camargue.", "https://www.foodette.fr/files/products/img_4915_aveclogoweb.jpg", typePlat);
		platService.create("Boeuf bourguignon", "Pavé de boeuf aux carottes et oignons.", "https://www.atelierdeschefs.com/media/recette-d17911-pave-de-boeuf-aux-pommes-boulangeres-carottes-vichy-sauce-a-la-bourguignonne.jpg", typePlat);
		platService.create("Cabillaud à la parisienne", "Cabillaud sauce aux champignons et tomates.", "https://fac.img.pmdstatic.net/fit/http.3A.2F.2Fwww.2Efemmeactuelle.2Efr.2Fvar.2Ffemmeactuelle.2Fstorage.2Fimages.2Fcuisine.2Frecettes.2Fplat.2Fcabillaud-aux-champignons-sauce-normande-02079.2F10313064-3-fre-FR.2Fcabillaud-aux-champignons-sauce-normande.2Ejpg/734x367/crop-from/center/quality/80/cabillaud-aux-champignons-sauce-normande.jpg", typePlat);
		typePlat = typePlatRepository.findByLibelle("Dessert");
		platService.create("Mousse au chocolat", "Mousse au chocolat noir et à la crème.", "https://static.cuisineaz.com/240x192/i45681-mousse-au-chocolat-a-la-creme-fleurette.jpg", typePlat);
		platService.create("Tiramisu", "Tiramisu traditionnel au mascarpone et café.", "http://static.750g.com/images/622-auto/c2c7ae77368260f6a591cb69e9f0c136/tiramisu.jpg", typePlat);
		platService.create("Glace à la compote de fraise", "Glace à la fraise avec fruits rouges, fraises, groseilles, framboises.", "http://cdn1-elle.ladmedia.fr/var/plain_site/storage/images/elle-a-table/recettes-de-cuisine/glace-a-la-compote-de-fraise-2944712/54201918-1-fre-FR/Glace-a-la-compote-de-fraise.jpg", typePlat);
		platService.create("Crème caramel", "Crème caramel, zestes d'orange.", "http://cdnwp.audiencemedia.com/wp-content/uploads/2014/11/414892-1-eng-GB_del02.106-470x540.jpg", typePlat);
		platService.create("Tartelette au citron", "Tartelette au citron et à la crème fraîche.", "http://www.delices-du-monde.fr/photos-recettes/zoom/01-tartelettes-au-citron.jpg", typePlat);
		platService.create("Poêlée de pommes et poires caramélisées", "Pommes et poires caramélisées, miel et glace vanille.", "https://maison2.advcdn.net/images/medias/000/016/000016418/660.jpg", typePlat);
		
		// Création temporaire des menus
		LocalDate date = LocalDate.of(2018, 03, 29);
		menuService.create("Menu 1", "Soupe concombre - Spaghetti bolognèse - Glace à la fraise", "", date);
		date = LocalDate.of(2018, 03, 30);
		menuService.create("Menu 2", "Soupe potiron - Quiche bacon - Tiramisu", "", date);
		date = LocalDate.of(2018, 03, 31);
		menuService.create("Menu 3", "Chèvre chaud - Darne de saumon - Crème caramel", "", date);
		date = LocalDate.of(2018, 04, 01);
		menuService.create("Menu 4", "Soupe de poireaux - Boeuf bourguignon - Mousse au chocolat", "", date);
		date = LocalDate.of(2018, 04, 02);
		menuService.create("Menu 5", "Carpaccio de boeuf - Cabillaud - Tartelette au citron", "", date);
		date = LocalDate.of(2018, 04, 03);
		menuService.create("Menu 6", "Tomate farcie surimi - Poulet basquaise - Poêlée pommes poires ", "", date);
		
		// Création temporaire des menus du jour
//		Plat plat = 
	}

}

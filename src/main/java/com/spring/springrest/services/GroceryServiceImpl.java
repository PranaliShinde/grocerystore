package com.spring.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.springrest.dao.BabyDao;
import com.spring.springrest.dao.BeautyDao;
import com.spring.springrest.dao.BeverageDao;
import com.spring.springrest.dao.CakeDao;
import com.spring.springrest.dao.FruitDao;
import com.spring.springrest.dao.MasalaDao;
import com.spring.springrest.dao.NonvegDao;
import com.spring.springrest.dao.VegetableDao;
import com.spring.springrest.entities.Babys;
import com.spring.springrest.entities.Beautys;
import com.spring.springrest.entities.Beverages;
import com.spring.springrest.entities.Cakes;
import com.spring.springrest.entities.Fruits;
import com.spring.springrest.entities.Masalas;
import com.spring.springrest.entities.Nonvegs;
import com.spring.springrest.entities.Vegetables;


@Service
public class GroceryServiceImpl implements GroceryService {
	
	
	@Autowired
	private FruitDao fruitDao;

	@Autowired
	private VegetableDao vegetableDao;

	@Autowired
	private NonvegDao nonvegDao;

	
	@Autowired
	private MasalaDao masalaDao;

	@Autowired
	private CakeDao cakeDao;
	
	@Autowired
	private BeverageDao beverageDao;


	@Autowired
	private BeautyDao beautyDao;
	
	@Autowired
	private BabyDao babyDao;


	//List<Fruits> list;
	
	public GroceryServiceImpl()
	{
//		list=new ArrayList<>();
//		list.add(new Fruits(2,40,"apple","Fresh Apple","C:\\Users\\pranali_shinde\\Documents\\grocery-store\\src\\Components\\category\\images1\\apple.jpg"));
//		
//		list.add(new Fruits(3,45,"guava","Fresh guava","C:\\Users\\pranali_shinde\\Documents\\grocery-store\\src\\Components\\category\\images1\\guava.jpg"));

	}
	
	
	@Override
	public List<Fruits> getFruits() {
		// TODO Auto-generated method stub
		return fruitDao.findAll();
	}


	@Override
	public Fruits getFruit(int fruitId) {
		// TODO Auto-generated method stub
//		Fruits f=null;
//		for(Fruits fruit:list)
//		{
//			if(fruit.getId()==fruitId)
//			{
//				f=fruit;
//				break;
//			}
//		}
		
		System.out.println("Fruit id in impl-"+fruitId);

		
		Fruits a=fruitDao.getById(fruitId);
		System.out.println(a);
		return a;
	}


	@Override
	public Fruits addFruit(Fruits fruit) {
		// TODO Auto-generated method stub
		
		//list.add(fruit);
		
		fruitDao.save(fruit);
		return fruit;
	}


	@Override
	public Fruits updateFruit(Fruits fruit) {
		// TODO Auto-generated method stub
		String fruitTitle=fruit.getTitle();
	     Fruits fruitobj =findByName(fruitTitle);
	    	     

	    	     fruitobj.setPrice(fruit.getPrice());
	    	     fruitobj.setDescription(fruit.getDescription());
	    	     fruitobj.setImage_path(fruit.getImage_path());
	    	     Fruits updatedFruit = fruitDao.save(fruitobj);
	    	     return updatedFruit;

	}


	private Fruits findByName(String fruitTitle) {
		// TODO Auto-generated method stub
		
		
		Fruits fruit1=null;
		System.out.println(fruitTitle);
		List<Fruits> list = fruitDao.findAll();
		for(Fruits fruit:list)
		{
			if(fruit.getTitle().equalsIgnoreCase(fruitTitle))
			{
				System.out.println("In if");
				fruit1=fruit;
				System.out.println(fruit1);
				break;
				
			}
			
		}
			return fruit1;
		
	}


	@Override
	public void deleteFruit(String fruitTitle) {
		// TODO Auto-generated method stub
		
		Fruits fruitobj=findByName(fruitTitle);
		
		
		fruitDao.delete(fruitobj);
	}

//for vegetables
	@Override
	public List<Vegetables> getVegetables() {
		// TODO Auto-generated method stub
		return vegetableDao.findAll();
	}


	@Override
	public Vegetables addVegetable(Vegetables vegetable) {
		// TODO Auto-generated method stub
		vegetableDao.save(vegetable);
		return vegetable;	
		
		}


	@Override
	public Vegetables updateVegetable(Vegetables vegetable) {
		// TODO Auto-generated method stub
		String vegetableTitle=vegetable.getTitle();
	     Vegetables vegetableobj =findByNameV(vegetableTitle);
	    	     

	     vegetableobj.setPrice(vegetable.getPrice());
	     vegetableobj.setDescription(vegetable.getDescription());
	     vegetableobj.setImage_path(vegetable.getImage_path());
	    	       Vegetables updatedVegetable= vegetableDao.save(vegetableobj);
	    	     return updatedVegetable;

	}

	private Vegetables findByNameV(String vegetableTitle) {
		// TODO Auto-generated method stub
		
		
		Vegetables vegetable1=null;
		System.out.println(vegetableTitle);
		List<Vegetables> list = vegetableDao.findAll();
		for(Vegetables vegetable:list)
		{
			if(vegetable.getTitle().equalsIgnoreCase(vegetableTitle))
			{
				System.out.println("In if");
				vegetable1=vegetable;
				System.out.println(vegetable1);
				break;
				
			}
			
		}
			return vegetable1;
		
	}


	@Override
	public void deleteVegetable(String vegetableTitle) {
		// TODO Auto-generated method stub
		
	     Vegetables vegetableobj =findByNameV(vegetableTitle);

		vegetableDao.delete(vegetableobj);
	}


	
	//for nonveg
	@Override
	public List<Nonvegs> getNonvegs() {
		// TODO Auto-generated method stub
		return nonvegDao.findAll();
	}


	@Override
	public Nonvegs addNonveg(Nonvegs nonveg) {
		// TODO Auto-generated method stub

		nonvegDao.save(nonveg);
		return nonveg;
	}


	@Override
	public Nonvegs updateNonveg(Nonvegs nonveg) {
		// TODO Auto-generated method stub
		String nonvegTitle=nonveg.getTitle();
		Nonvegs nonvegobj =findByNameN(nonvegTitle);
	    	     

		nonvegobj.setPrice(nonveg.getPrice());
		nonvegobj.setDescription(nonveg.getDescription());
		nonvegobj.setImage_path(nonveg.getImage_path());
	    	     Nonvegs updatedNonveg = nonvegDao.save(nonvegobj);
	    	     return updatedNonveg;

	}
	
	private Nonvegs findByNameN(String nonvegTitle) {
		// TODO Auto-generated method stub
		
		
		Nonvegs nonveg1=null;
		System.out.println(nonvegTitle);
		List<Nonvegs> list = nonvegDao.findAll();
		for(Nonvegs nonveg:list)
		{
			if(nonveg.getTitle().equalsIgnoreCase(nonvegTitle))
			{
				System.out.println("In if");
				nonveg1=nonveg;
				System.out.println(nonveg1);
				break;
				
			}
			
		}
			return nonveg1;
		
	}



	@Override
	public void deleteNonveg(String nonvegTitle) {
		// TODO Auto-generated method stub
		Nonvegs nonvegobj =findByNameN(nonvegTitle);

		nonvegDao.delete(nonvegobj);
	}

	
	//for masala

	@Override
	public List<Masalas> getMasalas() {
		// TODO Auto-generated method stub
		return masalaDao.findAll();
	}


	@Override
	public Masalas addMasala(Masalas masala) {
		// TODO Auto-generated method stub
		masalaDao.save(masala);
		return masala;
	}


	@Override
	public Masalas updateMasala(Masalas masala) {
		// TODO Auto-generated method stub
		String masalaTitle=masala.getTitle();
		Masalas masalaobj =findByNameM(masalaTitle);
	    	     

		masalaobj.setPrice(masala.getPrice());
		masalaobj.setDescription(masala.getDescription());
		masalaobj.setImage_path(masala.getImage_path());
		Masalas updatedMasala = masalaDao.save(masalaobj);
	    	     return updatedMasala;

	}
	
	private Masalas findByNameM(String masalaTitle) {
		// TODO Auto-generated method stub
		
		
		Masalas masala1=null;
		System.out.println(masalaTitle);
		List<Masalas> list = masalaDao.findAll();
		for(Masalas masala:list)
		{
			if(masala.getTitle().equalsIgnoreCase(masalaTitle))
			{
				System.out.println("In if");
				masala1=masala;
				System.out.println(masala1);
				break;
				
			}
			
		}
			return masala1;
		
	}



	@Override
	public void deleteMasala(String masalaTitle) {
		// TODO Auto-generated method stub

		Masalas masalaobj =findByNameM(masalaTitle);

		masalaDao.delete(masalaobj);

	}


	
	//for cake
	@Override
	public List<Cakes> getCakes() {
		// TODO Auto-generated method stub
		return cakeDao.findAll();
	}


	@Override
	public Cakes addCake(Cakes cake) {
		// TODO Auto-generated method stub
		cakeDao.save(cake);
		return cake;
		}


	@Override
	public Cakes updateCake(Cakes cake) {
		// TODO Auto-generated method stub
		String cakeTitle=cake.getTitle();
		Cakes cakeobj =findByNameC(cakeTitle);
	    	     

		cakeobj.setPrice(cake.getPrice());
		cakeobj.setDescription(cake.getDescription());
		cakeobj.setImage_path(cake.getImage_path());
		Cakes updatedCake = cakeDao.save(cakeobj);
	    	     return updatedCake;

	}
	
	private Cakes findByNameC(String cakeTitle) {
		// TODO Auto-generated method stub
		
		
		Cakes cake1=null;
		System.out.println(cakeTitle);
		List<Cakes> list = cakeDao.findAll();
		for(Cakes cake:list)
		{
			if(cake.getTitle().equalsIgnoreCase(cakeTitle))
			{
				System.out.println("In if");
				cake1=cake;
				System.out.println(cake1);
				break;
				
			}
			
		}
			return cake1;
		
	}



	@Override
	public void deleteCake(String cakeTitle) {
		// TODO Auto-generated method stub

		Cakes cakeobj =findByNameC(cakeTitle);

		cakeDao.delete(cakeobj);

	}


	//for beverage
	@Override
	public List<Beverages> getBeverages() {
		// TODO Auto-generated method stub
		return beverageDao.findAll();
	}


	@Override
	public Beverages addBeverage(Beverages beverage) {
		// TODO Auto-generated method stub
		beverageDao.save(beverage);
		return beverage;
	}


	@Override
	public Beverages updateBeverage(Beverages beverage) {
		// TODO Auto-generated method stub
		String beverageTitle=beverage.getTitle();
		Beverages beverageobj =findByNameB(beverageTitle);
	    	     

		beverageobj.setPrice(beverage.getPrice());
		beverageobj.setDescription(beverage.getDescription());
		beverageobj.setImage_path(beverage.getImage_path());
		Beverages updatedBeverage = beverageDao.save(beverageobj);
	    	     return updatedBeverage;

	}

	private Beverages findByNameB(String beverageTitle) {
		// TODO Auto-generated method stub
		
		
		Beverages beverage1=null;
		System.out.println(beverageTitle);
		List<Beverages> list = beverageDao.findAll();
		for(Beverages beverage:list)
		{
			if(beverage.getTitle().equalsIgnoreCase(beverageTitle))
			{
				System.out.println("In if");
				beverage1=beverage;
				System.out.println(beverage1);
				break;
				
			}
			
		}
			return beverage1;
		
	}



	@Override
	public void deleteBeverage(String beverageTitle) {
		// TODO Auto-generated method stub
		
		Beverages beverageobj =findByNameB(beverageTitle);

		beverageDao.delete(beverageobj);

	}


	
	
	//for beauty
	@Override
	public List<Beautys> getBeautys() {
		// TODO Auto-generated method stub
		return beautyDao.findAll();
	}


	@Override
	public Beautys addBeauty(Beautys beauty) {
		// TODO Auto-generated method stub
		beautyDao.save(beauty);
		return beauty;
	}


	@Override
	public Beautys updateBeauty(Beautys beauty) {
		// TODO Auto-generated method stub

		String beautyTitle=beauty.getTitle();
		Beautys beautyobj =findByNameBe(beautyTitle);
	    	     

		beautyobj.setPrice(beauty.getPrice());
		beautyobj.setDescription(beauty.getDescription());
		beautyobj.setImage_path(beauty.getImage_path());
		Beautys updatedBeauty = beautyDao.save(beautyobj);
	    	     return updatedBeauty;

	}

	private Beautys findByNameBe(String beautyTitle) {
		// TODO Auto-generated method stub
		
		
		Beautys beauty1=null;
		System.out.println(beautyTitle);
		List<Beautys> list = beautyDao.findAll();
		for(Beautys beauty:list)
		{
			if(beauty.getTitle().equalsIgnoreCase(beautyTitle))
			{
				System.out.println("In if");
				beauty1=beauty;
				System.out.println(beauty1);
				break;
				
			}
			
		}
			return beauty1;
		
	}



	@Override
	public void deleteBeauty(String beautyTitle) {
		// TODO Auto-generated method stub

		Beautys beautyobj =findByNameBe(beautyTitle);

		beautyDao.delete(beautyobj);

	}

	
	//for baby

	@Override
	public List<Babys> getBabys() {
		// TODO Auto-generated method stub
		return babyDao.findAll();
	}


	@Override
	public Babys addBaby(Babys baby) {
		// TODO Auto-generated method stub
		babyDao.save(baby);
		return baby;
	}


	@Override
	public Babys updateBaby(Babys baby) {
		// TODO Auto-generated method stub

		String babyTitle=baby.getTitle();
		Babys babyobj =findByNameBa(babyTitle);
	    	     

		babyobj.setPrice(baby.getPrice());
		babyobj.setDescription(baby.getDescription());
		babyobj.setImage_path(baby.getImage_path());
		Babys updatedBaby = babyDao.save(babyobj);
	    	     return updatedBaby;

	}

	private Babys findByNameBa(String babyTitle) {
		// TODO Auto-generated method stub
		
		
		Babys baby1=null;
		System.out.println(babyTitle);
		List<Babys> list = babyDao.findAll();
		for(Babys baby:list)
		{
			if(baby.getTitle().equalsIgnoreCase(babyTitle))
			{
				System.out.println("In if");
				baby1=baby;
				System.out.println(baby1);
				break;
				
			}
			
		}
			return baby1;
		
	}



	@Override
	public void deleteBaby(String babyTitle) {
		// TODO Auto-generated method stub

		Babys babyobj =findByNameBa(babyTitle);

		babyDao.delete(babyobj);

	}

}

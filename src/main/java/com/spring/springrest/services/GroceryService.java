package com.spring.springrest.services;

import java.util.List;

import com.spring.springrest.entities.Babys;
import com.spring.springrest.entities.Beautys;
import com.spring.springrest.entities.Beverages;
import com.spring.springrest.entities.Cakes;
import com.spring.springrest.entities.Fruits;
import com.spring.springrest.entities.Masalas;
import com.spring.springrest.entities.Nonvegs;
import com.spring.springrest.entities.Vegetables;

public interface GroceryService {

	public List<Fruits> getFruits();
	
	public Fruits getFruit(int fruitId);
	
	public Fruits addFruit(Fruits fruit);
	
	public Fruits updateFruit(Fruits fruit);
	
	public void deleteFruit(String fruitTitle);

	public List<Vegetables> getVegetables();

	public Vegetables addVegetable(Vegetables vegetable);

	public Vegetables updateVegetable(Vegetables vegetable);

	public void deleteVegetable(String vegetableTitle);

	public List<Nonvegs> getNonvegs();

	public Nonvegs addNonveg(Nonvegs nonveg);

	public Nonvegs updateNonveg(Nonvegs nonveg);

	public void deleteNonveg(String nonvegTitle);

	public List<Masalas> getMasalas();

	public Masalas addMasala(Masalas masala);

	public Masalas updateMasala(Masalas masala);

	public void deleteMasala(String masalaTitle);

	public List<Cakes> getCakes();

	public Cakes addCake(Cakes cake);

	public Cakes updateCake(Cakes cake);

	public void deleteCake(String cakeTitle);

	public List<Beverages> getBeverages();

	public Beverages addBeverage(Beverages beverage);

	public Beverages updateBeverage(Beverages beverage);

	public void deleteBeverage(String beverageTitle);

	public List<Beautys> getBeautys();

	public Beautys addBeauty(Beautys beauty);

	public Beautys updateBeauty(Beautys beauty);

	public void deleteBeauty(String beautyTitle);

	public List<Babys> getBabys();

	public Babys addBaby(Babys baby);

	public Babys updateBaby(Babys baby);

	public void deleteBaby(String babyTitle);
	
}

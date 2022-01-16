package com.spring.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.springrest.entities.Babys;
import com.spring.springrest.entities.Beautys;
import com.spring.springrest.entities.Beverages;
import com.spring.springrest.entities.Cakes;
import com.spring.springrest.entities.Fruits;
import com.spring.springrest.entities.Masalas;
import com.spring.springrest.entities.Nonvegs;
import com.spring.springrest.entities.Vegetables;
import com.spring.springrest.services.GroceryService;

@RestController
public class GroceryController {

	@Autowired
	private GroceryService groceryservice;
	
	//get fruits
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/fruits")
	public List<Fruits> getFruits()
	{
		
		return this.groceryservice.getFruits();
		
	}
	
	//get single fruit
	@GetMapping("/fruits/{fruitId}")
	public Fruits getFruit(@PathVariable String fruitId)
	{
		System.out.println("Fruit id-"+fruitId);
		Fruits a= this.groceryservice.getFruit(Integer.parseInt(fruitId));
		System.out.println("In controller-"+a);
		return a;
	}
	
	//add fruit
	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/fruits")
	public Fruits addFruit(@RequestBody Fruits fruit)
	{
		return this.groceryservice.addFruit(fruit);
	}
	
	//update existing fruit
	@CrossOrigin(origins = "http://localhost:3000")
	@PutMapping("/fruits")
	public Fruits updateFruit(@RequestBody Fruits fruit)
	{
		return this.groceryservice.updateFruit(fruit);
	}
	
	
	
	//delete fruit
	@CrossOrigin(origins = "http://localhost:3000")
	@DeleteMapping("/fruits/{fruitTitle}")
	public ResponseEntity<HttpStatus> deleteFruit(@PathVariable String fruitTitle)
	{
	
		try
		{
			this.groceryservice.deleteFruit(fruitTitle);
			return new ResponseEntity<>(HttpStatus.OK);
			
		}
		catch(Exception e)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);

		}
	}
	
	
	//for vegetables
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/vegetables")
	public List<Vegetables> getVegetables()
	{
		
		return this.groceryservice.getVegetables();
		
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/vegetables")
	public Vegetables addVegetable(@RequestBody Vegetables vegetable)
	{
		return this.groceryservice.addVegetable(vegetable);
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@PutMapping("/vegetables")
	public Vegetables updateVegetable(@RequestBody Vegetables vegetable)
	{
		return this.groceryservice.updateVegetable(vegetable);
	}
	
	
	@CrossOrigin(origins = "http://localhost:3000")
	@DeleteMapping("/vegetables/{vegetableTitle}")
	public ResponseEntity<HttpStatus> deleteVegetable(@PathVariable String vegetableTitle)
	{
	
		try
		{
			this.groceryservice.deleteVegetable(vegetableTitle);
			return new ResponseEntity<>(HttpStatus.OK);
			
		}
		catch(Exception e)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);

		}
	}


	//for nonveg
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/nonvegs")
	public List<Nonvegs> getNonvegs()
	{
		
		return this.groceryservice.getNonvegs();
		
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/nonvegs")
	public Nonvegs addNonveg(@RequestBody Nonvegs nonveg)
	{
		return this.groceryservice.addNonveg(nonveg);
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@PutMapping("/nonvegs")
	public Nonvegs updateNonveg(@RequestBody Nonvegs nonveg)
	{
		return this.groceryservice.updateNonveg(nonveg);
	}
	
	
	@CrossOrigin(origins = "http://localhost:3000")
	@DeleteMapping("/nonvegs/{nonvegTitle}")
	public ResponseEntity<HttpStatus> deleteNonveg(@PathVariable String nonvegTitle)
	{
	
		try
		{
			this.groceryservice.deleteNonveg(nonvegTitle);
			return new ResponseEntity<>(HttpStatus.OK);
			
		}
		catch(Exception e)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);

		}
	}

	
	//for masalas
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/masalas")
	public List<Masalas> getMasalas()
	{
		
		return this.groceryservice.getMasalas();
		
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/masalas")
	public Masalas addMasala(@RequestBody Masalas masala)
	{
		return this.groceryservice.addMasala(masala);
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@PutMapping("/masalas")
	public Masalas updateMasala(@RequestBody Masalas masala)
	{
		return this.groceryservice.updateMasala(masala);
	}
	
	
	@CrossOrigin(origins = "http://localhost:3000")
	@DeleteMapping("/masalas/{masalaTitle}")
	public ResponseEntity<HttpStatus> deleteMasala(@PathVariable String masalaTitle)
	{
	
		try
		{
			this.groceryservice.deleteMasala(masalaTitle);
			return new ResponseEntity<>(HttpStatus.OK);
			
		}
		catch(Exception e)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);

		}
	}
	
	//for cakes
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/cakes")
	public List<Cakes> getCakes()
	{
		
		return this.groceryservice.getCakes();
		
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/cakes")
	public Cakes addCake(@RequestBody Cakes cake)
	{
		return this.groceryservice.addCake(cake);
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@PutMapping("/cakes")
	public Cakes updateCake(@RequestBody Cakes cake)
	{
		return this.groceryservice.updateCake(cake);
	}
	
	
	@CrossOrigin(origins = "http://localhost:3000")
	@DeleteMapping("/cakes/{cakeTitle}")
	public ResponseEntity<HttpStatus> deleteCake(@PathVariable String cakeTitle)
	{
	
		try
		{
			this.groceryservice.deleteCake(cakeTitle);
			return new ResponseEntity<>(HttpStatus.OK);
			
		}
		catch(Exception e)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);

		}
	}
				

//for beverages
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/beverages")
	public List<Beverages> getBeverages()
	{
		
		return this.groceryservice.getBeverages();
		
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/beverages")
	public Beverages addBeverage(@RequestBody Beverages beverage)
	{
		return this.groceryservice.addBeverage(beverage);
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@PutMapping("/beverages")
	public Beverages updateBeverage(@RequestBody Beverages beverage)
	{
		return this.groceryservice.updateBeverage(beverage);
	}
	
	
	@CrossOrigin(origins = "http://localhost:3000")
	@DeleteMapping("/beverages/{beverageTitle}")
	public ResponseEntity<HttpStatus> deleteBeverage(@PathVariable String beverageTitle)
	{
	
		try
		{
			this.groceryservice.deleteBeverage(beverageTitle);
			return new ResponseEntity<>(HttpStatus.OK);
			
		}
		catch(Exception e)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);

		}
	}
			
	//for beauty
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/beautys")
	public List<Beautys> getBeautys()
	{
		
		return this.groceryservice.getBeautys();
		
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/beautys")
	public Beautys addBeauty(@RequestBody Beautys beauty)
	{
		return this.groceryservice.addBeauty(beauty);
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@PutMapping("/beautys")
	public Beautys updateBeauty(@RequestBody Beautys beauty)
	{
		return this.groceryservice.updateBeauty(beauty);
	}
	
	
	@CrossOrigin(origins = "http://localhost:3000")
	@DeleteMapping("/beautys/{beautyTitle}")
	public ResponseEntity<HttpStatus> deleteBeauty(@PathVariable String beautyTitle)
	{
	
		try
		{
			this.groceryservice.deleteBeauty(beautyTitle);
			return new ResponseEntity<>(HttpStatus.OK);
			
		}
		catch(Exception e)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);

		}
	}
		
	//for baby

	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/babys")
	public List<Babys> getBabys()
	{
		
		return this.groceryservice.getBabys();
		
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/babys")
	public Babys addBaby(@RequestBody Babys baby)
	{
		return this.groceryservice.addBaby(baby);
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@PutMapping("/babys")
	public Babys updateBaby(@RequestBody Babys baby)
	{
		return this.groceryservice.updateBaby(baby);
	}
	
	
	@CrossOrigin(origins = "http://localhost:3000")
	@DeleteMapping("/babys/{babyTitle}")
	public ResponseEntity<HttpStatus> deleteBaby(@PathVariable String babyTitle)
	{
	
		try
		{
			this.groceryservice.deleteBaby(babyTitle);
			return new ResponseEntity<>(HttpStatus.OK);
			
		}
		catch(Exception e)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);

		}
	}






	
	
}

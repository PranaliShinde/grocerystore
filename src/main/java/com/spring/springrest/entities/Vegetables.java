package com.spring.springrest.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vegetables {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private float price;
	
	@Column(unique=true)
	private String title;
	
	private String description,image_path;
	
	
	public Vegetables(int id, float price, String title, String description, String image_path) {
		super();
		this.id = id;
		this.price = price;
		this.title = title;
		this.description = description;
		this.image_path = image_path;
	}
	public Vegetables() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImage_path() {
		return image_path;
	}
	public void setImage_path(String image_path) {
		this.image_path = image_path;
	}
	@Override
	public String toString() {
		return "Vegetables [id=" + id + ", price=" + price + ", title=" + title + ", description=" + description
				+ ", image_path=" + image_path + "]";
	}
	
}

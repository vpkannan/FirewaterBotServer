/**
 * 
 */
package com.firewaterbot.server.entity;

import java.io.File;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Vignesh
 *
 */
@Document(collection = "drink")
public class Drink {

	private String name;
	private File picture;
	private List<Ingredient> ingredients;

	public Drink(String name, File picture, List<Ingredient> ingredients) {
		this.name = name;
		this.picture = picture;
		this.ingredients = ingredients;
	}

	public Drink(String name, List<Ingredient> ingredients) {
		this.name = name;
		this.ingredients = ingredients;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public File getPicture() {
		return picture;
	}

	public void setPicture(File picture) {
		this.picture = picture;
	}

	public List<Ingredient> getIngredients() {
		return ingredients;
	}

	public void setIngredients(List<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}

}

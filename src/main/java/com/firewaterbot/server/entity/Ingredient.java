/**
 * 
 */
package com.firewaterbot.server.entity;

import java.io.File;

/**
 * @author Vignesh
 *
 */
public class Ingredient {

	private BaseDrink baseDrink;
	private File picture;
	private Double Quantity;

	public Ingredient(BaseDrink baseDrink, File picture, Double quantity) {
		this.baseDrink = baseDrink;
		this.picture = picture;
		Quantity = quantity;
	}

	public Ingredient(BaseDrink baseDrink, Double quantity) {
		this.baseDrink = baseDrink;
		Quantity = quantity;
	}

	public BaseDrink getBaseDrink() {
		return baseDrink;
	}

	public void setBaseDrink(BaseDrink baseDrink) {
		this.baseDrink = baseDrink;
	}

	public File getPicture() {
		return picture;
	}

	public void setPicture(File picture) {
		this.picture = picture;
	}

	public Double getQuantity() {
		return Quantity;
	}

	public void setQuantity(Double quantity) {
		Quantity = quantity;
	}

}

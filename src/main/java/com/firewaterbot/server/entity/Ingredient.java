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

	private int id;
	private BaseDrink baseDrink;
	private File picture;
	private float Quantity;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public float getQuantity() {
		return Quantity;
	}

	public void setQuantity(float quantity) {
		Quantity = quantity;
	}

}

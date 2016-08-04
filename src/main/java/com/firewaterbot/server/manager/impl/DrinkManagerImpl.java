/**
 * 
 */
package com.firewaterbot.server.manager.impl;

import java.util.List;
import java.util.Map;

import com.firewaterbot.server.entity.BaseDrink;
import com.firewaterbot.server.entity.Drink;
import com.firewaterbot.server.entity.Tap;
import com.firewaterbot.server.manager.DrinkManager;

/**
 * @author Vignesh
 *
 */
public class DrinkManagerImpl implements DrinkManager {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.firewaterbot.server.manager.DrinkManager#sendRecipeToVendingMachine(
	 * java.lang.String)
	 */
	public Map<Tap, Float> sendRecipeToVendingMachine(String drinkName) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.firewaterbot.server.manager.DrinkManager#addNewDrinkRecipe(com.
	 * firewaterbot.server.entity.Drink)
	 */
	public boolean addNewDrinkRecipe(Drink drink) {
		
		return false;
	}

	public Drink getDrinkRecipe(String drinkName) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.firewaterbot.server.manager.DrinkManager#getDrinksByBaseDrinks(com.
	 * firewaterbot.server.entity.BaseDrink)
	 */
	public List<Drink> getDrinksByBaseDrinks(BaseDrink baseDrink) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.firewaterbot.server.manager.DrinkManager#getDrinksByAvailableTaps()
	 */
	public List<Drink> getDrinksByAvailableTaps() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.firewaterbot.server.manager.DrinkManager#setCupCapacity(float)
	 */
	public boolean setCupCapacity(float cupCapacity) {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.firewaterbot.server.manager.DrinkManager#getCupCapacity()
	 */
	public float getCupCapacity() {
		// TODO Auto-generated method stub
		return 0;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.firewaterbot.server.manager.DrinkManager#calculateDispensingQuantity(
	 * float)
	 */
	public float calculateDispensingQuantity(float percentageOfDrink) {
		// TODO Auto-generated method stub
		return 0;
	}

}

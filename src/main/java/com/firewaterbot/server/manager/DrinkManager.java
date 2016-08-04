/**
 * 
 */
package com.firewaterbot.server.manager;

import java.util.List;
import java.util.Map;

import com.firewaterbot.server.entity.BaseDrink;
import com.firewaterbot.server.entity.Drink;
import com.firewaterbot.server.entity.Tap;

/**
 * @author Vignesh
 *
 */
public interface DrinkManager {

	Map<Tap, Float> sendRecipeToVendingMachine(String drinkName);

	boolean addNewDrinkRecipe(Drink drink);
	
	Drink getDrinkRecipe(String drinkName);

	List<Drink> getDrinksByBaseDrinks(BaseDrink baseDrink);

	List<Drink> getDrinksByAvailableTaps();

	boolean setCupCapacity(float cupCapacity);

	float getCupCapacity();

	float calculateDispensingQuantity(float percentageOfDrink);

}

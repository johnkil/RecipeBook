package com.devspark.recipebook.data;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author e.shishkin
 *
 */
public class Data {
	
	public static List<Recipe> snacks;
	public static List<Recipe> salads;
	public static List<Recipe> first;
	public static List<Recipe> second;
	public static List<Recipe> desserts;
	public static List<Recipe> beverages;
	
	public static void onInit() {
		setupSnacks();
		setupSalads();
		setupFirst();
		setupSecond();
		setupDesserts();
		setupBeverages();
	}
	
	private static void setupSnacks() {
		snacks = new ArrayList<Recipe>();
		snacks.add(new Recipe("Закуска «Дракончики»", 1));
		snacks.add(new Recipe("Тарталетки «Котята»", 2));
		snacks.add(new Recipe("Закуска «Морская раковина»", 3));
		snacks.add(new Recipe("Профитроли с тремя вариантами начинки", 4));
		snacks.add(new Recipe("Сырники с вишневым соусом", 5));
		snacks.add(new Recipe("Заливные яйца", 6));
		snacks.add(new Recipe("Фаршированные яйца", 7));
		snacks.add(new Recipe("Гнездышки «Пасхальные»", 8));
		snacks.add(new Recipe("Закуска «Новогодняя»", 9));
		snacks.add(new Recipe("Фаршированные булочки", 10));
		snacks.add(new Recipe("Фаршированные черри", 11));
		snacks.add(new Recipe("Горячие бутерброды с окороком, помидорами и яйцами", 12));
		snacks.add(new Recipe("Малосольные огурцы без рассола", 13));
		snacks.add(new Recipe("Гавайские тостики", 14));
		snacks.add(new Recipe("Заливное мясо", 15));
		snacks.add(new Recipe("Помидоры заливные", 16));
		snacks.add(new Recipe("Рулетики из лаваша с семгой и ветчиной", 17));
		snacks.add(new Recipe("Омлет с ветчиной и помидорами", 18));
		snacks.add(new Recipe("Рулетики из форели с огурцами и сливочным сыром", 19));
		snacks.add(new Recipe("Перец, фаршированный сыром и яйцами", 20));
	}
	
	private static void setupSalads() {
		salads = new ArrayList<Recipe>();
		salads.add(new Recipe("Закуска «Дракончики»", 1));
		salads.add(new Recipe("Тарталетки «Котята»", 2));
		salads.add(new Recipe("Закуска «Морская раковина»", 3));
		salads.add(new Recipe("Профитроли с тремя вариантами начинки", 4));
		salads.add(new Recipe("Сырники с вишневым соусом", 5));
		salads.add(new Recipe("Заливные яйца", 6));
		salads.add(new Recipe("Фаршированные яйца", 7));
		salads.add(new Recipe("Гнездышки «Пасхальные»", 8));
		salads.add(new Recipe("Закуска «Новогодняя»", 9));
		salads.add(new Recipe("Фаршированные булочки", 10));
		salads.add(new Recipe("Фаршированные черри", 11));
		salads.add(new Recipe("Горячие бутерброды с окороком, помидорами и яйцами", 12));
		salads.add(new Recipe("Малосольные огурцы без рассола", 13));
		salads.add(new Recipe("Гавайские тостики", 14));
		salads.add(new Recipe("Заливное мясо", 15));
		salads.add(new Recipe("Помидоры заливные", 16));
		salads.add(new Recipe("Рулетики из лаваша с семгой и ветчиной", 17));
		salads.add(new Recipe("Омлет с ветчиной и помидорами", 18));
		salads.add(new Recipe("Рулетики из форели с огурцами и сливочным сыром", 19));
		salads.add(new Recipe("Перец, фаршированный сыром и яйцами", 20));
	}
	
	private static void setupFirst() {
		first = new ArrayList<Recipe>();
		first.add(new Recipe("Закуска «Дракончики»", 1));
		first.add(new Recipe("Тарталетки «Котята»", 2));
		first.add(new Recipe("Закуска «Морская раковина»", 3));
		first.add(new Recipe("Профитроли с тремя вариантами начинки", 4));
		first.add(new Recipe("Сырники с вишневым соусом", 5));
		first.add(new Recipe("Заливные яйца", 6));
		first.add(new Recipe("Фаршированные яйца", 7));
		first.add(new Recipe("Гнездышки «Пасхальные»", 8));
		first.add(new Recipe("Закуска «Новогодняя»", 9));
		first.add(new Recipe("Фаршированные булочки", 10));
		first.add(new Recipe("Фаршированные черри", 11));
		first.add(new Recipe("Горячие бутерброды с окороком, помидорами и яйцами", 12));
		first.add(new Recipe("Малосольные огурцы без рассола", 13));
		first.add(new Recipe("Гавайские тостики", 14));
		first.add(new Recipe("Заливное мясо", 15));
		first.add(new Recipe("Помидоры заливные", 16));
		first.add(new Recipe("Рулетики из лаваша с семгой и ветчиной", 17));
		first.add(new Recipe("Омлет с ветчиной и помидорами", 18));
		first.add(new Recipe("Рулетики из форели с огурцами и сливочным сыром", 19));
		first.add(new Recipe("Перец, фаршированный сыром и яйцами", 20));
	}
	
	private static void setupSecond() {
		second = new ArrayList<Recipe>();
		second.add(new Recipe("Закуска «Дракончики»", 1));
		second.add(new Recipe("Тарталетки «Котята»", 2));
		second.add(new Recipe("Закуска «Морская раковина»", 3));
		second.add(new Recipe("Профитроли с тремя вариантами начинки", 4));
		second.add(new Recipe("Сырники с вишневым соусом", 5));
		second.add(new Recipe("Заливные яйца", 6));
		second.add(new Recipe("Фаршированные яйца", 7));
		second.add(new Recipe("Гнездышки «Пасхальные»", 8));
		second.add(new Recipe("Закуска «Новогодняя»", 9));
		second.add(new Recipe("Фаршированные булочки", 10));
		second.add(new Recipe("Фаршированные черри", 11));
		second.add(new Recipe("Горячие бутерброды с окороком, помидорами и яйцами", 12));
		second.add(new Recipe("Малосольные огурцы без рассола", 13));
		second.add(new Recipe("Гавайские тостики", 14));
		second.add(new Recipe("Заливное мясо", 15));
		second.add(new Recipe("Помидоры заливные", 16));
		second.add(new Recipe("Рулетики из лаваша с семгой и ветчиной", 17));
		second.add(new Recipe("Омлет с ветчиной и помидорами", 18));
		second.add(new Recipe("Рулетики из форели с огурцами и сливочным сыром", 19));
		second.add(new Recipe("Перец, фаршированный сыром и яйцами", 20));
	}
	
	private static void setupDesserts() {
		desserts = new ArrayList<Recipe>();
		desserts.add(new Recipe("Закуска «Дракончики»", 1));
		desserts.add(new Recipe("Тарталетки «Котята»", 2));
		desserts.add(new Recipe("Закуска «Морская раковина»", 3));
		desserts.add(new Recipe("Профитроли с тремя вариантами начинки", 4));
		desserts.add(new Recipe("Сырники с вишневым соусом", 5));
		desserts.add(new Recipe("Заливные яйца", 6));
		desserts.add(new Recipe("Фаршированные яйца", 7));
		desserts.add(new Recipe("Гнездышки «Пасхальные»", 8));
		desserts.add(new Recipe("Закуска «Новогодняя»", 9));
		desserts.add(new Recipe("Фаршированные булочки", 10));
		desserts.add(new Recipe("Фаршированные черри", 11));
		desserts.add(new Recipe("Горячие бутерброды с окороком, помидорами и яйцами", 12));
		desserts.add(new Recipe("Малосольные огурцы без рассола", 13));
		desserts.add(new Recipe("Гавайские тостики", 14));
		desserts.add(new Recipe("Заливное мясо", 15));
		desserts.add(new Recipe("Помидоры заливные", 16));
		desserts.add(new Recipe("Рулетики из лаваша с семгой и ветчиной", 17));
		desserts.add(new Recipe("Омлет с ветчиной и помидорами", 18));
		desserts.add(new Recipe("Рулетики из форели с огурцами и сливочным сыром", 19));
		desserts.add(new Recipe("Перец, фаршированный сыром и яйцами", 20));
	}
	
	private static void setupBeverages() {
		beverages = new ArrayList<Recipe>();
		beverages.add(new Recipe("Закуска «Дракончики»", 1));
		beverages.add(new Recipe("Тарталетки «Котята»", 2));
		beverages.add(new Recipe("Закуска «Морская раковина»", 3));
		beverages.add(new Recipe("Профитроли с тремя вариантами начинки", 4));
		beverages.add(new Recipe("Сырники с вишневым соусом", 5));
		beverages.add(new Recipe("Заливные яйца", 6));
		beverages.add(new Recipe("Фаршированные яйца", 7));
		beverages.add(new Recipe("Гнездышки «Пасхальные»", 8));
		beverages.add(new Recipe("Закуска «Новогодняя»", 9));
		beverages.add(new Recipe("Фаршированные булочки", 10));
	}

}

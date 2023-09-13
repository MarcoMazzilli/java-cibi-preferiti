package org.lessons.java.array;

public class CibiPreferiti {
	public static void main(String[] args) {
		
		String[] arrayFavouriteFood = {"pizza","pasta al forno","verdure","legumi","formaggi","pesce"};
		
		System.out.println("Lunghezza della stringa (" + arrayFavouriteFood.length+")");
		
		System.out.println("Cibo top (" + arrayFavouriteFood[0].toUpperCase() +")" );
		
		System.out.println("Qualcosa che non mi fa impazzire (" + arrayFavouriteFood[arrayFavouriteFood.length - 1] + ")" ); 
		
		System.out.println("Cibo di mezza classifica (" + arrayFavouriteFood[(arrayFavouriteFood.length - 1)/2] + ")" );

	}
}

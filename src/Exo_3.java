import java.util.Random;

public class Exo_3 {
	
	public static void main(String[] args) {
		/*
		 * Exo 3 : Ecrire dans un tableau 20 entiers au hasard inférieur à 100
		   et afficher tous les nombres pairs.

		 */
		
		int[] numbers = new int[20];
		
		
        Random rand = new Random();
        
        
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100);
        }
        
        System.out.println("Les nombres pairs sont :");
        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
            }
        }
		
	}

}

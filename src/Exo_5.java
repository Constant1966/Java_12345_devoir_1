
public class Exo_5 {
	public static void main(String[] args) {
		/*
		 *  Exo 5 : Écrivez une méthode qui prend un nombre en argument et
			affiche sa table de multiplication jusqu’à 10. (input : 5 => sortie
			prévue: 5 x 1 = 5 …)

		 */
		
		 int number2 = 5;
	        printMultiplicationTable(number2);
	    }

	    private static void printMultiplicationTable(int num) {
	        for (int i = 1; i <= 10; i++) {
	            System.out.println(num + " x " + i + " = " + (num * i));
	        }
		
	}

}

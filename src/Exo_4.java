
public class Exo_4 {
	public static void main(String[] args) {
		/*
		 *  Exo 4 : Écrivez une méthode qui affiche le plus grand et le plus
			petit entier dans un tableau. Afficher un message d’erreur si la
			longueur du tableau n’est pas supérieure ou égale à 2.

		 */
		
		 int[] numbers = {50, -4, 10, 15, 20, 25, -23};
	        printMinMax(numbers);
	    }

	    public static void printMinMax(int[] val) {
	        if (val.length < 2) {
	            System.out.println("Erreur : la longueur du tableau doit être supérieure ou égale à 2.");
	            return;
	        }
	        int min = val[0];
	        int max = val[0];
	        for (int i = 1; i < val.length; i++) {
	            if (val[i] < min) {
	                min = val[i];
	            }
	            if (val[i] > max) {
	                max = val[i];
	            }
	        }
	        System.out.println("Le plus petit entier est : " + min);
	        System.out.println("Le plus grand entier est : " + max);
		
	}
	

}

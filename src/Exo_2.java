
public class Exo_2 {

	public static void main(String[] args) {
		/*  Exo 2 : Imprimer votre nom 400 fois sur l’écran : 100 fois en
			minuscule, 100 fois en majuscule et 100 en minuscule excepté le
			premier caractère de chaque mot, 100 fois en majuscule excepté le
			premier caractère de chaque mot.

		*/
		
	
	        String name = "constant lorvenson";
	        for (int i = 0; i < 100; i++) {
	            System.out.println(name.toLowerCase() + " ");
	        }
	        
	        System.out.println();
	        for (int i = 0; i < 100; i++) {
	            System.out.println(name.toUpperCase() + " ");
	        }
	        
	        System.out.println();
	        
	        for (int i = 0; i < 100; i++) {
	            String[] words = name.split(" ");
	            String modifiedName = "";
	            for (String word : words) {
	                modifiedName += word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase() + " ";
	            }
	            System.out.println(modifiedName.trim() + " ");
	        }
	        
	        System.out.println();
	        for (int i = 0; i < 100; i++) {
	            String[] words = name.split(" ");
	            String modifiedName = "";
	            for (String word : words) {
	                modifiedName += word.substring(0, 1).toLowerCase() + word.substring(1).toUpperCase() + " ";
	            }
	            System.out.println(modifiedName.trim() + " ");
	        }
	    }
}





import java.util.Random;
import java.util.Scanner;

public class Exo_1 {

	public static void main(String[] args) {
		
		// Exo 1 : Déclarer un tableau string de dimension 20. Remplissez le
		// tableau avec 20 noms que l’utilisateur fournira.

		String[] tableau = new String[20];
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Entrez 20 noms:");
		for (int i = 0; i < 20; i++) {
			System.out.printf("Entrez noms %d:\n", i+1);
			String inputUser = userInput.nextLine();
			
			tableau[i] = inputUser;
			
		}
		
		System.out.println();
		for (String val : tableau) {
			System.out.println(val);
		}

		userInput.close();
		
		
		
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
        
        
        
        
        /*
		 *  Exo 4 : Écrivez une méthode qui affiche le plus grand et le plus
			petit entier dans un tableau. Afficher un message d’erreur si la
			longueur du tableau n’est pas supérieure ou égale à 2.

		 */
		
		 int[] nombre = {50, -4, 10, 15, 20, 25, -23};
	        printMinMax(nombre);
        
		
	        
        /*
		 *  Exo 5 : Écrivez une méthode qui prend un nombre en argument et
			affiche sa table de multiplication jusqu’à 10. (input : 5 => sortie
			prévue: 5 x 1 = 5 …)

		 */
		
		 int number2 = 5;
	        printMultiplicationTable(number2);
		        
		        
		        
		        
		        
        /*
		 * 	Exo 6 : Écrivez une méthode qui prend une chaîne en argument et
			renvoie true s'il s'agit d'un palindrome et false dans le ca contraire.
			Un palindrome est une séquence de caractères qui se lit de la
			même manière vers l'avant et vers l'arrière.

		 */
		
		String str = "radar";
        boolean isPalindrome = checkPalindrome(str);
        System.out.println("La chaîne \"" + str + "\" est un palindrome : " + isPalindrome);

        
        
        /*
		 * 	Exo7 : Ecrire un programme qui affiche un menu qui donne le choix
			(1. Jouer et 2. Quittez, chaque choix sur une ligne) dans une boucle
			infinie. Si l'utilisateur choisit 1 (jouer), appelle la méthode
			devinerNombre 5 fois.
			devinerNombre :
			● Choisissez un nombre aléatoire entre [0 et 100].
			● Demandez à l'utilisateur de deviner quel nombre l'ordinateur
			a choisi.
			● Affichez un message indiquant que le nombre choisi par
			l'ordinateur est supérieur ou inférieur à la supposition de
			l'utilisateur.
			● Si le nombre que l'utilisateur est égal à celui que l'ordinateur
			a choisi, le programme doit s'arrêter et afficher un message de réussite.
		 */
		
		
		Scanner input = new Scanner(System.in);
		
        Random rand1 = new Random();
        while (true) {
            System.out.println("Menu :");
            System.out.println("1. Jouer");
            System.out.println("2. Quitter");
            int choice = input.nextInt();
            
            
            if (choice == 1) {
                for (int i = 0; i < 5; i++) {
                    devinerNombre(rand1.nextInt(101), input);
                }
            } else if (choice == 2) {
            	System.out.println("Au revoir!!!");
                break;
            } else {
                System.out.println("Choix invalide. Veuillez choisir 1 ou 2.");
            }
        }
        
        
        
	}
	
	
	
	
	
	private static void printMinMax(int[] val) {
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
	
	 private static void printMultiplicationTable(int num) {
	        for (int i = 1; i <= 10; i++) {
	            System.out.println(num + " x " + i + " = " + (num * i));
	        }
		
	}
	
	
	
	 private static boolean checkPalindrome(String str) {
	        int n = str.length();
	        for (int i = 0; i < n/2; i++) {
	            if (str.charAt(i) != str.charAt(n-i-1)) {
	                return false;
	            }
	        }
	        return true;
		}
	
	
	
	
	
	 private static void devinerNombre(int secretNumber, Scanner input) {
	        int guess;
	        do {
	            System.out.print("Devinez le nombre entre 0 et 100 : ");
	            guess = input.nextInt();
	            if (guess < secretNumber) {
	                System.out.println("Le nombre choisi est supérieur.");
	            } else if (guess > secretNumber) {
	                System.out.println("Le nombre choisi est inférieur.");
	            } else {
	                System.out.println("Bravo, vous avez deviné le nombre !");
	                break;
	            }
	        } while (guess != secretNumber);
			
		}
	
	
	
	
	
	
	

}

import java.util.Random;
import java.util.Scanner;

public class Exo_7 {
	public static void main(String[] args) {
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
		
        Random rand = new Random();
        while (true) {
            System.out.println("Menu :");
            System.out.println("1. Jouer");
            System.out.println("2. Quitter");
            int choice = input.nextInt();
            
            
            if (choice == 1) {
                for (int i = 0; i < 5; i++) {
                    devinerNombre(rand.nextInt(101), input);
                }
            } else if (choice == 2) {
            	System.out.println("Au revoir!!!");
                break;
            } else {
                System.out.println("Choix invalide. Veuillez choisir 1 ou 2.");
            }
        }
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


public class Exo_6 {

	public static void main(String[] args) {
		/*
		 * 	Exo 6 : Écrivez une méthode qui prend une chaîne en argument et
			renvoie true s'il s'agit d'un palindrome et false dans le ca contraire.
			Un palindrome est une séquence de caractères qui se lit de la
			même manière vers l'avant et vers l'arrière.

		 */
		
		String str = "radar";
        boolean isPalindrome = checkPalindrome(str);
        System.out.println("La chaîne \"" + str + "\" est un palindrome : " + isPalindrome);
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

}

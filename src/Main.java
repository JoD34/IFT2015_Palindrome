public class Main {
    public static void main(String[] args) {
        /*
         * Création des variables tests
         */
        String p = "patate";
        String q = "ana";
        String r = "qwere";
        String s = "qrelle";
        /*
         * Tester pour la fonction checker
         */
        System.out.println("Tests pour la fonction 'checker':");
        System.out.println(p + " -> " + Palindrome.checker(p));
        System.out.println(q + " -> " + Palindrome.checker(q));
        System.out.println(s + " -> " + Palindrome.checker(s)+"\n");
        /*
          Tester pour la fonction checker_recursive
         */
        System.out.println("Tests pour la fonction 'checker_recursive':");
        System.out.println(p + " -> " + Palindrome.checker_recursive(p));
        System.out.println(q + " -> " + Palindrome.checker_recursive(q));
        System.out.println(s + " -> " + Palindrome.checker_recursive(s)+"\n");
        /*
         * Tester pour la fonction reverse
         */
        System.out.println("Tests pour la fonction 'reverse':");
        System.out.println(p + " -> " + Palindrome.reverse(p));
        System.out.println(q + " -> " + Palindrome.reverse(q));
        System.out.println(s + " -> " + Palindrome.reverse(s)+"\n");
        /*
         * Tester pour la fonction transforme_palindrome
         */
        System.out.println("Tests pour la fonction 'transforme_palindrome':");
        System.out.println(p + " -> " + Palindrome.transforme_palindrome(p));
        System.out.println(q + " -> " + Palindrome.transforme_palindrome(q));
        System.out.println(s + " -> " + Palindrome.transforme_palindrome(s)+"\n");
        /*
         * Tester pour la fonction transforme_palindrome_compacte
         */
        System.out.println("Tests pour la fonction 'transforme_palindrome_compacte':");
        System.out.println(r + " -> " + Palindrome.transforme_palindrome_compacte(r));
        System.out.println(p + " -> " + Palindrome.transforme_palindrome_compacte(p));
        System.out.println(q + " -> " + Palindrome.transforme_palindrome_compacte(q));
        System.out.println(s + " -> " + Palindrome.transforme_palindrome_compacte(s));
    }
}
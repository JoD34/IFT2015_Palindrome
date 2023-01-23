public class Main {
    public static void main(String[] args) {
        Palindrome pal = new Palindrome();
        /**
         * Création des variables tests
         */
        String p = "patate";
        String q = "ana";
        String r = "qwere";
        String s = "qrelle";
        /**
         * Tester pour la fonction checker
         */
        System.out.println("Tests pour la fonction 'checker':");
        System.out.println(p + " -> " + pal.checker(p));
        System.out.println(q + " -> " +pal.checker(q));
        System.out.println(s + " -> " +pal.checker(s)+"\n");
        /**
         * Tester pour la fonction checker_recursive
         */
        System.out.println("Tests pour la fonction 'checker_recursive':");
        System.out.println(p + " -> " +pal.checker_recursive(p));
        System.out.println(q + " -> " +pal.checker_recursive(q));
        System.out.println(s + " -> " +pal.checker_recursive(s)+"\n");
        /**
         * Tester pour la fonction reverse
         */
        System.out.println("Tests pour la fonction 'reverse':");
        System.out.println(p + " -> " +pal.reverse(p));
        System.out.println(q + " -> " +pal.reverse(q));
        System.out.println(s + " -> " +pal.reverse(s)+"\n");
        /**
         * Tester pour la fonction transforme_palindrome
         */
        System.out.println("Tests pour la fonction 'transforme_palindrome':");
        System.out.println(p + " -> " +pal.transforme_palindrome(p));
        System.out.println(q + " -> " +pal.transforme_palindrome(q));
        System.out.println(s + " -> " +pal.transforme_palindrome(s)+"\n");
        /**
         * Tester pour la fonction transforme_palindrome_compacte
         */
        System.out.println("Tests pour la fonction 'transforme_palindrome_compacte':");
        System.out.println(r + " -> " +pal.transforme_palindrome_compacte(r));
        System.out.println(p + " -> " +pal.transforme_palindrome_compacte(p));
        System.out.println(q + " -> " +pal.transforme_palindrome_compacte(q));
        System.out.println(s + " -> " +pal.transforme_palindrome_compacte(s));
    }
}
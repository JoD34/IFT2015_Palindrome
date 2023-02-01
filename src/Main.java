
public class Main {
    public static void main(String[] args) {
        /*
         * Création des variables tests
         */
        String p = "patate";
        String q = "ana";
        String r = "qwere";
        String s = "qrelle";
        String t = "esope reste ici et se repose";
        String u = "Bonjour ami";
        String v = "abc cac c";
        /*
         * Tester pour la fonction checker
         */
        System.out.println("Tests pour la fonction 'checker':");
        System.out.println(p + " -> " + Palindrome.checker(p));
        System.out.println(q + " -> " + Palindrome.checker(q));
        System.out.println(s + " -> " + Palindrome.checker(s));
        System.out.println(t + " -> " + Palindrome.checker(t));
        System.out.println(u + " -> " + Palindrome.checker(u));
        System.out.println(v + " -> " + Palindrome.checker(v)+"\n");
        /*
          Tester pour la fonction checker_recursive
         */
        System.out.println("Tests pour la fonction 'checker_recursive':");
        System.out.println(p + " -> " + Palindrome.checker_recursive(p));
        System.out.println(q + " -> " + Palindrome.checker_recursive(q));
        System.out.println(s + " -> " + Palindrome.checker_recursive(s));
        System.out.println(t + " -> " + Palindrome.checker_recursive(t));
        System.out.println(u + " -> " + Palindrome.checker_recursive(u));
        System.out.println(v + " -> " + Palindrome.checker_recursive(v)+"\n");
        /*
         * Tester pour la fonction reverse
         */
        System.out.println("Tests pour la fonction 'reverse':");
        System.out.println(p + " -> " + Palindrome.reverse(p));
        System.out.println(q + " -> " + Palindrome.reverse(q));
        System.out.println(s + " -> " + Palindrome.reverse(s));
        System.out.println(t + " -> " + Palindrome.reverse(t));
        System.out.println(u + " -> " + Palindrome.reverse(u));
        System.out.println(v + " -> " + Palindrome.reverse(v)+"\n");
        /*
         * Tester pour la fonction transforme_palindrome
         */
        System.out.println("Tests pour la fonction 'transforme_palindrome':");
        System.out.println(p + " -> " + Palindrome.transforme_palindrome(p));
        System.out.println(q + " -> " + Palindrome.transforme_palindrome(q));
        System.out.println(s + " -> " + Palindrome.transforme_palindrome(s));
        System.out.println(t + " -> " + Palindrome.transforme_palindrome(t));
        System.out.println(u + " -> " + Palindrome.transforme_palindrome(u));
        System.out.println(v + " -> " + Palindrome.transforme_palindrome(v)+"\n");
        /*
         * Tester pour la fonction transforme_palindrome_compacte
         */
        System.out.println("Tests pour la fonction 'transforme_palindrome_compacte':");
        System.out.println(r + " -> " + Palindrome.transforme_palindrome_compacte(r));
        System.out.println(p + " -> " + Palindrome.transforme_palindrome_compacte(p));
        System.out.println(q + " -> " + Palindrome.transforme_palindrome_compacte(q));
        System.out.println(s + " -> " + Palindrome.transforme_palindrome_compacte(s));
        System.out.println(t + " -> " + Palindrome.transforme_palindrome_compacte(t));
        System.out.println(u + " -> " + Palindrome.transforme_palindrome_compacte(u));
        System.out.println(v + " -> " + Palindrome.transforme_palindrome_compacte(v));

        /*
        *
        *
        * */
        Pile pile = new Pile();
        pile.push(4);
        pile.push(5);
        pile.push(6);
        pile.pop();
        pile.push(7);

        //System.out.println(pile.pop());
        //System.out.println("La longueur est de " + pile.length());
        //pile.print();
        Pile pileTest = new Pile();
        for (int i=0; i<100; i++) {
            pileTest.push(i);
        }
        //System.out.println("Debut de pileTest");
        //pileTest.print();
        pileTest.push(5);
        //pileTest.print();

        Double_pile db = new Double_pile();
        db.push(true, 6);
        db.print();
        db.push(false, 54);
        db.pop(true);
        db.push(false, 64);
        db.print();
        System.out.println(db.length(false));
        System.out.println(db.full());
        System.out.println(db.top(false));

    }
}
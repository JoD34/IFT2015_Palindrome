public class Palindrome {
    /**
     * Détermine si un mo est un palindrome.
     * @param input Chaîne de caractère.
     * @return (boolean) true si la chaîne de caractère est un palindrome.
     */
    public static boolean checker(String input){

        int len = input.length()-1, IterLen = len/2;
        if (len == 0) return true;

        for(int i = 0; i <= IterLen; i++){
            char inst = input.charAt(i);
            char instEnd = input.charAt(len);
            if(inst == ' ') continue;
            while(instEnd == ' ') {
                len--;
                instEnd = input.charAt(len);
            }

            if (inst != instEnd )return false;
            len--;
        }
        return true;
    }

    /**
     * Fonction récursive déterminant s'il s'agit d'un palindrome.
     * @param input Chaîne de caractère.
     * @return (boolean) true si la chaîne de caractère est un palindrome.
     */
    public static boolean checker_recursive(String input){
        int len = input.length() - 1;
        if (len <= 0) return true;

        int i = 0;
        int j = input.charAt(i);
        int k = input.charAt(len);

        while (j == ' ') {
            i++;
            j = input.charAt(i);
        }
        while (k == ' ') {
            len--;
            k = input.charAt(len);
        }

        return (j == k) && checker_recursive(getSubString(input, j+1, len));
    }

    /**
     * Inverse les lettres d'un mot et le renvoie.
     * @param input chaîne de caractère (ou mot).
     * @return (String) le mot en entrée inversé.
     */
    public static String reverse(String input){
        String reverseWord = "";
        for(int i = input.length()-1; i>=0; i--) {
            reverseWord += input.charAt(i);
        }
        return reverseWord;
    }

    /**
     * Transformation d'un mot en palindrome de façon naïve.
     * @param input (String) mot.
     * @return un mot palindrome.
     */
    public static String transforme_palindrome(String input){
        if(checker(input)) return input;
        String rev = reverse(input);
        return input.concat(rev);
    }

    /**
     * Transformé un mot en un palindrome compacté.
     * @param input (String) mot.
     * @return mot transformé en palindrome de façon compacte.
     */
    public static String transforme_palindrome_compacte(String input) {
        int len = input.length();
        String addString = "";

        for (int i = 0; i <= len-1; i++) {
            while(input.charAt(i) == ' ') i++;
            String potPal = getSubString(input, i, len);

            if (checker(potPal)) {
                addString = reverse(getSubString(input, 0, i));
                break;
            }
        }
        return input + addString;
    }

    /**
     * Obtenir une sous chaîne de caractère d'une chaîne principale.
     * @param s: chaîne de caractère principale.
     * @param beg: index de départ de la sous chaîne de caractère.
     * @param end: index de fin de la sous chaîne de caractère.
     * @return (String) sous chaîne de caractère.
     */
    public static String getSubString(String s, int beg, int end) {
        String res = "";
        for (int i = beg; i < end; i++){
            res += s.charAt(i);
        }
        return res;
    }
}

public class Pile {

    public final int MAX_LENGTH = 100;
    public int[] maPile = new int[MAX_LENGTH];
    public int longueur;
    public Pile() {}
    /**
     * Ajoute un élément à la pile.
     * @param elem Un entier.
     */
    public void push(int elem) {
        try {
            this.maPile[this.longueur] = elem;
            this.longueur++;
        } catch (IndexOutOfBoundsException e){
            System.out.println("L'élément " + elem + " n'a pu être ajouté, car la pile est pleine.");
        }
    }

    /**
     * Détermine l'élément sur le dessus de la pile.
     * @return l'élément (entier) sur la pile.
     */
    public int top() { return this.maPile[this.longueur - 1]; }

    /**
     * Retire l'élément sur le dessus de la pile.
     * @return l'élément (entier) éliminé.
     */
    public int pop() {
        int popElem = this.maPile[this.longueur - 1];
        this.maPile[this.longueur - 1] = 0;
        this.longueur--;

        return popElem;
    }

    /**
     * Évalue la longueur de la pile.
     * @return la longueur (entier) de la pile.
     */
    public int length() { return this.longueur; }

    /**
     * Fait afficher le contenu de la pile.
     */
    public void print() {
        for (int i : maPile) {
            System.out.println(i);
        }
    }
}


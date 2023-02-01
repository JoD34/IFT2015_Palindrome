public class Double_pile {

    // Attributs
    public final int MAX_LENGTH = 100;
    public int[] container = new int[MAX_LENGTH];
    public int longueurPileUn;
    public int longueurPileDeux;

    // Constructeurs
    public Double_pile(){}

    /**
     * Indique s'il y a de la place dans la double pile pour ajouter un nouvel élément.
     * @return true s'il y a de la place disponible.
     */
    public boolean full(){
        if (this.longueurPileUn + this.longueurPileDeux >= 100) {
            return true;
        }
        else { return false; }
    }

    /**
     * Ajoute un élément au-dessus de la pile désirée (1 ou 2).
     * @param one un booléen true si la pile 1 est concernée et false si la pile 2 est concernée.
     * @param elem un entier à ajouter dans la pile concernée.
     * @return true si l'élément a été ajouté sans problème.
     */
    public boolean push(boolean one, int elem){
        if (full()) {
            System.out.println("Il n'y a plus d'espace pour ajouter un element");
            return false;
        }
        if (one) {
            this.container[this.longueurPileUn] = elem;
            this.longueurPileUn++;
            return true;
        }
        else {
            this.container[MAX_LENGTH - this.longueurPileDeux - 1] = elem;
            this.longueurPileDeux++;
            return true;
        }
    }

    /**
     * Identifie l'élément sur le dessus de la pile concernée (1 ou 2).
     * @param one un booléen true si la pile 1 est concernée et false si la pile 2 est concernée.
     * @return l'élément (entier) sur le dessus de la pile concernée.
     */
    public int top(boolean one) {
        if (one) {
            return this.container[this.longueurPileUn - 1];
        }
        else {
            return this.container[MAX_LENGTH - this.longueurPileDeux];
        }
    }

    /**
     * Retire l'élément sur le dessu de la pile concernée.
     * @param one un booléen true si la pile 1 est concernée et false si la pile 2 est concernée.
     * @return l'élément (entier) éliminé de la pile concernée.
     */
    public int pop(boolean one) {
        if (one) {
            int popElem = this.container[this.longueurPileUn - 1];
            this.container[this.longueurPileUn - 1] = 0;
            this.longueurPileUn--;
            return popElem;
        }
        else {
            int popElem = this.container[MAX_LENGTH - this.longueurPileDeux];
            this.container[MAX_LENGTH - this.longueurPileDeux] = 0;
            this.longueurPileDeux--;
            return popElem;
        }
    }

    /**
     * Détermine la longueur de la pile concernée.
     * @param one un booléen true si la pile 1 est concernée et false si la pile 2 est concernée.
     * @return le nombre d'élément (entier) dans la pile concernée.
     */
    public int length(boolean one) {
        if (one) { return this.longueurPileUn; }
        else { return this.longueurPileDeux; }
    }

    /**
     * Fait afficher le contenu du conteneur de la double pile.
     */
    public void print() {
        for (int i : container) {
            System.out.println(i);
        }
    }
}

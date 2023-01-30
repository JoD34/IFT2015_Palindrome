public class Pile {

    // Attributs
    public int[] maPile;
    public final int MAX_LENGTH = 100;

    // Constructeurs
    public Pile() {
    }

    public Pile(int[] maPile) {
        this.maPile = maPile;
    }

    // Methodes
    public void push(int elem) {

        if (this.maPile.length == MAX_LENGTH) return;
        ///////// VERIF SI ON DOIT AJOUTER A UNE NOUVELLE PILE OU JUSTE PAS AJOUTER ET RIEN FAIRE

        // metttre new Pile au lieu de int[]???
        int[] newPile = new int[this.maPile.length + 1];

        for (int i = 0; i < this.maPile.length; i++) {
            newPile[i] = this.maPile[i];
        }
        newPile[this.maPile.length + 1] = elem;

        this.maPile = newPile;
    }

    public int top() {
        return this.maPile[this.maPile.length - 1];
    }

    public int pop() {

        int[] newPile = new int[this.maPile.length - 1];
        int popElem = this.maPile[this.maPile.length - 1];
        for (int i=0; i<this.maPile.length-1; i++) {
            newPile[i] = this.maPile[i];
        }
        this.maPile = newPile;
        return popElem;
    }

    public int length() { return this.maPile.length;}
}


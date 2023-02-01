public class Double_pile {

    // Attributs
    public final int MAX_LENGTH = 100;
    public int[] container = new int[MAX_LENGTH];
    public int longueurPileUn;
    public int longueurPileDeux;

    // Constructeurs
    public Double_pile(){}

    public boolean full(){
        if (this.longueurPileUn + this.longueurPileDeux >= 100) {
            return true;
        }
        else { return false; }
    }

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

    public int top(boolean one) {
        if (one) {
            return this.container[this.longueurPileUn - 1];
        }
        else {
            return this.container[MAX_LENGTH - this.longueurPileDeux];
        }
    }

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

    public int length(boolean one) {
        if (one) { return this.longueurPileUn; }
        else { return this.longueurPileDeux; }
    }

    public void print() {
        for (int i : container) {
            System.out.println(i);
        }
    }
}

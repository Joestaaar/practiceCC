package hei.school;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Table {
    private int longueur;
    private int largeur;
    private String etat;
    private String couleur;

    public Table(int longueur, int largeur, String etat) {
        this.longueur = longueur;
        this.largeur = largeur;
        this.etat = etat;

    }

    public int getSurface(int longueur, int largeur) {
        return longueur * largeur;
    }
}

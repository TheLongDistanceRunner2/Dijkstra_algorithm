// https://java2blog.com/dijkstra-java/

// klasa reprezentująca krawędź w grafie:
public class Krawedz {
    private double waga;
    private Wierzcholek poczatkowyWierzcholek;
    private Wierzcholek koncowyWierzcholek;

    public Krawedz(double waga, Wierzcholek poczatkowyWierzcholek, Wierzcholek koncowyWierzcholek) {
        this.waga = waga;
        this.poczatkowyWierzcholek = poczatkowyWierzcholek;
        this.koncowyWierzcholek = koncowyWierzcholek;
    }

    public double getWaga() {
        return waga;
    }

    public void setWaga(double waga) {
        this.waga = waga;
    }

    public Wierzcholek getStartWierzcholek() {
        return poczatkowyWierzcholek;
    }

    public void setPoczatkowyWierzcholek(Wierzcholek poczatkowyWierzcholek) {
        this.poczatkowyWierzcholek = poczatkowyWierzcholek;
    }

    public Wierzcholek getKoncowyWierzcholek() {
        return koncowyWierzcholek;
    }

    public void setKoncowyWierzcholek(Wierzcholek koncowyWierzcholek) {
        this.koncowyWierzcholek = koncowyWierzcholek;
    }
}

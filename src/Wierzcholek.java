// https://java2blog.com/dijkstra-java/

import java.util.ArrayList;
import java.util.List;

// Klasa reprezentująca wierzchołek w grafie:
public class Wierzcholek implements Comparable<Wierzcholek> {
    private String nazwa;
    private List<Krawedz> sasiedzi;
    private boolean czyOdwiedzono;
    private Wierzcholek poprzednik;
    private double odleglosc = Double.MAX_VALUE; // ustawiamy początkowo umownie
                                                // na największą możliwą wartość (~nieskończoność)

    public Wierzcholek(String nazwa) {
        this.nazwa = nazwa;
        this.sasiedzi = new ArrayList<>();
    }

    public void dodajSasiada(Krawedz krawedz) {
        this.sasiedzi.add(krawedz);
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public List<Krawedz> getSasiedzi() {
        return sasiedzi;
    }

    public void setSasiedzi(List<Krawedz> sasiedzi) {
        this.sasiedzi = sasiedzi;
    }

    public boolean CzyOdwiedzono() {
        return czyOdwiedzono;
    }

    public void setCzyOdwiedzono(boolean czyOdwiedzono) {
        this.czyOdwiedzono = czyOdwiedzono;
    }

    public Wierzcholek getPoprzednik() {
        return poprzednik;
    }

    public void setPoprzednik(Wierzcholek poprzednik) {
        this.poprzednik = poprzednik;
    }

    public double getOdleglosc() {
        return odleglosc;
    }

    public void setOdleglosc(double odleglosc) {
        this.odleglosc = odleglosc;
    }

    @Override
    public String toString() {
        return this.nazwa;
    }

    @Override
    public int compareTo(Wierzcholek w) {
        return Double.compare(this.odleglosc, w.getOdleglosc());
    }
}

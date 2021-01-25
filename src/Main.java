// https://java2blog.com/dijkstra-java/

public class Main {
    public static void main(String[] args) {
        Wierzcholek wierzcholekDom = new Wierzcholek("Dom");
        Wierzcholek wierzcholekA = new Wierzcholek("A");
        Wierzcholek wierzcholekB = new Wierzcholek("B");
        Wierzcholek wierzcholekC = new Wierzcholek("C");
        Wierzcholek wierzcholekD = new Wierzcholek("D");
        Wierzcholek wierzcholekE = new Wierzcholek("E");
        Wierzcholek wierzcholekF = new Wierzcholek("F");
        Wierzcholek wierzcholekSzkola = new Wierzcholek("Szkola");

        wierzcholekDom.dodajSasiada(new Krawedz(3, wierzcholekDom, wierzcholekA));
        wierzcholekDom.dodajSasiada(new Krawedz(2, wierzcholekDom, wierzcholekB));
        wierzcholekDom.dodajSasiada(new Krawedz(5, wierzcholekDom, wierzcholekC));

        wierzcholekA.dodajSasiada(new Krawedz(3, wierzcholekA, wierzcholekDom));
        wierzcholekA.dodajSasiada(new Krawedz(3, wierzcholekA, wierzcholekD));

        wierzcholekB.dodajSasiada(new Krawedz(2, wierzcholekB, wierzcholekDom));
        wierzcholekB.dodajSasiada(new Krawedz(1, wierzcholekB, wierzcholekD));
        wierzcholekB.dodajSasiada(new Krawedz(6, wierzcholekB, wierzcholekE));

        wierzcholekC.dodajSasiada(new Krawedz(5, wierzcholekC, wierzcholekDom));
        wierzcholekC.dodajSasiada(new Krawedz(2, wierzcholekC, wierzcholekE));

        wierzcholekD.dodajSasiada(new Krawedz(3, wierzcholekC, wierzcholekA));
        wierzcholekD.dodajSasiada(new Krawedz(1, wierzcholekC, wierzcholekB));
        wierzcholekD.dodajSasiada(new Krawedz(4, wierzcholekC, wierzcholekF));

        wierzcholekE.dodajSasiada(new Krawedz(6, wierzcholekE, wierzcholekB));
        wierzcholekE.dodajSasiada(new Krawedz(2, wierzcholekE, wierzcholekC));
        wierzcholekE.dodajSasiada(new Krawedz(1, wierzcholekE, wierzcholekF));
        wierzcholekE.dodajSasiada(new Krawedz(4, wierzcholekE, wierzcholekSzkola));

        wierzcholekF.dodajSasiada(new Krawedz(4, wierzcholekF, wierzcholekD));
        wierzcholekF.dodajSasiada(new Krawedz(1, wierzcholekF, wierzcholekE));
        wierzcholekF.dodajSasiada(new Krawedz(2, wierzcholekF, wierzcholekSzkola));

        wierzcholekSzkola.dodajSasiada(new Krawedz(4, wierzcholekSzkola, wierzcholekE));
        wierzcholekSzkola.dodajSasiada(new Krawedz(2, wierzcholekSzkola, wierzcholekF));

        AlgorytmDijkstry algorytmDijkstry1 = new AlgorytmDijkstry();
        algorytmDijkstry1.obliczNajkrotszaDrogeDlaWierzcholka(wierzcholekDom);

        System.out.println("Najkrótsza droga z Domu do Szkoły wiedzie przez: " + algorytmDijkstry1.getNajkrotszaDrogaDoWierzcholka(wierzcholekSzkola));
    }
}

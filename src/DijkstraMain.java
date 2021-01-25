// https://java2blog.com/dijkstra-java/

public class DijkstraMain {
    public static void main(String[] args) {
        Wierzcholek wierzcholekHome = new Wierzcholek("Home");
        Wierzcholek wierzcholekA = new Wierzcholek("A");
        Wierzcholek wierzcholekB = new Wierzcholek("B");
        Wierzcholek wierzcholekC = new Wierzcholek("C");
        Wierzcholek wierzcholekD = new Wierzcholek("D");
        Wierzcholek wierzcholekE = new Wierzcholek("E");
        Wierzcholek wierzcholekF = new Wierzcholek("F");
        Wierzcholek wierzcholekSchool = new Wierzcholek("School");

        wierzcholekHome.dodajSasiada(new Krawedz(3, wierzcholekHome, wierzcholekA));
        wierzcholekHome.dodajSasiada(new Krawedz(2, wierzcholekHome, wierzcholekB));
        wierzcholekHome.dodajSasiada(new Krawedz(5, wierzcholekHome, wierzcholekC));

        wierzcholekA.dodajSasiada(new Krawedz(3, wierzcholekA, wierzcholekHome));
        wierzcholekA.dodajSasiada(new Krawedz(3, wierzcholekA, wierzcholekD));

        wierzcholekB.dodajSasiada(new Krawedz(2, wierzcholekB, wierzcholekHome));
        wierzcholekB.dodajSasiada(new Krawedz(1, wierzcholekB, wierzcholekD));
        wierzcholekB.dodajSasiada(new Krawedz(6, wierzcholekB, wierzcholekE));

        wierzcholekC.dodajSasiada(new Krawedz(5, wierzcholekC, wierzcholekHome));
        wierzcholekC.dodajSasiada(new Krawedz(2, wierzcholekC, wierzcholekE));

        wierzcholekD.dodajSasiada(new Krawedz(3, wierzcholekC, wierzcholekA));
        wierzcholekD.dodajSasiada(new Krawedz(1, wierzcholekC, wierzcholekB));
        wierzcholekD.dodajSasiada(new Krawedz(4, wierzcholekC, wierzcholekF));

        wierzcholekE.dodajSasiada(new Krawedz(6, wierzcholekE, wierzcholekB));
        wierzcholekE.dodajSasiada(new Krawedz(2, wierzcholekE, wierzcholekC));
        wierzcholekE.dodajSasiada(new Krawedz(1, wierzcholekE, wierzcholekF));
        wierzcholekE.dodajSasiada(new Krawedz(4, wierzcholekE, wierzcholekSchool));

        wierzcholekF.dodajSasiada(new Krawedz(4, wierzcholekF, wierzcholekD));
        wierzcholekF.dodajSasiada(new Krawedz(1, wierzcholekF, wierzcholekE));
        wierzcholekF.dodajSasiada(new Krawedz(2, wierzcholekF, wierzcholekSchool));

        wierzcholekSchool.dodajSasiada(new Krawedz(4, wierzcholekSchool, wierzcholekE));
        wierzcholekSchool.dodajSasiada(new Krawedz(2, wierzcholekSchool, wierzcholekF));

        algorytmDijskrty shortestPath = new algorytmDijskrty();
        shortestPath.obliczNajkrotszaDroge(wierzcholekHome);

        System.out.println("Shortest path from Home to School: " + shortestPath.getNajkrotszaDrogeDoWwierzcholka(wierzcholekSchool));
    }
}

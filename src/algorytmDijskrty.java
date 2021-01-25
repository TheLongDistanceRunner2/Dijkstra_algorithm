// https://java2blog.com/dijkstra-java/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class algorytmDijskrty {
    public void obliczNajkrotszaDroge(Wierzcholek wierzcholek) {
        // wybieramy aktualny wierzcholek i ustawiamy zerową odległość od niego:
        wierzcholek.setOdleglosc(0);
        PriorityQueue<Wierzcholek> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(wierzcholek);
        // oznaczamy wierzcholek jako odwiedzony:
        wierzcholek.setCzyOdwiedzono(true);

        // dopóki w kolejce znajdują się wierzchołki do sprawdzenia:
        while (!priorityQueue.isEmpty()) {
            // pobieramy z kolejki wierzchołek o najmniejszej odległości od wybranego na początku wierzchołka:
            Wierzcholek tmpWierzcholek = priorityQueue.poll();

            // sprawdzamy wszystkie krawędzie wychodzące z tego wierzchołka:
            for (Krawedz krawedz : tmpWierzcholek.getSasiedzi()) {
                Wierzcholek v = krawedz.getKoncowyWierzcholek();

                // jeśli nie odwiedzono jeszcze danego wierzchołka:
                if (!v.CzyOdwiedzono()) {
                    // nadajemy mu nową odległość, poprzez dodanie wartości
                    // aktualnego węzła do wagi krawędzi łączącej nowy wierzchołek
                    double nowaOdleglosc = tmpWierzcholek.getOdleglosc() + krawedz.getWaga();

                    // jesli nowa odleglosc jest mniejsza od wartości tego wierzchołka
                    // to zastępujemy ją nową, a jeśli większa, to zostawiamy starą
                    if (nowaOdleglosc < v.getOdleglosc()) {
                        // usuwamy wierzcholek z kolejki:
                        priorityQueue.remove(v);
                        // ustaiamy mu nową odległość:
                        v.setOdleglosc(nowaOdleglosc);
                        // ustawiamy mu poprzednik:
                        v.setPoprzednik(tmpWierzcholek);
                        // i dodajemy go do kolejki:
                        priorityQueue.add(v);
                    }
                }
            }

            // przestawiamy flagę, oznaczając wierzhołek jako odwiedzony:
            tmpWierzcholek.setCzyOdwiedzono(true);
        }
    }

    public List<Wierzcholek> getNajkrotszaDrogeDoWwierzcholka(Wierzcholek koncowyWierzcholek) {
        List<Wierzcholek> droga = new ArrayList<>();

        // przechodzimy graf, dodajac napotkane wierzcholki do drogi:
        for (Wierzcholek w = koncowyWierzcholek; w != null; w = w.getPoprzednik()) {
            droga.add(w);
        }

        // odwracamy kolejnosc drogi:
        Collections.reverse(droga);

        return droga;
    }
}

// https://java2blog.com/dijkstra-java/

public class DijkstraMain {
    public static void main(String[] args) {
        Vertex vertexHome = new Vertex("Home");
        Vertex vertexA = new Vertex("A");
        Vertex vertexB = new Vertex("B");
        Vertex vertexC = new Vertex("C");
        Vertex vertexD = new Vertex("D");
        Vertex vertexE = new Vertex("E");
        Vertex vertexF = new Vertex("F");
        Vertex vertexSchool = new Vertex("School");

        vertexHome.addNeighbour(new Edge(3, vertexHome, vertexA));
        vertexHome.addNeighbour(new Edge(2, vertexHome, vertexB));
        vertexHome.addNeighbour(new Edge(5, vertexHome, vertexC));

        vertexA.addNeighbour(new Edge(3, vertexA, vertexHome));
        vertexA.addNeighbour(new Edge(3, vertexA, vertexD));

        vertexB.addNeighbour(new Edge(2, vertexB, vertexHome));
        vertexB.addNeighbour(new Edge(1, vertexB, vertexD));
        vertexB.addNeighbour(new Edge(6, vertexB, vertexE));

        vertexC.addNeighbour(new Edge(5, vertexC, vertexHome));
        vertexC.addNeighbour(new Edge(2, vertexC, vertexE));

        vertexD.addNeighbour(new Edge(3, vertexC, vertexA));
        vertexD.addNeighbour(new Edge(1, vertexC, vertexB));
        vertexD.addNeighbour(new Edge(4, vertexC, vertexF));

        vertexE.addNeighbour(new Edge(6, vertexE, vertexB));
        vertexE.addNeighbour(new Edge(2, vertexE, vertexC));
        vertexE.addNeighbour(new Edge(1, vertexE, vertexF));
        vertexE.addNeighbour(new Edge(4, vertexE, vertexSchool));

        vertexF.addNeighbour(new Edge(4, vertexF, vertexD));
        vertexF.addNeighbour(new Edge(1, vertexF, vertexE));
        vertexF.addNeighbour(new Edge(2, vertexF, vertexSchool));

        vertexSchool.addNeighbour(new Edge(4, vertexSchool, vertexE));
        vertexSchool.addNeighbour(new Edge(2, vertexSchool, vertexF));

        DijkstraShortestPath shortestPath = new DijkstraShortestPath();
        shortestPath.computeShortestPaths(vertexHome);

        System.out.println("Shortest path from Home to School: " + shortestPath.getShortestPathTo(vertexSchool));
    }
}

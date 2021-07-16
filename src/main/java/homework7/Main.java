package homework7;

public class Main {
    public static void main(String[] args)
    {
        /* 7.1
        Cети
        */

        //7.2
        Graph graph = new Graph();
        graph.addVertex('A');
        graph.addVertex('B');
        graph.addVertex('C');
        graph.addVertex('D');
        graph.addVertex('E');
        graph.addVertex('H');

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(0, 3);
        graph.addEdge(3, 4);
        graph.addEdge(0, 5);

        // 7.3
        long a = System.nanoTime();
        graph.dfs(0);
        System.out.println("Время выполнения поиска в глубину: " + (System.nanoTime() - a));

        //7.4
        a = System.nanoTime();
        graph.bfs();
        System.out.println("Время выполнения поиска в ширину: " + (System.nanoTime() - a));
        a = System.nanoTime();
        graph.bfs2(0);
        System.out.println("Время выполнения поиска в ширину: " + (System.nanoTime() - a));
    }
}

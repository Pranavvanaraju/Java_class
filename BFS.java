import java.util.*;

public class BFS {

    public static void main(String[] args) {

        // Initialize graph
        Map<Integer, List<Integer>> graph = new LinkedHashMap<>();

        // Number of edges
        int edges = 5;

        // Edge list (hardcoded)
        int[][] edgeList = {
            {1, 2},
            {1, 3},
            {2, 4},
            {3, 5},
            {4, 6}
        };

        // Build graph
        for (int i = 0; i < edges; i++) {
            int u = edgeList[i][0];
            int v = edgeList[i][1];

            graph.putIfAbsent(u, new ArrayList<>());
            graph.putIfAbsent(v, new ArrayList<>());

            graph.get(u).add(v);
            graph.get(v).add(u); // undirected graph
        }

        // Starting node
        int start = 1;

        System.out.println("BFS Traversal:");
        bfs(graph, start);
    }

    static void bfs(Map<Integer, List<Integer>> graph, int start) {
        Queue<Integer> q = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();

        q.add(start);
        visited.add(start);

        while (!q.isEmpty()) {
            int node = q.poll();
            System.out.print(node + " ");

            for (int nei : graph.getOrDefault(node, new ArrayList<>())) {
                if (!visited.contains(nei)) {
                    visited.add(nei);
                    q.add(nei);
                }
            }
        }
    }
}
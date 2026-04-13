import java.util.*;

public class DFS {
    private int V; // number of vertices
    private LinkedList<Integer> adj[];
    DFS(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++)
            adj[i] = new LinkedList<Integer>();
    }
    void addEdge(int v, int w) {
        adj[v].add(w);
        // For undirected graph, use:
        // adj[w].add(v);
    }
    void DFSUtil(int v, boolean visited[]) {
        visited[v] = true;
        System.out.print(v + " ");
        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n]) {
                DFSUtil(n, visited);
            }
        }
    }
    void DFS(int start) {
        boolean visited[] = new boolean[V];
        DFSUtil(start, visited);
    }
    public static void main(String args[]) {

       DFS g = new DFS(6); // vertices 0 to 5

        // Insert edges
        g.addEdge(1,2);
        g.addEdge(1,4);
        g.addEdge(2,3);
        g.addEdge(2,4);
        g.addEdge(2,5);
        g.addEdge(3,5);
        g.addEdge(4,5);

        System.out.println("DFS starting from vertex 1:");

        g.DFS(1);
    }
}
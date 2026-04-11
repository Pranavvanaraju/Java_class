import java.util.ArrayList;
public class graphrepresentation {
    ArrayList<ArrayList<Integer>> adjlist;
    graphrepresentation(int v){
        adjlist = new ArrayList<>();
        for(int i = 0; i < v; i++){
            adjlist.add(new ArrayList<Integer>());
        
    }
}
public void addEdge(int u, int v){
    adjlist.get(u).add(v);
    adjlist.get(v).add(u);
}
public void printAdjList(){
    for(int i =0; i<adjlist.size();i++){
        System.out.print("Adjacent list of vertex " + i + ": " );
        for(int j = 0; j<adjlist.get(i).size();j++){
            System.out.print(adjlist.get(i).get(j) + " ");
        }
        System.out.println();
    }
}
public static void main(String[] args){
    graphrepresentation g = new graphrepresentation(5);
    g.addEdge(0, 1);
    g.addEdge(0, 4);
    g.addEdge(1, 2);
    g.addEdge(1, 3);
    g.addEdge(1, 4);
    g.addEdge(2, 3);
    g.addEdge(3, 4);
    g.printAdjList();
}

}
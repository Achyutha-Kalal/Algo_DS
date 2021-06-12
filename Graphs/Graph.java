import java.util.List;
import java.util.ArrayList;
import java.util.Map;
class Graph{
    private Map<Vertex, List<Vertex>> adjList;
    void addVertex(int node)
    {
        adjList.put(new Vertex(node),new ArrayList<>());
    }
    void removeVertex(int node)
    {
        Vertex v = new Vertex(node);
        adjList.values().stream().forEach(e->e.remove(v));
        adjList.remove(new Vertex(node));
    }
    void addEdge(int node1,int node2)
    {
        Vertex v1=new Vertex(node1);
        Vertex v2=new Vertex(node2);
        adjList.get(v1).add(v2);
        adjList.get(v2).add(v1);
    }
    void removeEdge(int node1,int node2)
    {
        Vertex v1=new Vertex(node1);
        Vertex v2=new Vertex(node2);
        List<Vertex> edgeList1=adjList.get(v1);
        List<Vertex> edgeList2=adjList.get(v2);
        if(edgeList1!=null)
        {
            edgeList1.remove(v2);
        }
        if(edgeList2!=null)
        {
            edgeList2.remove(v1);
        }
    }
        void printGraph(ArrayList<ArrayList<Integer> > adj)
    {
        for (int i = 0; i < adj.size(); i++) {
            System.out.println("\nAdjacency list of vertex" + i);
            System.out.print("head");
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(" -> "+adj.get(i).get(j));
            }
            System.out.println();
        }
    }
    }
}
class Graph{
    
    private Map<Vertex,List<Vertex>> adjList;
    //Add new Vertex to the graph 
   private void addVertex(int k,Map<Vertex,List<Vertex>> adjList)
   {
       adjVertices.putIfAbsent(new Vertex(k),new ArrayList<>());
   }
   //Add new Vertex to the main graph
   public void addVertex(int k)
   {
       addVertex(k,this.adjList);
   }

      //remove Vertex and all edges related to vertex in the graph
   private void removeVertex(int k,Map<Vertex,List<Vertex>> adjList)
   {
       Vertex v= new Vertex(k);
       adjList.values().stream().forEach(e->e.remove(v));
       adjList.remove(new Vertex(k));
   }
      //remove Vertex and all edges related to vertex in the main graph
   public void removeVertex(int k)
   {
       removeVertex(k,this.adjList);
   }

   //add edge related to vertex in the graph
   private void addEdge(int vert,int edge,Map<Vertex,List<Vertex>> adjList)
   {
       Vertex v1=new Vertex(vert);
       Vertex v2=new Vertex(edge);
       adjList.get(v1).add(v2);
       adjList.get(v2).add(v1);

   }
   //add edge related to vertex in the main graph
   public void addEdge(int vert,int edge){
       addEdge(vert, edge, this.adjList);
   }

    //remove edge related to vertex in the graph
    private void removeEdge(int vert,int edge,Map<Vertex,List<Vertex>> adjList)
    {
        Vertex v1=new Vertex(vert);
        Vertex v2=new Vertex(edge);
        List<Vertex> eV1=adjList.get(v1);
        List<Vertex> eV2=adjList.get(v2);
        if(ev1!=null)
            eV1.remove(v2);
        if(ev2!=null)
            eV2.remove(v1);
 
    }
    //remove edge related to vertex in the main graph
    public void removeEdge(int vert,int edge){
        removeEdge(vert, edge, this.adjList);
    }

    //List all the edges from the given vertex of the graph
    private List<Vertex> getEdges(int vert,Map<Vertex,List<Vertex>> adjList)
    {
        return adjList.get(new Vertex(k));
    }

    //List all the edges from the given vertex of the main graph
    public List<Vertex> getEdges(int vert)
    {
        return getEdges(vert,this.adjList);
    }

}
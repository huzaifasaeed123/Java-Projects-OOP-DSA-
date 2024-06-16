
package testgraph;

import java.util.*;

public class TestGraph {
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Edge>[] graph=new ArrayList[5];
        Graph obj=new Graph();
        obj.MakeGraph(graph);
       // obj.dfsWithRecursion(graph);
     //   dfsWithStack(graph);
         System.out.println(obj.DetectCycleWithDfs(graph));
        
    }
    
    
    
}

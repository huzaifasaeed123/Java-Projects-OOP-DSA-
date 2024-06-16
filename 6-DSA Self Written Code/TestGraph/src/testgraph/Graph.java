package testgraph;

import java.util.*;

public class Graph {

    public boolean DetectCycleWithDfs(ArrayList<Edge>[] graph) {
        int curr = 0;
        boolean visit[] = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!visit[i]) 
            {
                if(DetectCycleWithDfsHelper(graph, visit, curr, 0))
                {
                    return true;
                }
            }
        }
        
       
        return false;

    }

    public boolean DetectCycleWithDfsHelper(ArrayList<Edge>[] graph, boolean[] visit, int curr, int parent) {

        visit[curr] = true;
        System.out.println(curr+" Time");
        //Find Neibhours
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            int curr1 = e.destination;
            if (!visit[e.destination] && DetectCycleWithDfsHelper(graph, visit, e.destination, curr)) 
            {
                //return DetectCycleWithDfsHelper(graph, visit, curr1, curr);
                return true;
            } 
            else if (visit[e.destination] && e.destination != parent) 
            {
                return true;
            }
        }

        return false;
    }

    public void dfsWithRecursion(ArrayList<Edge>[] graph) {
        boolean[] visit = new boolean[graph.length];
        int curr = 0;//For Source
        //This Loop is for all disjoin Components of Graph
        //Loop will run that time how many Node Exist
        for (int i = 0; i < graph.length; i++) {
            //This Condition Will help us to prevent unnecessay calls that already Visited Done
            if (!visit[i]) {
                dfsWithRecursionHelp(graph, curr, visit);
            }
        }
    }

    public void dfsWithRecursionHelp(ArrayList<Edge>[] graph, int curr, boolean[] visit) {

        //1st Methos Using Recursive Appproach
        visit[curr] = true;
        System.out.println(curr);

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            curr = e.destination;
            if (!visit[curr]) {
                dfsWithRecursionHelp(graph, curr, visit);
            }
        }
    }

    public void dfsWithStack(ArrayList<Edge>[] graph) {
        Stack<Integer> st = new Stack<>();
        boolean[] visit = new boolean[graph.length];

        st.push(0);

        while (!st.isEmpty()) {

            int curr = st.peek();
            if (!visit[curr]) {
                visit[curr] = true;
                System.out.println(curr);
            }

            int count = 0;
            for (int i = 0; i < graph[curr].size(); i++) {
                Edge e = graph[curr].get(i);
                curr = e.destination;
                if (count == 1) {
                    break;
                } else {
                    if (!visit[curr]) {

                        visit[curr] = true;
                        System.out.println(curr);
                        st.push(curr);
                        count++;
                    }
                }

            }//inside while loop+
            if (count == 0) {
                st.pop();
            }
        }

    }

    public void bfs(ArrayList<Edge>[] graph) {
        boolean[] visit = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!visit[i]) {
                bfsHelper(graph, visit);
            }
        }

    }

    public void bfsHelper(ArrayList<Edge>[] graph, boolean visit[]) {
        Queue<Integer> q = new LinkedList<>();

        //Add Root,agr nhi karo ga to phr wo 1 ko laa laa ga
        //1st Method Time complexity n3
//        q.add(0);
//        for (int i = 0; i < graph.length; i++) {
//            for (int j = 0; j < graph[i].size(); j++) 
//            {
//                Edge k=graph[i].get(j);
//                q.add(k.destination);
//                System.out.println(k.destination);
//            }
//        }
//        while(!q.isEmpty())
//        {
//            int curr=q.remove();
//            if(!visit[curr])
//            {
//                visit[curr]=true;
//                System.out.println(curr);
//            }
//        }
        //2nd Method And Time Complexity n2,this method:: add neighbor as well as remove
        q.add(0);
        while (!q.isEmpty()) {
            int curr = q.remove();
            if (!visit[curr]) {
                visit[curr] = true;
                System.out.println(curr);
            }
            for (int i = 0; i < graph[curr].size(); i++) {
                Edge e = graph[curr].get(i);
                q.add(e.destination);
            }
        }

    }

    public void MakeGraph(ArrayList<Edge>[] graph) {
        int V = graph.length;
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }
//        ArrayList<Edge> arrlist=new ArrayList<>();
//        arrlist.add(new Edge(3,5,6));
//        graph[0]=arrlist;
        //In Short Form we store at array of 0 index ,arraylist of edge
        // For Vertix 0
        graph[0].add(new Edge(0, 1, 5));
        // For Vertix 1
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));
        //For Vertix 2
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 2));
        //For Vertix 3
        graph[3].add(new Edge(3, 1, 3));
        //For Vertix 4
        graph[4].add(new Edge(4, 2, 2));

    }

}

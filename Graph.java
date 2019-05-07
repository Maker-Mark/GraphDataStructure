
import java.util.*;
import java.io.*;
/*
Class Graph mimics a list graph.
Current build: Non-functioning skeleton  
*/
public class Graph{

	private List<List<Integer>> adjLists;;
	private int numVert;

	public Graph (int numVert){

		adjLists = new ArrayList<List<Integer>>();
		this.numVert = numVert;
		for(int i =0; i < numVert; i++)
			adjLists.add(new LinkedList<Integer>());

	}


	public void inputGraph(Scanner s, List<List<Integer>> adjList) {
		while(s.hasNext()){
			int v1 = Integer.parseInt(s.next());
			int v2 = Integer.parseInt(s.next());
			// Gives me the linked list associated with v1, then I just add vs to it
			adjList.get(v1).add(v2);
			// Gives me the linked list associated with v2, then I just add vs to it, as the graph is undirected.
			adjList.get(v2).add(v1);

		}
	}

	public int getNumVertices(){
		return numVert;
	}


	public List<Integer> adjList(int vertex){
		if(vertex<0 || vertex >= numVert)
			throw new IndexOutOfBoundsException();
		return adjLists.get(vertex);
	}



}



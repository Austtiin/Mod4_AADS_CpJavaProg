//DFS.java
//This class will be used to perform the depth first search
//
//Austin Stephens
//Rasmussen University
//Professor Kumar
//COT4530C
//Unit 4 Project
//Date: 07/28/2024



import java.util.HashSet;
import java.util.Set;

public class DFS {
    // Set to store the visited nodes, make final because we don't want to change the visited nodes
    private Set<Node> visited;

    // Constructor to initialize the visited set
    public DFS() {
        try {
            visited = new HashSet<>();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Finished creating the visited set. \n\n");
        }
    }


    // We need a method to check if the node has been visited
    public boolean isVisited(Node node) {
        return visited.contains(node);
    }

    // We will also need a method to perform the depth first search
    public void depthFirstSearch(Node node) {
        if (visited.contains(node)) {
            // If the node has been visited we don't need to visit it again so we return
            return;
        }

        // Add the node to the visited set
        visited.add(node);

        System.out.println("Visited node: " + node.grabName());

        // Use for-each loop to loop through the dependencies
        for (Node dependency : node.grabDependency()) {
            depthFirstSearch(dependency);
        }
    }
}
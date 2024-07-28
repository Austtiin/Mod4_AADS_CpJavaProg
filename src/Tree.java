//Tree.java
//This class will be used to create the tree
//We will have a constructor that will initialize the tree
//
//Austin Stephens
//Rasmussen University
//Professor Kumar
//COT4530C
//Unit 4 Project
//Date: 07/28/2024


import java.util.HashMap;
import java.util.Map;

public class Tree {
    //Map to store the nodes make final because we don't want to change the nodes
    private final Map<String, Node> nodes;

    //Constructor to initialize the tree
    public Tree() {
        nodes = new HashMap<>();
        System.out.println("Starting our tree.");
    }

    //We need to have a method to add a node to the tree
public void addNode(Node node) {
    try {
        //Check if the node is already in the tree
        if (nodes.containsKey(node.grabName())) {
            throw new Exception("Node " + node.grabName() +" already exists in the tree.");
        } else {
            System.out.println("Node does not exist in the tree.");
            System.out.println("Adding node to our tree. \n" + node.grabName());
            nodes.put(node.grabName(), node);
        }
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        System.out.println("Finished acting on the node. \n\n");
    }
}

    //We need to have a method to add a dependency between two nodes
    public void addDependency(Node node1, Node node2) {
    try {
        // Check if the nodes are in the tree
        if (!nodes.containsKey(node1.grabName()) || !nodes.containsKey(node2.grabName())) {
            throw new Exception("Node " + node1.grabName() + " or " + node2.grabName() + " does not exist in the tree.");
        }


        // Add the dependency between the two nodes
        node1.addDependency(node2);
        System.out.println("Adding dependency from " + node1.grabName() + " to " + node2.grabName());
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        System.out.println("Finished processing the dependency. \n\n");
    }
}

    //We need to have a method to perform the depth first search
    public void depthFirstSearch() {
        //Create an instance of the DFS class to perform the depth first search
        DFS dfs = new DFS();

        try {
            if (nodes.isEmpty()) {
                throw new Exception("Tree is empty.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println("Tree is empty...");
        }


        //We continue with the depth first search if the tree is not empty
        //---
        //Loop through all the nodes and perform the depth first search
        //Use for each loop to loop through the nodes
        for (Node node : nodes.values()) {
            if (!dfs.isVisited(node)) {
                //If the node has not been visited we have to perform the depth first search
                dfs.depthFirstSearch(node);
            }
        }
    }
}
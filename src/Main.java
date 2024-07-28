// main.java
// This class will be the entry point of the program
//
//Austin Stephens
//Rasmussen University
//Professor Kumar
//COT4530C
//Unit 4 Project
//Date: 07/28/2024

//Last week we created a tree / un directed graph. This week we will implement the following methods:
// Instructions: Create a Java module that will consume the tree created in Unit 3
// and perform a depth-first search to determine the class compiling order for the given dependencies.
// Your solution should be able to identify any cycles if they exist.

//We will separate the classes into differernt classes to make it easier to read and understand
//We will have a class for the tree, a class for the node, and a class for the main method

public class Main {

    public static void main(String[] args) {
        // Create a tree
        try {
            Tree tree = new Tree();

            // Create nodes
            Node a = new Node("A");
            Node b = new Node("B");
            Node c = new Node("C");
            Node d = new Node("D");
            Node e = new Node("E");
            Node f = new Node("F");

            // Add nodes to our tree - acting on the tree
            tree.addNode(a);
            tree.addNode(b);
            tree.addNode(c);
            tree.addNode(d);
            tree.addNode(e);
            tree.addNode(f);

            // Add dependencies
            //Dependencies resemble the order in which the classes should be compiled
            //""Adding our edges to the tree"" as we might say in graph theory
            tree.addDependency(a, b);
            tree.addDependency(a, c);
            tree.addDependency(b, d);
            tree.addDependency(c, d);
            tree.addDependency(d, e);
            tree.addDependency(e, f);

            // Perform the depth first search / start the process
            tree.depthFirstSearch();

            //end the program
            System.out.println("Finished the program.");
            System.exit(0);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //Error out if the tree cannot be created or if there is an error
            System.out.println("An error happened creating the tree...");
        }
    }
}
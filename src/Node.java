//Node.java
//This class will be used to create the nodes of the tree
//
//Austin Stephens
//Rasmussen University
//Professor Kumar
//COT4530C
//Unit 4 Project
//Date: 07/28/2024


import java.util.ArrayList;
import java.util.List;

public class Node {
    private String name;
    private final List<Node> dependencies;
    //Final because we don't want to change the dependencies

    //Constructor to initialize the node
    public Node(String name) {
        this.name = name;
        this.dependencies = new ArrayList<>();

    }


//Getters and setters
    //Getters and setters
    //
    public String grabName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Node> grabDependency() {
        return dependencies;
    }

    public void addDependency(Node node) {
        dependencies.add(node);
    }
}

package dev.gusevang.graph;

import java.util.ArrayList;
import java.util.Random;
import java.util.function.Predicate;

public class Graph<T> {
    class Node {
        int id;             // UUID
        T value;            // generic
        ArrayList<Node> in;
        ArrayList<Node> out;

        Node(int id, T val){
            this.id = id;
            value = val;
            in = new ArrayList<Node>();
            out = new ArrayList<Node>();
        }
    }

    public Graph(int nodesNumber){
        ArrayList<Node> nodes  = new ArrayList<Node>[];
        int[] ins = new int[nodesNumber];
        int[] outs = new int[nodesNumber];

        for(int i=0; i<nodesNumber; ++i){
            ins[i] = Random.;
            outs[i] = ;
        }

        for(int i=0; i< nodesNumber; ++i){
            nodes.add(new Node(i+1,));
        }

    }

    public Iterable<T> find(Predicate<T> predicate) {

    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.graph_drawing;

import java.util.Scanner;

/**
 *
 * @author Ahmed Hisham
 */
public class main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int nodenumber, eadges_num,root,distination;
        System.out.println("Enter  the number of nodes you need");
        nodenumber = input.nextInt();
        System.out.println("Enter  the number of eadges you need");
        eadges_num = input.nextInt();
        graph new_graph = new graph(nodenumber, eadges_num);
        new_graph.clear();
        eadges neweadge = new eadges(nodenumber, eadges_num);
        new_graph.adj_graph = neweadge.adj_graph;
        neweadge.input(eadges_num);
        int query_type=0;
        while (query_type!=10)
        {
            System.out.println("Enter numberof choise type of query you want ?");
            System.out.println("1-add node");
            System.out.println("2-delete node");
            System.out.println("3-add edge or update ");
            System.out.println("4-delete eadge");
            System.out.println("5-clear graph");
            System.out.println("6-disply graph");
            System.out.println("7-calculate shortest path between two nodes");
            System.out.println("8-disply children of node");
            System.out.println("9-check if the graph is totaly connected");
            System.out.println("10-Exit");
            query_type = input.nextInt();
            node new_node = new node(nodenumber,eadges_num);
            switch (query_type)
            {
                case 1:
                    new_node.add_node();
                    break;
                case 2:
                    neweadge.popnode();
                    break;
                case 3:
                    neweadge.add_edge();
                    break;
                case 4:
                    neweadge.Delete_Edge();
                    break;
                case 5:
                    new_graph.clear();
                    break;
                case 6:
                    new_graph.displaymatrix();
                    break;
                case 7:
                    System.out.println("Enter two nodes that you want to calculate the shortest path between");
                    root= input.nextInt();
                    distination= input.nextInt();
                    new_graph.dijkstra(root-1,distination);
                    break;
                case 8:
                    neweadge.showChildren();
                    break;
                case 9:
                    System.out.println("Enter any node to be root of traverse algorithm");
                    root= input.nextInt();
                    for(int i=0;i>1000;i++)
                    {
                        new_graph.visited[i]=0;
                    }
                    if(new_graph.dfs(root-1)+1==new_graph.nodenumber)
                        System.out.println("connected graph ");
                    else
                        System.out.println("is not full connected graph");
                    break;
                default:
            }
        }
    }

}

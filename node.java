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

public class node extends graph
{
    public int value;
    public node( int nodenumber, int eadges) {
        super(nodenumber, eadges);
    }
    public  void add_node ()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of new node ");
        value=input.nextInt();
        nodenumber++;
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labquiz5;

import java.util.ArrayList;

/**
 *
 * @author Mehmet Sait
 */
public class LabQuiz5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         ArrayList<Integer> A=new ArrayList<Integer>(5);
        ArrayList<Integer> B=new ArrayList<Integer>(3);
        A.add(1);A.add(2);A.add(4);A.add(6);A.add(8);
        B.add(2);B.add(7);B.add(8);
        ArrayList<Integer> C=new ArrayList<Integer>();
        System.out.println("A="+A.toString());
        System.out.println("B="+B.toString());
        
        for(int k=0;k<A.size();k++)
        { 
            for(int l=0;l<B.size();l++)
            {
                if(A.get(k)==B.get(l)) C.add(A.get(k));
            }
        }
       
        
        System.out.println("A ile B nin ortak elemanları="+ C.toString());
    }
    
}

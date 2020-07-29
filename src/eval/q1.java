/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eval;

import java.util.Scanner;

/**
 *
 * @author Formation
 */
public class q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
           Scanner reader = new Scanner(System.in);
       final int n=10;
       int i,tmp;
       //declaration du tableau 
       int[] tab;
       //creation du tableau 
       tab= new int [n];
       //lecture du tableau
       
        for(i=0; i<n;i++){
        System.out.print("saisir une valeur");
        tab[i]=reader.nextInt();
        }
         //reverse
          for (i=0;i<n/2;i++){
              tmp=tab[i];
              tab[i]=tab[n-i-1];
              tab[n-i-1]=tmp;
          }
              //affichage du tableau inversé
              for (i=0; i<n; i++){
           
      System.out.print(tab[i] + "");}
              
        
            
        
          }
        
        
        
        
          
    }
    


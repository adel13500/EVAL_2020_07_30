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
public class q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        final int nl=5, nc=2;
              int  max,min,amp=0,j,i;
              int tab [][]= new int [nl][nc];
              
              for (i=0;i<nl;i++){
               for (j=0; j<nc; j++){
            System.out.print("saisir une valeur");
          tab [i][j]=reader.nextInt();}
              }
              
              max=tab[0][0];
              min=tab[0][0];
              for (i=1;i<nl;i++){
                  for (j=1;j<nc;j++){
                  if (tab[i][j]>max){
                      max=tab[i][j];}
                      else if (tab[i][j]<min)
                       min=tab[i][j];
                       amp=max-min;
                              }
                                     }
                       
                     
              
              System.out.println("l'amplitude est "+amp);
     
        
        
    }
    
}

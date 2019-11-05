/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package struktur_data;

/**
 *
 * @author user
 */
public class Struktur_data {
  public static void main(String[] args) {
     int nilai [][] = {{2,4,6,8},{3,9,27,30},{4,16,20,24},{15,25,35,45}};      
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai [i].length; j++){
                System.out.print(nilai[i][j]+"\t");
                
         
            
            }
            System.out.println();
        }
        
    }
}  
    
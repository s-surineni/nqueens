/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nqueens;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author vinnu
 */
public class Nqueens {
static int[][] Arr=new int[4][4];
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        System.out.println("input the value of n");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nsize=Integer.parseInt(br.readLine());
        System.out.println(nsize);
        Nqueens no=new Nqueens();
        no.Display(Arr);
        no.solve(Arr);
        
        
    }
    void Display(int[][] Arr){
        for(int trk=0;trk<4;trk++){
         for(int trk1=0;trk1<4;trk1++)   {
             System.out.print(Arr[trk][trk1]+" ");
         }
         System.out.println();
        }
    }
    
    void solve(int[][] Arr){
        solveRecu(Arr,0);
    }
    void solveRecu(int[][] Arr,int col){
        for(int trk=0;trk<4;trk++){
            for(int trk1=0;trk1<trk;trk++){
                if(Arr[col][trk1]==1){
                    continue;
                }
                int rowt=trk;
                for(int trk2=col-1;trk2>=0&&rowt>=0;trk2--,rowt--){
                    if(Arr[trk2][rowt]==1){
                        continue;
                    }
                }
            }
            
        }
    }
}

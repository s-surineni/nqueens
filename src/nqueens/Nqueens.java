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
int[][] Arr=new int[4][4];
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Nqueens obj=new Nqueens();
        obj.start();
        
    }
    
    void start(){
        
        for(int colc=0;colc<4;colc++){
            checkIC(colc);
            Display(Arr);
            System.out.println("in checkic");
        }
        Display(Arr);
    }
    
    boolean checkIC(int colc){//this function is for checking in a column
        if(colc>3){
            return true;
        }
        for(int tr=0;tr<4;tr++){//this iterates through elements in a row
            
            
            if(isSafe(tr, colc)){
                
                
                Arr[tr][colc]=1;
                if(checkIC(colc+1)==true)//got an error when checkIC(colc+1)==false was here
                {
                  return true;  //got an error when Arr[tr][colc]=0 was here
                }
                Arr[tr][colc]=0;
                
            }           
        }
        return false;
    }
    
    boolean isSafe(int tr,int colc){
        for(int fr=tr,clm=0;clm<colc;clm++){//this for checking whether elements are in a row
                if(Arr[fr][clm]==1){//here we keep row constant and increment column value to check in that row
                    return false;
                }
            }
            int sr=tr-1;//this saves the value of current row
            for(int ud=colc-1;ud>=0&&sr>=0;ud--,sr--){//this loop checks for upper diagonal
                if(Arr[sr][ud]==1){
                    return false;
                }
                            }
            int sr2=tr+1;//this also saves the value of current row
            for(int ld=colc-1;ld>=0&&sr2<4;ld--,sr2++){
                if(Arr[sr2][ld]==1){
                    return false;
                }
            }
            
            return true;
    }
    
    void Display(int[][] Arr){
        for(int trk=0;trk<4;trk++){
         for(int trk1=0;trk1<4;trk1++)   {
             System.out.print(Arr[trk][trk1]+" ");
         }
         System.out.println();
        }
    }
    
    
}

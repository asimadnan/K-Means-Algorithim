/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package k_means;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author asimadnan
 */
public class K_Means {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kmeans k = new Kmeans();
        Centroid c1 = new Centroid(2,10);
        Centroid c2 = new Centroid(5,8);
        Centroid c3 = new Centroid(1,2);
        
        Data d1 = new Data(2,10);
        Data d2 = new Data(2,5);
        Data d3 = new Data(8,4);
        Data d4 = new Data(5,8);
        Data d5 = new Data(7,5);
        Data d6 = new Data(6,4);
        Data d7 = new Data(1,2);
        Data d8 = new Data(4,9);
        
        
        k.setNumClusters(3);
        
        k.addCentroid(c1);
        k.addCentroid(c2);
        k.addCentroid(c3);
        
        k.addData(d1);
        k.addData(d2);
        k.addData(d3);
        k.addData(d4);
        k.addData(d5);
        k.addData(d6);
        k.addData(d7);
        k.addData(d8);
        
        for(int i=0;i<20;i++){
            k.calDist();
            k.ChooseNewCenter();
        }
        
    //    k.DisplayData();
      //  k.DisplayCentroids();
        
        Kmeans k2 = new Kmeans();
        
        final Random r = new Random();
        int max=7;
        int min=0;
        int maxD = 5000;
        int minD = -5000;
       
        for (int i=0;i<1000;i++){
           Data temp = new Data();
           temp.setX(r.nextInt((maxD - minD) + 1) + minD);
           temp.setY(r.nextInt((maxD - minD) + 1) + minD);
           temp.setCluster(r.nextInt((max - min) + 1) + min);
           
           k2.addData(temp);
       }
       int num =8;
        k2.setNumClusters(num);
       
        for(int i=0;i<num;i++){
            Centroid center = new Centroid(r.nextInt((max - min) + 1) + min,r.nextInt((max - min) + 1) + min);
            k2.addCentroid(center);
        }
        
       k2.DisplayCentroids();
       k2.DisplayData();
       for(int i=0;i<=10;i++){
           k2.calDist();
            k2.ChooseNewCenter();
            if(i%5 == 0){
                k2.DisplayData();
            }
            
        }
        k2.DisplayData();
                k2.DisplayCentroids();
        
        
      /*  
        
        Kmeans k3 = new Kmeans();
        
        int maxK = 4;
        int minK = 0;
        
        for(int i=0;i<100;i++){
            Data temp = new Data();
           temp.setX(i);
           temp.setY(Math.sin(i));
           temp.setCluster(r.nextInt((maxK - minK) + 1) + minK);
           k3.addData(temp);
        }
        k3.setNumClusters(3);
      */  
    } 
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package k_means;

import java.awt.Color;
import java.util.ArrayList;
import javafx.scene.chart.NumberAxis;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberTickUnit;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.xy.XYDataset;

/**
 *
 * @author asimadnan
 */
public class Kmeans {
    
    int k; // number of cluster
   
    private static ArrayList<Data> dataSet = new ArrayList<Data>();
    private static ArrayList<Centroid> centroids = new ArrayList<Centroid>();
   // private static ArrayList<Centroid> centroidTemp = new ArrayList<Centroid>();
    
        Kmeans(){
        
                }
        
        public void setNumClusters(int num){
            this.k = num;
        }
        
        public void addData(Data D){
          
            dataSet.add(D);  
        }
        
        public void addCentroid(Centroid C){
            
            centroids.add(C);
            
        }
        
        public  void calDist(){
          
            double distance =0;
            double minimum = 0;
            int cluster = 0;
            double bignum = Math.pow(10,10);
            
            
            for(int i=0;i<dataSet.size();i++){
                minimum = bignum;
                for(int j=0; j< k;j++){
                    distance = Distance.EDistance(dataSet.get(i), centroids.get(j));
                    if (distance < minimum){
                        minimum = distance;
                        cluster = j;
                    }
                    dataSet.get(i).setCluster(cluster);
                }
            }
            
        }
        
   
        
        public void ChooseNewCenter(){
            for(int i=0;i<k;i++){
                double totalX =0;
                double totalY =0;
                int totalInCluster =0;
                
                for(int j=0;j<dataSet.size();j++){
                   
                    if(dataSet.get(j).getCluster() == i){
                        
                        totalX += dataSet.get(j).getX();
                        totalY += dataSet.get(j).getY();
                        totalInCluster++;
                       
                    }
                }
                 if (totalInCluster > 0 ){
                        
                        centroids.get(i).setX(totalX/totalInCluster);
                        centroids.get(i).setY(totalY/totalInCluster);
                    }
            }
            
        }
        
        public void Display(){
            
            for(int i=0;i<dataSet.size();i++){
                for(int j=0;j<centroids.size();j++){
                    if(dataSet.get(i).getCluster() == j){
                        System.out.println("Cluster :" + i + " X :" +centroids.get(j).getX() + " Y :" + centroids.get(j).getX());
                    }
                    System.out.println();
                }
            }
                
        }
        
        public void DisplayData(){
            for(int i=0;i<dataSet.size();i++){
                System.out.println("X:" + dataSet.get(i).getX() + " Y:" + dataSet.get(i).getY() + " CLUSTER :" + dataSet.get(i).getCluster());
            }
            
            XYDataset d = Plot.createDataset(dataSet,k);
            
             JFreeChart chart = ChartFactory.createScatterPlot("DataPlot","X","Y",d,PlotOrientation.VERTICAL,true,true,false );
          // create and display a frame...
            ChartFrame frame = new ChartFrame("First", chart);
            frame.pack();
            frame.setVisible(true);
            
            
             
   
        }
        
        public void DisplayCentroids(){
            for(int i=0;i<centroids.size();i++){
                System.out.println("XCC:" + centroids.get(i).getX() + " Y:" + centroids.get(i).getY());
            }
        }
        
   /*     public void KmeansCluster(){
            
            final double bigNumber = Math.pow(10, 10);    // some big number that's sure to be larger than our data range.
            double minimum = bigNumber;                   // The minimum value to beat. 
            double distance = 0.0;                        // The current minimum value.
            int sampleNumber = 0;
            int cluster = 0;
            boolean isStillMoving = true;
            Data newData = null;
            //Distance D =  new Distance();
            
            for(int i=0;i<dataSet.size();i++){
                
                minimum = bigNumber;
                for(int j=0; i< k;j++){
                    distance = Distance.EDistance(dataSet.get(i), centroids.get(j));
                    if (distance < minimum){
                        minimum = distance;
                        cluster = j;
                    }
                    dataSet.get(i).setCluster(cluster);
                }
            }
            
            for(int l=0;l<k;l++){
                int totalX =0;
                int totalY =0;
                int totalInCluster =0;
                for(int m=0;m<dataSet.size();m++){
                    if(dataSet.get(m).getCluster() == k){
                        
                        totalX += dataSet.get(m).getX();
                        totalY += dataSet.get(m).getY();
                        totalInCluster++;
                        
                    }
                }
                 if (totalInCluster > 0 ){
                        centroids.get(l).setX(totalX/totalInCluster);
                        centroids.get(l).setY(totalY/totalInCluster);
                    }
            }
            
        } */
}

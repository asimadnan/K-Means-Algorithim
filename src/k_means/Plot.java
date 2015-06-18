/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package k_means;
import java.util.ArrayList;
import java.util.Random;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
/**
 *
 * @author asimadnan
 */
public class Plot {

        private static final Random r = new Random();
        // create a chart...
           
      
        
        
        public static XYDataset createDataset(ArrayList<Data> dataSet , int k) {
            
            
            final XYSeriesCollection dataset = new XYSeriesCollection( );
              
                        for(int i=0;i<k;i++){
                            String str = "Cluster " + (i+1);
                            XYSeries  cluster = new XYSeries(str);
                            for(int j=0;j<dataSet.size();j++){
                                
                               
                           
                                if(dataSet.get(j).getCluster() == i){
                            cluster.add(dataSet.get(j).getX(),dataSet.get(j).getY()); }
                            
                            }
                            dataset.addSeries( cluster ); 
                        }       
                        
                        
                           
                                  
                        
                        return dataset;

        }
        
      

         
    
}
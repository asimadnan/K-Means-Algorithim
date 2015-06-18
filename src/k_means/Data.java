/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package k_means;

/**
 *
 * @author asimadnan
 */
public class Data {
    
        private double mX = 0;
        private double mY = 0;
        private int mCluster = 0;
        private double disFrmCluster =0;
        
        public Data()
        {
           
        }
        
        public Data(double x, double y)
        {
            this.mX = x;
            this.mY = y;
           
        }
        
        public void setDisFrmClus(double c){
            this.disFrmCluster = c;
        }
        
        public double getDisFrmClus(){
            return this.disFrmCluster;
        }
        
        public void setX(double x)
        {
            this.mX = x;
        }
        
        public double getX()
        {
            return this.mX;
        }
        
        public void setY(double y)
        {
            this.mY = y;
        }
        
        public double getY()
        {
            return this.mY;
        }
        
        public void setCluster(int clusterNumber)
        {
            this.mCluster = clusterNumber;
        }
        
        public int getCluster()
        {
            return this.mCluster;
        }
}

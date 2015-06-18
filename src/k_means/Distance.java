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
public class Distance {
    
    Distance(){ }
   // Euclidean distance.
   //Data object d.
   //Centroid object c
   //return - double value.
   
    static double EDistance(Data d, Centroid c)
    {
        return Math.sqrt(Math.pow((c.getY() - d.getY()), 2) + Math.pow((c.getX() - d.getX()), 2));
    }
    
 
}

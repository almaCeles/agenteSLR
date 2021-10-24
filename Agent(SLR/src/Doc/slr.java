
package Doc;

import java.util.Arrays;

/**
 *
 * @author celeste
 */
public class slr {
    
    
    public double [] calcularBs(int n, double  a[][]){
        ////
         double  xyy = 0, y = 0, x = 0, x22 = 0;
          double xy [],x2[];
          
          
    
           xy=new double[n];
           x2=new double[n];
           
           
           
         for(int d=0; n>d ;d++ ){
            y+=a[d][0];
            x+=a[d][1];
            xy[d]=a[d][1]*a[d][0];
            x2[d]=a[d][1]*a[d][1];
         }
         
         for(int d=0; n>d ;d++ ){
            xyy+=xy[d];
            x22+=x2[d];           
         } 
     ///////////
        double b []= new double  [2]; 
        
        b[0]=((x22*y)-(x*xyy))/((n*x22)-(Math.pow(x,2)));
        b[1]=((n*xyy)-(x*y))/((n*x22)-(Math.pow(x,2)));
          return b;
    }
    
    public double predecir(double B0, double B1, double r){
         double yy=B0+(B1*r);
        return yy;
    }
}


package Doc;

import java.util.Arrays;

/**
 *
 * @author celeste
 */
public class slr {
    static int n;
    static double   xyy, y , x, x22;
    static double a [][];
    static  double xy [],x2[];
    public slr( double[][] datos , int n){
        this.n= n;
        xy=new double[n];
        x2=new double[n];
        this.a=datos;
         
    }
    
     public void calcularVariables(){
         
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
     
    }
    public double calcularB0(){
         double hu=((x22*y)-(x*xyy))/((n*x22)-(Math.pow(x,2))); 
         return  hu;         
    }
    public double calcularB1(){
         double hu=((n*xyy)-(x*y))/((n*x22)-(Math.pow(x,2))); 
         return  hu;         
    }
    
    public double predecir(double B0,double B1, double dato){
       
        double yy=B0+(B1*dato);
        
        return yy;
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Doc;
import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;
import java.util.Arrays;
/**
 *
 * @author celeste
 */
public class AgentSLR extends Agent{
    
     gui gui;
    public void setup(){
        System.out.println("Hola Mundo");
        gui gui = new gui(this);
	gui.showGui(); 
        
    }
    protected void takeDown() {
        gui.dispose();
    }
    public void predecir(double numero){
        addBehaviour(new OneShotBehaviour() {
            public void action() {
                double[][] datos= new double[][]{
				{651,23},
				{762,26},
				{856,30},
				{1063,34},
				{1190,43},
				{1298,48},
				{1421,52},
				{1440,57},
				{1518,58}
				};
                  
                slr s=new slr( );
               s.calcularBs( datos.length,datos);
               
               
                double b0=s.calcularBs( datos.length,datos)[0];
                double b1=s.calcularBs( datos.length,datos)[1];
                System.out.println("b0: "+b0);
                System.out.println("b0: "+b1);
                
                System.out.println("resultado : "+numero+"," +s.predecir(b0,b1,numero));
                

            }
        });
    }
    
    
}

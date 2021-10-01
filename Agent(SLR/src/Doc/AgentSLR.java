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
                  
                slr s=new slr( datos,datos.length);
                s.calcularVariables();
              
                System.out.println("b0: "+s.calcularB0());
                System.out.println("b0: "+s.calcularB1());
                
                System.out.println("resultado : "+numero+"," +s.predecir(s.calcularB0(),s.calcularB1(),numero));
                

            }
        });
    }
    
    
}

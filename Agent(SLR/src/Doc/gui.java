/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Doc;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author celeste
 */
public class gui extends JFrame{
    private AgentSLR myAgent;
    private JTextField numero;
    
    gui(AgentSLR a){
        super(a.getLocalName());
        
        myAgent =a;
        
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(2,2));
        p.add(new JLabel("Regresion Lineal"));
        numero = new JTextField(15);
        p.add(numero);
        getContentPane().add(p, BorderLayout.CENTER);
        
        
        JButton boton = new JButton("Pronosticar");
        boton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
              
		String x = numero.getText().trim();
		myAgent.predecir(Integer.parseInt(x));
		numero.setText("");			
		
              }
           
            });
            p = new JPanel();
	    p.add(boton);
	    getContentPane().add(p, BorderLayout.SOUTH);
            
            addWindowListener(new WindowAdapter(){
                 public void windowClosing(WindowEvent e){
                   myAgent.doDelete();
                 }
                 
            } );
            
            setResizable(false);
        
    }
    public void showGui() {
		pack();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int centerX = (int)screenSize.getWidth() / 2;
		int centerY = (int)screenSize.getHeight() / 2;
		setLocation(centerX - getWidth() / 2, centerY - getHeight() / 2);
		super.setVisible(true);
	}
}

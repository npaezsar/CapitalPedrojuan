/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitalpedrojuan;

import javax.swing.JOptionPane;

/**
 *
 * @author npaez
 */
public class CapitalPedrojuan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //Declaración de variables
        int n;
        double C1, C2, C3;
        String rta = "Capital - Meses: \n\n";
        
        //Entrada de datos (input)
        C1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el capital de Pedro: "));
        C2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el capital de Juan: "));
        C3 = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor del negocio: "));
         
        //Operaciones o calculos o procesos
        n = 0;
        
        while(C1 + C2 < C3)
        {
            rta = rta + "C1: "+ C1 + " -- C2: " + C2 + " -- C3: " + (C1 + C2) + "\n"; 
            C1 = 1.03*C1;
            C2 = 1.04*C2;
            n++;
        }
        
        rta = rta + "C1: "+ C1 + " -- C2: " + C2 + " -- C3: " + (C1 + C2) + "\n";
        
        
        //Salida
        JOptionPane.showMessageDialog(null,rta + "\nEl negocio se puede hacer a los1 " + n + " meses");
        
        //Fin y liberación
        System.exit(0);
    }
    
}

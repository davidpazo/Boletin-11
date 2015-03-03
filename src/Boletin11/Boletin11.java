package Boletin11;

import javax.swing.JOptionPane;

/** @author dpazolopez */
public class Boletin11 {
        
   public static void main(String[] args) {
       // guardar timestamp inicio
       long inicio = System.currentTimeMillis();

       // hacer algo
       JOptionPane.showInputDialog(null,"Escribe a seguinte frase: A documentación é todo aquel conxunto de manuais impresos "
               + "ou en formato dixital que explique unha aplicación informática .");
       
       // calcular tiempo transcurrido
       long fin = System.currentTimeMillis();
       JOptionPane.showMessageDialog(null,"Preme enter para rematar");
       long resultado = fin - inicio;
        JOptionPane.showMessageDialog(null,"Tardaches: " + resultado / 1000 +" segundos en escribir a frase" );
          }
}


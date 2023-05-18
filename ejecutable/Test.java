package ejecutable; 

import javax.swing.JOptionPane;

import modelo.division;
import modelo.multiplicacion;
import modelo.resta;
import modelo.suma;

public class Test{
    public static void main(String[] args) {
        double x= Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de x:"));
        double y= Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de y:"));

        //creacion de un objeto suma 
        suma miSuma= new suma(x,y);
        miSuma.sumar();
        JOptionPane.showMessageDialog(null, "La suma de " + x +" y " + y +"es: " + miSuma.mostrarResultado());
       
        //objeto resta 
        resta miResta= new resta(x, y);
        miResta.restar();
        JOptionPane.showMessageDialog(null, "La Resta de " +x +"y" + y+"es: " + miResta.mostrarResultado());
        

        //objeto multiplicacion 
        multiplicacion miMultiplicacion= new multiplicacion(x, y);
        miMultiplicacion.multiplicar();
        JOptionPane.showMessageDialog(null, "La multiplicaion  de " +x +"y" + y+"es: " + miMultiplicacion.mostrarResultado());
     
        //objeto division 
        while (y==0){
        division miDivision= new division(x, y);
        miDivision.dividir();
        JOptionPane.showMessageDialog(null, "La division de " +x +"y" + y+"es: " + miSuma.mostrarResultado());
        System.exit(0);
        }


    }
}
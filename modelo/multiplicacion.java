package modelo;

public class multiplicacion extends Opercaion{
    //constructor 
    public multiplicacion(double x, double y){
        super(x, y);
    }
    //metodos 
    public void multiplicar(){
        resultado=x*y;
    }

}
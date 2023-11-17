package Figuras;
/**
 *
 * @author Laura
 */
public class Esfera extends FiguraGeometrica{
    private double radio;//Atributo que identifica el radio de una esfera
    
    /**
    * Constructor de la clase Esfera con valor double radio
    */
    public Esfera(double radio){
        this.radio = radio;
        this.setVolumen(calcularVolumen());
        this.setSuperficie(calcularSuperficie());
    }
    
    /**
    * Metodo que calcula el volumen de la esfera
    * @return El volumen calculado
    */
    public double calcularVolumen(){
        double volumen = 1.333 * Math.PI * Math.pow(radio, 3);
        return volumen;
    }
    /**
    * Metodo que calcula la superficie del cilindro
    * @return La superficie calculada
    */
    public double calcularSuperficie(){
        double superficie = 4 * Math.pow(radio, 2) * Math.PI;
        return superficie;
    }
}

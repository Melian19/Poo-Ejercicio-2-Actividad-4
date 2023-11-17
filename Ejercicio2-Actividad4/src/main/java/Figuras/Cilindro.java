package Figuras;

/**
 *
 * @author Laura
 */
public class Cilindro extends FiguraGeometrica{
    private double radio; //Atributo que identifica el radio de un cilindro
    private double altura;//Atributo que identifica la altura de un cilindro
    
    /**
    * Constructor de la clase Cilindro con valores double radio y altura
    */
    public Cilindro(double radio, double altura){
        this.radio = radio;
        this.altura = altura;
        this.setVolumen(calcularVolumen());
        this.setSuperficie(calcularSuperficie());
    }
    
    /**
    * Metodo que calcula el volumen del cilindro
    * @return El volumen calculado
    */
    public double calcularVolumen(){
        double volumen = Math.PI * altura * Math.pow(radio,2);
        return volumen;
    }
    
    /**
    * Metodo que calcula la superficie del cilindro
    * @return La superficie calculada
    */
    public double calcularSuperficie(){
        double areaLadoA, areaLadoB;
        areaLadoA = 2 * Math.PI * radio * altura;
        areaLadoB = 2 * Math.PI * Math.pow(radio, 2);
        return areaLadoA+areaLadoB;
    }
}

package Figuras;
/**
 *
 * @author Laura
 */
public class Piramide extends FiguraGeometrica{
    private double base;//Atributo que identifica la base de una piramide
    private double altura;//Atributo que identifica la altura de una piramide
    private double apotema;//Atributo que identifica la apotema de una piramide
    
    /**
    * Constructor de la clase Piramide con valores double base, altura y apotema
    */
    public Piramide(double base, double altura, double apotema){
        this.base = base;
        this.altura = altura;
        this.apotema = apotema;
        this.setVolumen(calcularVolumen());
        this.setSuperficie(calcularSuperficie());
    }
    
    /**
    * Metodo que calcula el volumen de la piramide
    * @return El volumen calculado
    */
    public double calcularVolumen(){
        double volumen = (Math.pow(base,2) * altura) / 3;
        return volumen;
    }
    /**
    * Metodo que calcula la superficie de la piramide
    * @return La superficie calculada
    */
    public double calcularSuperficie(){
        double areaBase,areaLado;
        areaBase = Math.pow(base,2);
        areaLado = 2 * base * apotema;
        return areaBase + areaLado;
    }
}

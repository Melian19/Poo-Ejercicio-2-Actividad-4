package Figuras;
/**
 *
 * @author Laura
 */
public class FiguraGeometrica {
    private double volumen;//Atributo que identifica el volumen de la figura
    private double superficie;//Atributo que identifica la superficie de la figura
    
    /**
    * Metodo que define el valor del volumen de la figura
    */
    public void setVolumen(double volumen){
        this.volumen = volumen;
    }
    /**
    * Metodo que recupera el valor del volumen de la figura
    * @return atributo volumen
    */
    public double getVolumen(){
        return volumen;
    }
    /**
    * Metodo que define el valor de la superficie de la figura
    */
    public void setSuperficie(double superficie){
        this.superficie = superficie;
    }
    /**
    * Metodo que recupera el valor de la superficie de la figura
    * @return atributo atributo superficie
    */
    public double getSuperficie(){
        return superficie;
    }
}

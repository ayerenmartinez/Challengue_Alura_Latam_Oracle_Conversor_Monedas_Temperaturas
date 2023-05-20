package ENTIDADES;

public class Convertidor {

    public Convertidor() {

    }

    public  Double convertirSolesDolares(Double dineroConvertir){
        return dineroConvertir / 3.69568;
    }
    public  Double convertirSolesEuros(Double dineroConvertir){
        return dineroConvertir / 4.00020;
    }
    public  Double convertirSolesLibras(Double dineroConvertir){
        return dineroConvertir / 4.60033;
    }
    public  Double convertirSolesYen(Double dineroConvertir){
        return dineroConvertir / 0.0267830;
    }
    public  Double convertirSolesWonCoreano(Double dineroConvertir){
        return dineroConvertir / 0.00278891;
    }

    public Double convertirDolaresSoles(Double dineroConvertir){
        return dineroConvertir * 3.69568;
    }
    public Double convertirEurosSoles(Double dineroConvertir){
        return dineroConvertir * 4.00020;
    }
    public Double convertirLibrasSoles(Double dineroConvertir){
        return dineroConvertir * 4.60033;
    }
    public Double convertirYenesSoles(Double dineroConvertir){
        return dineroConvertir * 0.0267830;
    }
    public Double convertirWonCoreanoSoles(Double dineroConvertir){
        return dineroConvertir * 0.00278884 ;
    }

    public Double convertirCelsiusFarenheit(Double temperaturaConvertir){
        return ((temperaturaConvertir * 9 )/5) + 32;
    }
    public Double convertirCelsiusKelvin(Double temperaturaConvertir){
        return temperaturaConvertir + 273.15;
    }
    public Double convertirCelsiusRankine(Double temperaturaConvertir){
        return ((temperaturaConvertir * 9 )/5) + 491.67;
    }
    public Double convertirFarenheitCelsius(Double temperaturaConvertir){
        return ((temperaturaConvertir - 32 ) * 5)/9;
    }
    public Double convertirKelvinCelsius(Double temperaturaConvertir){
        return temperaturaConvertir - 273.15;
    }
    public Double convertirRankineCelsius(Double temperaturaConvertir){
        return  ((temperaturaConvertir - 491.67) * 5)/9;
    }
}

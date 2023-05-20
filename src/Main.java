import ENTIDADES.Convertidor;
import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Convertidor convertidor = new Convertidor();
        Boolean continuar = true;
        Double dineroConvertir = 0.0;
        Double temperaturaConvertir = 0.0;

        while(continuar){
            String [] opcionConversion = {
                    "Conversor de Moneda",
                    "Conversor de Temperatura"
            };
            String opcion = (String) JOptionPane.showInputDialog(
                    null,
                    "Selecciona una opción de conversión",
                    "Menu",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opcionConversion,
                    opcionConversion[0]
            );
            switch (opcion){
                case "Conversor de Moneda":{
                    dineroConvertir = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingresa la cantidad de dinero que deseas convertir: "));
                    String[] monedasConversion = {
                            "De Soles a Dólar",
                            "De Soles a Euro",
                            "De Soles a Libras",
                            "De Soles a Yen",
                            "De Soles a Won Coreano",
                            "De Dólar a Soles",
                            "De Euro a Soles",
                            "De Libras a Soles",
                            "De Yen a Soles",
                            "De Won Coreano a Soles"
                    };
                    String monedaDeConversion = (String) JOptionPane.showInputDialog(
                            null,
                            "Elije la moneda a la que deseas convertir tu dinero",
                            "Monedas",
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            monedasConversion,
                            monedasConversion[0]
                    );

                    switch (monedaDeConversion){
                        case "De Soles a Dólar":{
                            JOptionPane.showMessageDialog(null,"Tienes: "+String.format("%.2f",convertidor.convertirSolesDolares(dineroConvertir)).toString()+" Dólares");
                            continuar = continuar();
                            mostrarMensajeProgramaTerminado(continuar);
                            break;
                        }
                        case "De Soles a Euro":{
                            JOptionPane.showMessageDialog(null,"Tienes: "+String.format("%.2f",convertidor.convertirSolesEuros(dineroConvertir)).toString()+" Euros");
                            continuar = continuar();
                            mostrarMensajeProgramaTerminado(continuar);
                            break;
                        }
                        case "De Soles a Libras":{
                            JOptionPane.showMessageDialog(null,"Tienes: "+String.format("%.2f",convertidor.convertirSolesLibras(dineroConvertir)).toString()+" Libras");
                            continuar = continuar();
                            mostrarMensajeProgramaTerminado(continuar);
                            break;
                        }
                        case "De Soles a Yen":{
                            JOptionPane.showMessageDialog(null,"Tienes: "+String.format("%.2f",convertidor.convertirSolesYen(dineroConvertir)).toString()+" Yenes");
                            continuar = continuar();
                            mostrarMensajeProgramaTerminado(continuar);
                            break;
                        }
                        case "De Soles a Won Coreano":{
                            JOptionPane.showMessageDialog(null,"Tienes: "+String.format("%.2f",convertidor.convertirSolesWonCoreano(dineroConvertir)).toString()+" Wones Coreanos");
                            continuar = continuar();
                            mostrarMensajeProgramaTerminado(continuar);
                            break;
                        }
                        case "De Dólar a Soles":{
                            JOptionPane.showMessageDialog(null,"Tienes: "+String.format("%.2f",convertidor.convertirDolaresSoles(dineroConvertir)).toString()+" Soles");
                            continuar = continuar();
                            mostrarMensajeProgramaTerminado(continuar);
                            break;
                        }
                        case "De Euro a Soles":{
                            JOptionPane.showMessageDialog(null,"Tienes: "+String.format("%.2f",convertidor.convertirEurosSoles(dineroConvertir)).toString()+" Soles");
                            continuar = continuar();
                            mostrarMensajeProgramaTerminado(continuar);
                            break;
                        }
                        case "De Libras a Soles":{
                            JOptionPane.showMessageDialog(null,"Tienes: "+String.format("%.2f",convertidor.convertirLibrasSoles(dineroConvertir)).toString()+" Soles");
                            continuar = continuar();
                            mostrarMensajeProgramaTerminado(continuar);
                            break;
                        }
                        case "De Yen a Soles":{
                            JOptionPane.showMessageDialog(null,"Tienes: "+String.format("%.2f",convertidor.convertirYenesSoles(dineroConvertir)).toString()+" Soles");
                            continuar = continuar();
                            mostrarMensajeProgramaTerminado(continuar);
                            break;
                        }
                        case "De Won Coreano a Soles":{
                            JOptionPane.showMessageDialog(null,"Tienes: "+String.format("%.2f",convertidor.convertirWonCoreanoSoles(dineroConvertir).toString())+" Soles");
                            continuar = continuar();
                            mostrarMensajeProgramaTerminado(continuar);
                            break;
                        }
                    }

                    break;
                }
                case "Conversor de Temperatura":{
                    String[] temperaturasConversion = {
                            "De Celsius a Farenheti",
                            "De Celsius a Kelvin",
                            "De Celsius a Rankine",
                            "De Farenheit a Celsius",
                            "De Kelvin a Celsius",
                            "De Rankine a Celsius"
                    };
                    String temperaturaDeConversion = (String) JOptionPane.showInputDialog(
                            null,
                            "Elige la temperatura a la que deseas convertir",
                            "Temperaturas",
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            temperaturasConversion,
                            temperaturasConversion[0]
                    );
                    temperaturaConvertir = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingresa la temperatura que desea convertir: "));
                    switch (temperaturaDeConversion){
                        case "De Celsius a Farenheti":{
                            JOptionPane.showMessageDialog(null,"La Temperatura en Farenheit es: "+String.format("%.2f",convertidor.convertirCelsiusFarenheit(temperaturaConvertir))+"Fª");
                            continuar = continuar();
                            mostrarMensajeProgramaTerminado(continuar);
                            break;
                        }
                        case "De Celsius a Kelvin":{
                            JOptionPane.showMessageDialog(null,"La Temperatura en Kelvin es: "+String.format("%.2f",convertidor.convertirCelsiusKelvin(temperaturaConvertir))+"Kª");
                            continuar = continuar();
                            mostrarMensajeProgramaTerminado(continuar);
                            break;
                        }
                        case "De Celsius a Rankine":{
                            JOptionPane.showMessageDialog(null,"La Temperatura en Rankine es: "+String.format("%.2f",convertidor.convertirCelsiusRankine(temperaturaConvertir))+"Rª");
                            continuar = continuar();
                            mostrarMensajeProgramaTerminado(continuar);
                            break;
                        }
                        case "De Farenheit a Celsius":{
                            JOptionPane.showMessageDialog(null,"La Temperatura en Celsius es: "+String.format("%.2f",convertidor.convertirFarenheitCelsius(temperaturaConvertir))+"Cª");
                            continuar = continuar();
                            mostrarMensajeProgramaTerminado(continuar);
                            break;
                        }
                        case "De Kelvin a Celsius":{
                            JOptionPane.showMessageDialog(null,"La Temperatura en Celsius es: "+String.format("%.2f",convertidor.convertirKelvinCelsius(temperaturaConvertir))+"Cª");
                            continuar = continuar();
                            mostrarMensajeProgramaTerminado(continuar);
                            break;
                        }
                        case "De Rankine a Celsius":{
                            JOptionPane.showMessageDialog(null,"La Temperatura en Celsius es: "+String.format("%.2f",convertidor.convertirRankineCelsius(temperaturaConvertir))+"Cª");
                            continuar = continuar();
                            mostrarMensajeProgramaTerminado(continuar);
                            break;
                        }
                    }
                    break;
                }
            }
        }

    }
    public static Boolean  continuar(){
        int salir = JOptionPane.showConfirmDialog(null,"¿Desea continuar?");
        return salir == JOptionPane.YES_OPTION ? true : false;
    }

    public static void mostrarMensajeProgramaTerminado(Boolean continuar){
        if(!continuar){
            JOptionPane.showMessageDialog(null,"Programa terminado");
        }
    }
}
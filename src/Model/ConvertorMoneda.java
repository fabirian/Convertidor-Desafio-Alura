/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Model;
import Model.ClaseDeMoneda.*;

/**
 *
 * @author fabian
 */
public class ConvertorMoneda {
     public double convertirPesosADolares(double pesos) {
        double dolares = pesos / Monedas.DOLAR.getTipoCambio();
        return dolares;
    }

    public double convertirDolaresAPesos(double dolares) {
        double pesos = dolares * Monedas.DOLAR.getTipoCambio();
        return pesos;
    }

    public double convertirPesosAEuros(double pesos) {
        double euros = pesos / Monedas.EURO.getTipoCambio();
        return euros;
    }

    public double convertirEurosAPesos(double euros) {
        double pesos = euros * Monedas.EURO.getTipoCambio();
        return pesos;
    }

    public double convertirPesosALibrasEsterlinas(double pesos) {
        double librasEsterlinas = pesos / Monedas.LIBRA_ESTERLINA.getTipoCambio();
        return librasEsterlinas;
    }

    public double convertirLibrasEsterlinasAPesos(double librasEsterlinas) {
        double pesos = librasEsterlinas * Monedas.LIBRA_ESTERLINA.getTipoCambio();
        return pesos;
    }

    public double convertirPesosAYenJapones(double pesos) {
        double yenJapones = pesos / Monedas.YEN_JAPONES.getTipoCambio();
        return yenJapones;
    }

    public double convertirYenJaponesAPesos(double yenJapones) {
        double pesos = yenJapones * Monedas.YEN_JAPONES.getTipoCambio();
        return pesos;
    }

    public double convertirPesosAWonSulCoreano(double pesos) {
        double wonSulCoreano = pesos / Monedas.WON_SULCOREANO.getTipoCambio();
        return wonSulCoreano;
    }

    public double convertirWonSulCoreanoAPesos(double wonSulCoreano) {
        double pesos = wonSulCoreano * Monedas.WON_SULCOREANO.getTipoCambio();
        return pesos;
    }

}

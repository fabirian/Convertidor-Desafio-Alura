/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author fabian
 */
public class ClaseDeMoneda {
    
    public enum Monedas{
        DOLAR(4834.56),
        EURO(5166.30),
        LIBRA_ESTERLINA(5904.04),
        YEN_JAPONES(36.57),
        WON_SULCOREANO(3.69);

        private final double tipoCambio;

        Monedas(double tipoCambio) {
            this.tipoCambio = tipoCambio;
        }

        public double getTipoCambio() {
            return tipoCambio;
        }
    }
    
}

package controller;

import Model.*;
import view.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


/**
 *
 * @author fabian
 */
public class ConvertidorMoneda implements ActionListener{

    private final ViewConvertir viewConvertirMoneda;
    private final ConvertorMoneda convertir;
    private final ViewMenu viewMenuP;

    public ConvertidorMoneda(ViewConvertir viewConvertirMoneda,
            ConvertorMoneda convertir, ViewMenu viewMenuP) {
        
        this.viewConvertirMoneda = viewConvertirMoneda;
        this.convertir = convertir;
        this.viewConvertirMoneda.botonConvertir.addActionListener(this);
        this.viewMenuP = viewMenuP;

        // Botón "Volver":
        this.viewConvertirMoneda.botonVolver.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Cerrar la ventana actual:
                viewConvertirMoneda.dispose();

                // Hacer visible la vista del menú principal:
                viewMenuP.setVisible(true);
            }
        });

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        double ingresarValor = 0.0;
        String valorIngresadoTexto = viewConvertirMoneda.textIngresarValor.getText();

        try {
            
            ingresarValor = Double.parseDouble(valorIngresadoTexto);

            if (ingresarValor < 0) {
                throw new Exception("Debe ingresar un valor positivo");
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(viewConvertirMoneda, "Debe ingresar un valor numérico válido");
            return;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(viewConvertirMoneda, ex.getMessage());
            return;
        }

        String moneda = (String) viewConvertirMoneda.comboMonedas.getSelectedItem();

        double resultado = 0.0;

        switch (moneda) {
            case "De Pesos a Dólares" ->
                resultado = convertir.convertirPesosADolares(ingresarValor);
            case "De Pesos a Euros" ->
                resultado = convertir.convertirPesosAEuros(ingresarValor);
            case "De Pesos a Libras Esterlinas" ->
                resultado = convertir.convertirPesosALibrasEsterlinas(ingresarValor);
            case "De Pesos a Yen Japonés" ->
                resultado = convertir.convertirPesosAYenJapones(ingresarValor);
            case "De Pesos a Won Sul-Coreano" ->
                resultado = convertir.convertirPesosAWonSulCoreano(ingresarValor);
            case "De Dólares a Pesos" ->
                resultado = convertir.convertirDolaresAPesos(ingresarValor);
            case "De Euros a Pesos" ->
                resultado = convertir.convertirEurosAPesos(ingresarValor);
            case "De Libras Esterlinas a Pesos" ->
                resultado = convertir.convertirLibrasEsterlinasAPesos(ingresarValor);
            case "De Yen Japonés a Pesos" ->
                resultado = convertir.convertirYenJaponesAPesos(ingresarValor);
            case "De Won Sul-Coreano a Pesos" ->
                resultado = convertir.convertirWonSulCoreanoAPesos(ingresarValor);
        }

        String resultadoTexto = String.format("%.2f", resultado);
        viewConvertirMoneda.textResultado.setText(resultadoTexto);
        viewConvertirMoneda.textIngresarValor.setText("");
    }

    
}

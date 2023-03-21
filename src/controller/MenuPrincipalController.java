/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import view.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author fabian
 */
public class MenuPrincipalController {
    private final ViewMenu vistaMenuPrincipal;
    private final ViewConvertir vistaConversorMoneda;

    public MenuPrincipalController(ViewMenu vistaMenuPrincipal, 
            ViewConvertir vistaConversorMoneda) {
        
        this.vistaMenuPrincipal = vistaMenuPrincipal;
        this.vistaConversorMoneda = vistaConversorMoneda;

    }

    public void manejarBotonMenuPrincipal() {
        vistaMenuPrincipal.botonMoneda.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Hacer visible la ventana del conversor:
                vistaConversorMoneda.setVisible(true);

                // Ocultar la ventana principal:
                vistaMenuPrincipal.setVisible(false);
            }
        });
    }
}

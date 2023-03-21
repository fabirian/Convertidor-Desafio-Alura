/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import Model.*;
import view.*;
import controller.*;

/**
 *
 * @author fabian
 */
public class Main {

    public static void main(String[] args) {
        
        // Instancias de las vistas:
       ViewMenu vistaMenuPrincipal = new ViewMenu();
       ViewConvertir viewConvertirMoneda = new ViewConvertir();

        // Instancias de las clases del modelo:
        ConvertorMoneda convertir = new ConvertorMoneda();


        // Instancias de los controladores:
        ConvertidorMoneda controladorConversorMoneda = new ConvertidorMoneda(viewConvertirMoneda,
                convertir, vistaMenuPrincipal);
        MenuPrincipalController controladorMenuPrincipal = new MenuPrincipalController(vistaMenuPrincipal, 
                viewConvertirMoneda);
        ControllerExit controladorSalir = new ControllerExit();

        // Controladores como escuchadores de eventos (actionListener):
        vistaMenuPrincipal.menuSalir.addActionListener(controladorSalir);

        // Mostrar la vista principal:
        vistaMenuPrincipal.setVisible(true);

        // Manejar las acciones de los controladores:
        controladorMenuPrincipal.manejarBotonMenuPrincipal();

        // Ocultar la vista del conversor:
        viewConvertirMoneda.setVisible(false);
    }
    
}

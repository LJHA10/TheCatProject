/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.catproject;

import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author LuisJ
 */
public class CatProject {

    public static void main(String[] args) throws IOException {
        GatoService catService = new GatoService();
        catService.getGatos();

        int opcionMenu = -1;
        String[] opciones = {
            "1. Ver Gatos",
            "2. Salir"
        };

        do {
            String opcion = (String) JOptionPane.showInputDialog(null, "Gatitos java", "Menu principal", JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

            for (int i = 0; i < opciones.length; i++) {
                if (opcion.equals(opciones[i])) {
                    opcionMenu = i;
                }
            }
            GatoService service = new GatoService();
            
            switch (opcionMenu) {
                case 0:{
                    System.out.println("Vas a ver a un gato");
                    service.getGatos();
                }
                    break;
                case 1:
                    System.out.println("Vas a salir del sistema");
            }

        } while (opcionMenu != 1);

    }
}

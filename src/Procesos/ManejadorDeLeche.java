/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesos;

import Leche.LecheDeslactosada;
import Leche.LecheEntera;
import Postres.*;

/**
 *
 * @author Pedro Mendoza
 */
public class ManejadorDeLeche {
    private LecheEntera leche;

    public ManejadorDeLeche(LecheEntera leche) {
        this.leche = leche;
    }
    
    public void cambiarTipoLeche(Postre postre){
        // Cambiar tipo de leche en la preparación de los postres, usar leche deslactosada
        System.out.println(postre.getClass());
        
        if(!(postre.getClass() == Pastel.class && leche.getClass()==LecheDeslactosada.class))
            leche.cambiarLeche();
        else
            System.err.println("No es posible usar leche deslactosada en pastel");
    }
}
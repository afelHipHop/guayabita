/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author Estudiantes
 */

import Logico.Decision;
import Logico.Juego;

public class main {

    public static void main(String[] args) {
        new Juego().jugar(new Decision().decidir(1, 6), 1000, 1000, 100, 200, 1,new Decision().decidir(1, 6),new Juego().ponerDinero(1000, 100, 200));
    }
    
}

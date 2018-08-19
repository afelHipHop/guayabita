/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logico;

/**
 *
 * @author Estudiantes
 */
public class Decision {
    
    public int decidir(int min, int max){
        return (int) (Math.random() * max) + min;
    }
    
}

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
public class Juego {
    
    public void jugar(int dado, int dinero1, int dinero2, int apuestaMin, int dineroMesa, int jugador, int nuevoDado, int apuesta){
            if(dinero1<=0||dinero2 <= 0){
            if(dinero1<=0)
                ganador("Jugador 2");
            else
                ganador("Jugador 1");
        }
        else{
            System.out.println("Dinero en la mesa: "+dineroMesa);
            if(dineroMesa<=0){
                System.out.println("No hay dinero en la mesa, ambos jugadores ponen: "+apuestaMin);
                jugar(new Decision().decidir(1, 6), dinero1-apuestaMin, dinero2-apuestaMin, apuestaMin, (dineroMesa+(apuestaMin*2)), jugador, new Decision().decidir(1, 6), apuesta);
            }
            if(jugador==1){
                System.out.println("Turno jugador 1 "+
                                    "Dinero: "+dinero1+
                                    " Numero en el dado: "+dado);
                if (dado == 2 || dado == 3 || dado == 4 || dado == 5){
                    if(!apostar()){
                        System.out.println("No apuesta");
                        jugar(new Decision().decidir(1, 6), dinero1, dinero2, apuestaMin, dineroMesa, ((jugador+1)%2),new Decision().decidir(1, 6),ponerDinero(dinero2, apuestaMin, dineroMesa));
                    }
                    else{
                        System.out.println("Apuesta: "+apuesta);
                        System.out.println("Saca: "+nuevoDado);
                        if(dado>=nuevoDado){
                            System.out.println("Pierde: "+apuesta);
                            jugar(new Decision().decidir(1, 6), (dinero1-apuesta), dinero2, apuestaMin, (dineroMesa+apuesta), ((jugador+1)%2),new Decision().decidir(1, 6),ponerDinero(dinero2, apuestaMin, (dineroMesa+apuesta)));
                        }
                        else{
                            System.out.println("Gana: "+apuesta);
                            jugar(new Decision().decidir(1, 6), (dinero1+apuesta), dinero2, apuestaMin, (dineroMesa-apuesta), ((jugador+1)%2),new Decision().decidir(1, 6),ponerDinero(dinero2, apuestaMin, (dineroMesa-apuesta)));
                        }
                    }
                }else{
                    if(dado == 1){
                        System.out.println("Debe poner: "+apuestaMin+" en la mesa");
                        jugar(new Decision().decidir(1, 6), (dinero1-apuestaMin), dinero2, apuestaMin, (dineroMesa+apuestaMin), ((jugador+1)%2),new Decision().decidir(1, 6),ponerDinero(dinero2, apuestaMin, (dineroMesa+apuestaMin)));
                    }
                    else{
                        System.out.println("Debe sacar: "+apuestaMin+" en la mesa");
                        if(dineroMesa<apuestaMin){
                            System.out.println("Hay menos dinero en la mesa que la apuesta minima, debe sacar todo el dinero");
                            jugar(new Decision().decidir(1, 6), (dinero1+dineroMesa), dinero2, apuestaMin, (0), ((jugador+1)%2),new Decision().decidir(1, 6),ponerDinero(dinero2, apuestaMin, 0));
                        }
                        else
                            jugar(new Decision().decidir(1, 6), (dinero1+apuestaMin), dinero2, apuestaMin, (dineroMesa-apuestaMin), ((jugador+1)%2),new Decision().decidir(1, 6),ponerDinero(dinero2, apuestaMin, (dineroMesa-apuestaMin)));
                    }
                }
            }else{
                System.out.println("Turno jugador 2 "+
                                    "Dinero: "+dinero2+
                                    " Numero en el dado: "+dado);
                if (dado == 2 || dado == 3 || dado == 4 || dado == 5){
                    if(!apostar()){
                        System.out.println("No apuesta");
                        jugar(new Decision().decidir(1, 6), dinero1, dinero2, apuestaMin, dineroMesa, ((jugador+1)%2),new Decision().decidir(1, 6),ponerDinero(dinero1, apuestaMin, dineroMesa));
                    }
                    else{
                        System.out.println("Apuesta: "+apuesta);
                        System.out.println("Saca: "+nuevoDado);
                        if(dado>=nuevoDado){
                            System.out.println("Pierde: "+apuesta);
                            jugar(new Decision().decidir(1, 6), dinero1, dinero2-apuesta, apuestaMin, (dineroMesa+apuesta), ((jugador+1)%2),new Decision().decidir(1, 6),ponerDinero(dinero1, apuestaMin, (dineroMesa+apuesta)));
                        }
                        else{
                            System.out.println("Gana: "+apuesta);
                            jugar(new Decision().decidir(1, 6), dinero1, dinero2+apuesta, apuestaMin, (dineroMesa-apuesta), ((jugador+1)%2),new Decision().decidir(1, 6),ponerDinero(dinero1, apuestaMin, (dineroMesa-apuesta)));
                        }
                    }
                }else{
                    if(dado == 1){
                        System.out.println("Debe poner: "+apuestaMin+" en la mesa");
                        jugar(new Decision().decidir(1, 6), dinero1, dinero2-apuestaMin, apuestaMin, (dineroMesa+apuestaMin), ((jugador+1)%2),new Decision().decidir(1, 6),ponerDinero(dinero1, apuestaMin, (dineroMesa+apuestaMin)));
                    }
                    else{
                        System.out.println("Debe sacar: "+apuestaMin+" en la mesa");
                        if(dineroMesa<apuestaMin){
                            System.out.println("Hay menos dinero en la mesa que la apuesta minima, debe sacar todo el dinero");
                            jugar(new Decision().decidir(1, 6), dinero1, dinero2+dineroMesa, apuestaMin, (0), ((jugador+1)%2),new Decision().decidir(1, 6),ponerDinero(dinero1, apuestaMin, 0));
                        }else
                            jugar(new Decision().decidir(1, 6), dinero1, dinero2+apuestaMin, apuestaMin, (dineroMesa-apuestaMin), ((jugador+1)%2),new Decision().decidir(1, 6),ponerDinero(dinero1, apuestaMin, (dineroMesa-apuestaMin)));
                    }
                }
            }
        }
    }
    public boolean apostar(){
        return new Decision().decidir(1, 2)==1;
    }
    public int ponerDinero(int dinero, int apuestaMin, int dineroMesa){
        if(dinero>=dineroMesa){
            if(dineroMesa>apuestaMin)
                return new Decision().decidir(apuestaMin, dineroMesa);
            else
                return new Decision().decidir(1, dineroMesa);
        }
        else
            return new Decision().decidir(apuestaMin, dinero);
    }
    
    public void ganador(String ganador){
        System.out.println("El ganador es el: " + ganador);
        System.exit(0);
    }
    
}


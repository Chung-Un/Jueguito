/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegodememoria;

/**
 *
 * @author chung
 */
public class infoJuego {
    String jugador1, jugador2;
    String[][] arregloCartas = {
        {"A", "A"},
        {"B", "B"},
        {"C", "C"},
        {"D", "D"},
        {"E", "E"},
    };
    int puntosJugador1, puntosJugador2;

    public String getJugador1() {
        return jugador1;
    }

    public void setJugador1(String jugador1) {
        this.jugador1 = jugador1;
    }

    public String getJugador2() {
        return jugador2;
    }

    public void setJugador2(String jugador2) {
        this.jugador2 = jugador2;
    }

    public String[][] getArregloCartas() {
        return arregloCartas;
    }

    public void setArregloCartas(String[][] arregloCartas) {
        this.arregloCartas = arregloCartas;
    }

    public int getPuntosJugador1() {
        return puntosJugador1;
    }

    public void setPuntosJugador1(int puntosJugador1) {
        this.puntosJugador1 = puntosJugador1;
    }

    public int getPuntosJugador2() {
        return puntosJugador2;
    }

    public void setPuntosJugador2(int puntosJugador2) {
        this.puntosJugador2 = puntosJugador2;
    }
    
    
}

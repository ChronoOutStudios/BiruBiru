package com.chronoout.drinking.games.game.cards.casual.friends.party.drink.alcohol.neverhaveiever.birubiru;

import java.util.LinkedList;
import java.util.List;

public class Baraja {
    private final int NUMEROCARTAS = 40;
    private int indiceCartaActual =-1;
    private boolean configuracion[];
    public List<Carta> misCartas = new LinkedList<>();


    public Baraja (int dificultad,boolean [] config){

    }

    public void siguienteCarta(){

    }

    public void crearCartasPalos(int dificultad) {
        switch (dificultad) {
            case 0: // facil numeros del 1 al 4

                break;
            case 1: // medio numeros del 2 al 6
                break;

            case 2: // dificil numeros del 3 al 8
                break;

        }
    }


}

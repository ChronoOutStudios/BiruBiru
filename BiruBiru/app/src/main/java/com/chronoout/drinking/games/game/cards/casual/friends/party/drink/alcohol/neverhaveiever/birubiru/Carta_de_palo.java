package com.chronoout.drinking.games.game.cards.casual.friends.party.drink.alcohol.neverhaveiever.birubiru;

import android.media.Image;

public class Carta_de_palo extends Carta {
    public  enum palo { Limon,Hielo,Hierbabuena,Cereza};
    public  int numero;
    public palo miPalo;

    public Carta_de_palo(String nombre, String descripcion, Image imagen,palo miPalo, int numero){
        super(nombre,descripcion,imagen);
        this.miPalo = miPalo;
        this.numero = numero;
    }
}

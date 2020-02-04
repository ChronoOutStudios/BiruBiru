package com.chronoout.drinking.games.game.cards.casual.friends.party.drink.alcohol.neverhaveiever.birubiru;

import android.media.Image;

public class Carta_especial extends Carta {
    public enum tipo {Rey,Norma,Mochila,YoNunca,Regata,DeLaHabana,Hidalgo,Chupito,TragoGlobal};
    public tipo miTipo;

    public Carta_especial(String nombre, String descripcion, Image imagen,tipo miTipo){
        super(nombre,descripcion,imagen);
        this.miTipo = miTipo;
    }
}

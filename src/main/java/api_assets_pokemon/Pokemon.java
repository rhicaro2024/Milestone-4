/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package api_assets_pokemon;

/**
 *
 * @author raphaelhicaro
 */
public class Pokemon {
    private int slot;
    private PokemonInner pokemon;
    
    public int getSlot(){
        return this.slot;
    }
    
    public PokemonInner getPokemon(){
        return this.pokemon;
    }
}

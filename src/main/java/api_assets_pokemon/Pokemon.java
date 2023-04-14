/*
    This class is used for the poke api to make a certain call
 */
package api_assets_pokemon;

public class Pokemon {
    private int slot;
    private PokemonInner pokemon;
    
    /**
     * getter for the slot
     * @return int
     */
    public int getSlot(){
        return this.slot;
    }
    
    /**
     * getter for wrapping class of Pokemon
     * @return PokemonInner wrapping class
     */
    public PokemonInner getPokemon(){
        return this.pokemon;
    }
}

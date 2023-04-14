/*
    Class used for the poke api and help return something specific
 */
package api_assets_pokemon;

public class PokemonResponseName {
    public Pokemon[] pokemon;
    
    /**
     * getter for list of pokemon
     * @return Pokemon[]
     */
    public Pokemon[] getPokemonList(){
        return this.pokemon;
    }
}

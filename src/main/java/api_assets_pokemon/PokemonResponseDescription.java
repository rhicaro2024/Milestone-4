/*
    Class used for the poke api and help return something specific
 */
package api_assets_pokemon;

public class PokemonResponseDescription {
    private FlavorText[] flavor_text_entries;
    
    /**
     * getter to return a list of type FlavorText
     * @return FlavorText[]
     */
    public FlavorText[] getFlavorText(){
        return this.flavor_text_entries;
    }
}

/**
 * This Class is meant for an API call with the pokeAPI specifically for calling
 * on the flavor text of the certain pokemon
 */
package api_assets_pokemon;

public class FlavorText {
    private String flavor_text;
    private FlavorTextInner language;
    
    /**
     * Return the description of the pokemon
     * @return String
     */
    public String getText(){
        return this.flavor_text;
    }
    
    /**
     * Return wrapping class of flavor_text
     * @return String
     */
    public FlavorTextInner getFlavorTextInner(){
        return language;
    }
}

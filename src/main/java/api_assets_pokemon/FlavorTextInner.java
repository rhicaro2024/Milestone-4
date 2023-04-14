/*
    This class is used for the poke api to represent the wrapping class of 
    flavor text
 */
package api_assets_pokemon;

public class FlavorTextInner {
    private String name;
    
    /**
     * getter from the api for language type
     * @return String 
     */
    public String getlanguageName(){
        return this.name;
    }
}

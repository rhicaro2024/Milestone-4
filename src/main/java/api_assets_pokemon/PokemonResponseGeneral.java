/*
    Class used for the poke api and help return something specific
 */
package api_assets_pokemon;

public class PokemonResponseGeneral {
    private int height, weight;
    private String name;
    private Types[] types;
    private Sprite sprites;
    
    /**
     * getter for pokemon height
     * @return int
     */
    public int getHeight(){
        return this.height;
    }
    
    /**
     * getter for pokemon weight
     * @return int
     */
    public int getWeight(){
        return this.weight;
    }
    
    /**
     * getter for pokemon name
     * @return String
     */
    public String getName(){
        return this.name;
    }
    
    /**
     * getter for list of pokemon types
     * @return Types[]
     */
    public Types[] getTypes(){
        return this.types;
    }
    
    /**
     * getter for sprite class
     * @return Sprite class
     */
    public Sprite getSprite(){
        return this.sprites;
    }
}

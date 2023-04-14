/**
 * pokemon object used to make calls from the api using the api response object
 */
package pokemon_objects;

import api_assets_pokemon.*;
import classes.*;

/**
 *
 * @author Hicaro
 */
public class PokemonObject extends PokemonAPICall{

    /**
     * getter for the height of the pokemon
     * @param resp API response object
     * @return int
     */
    @Override
    public int getHeight(PokemonResponseGeneral resp) {
        int temp = 0;
        temp = resp.getHeight();
        return temp;
    }

    /**
     * getter for the weight of the pokemon
     * @param resp API response object
     * @return int
     */
    @Override
    public int getWeight(PokemonResponseGeneral resp) {
        int temp = 0;
        temp = resp.getWeight();
        return temp;
    }

    /**
     * getter for the name of the pokemon
     * @param resp API response object
     * @return string
     */
    @Override
    public String getName(PokemonResponseName resp, int index) {
        String temp = "";
        temp = resp.getPokemonList()[index].getPokemon().getPokemonName();
        return temp;
    }

    /**
     * getter for the description of the pokemon
     * @param resp API response object
     * @return String
     */
    @Override
    public String getDescription(PokemonResponseDescription resp) {
        String temp = "";
        temp = englishDescription(resp);
        return temp;
    }

    /**
     * getter for the sprite URL of the pokemon
     * @param resp API response object
     * @return int
     */
    @Override
    public String getSprite(PokemonResponseGeneral resp) {
        String temp = "";
        temp = resp.getSprite().getImageURL();
        return temp;
    }
    
    /**
     * Finds the english description of the pokemon
     * @param pokemon api object
     * @return String
     */
    public String englishDescription(PokemonResponseDescription pokemon){
        String temp = "";
        String description = "";
        FlavorText[] entryList = pokemon.getFlavorText();
        for (FlavorText entryList1 : entryList) {
            if ("en".equals(entryList1.getFlavorTextInner().getlanguageName())) {
                description = entryList1.getText();
                String[] split = description.split("\n");
                for (int j=0;j<split.length;j++){
                    if (j == 0){
                        temp = temp + split[j];
                    } else {
                        temp = temp + " " +split[j];
                    }
                }
                return temp;
            }   
        }
        return "No entry";
    }
}

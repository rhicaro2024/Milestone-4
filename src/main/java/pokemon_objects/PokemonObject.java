/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemon_objects;

import api_assets_pokemon.*;
import classes.*;

/**
 *
 * @author Hicaro
 */
public class PokemonObject extends PokemonAPICall{

    @Override
    public int getHeight(PokemonResponseGeneral resp) {
        int temp = 0;
        temp = resp.getHeight();
        return temp;
    }

    @Override
    public int getWeight(PokemonResponseGeneral resp) {
        int temp = 0;
        temp = resp.getWeight();
        return temp;
    }

    @Override
    public String getName(PokemonResponseName resp, int index) {
        String temp = "";
        temp = resp.getPokemonList()[index].getPokemon().getPokemonName();
        return temp;
    }

    @Override
    public String getDescription(PokemonResponseDescription resp) {
        String temp = "";
        temp = englishDescription(resp);
        return temp;
    }

    @Override
    public String getSprite(PokemonResponseGeneral resp) {
        String temp = "";
        temp = resp.getSprite().getImageURL();
        return temp;
    }
    
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

/**
 * Handle the API requests with the poke API
 */
package api_response_classes;

import api_assets_weather.*;
import api_assets_pokemon.*;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

public class API_Response_Pokemon{    
    /**
     * create a API call specifically for the name of the pokemon based on a certain
     * element type which is based on the weather.
     * @param pokemonType element of the pokemon
     * @return PokemonResponseName
     */
    public PokemonResponseName getPokemonResponseName(String pokemonType){
        Gson gson = new Gson();
        try {
            URL url = new URL("https://pokeapi.co/api/v2/type/" + pokemonType);
            HttpURLConnection connection = (HttpURLConnection)url.openConnection();
            BufferedReader in = new BufferedReader(
                        new InputStreamReader(connection.getInputStream()));
            String tmp = in.readLine();
            PokemonResponseName genPokemonResponse = gson.fromJson(tmp, PokemonResponseName.class);
            return genPokemonResponse;
        } catch (MalformedURLException ex) {
            Logger.getLogger(City.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(City.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    /**
     * create an API call specifically for general information about a specific pokemon
     * @param pokemonName name of pokemon that is viewed
     * @return PokemonResponseGeneral
     */
    public PokemonResponseGeneral getPokemonResponseGeneral(String pokemonName){
        Gson gson = new Gson();
        try {
            URL url = new URL("https://pokeapi.co/api/v2/pokemon/" + pokemonName);
            HttpURLConnection connection = (HttpURLConnection)url.openConnection();
            BufferedReader in = new BufferedReader(
                        new InputStreamReader(connection.getInputStream()));
            String tmp = in.readLine();
            PokemonResponseGeneral genPokemonResponse = gson.fromJson(tmp, PokemonResponseGeneral.class);
            return genPokemonResponse;
        } catch (MalformedURLException ex) {
            Logger.getLogger(City.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(City.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    /**
     * create an API call specifically for the Description of the pokemon similar
     * to a pokedex
     * @param pokemonName name of pokemon that is viewed
     * @return PokemonResponseDescription
     */
    public static PokemonResponseDescription getPokemonResponseDescription(String pokemonName){
        Gson gson = new Gson();
        try {
            URL url = new URL("https://pokeapi.co/api/v2/pokemon-species/" + pokemonName);
            HttpURLConnection connection = (HttpURLConnection)url.openConnection();
            BufferedReader in = new BufferedReader(
                        new InputStreamReader(connection.getInputStream()));
            String tmp = in.readLine();
            PokemonResponseDescription genPokemonResponse = gson.fromJson(tmp, PokemonResponseDescription.class);
            return genPokemonResponse;
        } catch (MalformedURLException ex) {
            Logger.getLogger(City.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(City.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}

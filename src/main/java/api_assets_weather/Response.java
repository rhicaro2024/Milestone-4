/**
 * required class for calling from the weather api
 */package api_assets_weather;

public class Response {
    private Info[] list; 
    private City city;
    
    /**
     * getter for info list class
     * @return Info[]
     */
    public Info[] getList(){
        return this.list;
    }
    
    /**
     * getter for city class
     * @return City
     */
    public City getCity(){
        return this.city;
    }
}

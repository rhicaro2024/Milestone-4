/**
 * required class for calling from the weather api
 */
package api_assets_weather;

public class LocationList {
    private Location[] list;
    
    /**
     *Getter for the location list class
     * @return Location[]
     */
    public Location[] getLocationList(){
        return this.list;
    }
}

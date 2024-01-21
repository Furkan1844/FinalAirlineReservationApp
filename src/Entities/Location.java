package Entities;

public class Location {
    private int id;
    private String city;
    private String country;
    private String airport;
    private boolean active;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAirport() {
        return airport;
    }

    public void setAirport(String airport) {
        this.airport = airport;
    }


    public void setLocation(int id, String country, String city, String airport){
        this.setId(id);
        this.setCountry(country);
        this.setCity(city);
        this.setAirport(airport);
    }
    public void getLocation(){
        System.out.println("\nFlight ID: " + getId() + "\nDestination: " + getCity() + ", " + getCountry() + "\nAirport: " + getAirport());
    }
}

package entity;

public class Location extends Entity{
    private Long id;

    private String city;

    public Location(Long id, String city) {
        this.id = id;
        this.city = city;
    }

    public Location(String city) {
        this.city = city;
    }

    public Location() {
    }

    public Long getId() {
        return id;
    }



    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Location{" +
                "city='" + city + '\'' +
                '}';
    }
}

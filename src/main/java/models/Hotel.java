package models;

public class Hotel {
    private String name;
    private String location;

    public Hotel(String name, String location, int stars) {
        this.name = name;
        this.location = location;
        this.stars = stars;
    }

    private int stars;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }
}

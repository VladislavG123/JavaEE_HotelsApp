package models;

import java.util.ArrayList;

public class DbManager {
    private static ArrayList<Hotel> hotels = new ArrayList<>();

    static {
        hotels.add(new Hotel("Royal Palace", "Astana", 4));
        hotels.add(new Hotel("Ritz Carlton", "Moskow", 5));
        hotels.add(new Hotel("Rixos", "Almaty", 4));
        hotels.add(new Hotel("Konak Ui", "Taraz", 3));
    }

    public static ArrayList<Hotel> getAll(){
        return hotels;
    }

    public static void add(Hotel hotel){
        hotels.add(hotel);
    }

}

package com.example.mythirdtry;

import java.util.Comparator;

public class Dyr {

    private int id;
    private String navn;
    private String imageURL;

    public Dyr(int id, String navn, String imageURL) {
        this.id = id;
        this.navn = navn;
        this.imageURL = imageURL;
    }
    public static Comparator<Dyr> DyrNavnAZComparator = new Comparator<Dyr>() {
        @Override
        public int compare(Dyr p1, Dyr p2) {

            return p1.getNavn().compareTo(p2.getNavn());
        }
    };
    public static Comparator<Dyr> DyrNavnZAComparator = new Comparator<Dyr>() {
        @Override
        public int compare(Dyr p1, Dyr p2) {

            return p2.getNavn().compareTo(p1.getNavn());
        }
    };

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }



    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    @Override
    public String toString() {
        return "Dyr{" +
                "id=" + id +
                ", navn='" + navn + '\'' +
                ", imageURL='" + imageURL + '\'' +
                '}';
    }
}

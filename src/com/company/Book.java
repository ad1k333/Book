package com.company;

public class Book {
    private int id;
    private String avtor,
    izdatel,
    pereplet;
    private int god,
    stranicy,
    cena;

    public Book(int id, String avtor, String izdatel, String pereplet, int god, int stranicy, int cena) {
        this.id = id;
        this.avtor = avtor;
        this.izdatel = izdatel;
        this.pereplet = pereplet;
        this.god = god;
        this.stranicy = stranicy;
        this.cena = cena;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAvtor() {
        return avtor;
    }

    public void setAvtor(String avtor) {
        this.avtor = avtor;
    }

    public String getIzdatel() {
        return izdatel;
    }

    public void setIzdatel(String izdatel) {
        this.izdatel = izdatel;
    }

    public String getPereplet() {
        return pereplet;
    }

    public void setPereplet(String pereplet) {
        this.pereplet = pereplet;
    }

    public int getGod() {
        return god;
    }

    public void setGod(int god) {
        this.god = god;
    }

    public int getStranicy() {
        return stranicy;
    }

    public void setStranicy(int stranicy) {
        this.stranicy = stranicy;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", avtor='" + avtor + '\'' +
                ", izdatel='" + izdatel + '\'' +
                ", pereplet='" + pereplet + '\'' +
                ", god=" + god +
                ", stranicy=" + stranicy +
                ", cena=" + cena +
                '}';
    }
}


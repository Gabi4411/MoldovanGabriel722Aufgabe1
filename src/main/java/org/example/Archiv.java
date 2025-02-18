package org.example;

import java.time.LocalDate;

public class Archiv {
    public int id;
    public String held;
    public String antagonist;
    public enum konfrontationstyp{Individuell, Team, Galaktisch, Multiversal};
    public String ort;
    public LocalDate datum;
    public double globalerEinfluss;

    public Archiv(int id, String held, String antagonist, String ort, LocalDate datum, double globalerEinfluss) {
        this.id = id;
        this.held = held;
        this.antagonist = antagonist;
        this.ort = ort;
        this.datum = datum;
        this.globalerEinfluss = globalerEinfluss;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHeld() {
        return held;
    }

    public void setHeld(String held) {
        this.held = held;
    }

    public String getAntagonist() {
        return antagonist;
    }

    public void setAntagonist(String antagonist) {
        this.antagonist = antagonist;
    }

    public LocalDate getDatum() {
        return datum;
    }

    public void setDatum(LocalDate datum) {
        this.datum = datum;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public double getGlobalerEinfluss() {
        return globalerEinfluss;
    }

    public void setGlobalerEinfluss(double globalerEinfluss) {
        this.globalerEinfluss = globalerEinfluss;
    }

    @Override
    public String toString() {
        return "Archiv{" +
                "id=" + id +
                ", held='" + held + '\'' +
                ", antagonist='" + antagonist + '\'' +
                ", ort='" + ort + '\'' +
                ", datum=" + datum +
                ", globalerEinfluss=" + globalerEinfluss +
                '}';
    }
}

package com.example.test.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RandonneeeModel {
    @SerializedName("no_randonnee")
    @Expose
    private String no_randonnee;
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("lieu")
    @Expose
    private String lieu;
    @SerializedName("nombremini")
    @Expose
    private int nombremini;
    @SerializedName("nombremax")
    @Expose
    private int nombremax;
    @SerializedName("datemaxrep")
    @Expose
    private String datemaxrep;

    public RandonneeeModel(String no_randonnee, String date, String lieu, int nombremini, int nombremax, String datemaxrep) {
        this.no_randonnee = no_randonnee;
        this.date = date;
        this.lieu = lieu;
        this.nombremini = nombremini;
        this.nombremax = nombremax;
        this.datemaxrep = datemaxrep;
    }

    public String getNo_randonnee() {
        return no_randonnee;
    }

    public void setNo_randonnee(String no_randonnee) {
        this.no_randonnee = no_randonnee;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public int getNombremini() {
        return nombremini;
    }

    public void setNombremini(int nombremini) {
        this.nombremini = nombremini;
    }

    public int getNombremax() {
        return nombremax;
    }

    public void setNombremax(int nombremax) {
        this.nombremax = nombremax;
    }

    public String getDatemaxrep() {
        return datemaxrep;
    }

    public void setDatemaxrep(String datemaxrep) {
        this.datemaxrep = datemaxrep;
    }

}
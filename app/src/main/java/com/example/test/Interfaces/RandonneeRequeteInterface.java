package com.example.test.Interfaces;

import com.example.test.models.RandonneeeModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RandonneeRequeteInterface {
    @GET("/randonnees")
    Call<List<RandonneeeModel>> getAllRandonnee();
}
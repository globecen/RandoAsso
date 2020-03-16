package com.example.test.Interfaces;

import com.example.test.models.RandonneeeModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface MyRadonneeRequeteInterface {
    @GET("/backendAndroid/AfficheAllMyRando.php")
    Call<List<RandonneeeModel>> getMyAllRandonnee();
}
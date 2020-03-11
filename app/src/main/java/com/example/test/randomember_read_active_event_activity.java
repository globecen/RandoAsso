package com.example.test;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


import com.example.test.Interfaces.RandonneeInterface;
import com.example.test.adapters.RandonneeAdapter;
import com.example.test.models.RandonneeeModel;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class randomember_read_active_event_activity extends AppCompatActivity {
    ArrayList<RandonneeeModel> randonneeModels=new ArrayList<>();
    private RandonneeAdapter radonneAdapter;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.randomember_read_active_event_activity);
        getRandoneeeResponse();
    }

        private void getRandoneeeResponse() {
            Retrofit retrofit=new Retrofit.Builder()
                    .baseUrl("http://globecen.freeboxos.fr:8080")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            System.out.println("cc");
            RandonneeInterface requestInteface=retrofit.create(RandonneeInterface.class);
            Call<List<RandonneeeModel>> call=requestInteface.getOneRandonnee();
            System.out.println("cc1");
            call.enqueue(new Callback<List<RandonneeeModel>>() {
                @Override

                public void onResponse(Call<List<RandonneeeModel>> call, Response<List<RandonneeeModel>> response) {
                    randonneeModels = new ArrayList<>(response.body());
                    Toast.makeText(randomember_read_active_event_activity.this,"Success",Toast.LENGTH_SHORT).show();
                    //System.out.println(randonneeModels.get(1).getDate());

                }

                @Override
                public void onFailure(Call<List<RandonneeeModel>> call, Throwable t) {
                    //System.out.println(randonneeModels.get(0).getDate());
                    Toast.makeText(randomember_read_active_event_activity.this,"Failed",Toast.LENGTH_SHORT).show();
                    Log.e("erreur",t.getMessage());
                }
            });
        }
    }


package com.example.test;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.test.Interfaces.RandonneeRequeteInterface;
import com.example.test.adapters.RandonneeAdapter;
import com.example.test.models.RandonneeeModel;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class randomember_main_activity extends AppCompatActivity {
    ArrayList<RandonneeeModel> randonneeModels=new ArrayList<>();
    private TextView raondonnee_no,raondonnee_lieu;
    private RandonneeAdapter radonneAdapter;
    private RecyclerView randonneee_recyclerview;
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.randomember_main_activity);

        randonneee_recyclerview=(RecyclerView)findViewById(R.id.randonnee_recyclerview);
        raondonnee_no=(TextView) findViewById(R.id.randonneeno);
        raondonnee_lieu=(TextView)findViewById(R.id.randonneelieu);


        randonneee_recyclerview.setLayoutManager(new LinearLayoutManager(this));
        getRandoneeeResponse();

    }
    private void getRandoneeeResponse() {
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl("http://globecen.freeboxos.fr:8080")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        System.out.println("cc");
        RandonneeRequeteInterface requestInteface=retrofit.create(RandonneeRequeteInterface.class);
        Call<List<RandonneeeModel>> call=requestInteface.getAllRandonnee();
        System.out.println("cc1");
        call.enqueue(new Callback<List<RandonneeeModel>>() {
            @Override

            public void onResponse(Call<List<RandonneeeModel>> call, Response<List<RandonneeeModel>> response) {
                randonneeModels=new ArrayList<>(response.body());
                radonneAdapter=new RandonneeAdapter(randomember_main_activity.this,randonneeModels);
                randonneee_recyclerview.setAdapter(radonneAdapter);
                Toast.makeText(randomember_main_activity.this,"Success",Toast.LENGTH_SHORT).show();
                System.out.println("cc2");
            }

            @Override
            public void onFailure(Call<List<RandonneeeModel>> call, Throwable t) {
                Toast.makeText(randomember_main_activity.this,"Je Suis Null",Toast.LENGTH_SHORT).show();
                Toast.makeText(randomember_main_activity.this,"Failed",Toast.LENGTH_SHORT).show();
                Log.e("erreur",t.getMessage());
            }
        });
    }
}

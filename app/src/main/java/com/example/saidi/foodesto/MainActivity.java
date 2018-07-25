package com.example.saidi.foodesto;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import com.example.saidi.foodesto.models.Foodesto;
import com.example.saidi.foodesto.network.NetworkManager;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.json)
    protected TextView mJson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        NetworkManager.INSTANCE.getFoodestoServices().getProductDetails("737628064502.json").enqueue(new Callback<Foodesto>() {
            @Override
            public void onResponse(Call<Foodesto> call, Response<Foodesto> response) {
                Toast.makeText(MainActivity.this, "Success", Toast.LENGTH_SHORT).show();
                mJson.setText(response.body().getCode());

            }

            @Override
            public void onFailure(Call<Foodesto> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Failed", Toast.LENGTH_SHORT).show();
            }
        });

    }
}

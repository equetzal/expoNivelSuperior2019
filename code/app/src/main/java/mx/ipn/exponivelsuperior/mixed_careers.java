package mx.ipn.exponivelsuperior;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class mixed_careers extends AppCompatActivity implements View.OnClickListener{
    ImageView btnBack;
    LinearLayout btnCarrLTuri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mixed_careers);

        btnBack = findViewById(R.id.btnBackToViewMode);
        btnCarrLTuri = findViewById(R.id.btnCarrLTuri);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        btnCarrLTuri.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent();

        switch (v.getId()){
            case R.id.btnCarrLTuri:
                i = new Intent(mixed_careers.this, carrera_mixta.class);
                i.putExtra("logo","est");
                i.putExtra("escuela", "EST");
                i.putExtra("esc","EST");
                i.putExtra("carr","LTuri");
        }

        startActivity(i);
    }
}

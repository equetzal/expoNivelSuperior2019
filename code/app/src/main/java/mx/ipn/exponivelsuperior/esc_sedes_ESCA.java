package mx.ipn.exponivelsuperior;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class esc_sedes_ESCA extends AppCompatActivity implements View.OnClickListener {
    ImageView btnBack;
    LinearLayout btnEscEscESCA_UST;
    LinearLayout btnEscEscESCA_UTep;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esc_sedes__esc);
        btnBack = findViewById(R.id.btnBackToSchools);

        btnEscEscESCA_UST = findViewById(R.id.btnEscEscESCA_UST);
        btnEscEscESCA_UTep = findViewById(R.id.btnEscEscESCA_UTep);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnEscEscESCA_UST.setOnClickListener(this);
        btnEscEscESCA_UTep.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent();
        switch (v.getId()){
            case R.id.btnEscEscESCA_UST:
                i = new Intent(esc_sedes_ESCA.this, esc_ESCA_UST.class);
            break;

            case R.id.btnEscEscESCA_UTep:
                i = new Intent(esc_sedes_ESCA.this, esc_ESCA_UTep.class);
            break;
        }
        startActivity(i);
    }
}

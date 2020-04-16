package mx.ipn.exponivelsuperior;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class esc_sedes_ESIA extends AppCompatActivity implements View.OnClickListener{
    ImageView btnBack;
    LinearLayout btnEscEscESIA_UTec;
    LinearLayout btnEscEscESIA_UTi;
    LinearLayout btnEscEscESIA_UZ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esc_sedes__esi);

        btnBack = findViewById(R.id.btnBackToSchools);

        btnEscEscESIA_UTec = findViewById(R.id.btnEscEscESIA_UTec);
        btnEscEscESIA_UTi = findViewById(R.id.btnEscEscESIA_UTi);
        btnEscEscESIA_UZ = findViewById(R.id.btnEscEscESIA_UZ);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnEscEscESIA_UTec.setOnClickListener(this);
        btnEscEscESIA_UTi.setOnClickListener(this);
        btnEscEscESIA_UZ.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent();
        switch (v.getId()){
            case R.id.btnEscEscESIA_UTec:
                i = new Intent(esc_sedes_ESIA.this, esc_ESIA_UTec.class);
            break;

            case R.id.btnEscEscESIA_UTi:
                i = new Intent(esc_sedes_ESIA.this, esc_ESIA_UTi.class);
            break;

            case R.id.btnEscEscESIA_UZ:
                i = new Intent(esc_sedes_ESIA.this, esc_ESIA_UZ.class);
            break;
        }
        startActivity(i);
    }
}

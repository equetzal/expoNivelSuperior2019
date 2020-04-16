package mx.ipn.exponivelsuperior;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class esc_sedes_ESIME extends AppCompatActivity implements View.OnClickListener {
    ImageView btnBack;
    LinearLayout btnEscEscESIME_UA;
    LinearLayout btnEscEscESIME_UC;
    LinearLayout btnEscEscESIME_UTi;
    LinearLayout btnEscEscESIME_UZ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esc_sedes__esime);
        btnBack = findViewById(R.id.btnBackToSchools);

        btnEscEscESIME_UA = findViewById(R.id.btnEscEscESIME_UA);
        btnEscEscESIME_UC = findViewById(R.id.btnEscEscESIME_UC);
        btnEscEscESIME_UTi = findViewById(R.id.btnEscEscESIME_UTi);
        btnEscEscESIME_UZ = findViewById(R.id.btnEscEscESIME_UZ);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnEscEscESIME_UA.setOnClickListener(this);
        btnEscEscESIME_UC.setOnClickListener(this);
        btnEscEscESIME_UTi.setOnClickListener(this);
        btnEscEscESIME_UZ.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent();
        switch (v.getId()){
            case R.id.btnEscEscESIME_UA:
                i = new Intent(esc_sedes_ESIME.this,esc_ESIME_UA.class);
            break;

            case R.id.btnEscEscESIME_UC:
                i = new Intent(esc_sedes_ESIME.this,esc_ESIME_UC.class);
            break;

            case R.id.btnEscEscESIME_UTi:
                i = new Intent(esc_sedes_ESIME.this, esc_ESIME_UTi.class);
            break;

            case R.id.btnEscEscESIME_UZ:
                i = new Intent(esc_sedes_ESIME.this, esc_ESIME_UZ.class);
            break;
        }
        startActivity(i);
    }
}

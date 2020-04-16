package mx.ipn.exponivelsuperior;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class esc_sedes_CICS extends AppCompatActivity implements View.OnClickListener {
    ImageView btnBack;
    LinearLayout btnEscEscCICS_UMA;
    LinearLayout btnEscEscCICS_UST;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esc_sedes__cics);
        btnBack = findViewById(R.id.btnBackToSchools);

        btnEscEscCICS_UMA = findViewById(R.id.btnEscEscCICS_UMA);
        btnEscEscCICS_UST = findViewById(R.id.btnEscEscCICS_UST);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnEscEscCICS_UMA.setOnClickListener(this);
        btnEscEscCICS_UST.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent();

        switch (v.getId()){
            case R.id.btnEscEscCICS_UMA:
                i = new Intent(esc_sedes_CICS.this, esc_CICS_UMA.class);
            break;

            case R.id.btnEscEscCICS_UST:
                i = new Intent(esc_sedes_CICS.this, esc_CICS_UST.class);
            break;
        }

        startActivity(i);
    }
}

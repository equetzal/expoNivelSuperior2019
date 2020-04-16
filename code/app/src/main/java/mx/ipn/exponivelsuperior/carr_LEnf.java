package mx.ipn.exponivelsuperior;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class carr_LEnf extends AppCompatActivity implements View.OnClickListener{
    ImageView btnBack;

    LinearLayout btnEscEscCICS_UMA;
    LinearLayout btnEscEscESEO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.carr_lenf);

        btnBack = findViewById(R.id.backToCarr);
        btnEscEscCICS_UMA = findViewById(R.id.btnEscEscCICS_UMA);
        btnEscEscESEO = findViewById(R.id.btnEscEscESEO);

        btnEscEscCICS_UMA.setOnClickListener(this);
        btnEscEscESEO.setOnClickListener(this);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent();
        switch (v.getId()){
            case R.id.btnEscEscCICS_UMA:
                i = new Intent(carr_LEnf.this, carrera_esc.class);
                i.putExtra("logo","cics");
                i.putExtra("escuela", "CICS UMA");
                i.putExtra("esc","CICS_UMA");
                i.putExtra("carr","LEnf");
                break;

            case R.id.btnEscEscESEO:
                i = new Intent(carr_LEnf.this, carrera_esc.class);
                i.putExtra("logo","eseo");
                i.putExtra("escuela", "ESEO");
                i.putExtra("esc","ESEO");
                i.putExtra("carr","LEnf");
                break;
        }
        startActivity(i);
    }
}

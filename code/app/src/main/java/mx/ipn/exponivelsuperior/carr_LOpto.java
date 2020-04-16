package mx.ipn.exponivelsuperior;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class carr_LOpto extends AppCompatActivity implements View.OnClickListener {
    ImageView btnBack;

    LinearLayout btnEscEscCICS_UMA;
    LinearLayout btnEscEscCICS_UST;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.carr_lopto);

        btnBack = findViewById(R.id.backToCarr);
        btnEscEscCICS_UMA = findViewById(R.id.btnEscEscCICS_UMA);
        btnEscEscCICS_UST = findViewById(R.id.btnEscEscCICS_UST);

        btnEscEscCICS_UMA.setOnClickListener(this);
        btnEscEscCICS_UST.setOnClickListener(this);

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
                i = new Intent(carr_LOpto.this, carrera_esc.class);
                i.putExtra("logo","cics");
                i.putExtra("escuela", "CICS UMA");
                i.putExtra("esc","CICS_UMA");
                i.putExtra("carr","LOpto");
                break;

            case R.id.btnEscEscCICS_UST:
                i = new Intent(carr_LOpto.this, carrera_esc.class);
                i.putExtra("logo","cics");
                i.putExtra("escuela", "CICS UST");
                i.putExtra("esc","CICS_UST");
                i.putExtra("carr","LOpto");
                break;

        }

        startActivity(i);

    }
}

package mx.ipn.exponivelsuperior;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class carr_IInd extends AppCompatActivity implements View.OnClickListener{
    ImageView btnBack;

    LinearLayout btnEscEscUPIIG;
    LinearLayout btnEscEscUPIICSA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.carr_iind);

        btnBack = findViewById(R.id.backToCarr);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnEscEscUPIIG = findViewById(R.id.btnEscEscUPIIG);
        btnEscEscUPIICSA = findViewById(R.id.btnEscEscUPIICSA);

        btnEscEscUPIIG.setOnClickListener(this);
        btnEscEscUPIICSA.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent();
        switch (v.getId()){
            case R.id.btnEscEscUPIIG:
                i = new Intent(carr_IInd.this, carrera_esc.class);
                i.putExtra("logo","upiig");
                i.putExtra("escuela", "UPIIG");
                i.putExtra("esc","UPIIG");
                i.putExtra("carr","IInd");
                break;

            case R.id.btnEscEscUPIICSA:
                i = new Intent(carr_IInd.this, carrera_esc.class);
                i.putExtra("logo","upiicsa");
                i.putExtra("escuela", "UPIICSA");
                i.putExtra("esc","UPIICSA");
                i.putExtra("carr","IInd");
                break;
        }
        startActivity(i);

    }
}

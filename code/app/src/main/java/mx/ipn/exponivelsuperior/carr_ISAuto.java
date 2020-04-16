package mx.ipn.exponivelsuperior;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class carr_ISAuto extends AppCompatActivity implements View.OnClickListener{
    ImageView btnBack;

    LinearLayout btnEscEscESIME_UA;
    LinearLayout btnEscEscESIME_UC;
    LinearLayout btnEscEscESIME_UTi;
    LinearLayout btnEscEscESIME_UZ;
    LinearLayout btnEscEscUPIIG;
    LinearLayout btnEscEscUPIIH;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.carr_isauto);

        btnBack = findViewById(R.id.backToCarr);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnEscEscESIME_UA = findViewById(R.id.btnEscEscESIME_UA);
        btnEscEscESIME_UC = findViewById(R.id.btnEscEscESIME_UC);
        btnEscEscESIME_UTi = findViewById(R.id.btnEscEscESIME_UTi);
        btnEscEscESIME_UZ = findViewById(R.id.btnEscEscESIME_UZ);
        btnEscEscUPIIG = findViewById(R.id.btnEscEscUPIIG);
        btnEscEscUPIIH = findViewById(R.id.btnEscEscUPIIH);

        btnEscEscESIME_UA.setOnClickListener(this);
        btnEscEscESIME_UC.setOnClickListener(this);
        btnEscEscESIME_UTi.setOnClickListener(this);
        btnEscEscESIME_UZ.setOnClickListener(this);
        btnEscEscUPIIH.setOnClickListener(this);
        btnEscEscUPIIG.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent();
        switch (v.getId()){
            case R.id.btnEscEscESIME_UA:
                i = new Intent(carr_ISAuto.this, carrera_esc.class);
                i.putExtra("logo","esime");
                i.putExtra("escuela", "ESIME UA");
                i.putExtra("esc","ESIME_UA");
                i.putExtra("carr","ISAuto");
                break;

            case R.id.btnEscEscESIME_UC:
                i = new Intent(carr_ISAuto.this, carrera_esc.class);
                i.putExtra("logo","esime");
                i.putExtra("escuela", "ESIME UC");
                i.putExtra("esc","ESIME_UC");
                i.putExtra("carr","ISAuto");
                break;

            case R.id.btnEscEscESIME_UTi:
                i = new Intent(carr_ISAuto.this, carrera_esc.class);
                i.putExtra("logo","esime");
                i.putExtra("escuela", "ESIME UTi");
                i.putExtra("esc","ESIME_UTi");
                i.putExtra("carr","ISAuto");
                break;

            case R.id.btnEscEscESIME_UZ:
                i = new Intent(carr_ISAuto.this, carrera_esc.class);
                i.putExtra("logo","esime");
                i.putExtra("escuela", "ESIME UZ");
                i.putExtra("esc","ESIME_UZ");
                i.putExtra("carr","ISAuto");
                break;

            case R.id.btnEscEscUPIIG:
                i = new Intent(carr_ISAuto.this, carrera_esc.class);
                i.putExtra("logo","upiig");
                i.putExtra("escuela", "UPIIG");
                i.putExtra("esc","UPIIG");
                i.putExtra("carr","ISAuto");
                break;

            case R.id.btnEscEscUPIIH:
                i = new Intent(carr_ISAuto.this, carrera_esc.class);
                i.putExtra("logo","upiih");
                i.putExtra("escuela", "UPIIH");
                i.putExtra("esc","UPIIH");
                i.putExtra("carr","ISAuto");
                break;
        }
        startActivity(i);

    }
}

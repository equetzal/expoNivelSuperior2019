package mx.ipn.exponivelsuperior;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class carr_ICE extends AppCompatActivity implements View.OnClickListener{
    ImageView btnBack;

    LinearLayout btnEscEscESIME_UC;
    LinearLayout btnEscEscESIME_UZ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.carr_ice);

        btnBack = findViewById(R.id.backToCarr);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnEscEscESIME_UC = findViewById(R.id.btnEscEscESIME_UC);
        btnEscEscESIME_UZ = findViewById(R.id.btnEscEscESIME_UZ);

        btnEscEscESIME_UC.setOnClickListener(this);
        btnEscEscESIME_UZ.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent();
        switch (v.getId()){
            case R.id.btnEscEscESIME_UC:
                i = new Intent(carr_ICE.this, carrera_esc.class);
                i.putExtra("logo","esime");
                i.putExtra("escuela", "ESIME UC");
                i.putExtra("esc","ESIME_UC");
                i.putExtra("carr","ICE");
                break;

            case R.id.btnEscEscESIME_UZ:
                i = new Intent(carr_ICE.this, carrera_esc.class);
                i.putExtra("logo","esime");
                i.putExtra("escuela", "ESIME UZ");
                i.putExtra("esc","ESIME_UZ");
                i.putExtra("carr","ICE");
                break;
        }
        startActivity(i);

    }
}

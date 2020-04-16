package mx.ipn.exponivelsuperior;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class carr_IAero extends AppCompatActivity implements View.OnClickListener {
    ImageView btnBack;

    LinearLayout btnEscEscESIME_UTi;
    LinearLayout btnEscEscUPIIG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.carr_iaero);

        btnBack = findViewById(R.id.backToCarr);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnEscEscESIME_UTi = findViewById(R.id.btnEscEscESIME_UTi);
        btnEscEscUPIIG = findViewById(R.id.btnEscEscUPIIG);

        btnEscEscESIME_UTi.setOnClickListener(this);
        btnEscEscUPIIG.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent();
        switch (v.getId()){
            case R.id.btnEscEscESIME_UTi:
                i = new Intent(carr_IAero.this, carrera_esc.class);
                i.putExtra("logo","esime");
                i.putExtra("escuela", "ESIME UTi");
                i.putExtra("esc","ESIME_UTi");
                i.putExtra("carr","IAero");
                break;

            case R.id.btnEscEscUPIIG:
                i = new Intent(carr_IAero.this, carrera_esc.class);
                i.putExtra("logo","upiig");
                i.putExtra("escuela", "UPIIG");
                i.putExtra("esc","UPIIG");
                i.putExtra("carr","IAero");
                break;
        }
        startActivity(i);

    }
}

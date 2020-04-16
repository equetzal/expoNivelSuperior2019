package mx.ipn.exponivelsuperior;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class carr_IMecani extends AppCompatActivity implements View.OnClickListener{
    ImageView btnBack;

    LinearLayout btnEscEscESIME_UA;
    LinearLayout btnEscEscESIME_UC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.carr_imecani);

        btnBack = findViewById(R.id.backToCarr);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnEscEscESIME_UA = findViewById(R.id.btnEscEscESIME_UA);
        btnEscEscESIME_UC = findViewById(R.id.btnEscEscESIME_UC);

        btnEscEscESIME_UA.setOnClickListener(this);
        btnEscEscESIME_UC.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent();
        switch (v.getId()){
            case R.id.btnEscEscESIME_UA:
                i = new Intent(carr_IMecani.this, carrera_esc.class);
                i.putExtra("logo","esime");
                i.putExtra("escuela", "ESIME UA");
                i.putExtra("esc","ESIME_UA");
                i.putExtra("carr","IMecani");
                break;

            case R.id.btnEscEscESIME_UC:
                i = new Intent(carr_IMecani.this, carrera_esc.class);
                i.putExtra("logo","esime");
                i.putExtra("escuela", "ESIME UC");
                i.putExtra("esc","ESIME_UC");
                i.putExtra("carr","IMecani");
                break;
        }
        startActivity(i);
    }
}

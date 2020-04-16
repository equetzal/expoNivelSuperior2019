package mx.ipn.exponivelsuperior;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class nesc_carr_CP extends AppCompatActivity implements View.OnClickListener {
    ImageView btnBack;

    LinearLayout btnNescEscESCA_UTep;
    LinearLayout btnNescEscESCA_UST;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nesc_carr_cp);

        btnBack = findViewById(R.id.backToCarr);
        btnNescEscESCA_UTep = findViewById(R.id.btnNescEscESCA_UTep);
        btnNescEscESCA_UST = findViewById(R.id.btnNescEscESCA_UST);

        btnNescEscESCA_UTep.setOnClickListener(this);
        btnNescEscESCA_UST.setOnClickListener(this);

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
            case R.id.btnNescEscESCA_UTep:
                i = new Intent(nesc_carr_CP.this, carrera_nesc.class);
                i.putExtra("logo","esca");
                i.putExtra("escuela", "ESCA UTep");
                i.putExtra("esc","ESCA_UTep");
                i.putExtra("carr","CP");
                break;

            case R.id.btnNescEscESCA_UST:
                i = new Intent(nesc_carr_CP.this, carrera_nesc.class);
                i.putExtra("logo","esca");
                i.putExtra("escuela", "ESCA UST");
                i.putExtra("esc","ESCA_UST");
                i.putExtra("carr","CP");
                break;

        }

        startActivity(i);


    }
}

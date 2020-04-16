package mx.ipn.exponivelsuperior;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class nesc_sedes_ESCA extends AppCompatActivity implements View.OnClickListener {
    ImageView btnBack;
    LinearLayout btnNescEscESCA_UST;
    LinearLayout btnNescEscESCA_UTep;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nesc_sedes__esca);

        btnBack = findViewById(R.id.btnBackToSchools);

        btnNescEscESCA_UST = findViewById(R.id.btnNescEscESCA_UST);
        btnNescEscESCA_UTep = findViewById(R.id.btnNescEscESCA_UTep);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnNescEscESCA_UST.setOnClickListener(this);
        btnNescEscESCA_UTep.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent();
        switch (v.getId()){
            case R.id.btnNescEscESCA_UST:
                i = new Intent(nesc_sedes_ESCA.this, nesc_ESCA_UST.class);
            break;

            case R.id.btnNescEscESCA_UTep:
                i = new Intent(nesc_sedes_ESCA.this, nesc_ESCA_UTep.class);
            break;
        }
        startActivity(i);
    }
}

package mx.ipn.exponivelsuperior;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class carr_LNI extends AppCompatActivity implements View.OnClickListener {
    ImageView btnBack;

    LinearLayout btnEscEscESCA_UTep;
    LinearLayout btnEscEscESCA_UST;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.carr_lni);

        btnBack = findViewById(R.id.backToCarr);
        btnEscEscESCA_UTep = findViewById(R.id.btnEscEscESCA_UTep);
        btnEscEscESCA_UST = findViewById(R.id.btnEscEscESCA_UST);

        btnEscEscESCA_UTep.setOnClickListener(this);
        btnEscEscESCA_UST.setOnClickListener(this);

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
            case R.id.btnEscEscESCA_UTep:
                i = new Intent(carr_LNI.this, carrera_esc.class);
                i.putExtra("logo","esca");
                i.putExtra("escuela", "ESCA UTep");
                i.putExtra("esc","ESCA_UTep");
                i.putExtra("carr","LNI");
                break;

            case R.id.btnEscEscESCA_UST:
                i = new Intent(carr_LNI.this, carrera_esc.class);
                i.putExtra("logo","esca");
                i.putExtra("escuela", "ESCA UST");
                i.putExtra("esc","ESCA_UST");
                i.putExtra("carr","LNI");
                break;

        }

        startActivity(i);

    }
}

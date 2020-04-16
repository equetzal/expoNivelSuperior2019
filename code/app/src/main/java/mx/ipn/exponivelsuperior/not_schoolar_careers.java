package mx.ipn.exponivelsuperior;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class not_schoolar_careers extends AppCompatActivity implements View.OnClickListener{
    ImageView btnBack;

    LinearLayout btnCarrCP;
    LinearLayout btnCarrLADE;
    LinearLayout btnCarrLCInt;
    LinearLayout btnCarrLNI;
    LinearLayout btnCarrLRC;
    LinearLayout btnCarrLPA;
    LinearLayout btnCarrLPB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_not_schoolar_careers);

        btnBack = findViewById(R.id.btnBackToViewMode);
        btnCarrCP = findViewById(R.id.btnCarrCP);
        btnCarrLADE = findViewById(R.id.btnCarrLADE);
        btnCarrLCInt = findViewById(R.id.btnCarrLCInt);
        btnCarrLNI = findViewById(R.id.btnCarrLNI);
        btnCarrLRC = findViewById(R.id.btnCarrLRC);
        btnCarrLPA = findViewById(R.id.btnCarrLPA);
        btnCarrLPB = findViewById(R.id.btnCarrLPB);


        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnCarrCP.setOnClickListener(this);
        btnCarrLADE.setOnClickListener(this);
        btnCarrLCInt.setOnClickListener(this);
        btnCarrLNI.setOnClickListener(this);
        btnCarrLRC.setOnClickListener(this);
        btnCarrLPA.setOnClickListener(this);
        btnCarrLPB.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent i = new Intent();

        switch (v.getId()){
            case R.id.btnCarrCP:
                i = new Intent(not_schoolar_careers.this, nesc_carr_CP.class);
                break;

            case R.id.btnCarrLADE:
                i = new Intent(not_schoolar_careers.this, carrera_nesc.class);
                i.putExtra("logo","esca");
                i.putExtra("escuela", "ESCA UST");
                i.putExtra("esc","ESCA_UST");
                i.putExtra("carr","LADE");
                break;

            case R.id.btnCarrLCInt:
                i = new Intent(not_schoolar_careers.this, carrera_nesc.class);
                i.putExtra("logo","esca");
                i.putExtra("escuela", "ESCA UST");
                i.putExtra("esc","ESCA_UST");
                i.putExtra("carr","LCInt");
                break;

            case R.id.btnCarrLNI:
                i = new Intent(not_schoolar_careers.this, nesc_carr_LNI.class);
                break;

            case R.id.btnCarrLRC:
                i = new Intent(not_schoolar_careers.this, nesc_carr_LRC.class);
                break;

            case R.id.btnCarrLPA:
                i = new Intent(not_schoolar_careers.this, carrera_nesc.class);
                i.putExtra("logo","enba");
                i.putExtra("escuela", "ENBA");
                i.putExtra("esc","ENBA");
                i.putExtra("carr","LPA");
                break;

            case R.id.btnCarrLPB:
                i = new Intent(not_schoolar_careers.this, carrera_nesc.class);
                i.putExtra("logo","enba");
                i.putExtra("escuela", "ENBA");
                i.putExtra("esc","ENBA");
                i.putExtra("carr","LPB");
                break;
        }

        startActivity(i);

    }
}

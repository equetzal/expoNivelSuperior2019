package mx.ipn.exponivelsuperior;

import android.content.Intent;
import android.support.v4.view.ViewCompat;
import android.support.v4.widget.NestedScrollView;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class schoolar_schools extends AppCompatActivity implements View.OnClickListener {
    ImageView btnBack;
    LinearLayout btnEscEscCICS;
    LinearLayout btnEscEscENBA;
    LinearLayout btnEscEscENCB;
    LinearLayout btnEscEscENMH;
    LinearLayout btnEscEscESCA;
    LinearLayout btnEscEscESCOM;
    LinearLayout btnEscEscESE;
    LinearLayout btnEscEscESEO;
    LinearLayout btnEscEscESFM;
    LinearLayout btnEscEscESIME;
    LinearLayout btnEscEscESIQIE;
    LinearLayout btnEscEscESIT;
    LinearLayout btnEscEscESIA;
    LinearLayout btnEscEscESM;
    LinearLayout btnEscEscEST;
    LinearLayout btnEscEscUPIBI;
    LinearLayout btnEscEscUPIIG;
    LinearLayout btnEscEscUPIIZ;
    LinearLayout btnEscEscUPIIH;
    LinearLayout btnEscEscUPIICSA;
    LinearLayout btnEscEscUPIITA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_schoolar_schools);
        ViewCompat.setNestedScrollingEnabled(findViewById(R.id.scrollEscuelasEscolarizadas),false);

        btnBack = findViewById(R.id.btnBackToViewMode);
        btnEscEscCICS = findViewById(R.id.btnEscEscCICS);
        btnEscEscENBA = findViewById(R.id.btnEscEscENBA);
        btnEscEscENCB = findViewById(R.id.btnEscEscENCB);
        btnEscEscENMH = findViewById(R.id.btnEscEscENMH);
        btnEscEscESCA = findViewById(R.id.btnEscEscESCA);
        btnEscEscESCOM = findViewById(R.id.btnEscEscESCOM);
        btnEscEscESE = findViewById(R.id.btnEscEscESE);
        btnEscEscESEO = findViewById(R.id.btnEscEscESEO);
        btnEscEscESFM  = findViewById(R.id.btnEscEscESFM);
        btnEscEscESIME = findViewById(R.id.btnEscEscESIME);
        btnEscEscESIQIE = findViewById(R.id.btnEscEscESIQIE);
        btnEscEscESIT = findViewById(R.id.btnEscEscESIT);
        btnEscEscESIA = findViewById(R.id.btnEscEscESIA);
        btnEscEscESM = findViewById(R.id.btnEscEscESM);
        btnEscEscEST = findViewById(R.id.btnEscEscEST);
        btnEscEscUPIBI = findViewById(R.id.btnEscEscUPIBI);
        btnEscEscUPIIG = findViewById(R.id.btnEscEscUPIIG);
        btnEscEscUPIIZ = findViewById(R.id.btnEscEscUPIIZ);
        btnEscEscUPIIH = findViewById(R.id.btnEscEscUPIIH);
        btnEscEscUPIICSA = findViewById(R.id.btnEscEscUPIICSA);
        btnEscEscUPIITA = findViewById(R.id.btnEscEscUPIITA);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnEscEscCICS.setOnClickListener(this);
        btnEscEscENBA.setOnClickListener(this);
        btnEscEscENCB.setOnClickListener(this);
        btnEscEscENMH.setOnClickListener(this);
        btnEscEscESCA.setOnClickListener(this);
        btnEscEscESCOM.setOnClickListener(this);
        btnEscEscESE.setOnClickListener(this);
        btnEscEscESEO.setOnClickListener(this);
        btnEscEscESFM.setOnClickListener(this);
        btnEscEscESIME.setOnClickListener(this);
        btnEscEscESIQIE.setOnClickListener(this);
        btnEscEscESIT.setOnClickListener(this);
        btnEscEscESIA.setOnClickListener(this);
        btnEscEscESM.setOnClickListener(this);
        btnEscEscEST.setOnClickListener(this);
        btnEscEscUPIBI.setOnClickListener(this);
        btnEscEscUPIIG.setOnClickListener(this);
        btnEscEscUPIIZ.setOnClickListener(this);
        btnEscEscUPIIH.setOnClickListener(this);
        btnEscEscUPIICSA.setOnClickListener(this);
        btnEscEscUPIITA.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent();
        Log.d("LogIntent", "Dio click");
        switch (v.getId()){
            case R.id.btnEscEscCICS:
                //Sedes
                i = new Intent(schoolar_schools.this, esc_sedes_CICS.class);
                break;

            case R.id.btnEscEscENBA:
                i = new Intent(schoolar_schools.this, esc_ENBA.class);
                break;

            case R.id.btnEscEscENCB:
                //Sedes Ya No
                //i = new Intent(schoolar_schools.this, esc_sedes_ENCB.class);
                i = new Intent(schoolar_schools.this, esc_ENCB_UST.class);
                break;

            case R.id.btnEscEscENMH:
                i = new Intent(schoolar_schools.this, esc_ENMH.class);
                break;

            case R.id.btnEscEscESCA:
                //Sedes
                i = new Intent(schoolar_schools.this, esc_sedes_ESCA.class);
                break;

            case R.id.btnEscEscESCOM:
                i = new Intent(schoolar_schools.this, esc_ESCOM.class);
                break;

            case R.id.btnEscEscESE:
                i = new Intent(schoolar_schools.this, esc_ESE.class);
                break;

            case R.id.btnEscEscESEO:
                i = new Intent(schoolar_schools.this, esc_ESEO.class);
                break;

            case R.id.btnEscEscESFM:
                i = new Intent(schoolar_schools.this, esc_ESFM.class);
                break;

            case R.id.btnEscEscESIA:
                //Esia
                i = new Intent(schoolar_schools.this, esc_sedes_ESIA.class);
                break;

            case R.id.btnEscEscESIME:
                //Sedes
                i = new Intent(schoolar_schools.this, esc_sedes_ESIME.class);
                break;

            case R.id.btnEscEscESIQIE:
                i = new Intent(schoolar_schools.this, esc_ESIQIE.class);
                break;

            case R.id.btnEscEscESIT:
                i = new Intent(schoolar_schools.this, esc_ESIT.class);
                break;

            case R.id.btnEscEscESM:
                i = new Intent(schoolar_schools.this, esc_ESM.class);
                break;

            case R.id.btnEscEscEST:
                i = new Intent(schoolar_schools.this, esc_EST.class);
                break;

            case R.id.btnEscEscUPIBI:
                i = new Intent(schoolar_schools.this, esc_UPIBI.class);
                break;

            case R.id.btnEscEscUPIICSA:
                i = new Intent(schoolar_schools.this, esc_UPIICSA.class);
                break;

            case R.id.btnEscEscUPIIG:
                i = new Intent(schoolar_schools.this, esc_UPIIG.class);
                break;

            case R.id.btnEscEscUPIIH:
                i = new Intent(schoolar_schools.this, esc_UPIIH.class);
                break;

            case R.id.btnEscEscUPIITA:
                i = new Intent(schoolar_schools.this, esc_UPIITA.class);
                break;

            case R.id.btnEscEscUPIIZ:
                i = new Intent(schoolar_schools.this, esc_UPIIZ.class);
                break;
        }
        startActivity(i);
    }
}

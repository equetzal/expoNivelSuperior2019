package mx.ipn.exponivelsuperior;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class esc_ESIQIE extends AppCompatActivity implements View.OnClickListener {
    ImageButton btnMapa;
    ImageView btnBack;
    LinearLayout btnWebEsc;
    LinearLayout btnWebBecas;
    LinearLayout btnWebSalud;
    LinearLayout btnWebSoftware;

    LinearLayout btnVerCarrIMM;
    LinearLayout btnVerCarrIQI;
    LinearLayout btnVerCarrIQP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.esc_esiqie);

        btnMapa = findViewById(R.id.btnMapa);
        btnBack = findViewById(R.id.backEsc);
        btnWebEsc = findViewById(R.id.btnWebEsc);
        btnWebBecas = findViewById(R.id.btnWebBecas);
        btnWebSalud = findViewById(R.id.btnWebSalud);
        btnWebSoftware = findViewById(R.id.btnWebSoftware);

        btnVerCarrIMM = findViewById(R.id.btnVerCarrIMM);
        btnVerCarrIQI = findViewById(R.id.btnVerCarrIQI);
        btnVerCarrIQP = findViewById(R.id.btnVerCarrIQP);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnMapa.setOnClickListener(this);
        btnWebEsc.setOnClickListener(this);
        btnWebBecas.setOnClickListener(this);
        btnWebSalud.setOnClickListener(this);
        btnWebSoftware.setOnClickListener(this);

        btnVerCarrIMM.setOnClickListener(this);
        btnVerCarrIQI.setOnClickListener(this);
        btnVerCarrIQP.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent();
        String url;
        switch (v.getId()){
            case R.id.btnMapa:
                Uri intentUri = Uri.parse("geo:19.5022715,-99.1340835?z=16.75&q=19.5022715,-99.1340835(ESIQIE)");
                i = new Intent(Intent.ACTION_VIEW, intentUri);
                break;

            case R.id.btnWebEsc:
                url = getString(R.string.httpESIQIE);
                i = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                break;

            case R.id.btnWebBecas:
                url = getString(R.string.webBecas);
                i = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                break;

            case R.id.btnWebSalud:
                url = getString(R.string.webSalud);
                i = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                break;

            case R.id.btnWebSoftware:
                url = getString(R.string.webSoftware);
                i = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                break;

            case R.id.btnVerCarrIMM:
                i = new Intent(esc_ESIQIE.this, carrera_esc.class);
                i.putExtra("logo","esiqie");
                i.putExtra("escuela", "ESIQIE");
                i.putExtra("esc","ESIQIE");
                i.putExtra("carr","IMM" );
                break;

            case R.id.btnVerCarrIQP:
                i = new Intent(esc_ESIQIE.this, carrera_esc.class);
                i.putExtra("logo","esiqie");
                i.putExtra("escuela", "ESIQIE");
                i.putExtra("esc","ESIQIE");
                i.putExtra("carr","IQP" );
                break;

            case R.id.btnVerCarrIQI:
                i = new Intent(esc_ESIQIE.this, carrera_esc.class);
                i.putExtra("logo","esiqie");
                i.putExtra("escuela", "ESIQIE");
                i.putExtra("esc","ESIQIE");
                i.putExtra("carr","IQI" );
                break;
        }

        startActivity(i);
    }
}

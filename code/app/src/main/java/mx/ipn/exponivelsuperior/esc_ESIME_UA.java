package mx.ipn.exponivelsuperior;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class esc_ESIME_UA extends AppCompatActivity implements View.OnClickListener {
    ImageButton btnMapa;
    ImageView btnBack;
    LinearLayout btnWebEsc;
    LinearLayout btnWebBecas;
    LinearLayout btnWebSalud;
    LinearLayout btnWebSoftware;

    LinearLayout btnVerCarrIMecani;
    LinearLayout btnVerCarrIRI;
    LinearLayout btnVerCarrISAuto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.esc_esime_ua);

        btnMapa = findViewById(R.id.btnMapa);
        btnBack = findViewById(R.id.backEsc);
        btnWebEsc = findViewById(R.id.btnWebEsc);
        btnWebBecas = findViewById(R.id.btnWebBecas);
        btnWebSalud = findViewById(R.id.btnWebSalud);
        btnWebSoftware = findViewById(R.id.btnWebSoftware);

        btnVerCarrIMecani = findViewById(R.id.btnVerCarrIMecani);
        btnVerCarrIRI = findViewById(R.id.btnVerCarrIRI);
        btnVerCarrISAuto = findViewById(R.id.btnVerCarrISAuto);

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

        btnVerCarrIMecani.setOnClickListener(this);
        btnVerCarrIRI.setOnClickListener(this);
        btnVerCarrISAuto.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent();
        String url;
        switch (v.getId()){
            case R.id.btnMapa:
                Uri intentUri = Uri.parse("geo:19.4888395,-99.174042?z=15.3&q=19.4888395,-99.174042(ESIME+UA)");
                i = new Intent(Intent.ACTION_VIEW, intentUri);
                break;

            case R.id.btnWebEsc:
                url = getString(R.string.httpESIME_UA);
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

            case R.id.btnVerCarrIMecani:
                i = new Intent(esc_ESIME_UA.this, carrera_esc.class);
                i.putExtra("logo","esime");
                i.putExtra("escuela", "ESIME UA");
                i.putExtra("esc","ESIME_UA");
                i.putExtra("carr","IMecani" );
                break;

            case R.id.btnVerCarrIRI:
                i = new Intent(esc_ESIME_UA.this, carrera_esc.class);
                i.putExtra("logo","esime");
                i.putExtra("escuela", "ESIM UA");
                i.putExtra("esc","ESIME_UA");
                i.putExtra("carr","IRI" );
                break;

            case R.id.btnVerCarrISAuto:
                i = new Intent(esc_ESIME_UA.this, carrera_esc.class);
                i.putExtra("logo","esime");
                i.putExtra("escuela", "ESIME UA");
                i.putExtra("esc","ESIME_UA");
                i.putExtra("carr","ISAuto" );
                break;
        }

        startActivity(i);
    }
}

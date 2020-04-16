package mx.ipn.exponivelsuperior;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class esc_ESIME_UC extends AppCompatActivity implements View.OnClickListener {
    ImageButton btnMapa;
    ImageView btnBack;
    LinearLayout btnWebEsc;
    LinearLayout btnWebBecas;
    LinearLayout btnWebSalud;
    LinearLayout btnWebSoftware;

    LinearLayout btnVerCarrIComp;
    LinearLayout btnVerCarrICE;
    LinearLayout btnVerCarrISAuto;
    LinearLayout btnVerCarrIMecani;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.esc_esime_uc);

        btnMapa = findViewById(R.id.btnMapa);
        btnBack = findViewById(R.id.backEsc);
        btnWebEsc = findViewById(R.id.btnWebEsc);
        btnWebBecas = findViewById(R.id.btnWebBecas);
        btnWebSalud = findViewById(R.id.btnWebSalud);
        btnWebSoftware = findViewById(R.id.btnWebSoftware);

        btnVerCarrIComp = findViewById(R.id.btnVerCarrIComp);
        btnVerCarrICE = findViewById(R.id.btnVerCarrICE);
        btnVerCarrIMecani = findViewById(R.id.btnVerCarrIMecani);
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

        btnVerCarrIComp.setOnClickListener(this);
        btnVerCarrICE.setOnClickListener(this);
        btnVerCarrIMecani.setOnClickListener(this);
        btnVerCarrISAuto.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent();
        String url;
        switch (v.getId()){
            case R.id.btnMapa:
                Uri intentUri = Uri.parse("geo:19.3289529,-99.1117755?z=17&q=19.3289529,-99.1117755(ESIME+UC)");
                i = new Intent(Intent.ACTION_VIEW, intentUri);
                break;

            case R.id.btnWebEsc:
                url = getString(R.string.httpESIME_UC);
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
                i = new Intent(esc_ESIME_UC.this, carrera_esc.class);
                i.putExtra("logo","esime");
                i.putExtra("escuela", "ESIME UC");
                i.putExtra("esc","ESIME_UC");
                i.putExtra("carr","IMecani" );
                break;

            case R.id.btnVerCarrIComp:
                i = new Intent(esc_ESIME_UC.this, carrera_esc.class);
                i.putExtra("logo","esime");
                i.putExtra("escuela", "ESIME UC");
                i.putExtra("esc","ESIME_UC");
                i.putExtra("carr","IComp" );
                break;

            case R.id.btnVerCarrISAuto:
                i = new Intent(esc_ESIME_UC.this, carrera_esc.class);
                i.putExtra("logo","esime");
                i.putExtra("escuela", "ESIME UC");
                i.putExtra("esc","ESIME_UC");
                i.putExtra("carr","ISAuto" );
                break;

            case R.id.btnVerCarrICE:
                i = new Intent(esc_ESIME_UC.this, carrera_esc.class);
                i.putExtra("logo","esime");
                i.putExtra("escuela", "ESIME UC");
                i.putExtra("esc","ESIME_UC");
                i.putExtra("carr","ICE" );
                break;
        }

        startActivity(i);
    }
}

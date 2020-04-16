package mx.ipn.exponivelsuperior;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class esc_ESIME_UZ extends AppCompatActivity implements View.OnClickListener {
    ImageButton btnMapa;
    ImageView btnBack;
    LinearLayout btnWebEsc;
    LinearLayout btnWebBecas;
    LinearLayout btnWebSalud;
    LinearLayout btnWebSoftware;

    LinearLayout btnVerCarrICE;
    LinearLayout btnVerCarrICA;
    LinearLayout btnVerCarrIElec;
    LinearLayout btnVerCarrISAuto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.esc_esime_uz);

        btnMapa = findViewById(R.id.btnMapa);
        btnBack = findViewById(R.id.backEsc);
        btnWebEsc = findViewById(R.id.btnWebEsc);
        btnWebBecas = findViewById(R.id.btnWebBecas);
        btnWebSalud = findViewById(R.id.btnWebSalud);
        btnWebSoftware = findViewById(R.id.btnWebSoftware);

        btnVerCarrICE = findViewById(R.id.btnVerCarrICE);
        btnVerCarrICA = findViewById(R.id.btnVerCarrICA);
        btnVerCarrIElec = findViewById(R.id.btnVerCarrIElec);
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

        btnVerCarrICA.setOnClickListener(this);
        btnVerCarrICE.setOnClickListener(this);
        btnVerCarrIElec.setOnClickListener(this);
        btnVerCarrISAuto.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent();
        String url;
        switch (v.getId()){
            case R.id.btnMapa:
                Uri intentUri = Uri.parse("geo:19.4977189,-99.1345464?z=16.18&q=19.4977189,-99.1345464(ESIME+UZ)");
                i = new Intent(Intent.ACTION_VIEW, intentUri);
                break;

            case R.id.btnWebEsc:
                url = getString(R.string.httpESIME_UZ);
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

            case R.id.btnVerCarrISAuto:
                i = new Intent(esc_ESIME_UZ.this, carrera_esc.class);
                i.putExtra("logo","esime");
                i.putExtra("escuela", "ESIME UZ");
                i.putExtra("esc","ESIME_UZ");
                i.putExtra("carr","ISAuto" );
                break;

            case R.id.btnVerCarrICE:
                i = new Intent(esc_ESIME_UZ.this, carrera_esc.class);
                i.putExtra("logo","esime");
                i.putExtra("escuela", "ESIME UZ");
                i.putExtra("esc","ESIME_UZ");
                i.putExtra("carr","ICE" );
                break;

            case R.id.btnVerCarrIElec:
                i = new Intent(esc_ESIME_UZ.this, carrera_esc.class);
                i.putExtra("logo","esime");
                i.putExtra("escuela", "ESIME UZ");
                i.putExtra("esc","ESIME_UZ");
                i.putExtra("carr","IElec" );
                break;

            case R.id.btnVerCarrICA:
                i = new Intent(esc_ESIME_UZ.this, carrera_esc.class);
                i.putExtra("logo","esime");
                i.putExtra("escuela", "ESIME UZ");
                i.putExtra("esc","ESIME_UZ");
                i.putExtra("carr","ICA" );
                break;
        }

        startActivity(i);
    }
}

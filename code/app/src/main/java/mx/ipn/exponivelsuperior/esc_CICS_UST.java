package mx.ipn.exponivelsuperior;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class esc_CICS_UST extends AppCompatActivity implements View.OnClickListener {
    ImageButton btnMapa;
    ImageView btnBack;
    LinearLayout btnWebEsc;
    LinearLayout btnWebBecas;
    LinearLayout btnWebSalud;
    LinearLayout btnWebSoftware;

    LinearLayout btnVerCarrLOdonto;
    LinearLayout btnVerCarrLOpto;
    LinearLayout btnVerCarrLPsico;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.esc_cics_ust);

        btnMapa = findViewById(R.id.btnMapa);
        btnBack = findViewById(R.id.backEsc);
        btnWebEsc = findViewById(R.id.btnWebEsc);
        btnWebBecas = findViewById(R.id.btnWebBecas);
        btnWebSalud = findViewById(R.id.btnWebSalud);
        btnWebSoftware = findViewById(R.id.btnWebSoftware);

        btnVerCarrLOdonto = findViewById(R.id.btnVerCarrLOdonto);
        btnVerCarrLOpto = findViewById(R.id.btnVerCarrLOpto);
        btnVerCarrLPsico = findViewById(R.id.btnVerCarrLPsico);

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

        btnVerCarrLOdonto.setOnClickListener(this);
        btnVerCarrLOpto.setOnClickListener(this);
        btnVerCarrLPsico.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent();
        String url;
        switch (v.getId()){
            case R.id.btnMapa:
                Uri intentUri = Uri.parse("geo:19.4549599,-99.1654931?z=17&q=19.4549599,-99.1654931(CICS+UST)");
                i = new Intent(Intent.ACTION_VIEW, intentUri);
                break;

            case R.id.btnWebEsc:
                url = getString(R.string.httpCICS_UST);
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

            case R.id.btnVerCarrLOpto:
                i = new Intent(esc_CICS_UST.this, carrera_esc.class);
                i.putExtra("logo","cics");
                i.putExtra("escuela", "CICS UST");
                i.putExtra("esc","CICS_UST");
                i.putExtra("carr","LOpto" );
                break;

            case R.id.btnVerCarrLOdonto:
                i = new Intent(esc_CICS_UST.this, carrera_esc.class);
                i.putExtra("logo","cics");
                i.putExtra("escuela", "CICS UST");
                i.putExtra("esc","CICS_UST");
                i.putExtra("carr","LOdonto" );
                break;

            case R.id.btnVerCarrLPsico:
                i = new Intent(esc_CICS_UST.this, carrera_esc.class);
                i.putExtra("logo","cics");
                i.putExtra("escuela", "CICS UST");
                i.putExtra("esc","CICS_UST");
                i.putExtra("carr","LPsico" );
                break;
        }

        startActivity(i);
    }
}

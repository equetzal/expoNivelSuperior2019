package mx.ipn.exponivelsuperior;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class esc_CICS_UMA extends AppCompatActivity implements View.OnClickListener{
    ImageButton btnMapa;
    ImageView btnBack;
    LinearLayout btnWebEsc;
    LinearLayout btnWebBecas;
    LinearLayout btnWebSalud;
    LinearLayout btnWebSoftware;

    LinearLayout btnVerCarrLNutri;
    LinearLayout btnVerCarrLOpto;
    LinearLayout btnVerCarrLEnf;
    LinearLayout btnVerCarrLOdonto;
    LinearLayout btnVerCarrLTS;
    LinearLayout btnVerCarrMCP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.esc_cics_uma);

        btnMapa = findViewById(R.id.btnMapa);
        btnBack = findViewById(R.id.backEsc);
        btnWebEsc = findViewById(R.id.btnWebEsc);
        btnWebBecas = findViewById(R.id.btnWebBecas);
        btnWebSalud = findViewById(R.id.btnWebSalud);
        btnWebSoftware = findViewById(R.id.btnWebSoftware);

        btnVerCarrLNutri = findViewById(R.id.btnVerCarrLNutri);
        btnVerCarrLOpto = findViewById(R.id.btnVerCarrLOpto);
        btnVerCarrLEnf = findViewById(R.id.btnVerCarrLEnf);
        btnVerCarrLOdonto = findViewById(R.id.btnVerCarrLOdonto);
        btnVerCarrLTS = findViewById(R.id.btnVerCarrLTS);
        btnVerCarrMCP = findViewById(R.id.btnVerCarrMCP);

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

        btnVerCarrLNutri.setOnClickListener(this);
        btnVerCarrLOpto.setOnClickListener(this);
        btnVerCarrLEnf.setOnClickListener(this);
        btnVerCarrLOdonto.setOnClickListener(this);
        btnVerCarrLTS.setOnClickListener(this);
        btnVerCarrMCP.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent();
        String url;
        switch (v.getId()){
            case R.id.btnMapa:
                Uri intentUri = Uri.parse("geo:19.079911,-98.95911?z=16&q=19.079911,-98.95911(CICS+UMA)");
                i = new Intent(Intent.ACTION_VIEW, intentUri);
                break;

            case R.id.btnWebEsc:
                url = getString(R.string.httpCICS_UMA);
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

            case R.id.btnVerCarrLNutri:
                i = new Intent(esc_CICS_UMA.this, carrera_esc.class);
                i.putExtra("logo","cics");
                i.putExtra("escuela", "CICS UMA");
                i.putExtra("esc","CICS_UMA");
                i.putExtra("carr","LNutri" );
                break;

            case R.id.btnVerCarrLOpto:
                i = new Intent(esc_CICS_UMA.this, carrera_esc.class);
                i.putExtra("logo","cics");
                i.putExtra("escuela", "CICS UMA");
                i.putExtra("esc","CICS_UMA");
                i.putExtra("carr","LOpto" );
                break;

            case R.id.btnVerCarrLEnf:
                i = new Intent(esc_CICS_UMA.this, carrera_esc.class);
                i.putExtra("logo","cics");
                i.putExtra("escuela", "CICS UMA");
                i.putExtra("esc","CICS_UMA");
                i.putExtra("carr","LEnf" );
                break;

            case R.id.btnVerCarrLOdonto:
                i = new Intent(esc_CICS_UMA.this, carrera_esc.class);
                i.putExtra("logo","cics");
                i.putExtra("escuela", "CICS UMA");
                i.putExtra("esc","CICS_UMA");
                i.putExtra("carr","LOdonto" );
                break;

            case R.id.btnVerCarrLTS:
                i = new Intent(esc_CICS_UMA.this, carrera_esc.class);
                i.putExtra("logo","cics");
                i.putExtra("escuela", "CICS UMA");
                i.putExtra("esc","CICS_UMA");
                i.putExtra("carr","LTS" );
                break;

            case R.id.btnVerCarrMCP:
                i = new Intent(esc_CICS_UMA.this, carrera_esc.class);
                i.putExtra("logo","cics");
                i.putExtra("escuela", "CICS UMA");
                i.putExtra("esc","CICS_UMA");
                i.putExtra("carr","MCP" );
                break;
        }

        startActivity(i);

    }
}

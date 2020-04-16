package mx.ipn.exponivelsuperior;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class esc_ENMH extends AppCompatActivity implements View.OnClickListener{
    ImageButton btnMapa;
    ImageView btnBack;
    LinearLayout btnWebEsc;
    LinearLayout btnWebBecas;
    LinearLayout btnWebSalud;
    LinearLayout btnWebSoftware;

    LinearLayout btnVerCarrMCH;
    LinearLayout btnVerCarrMCP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.esc_enmh);

        btnMapa = findViewById(R.id.btnMapa);
        btnBack = findViewById(R.id.backEsc);
        btnWebEsc = findViewById(R.id.btnWebEsc);
        btnWebBecas = findViewById(R.id.btnWebBecas);
        btnWebSalud = findViewById(R.id.btnWebSalud);
        btnWebSoftware = findViewById(R.id.btnWebSoftware);

        btnVerCarrMCH = findViewById(R.id.btnVerCarrMCH);
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

        btnVerCarrMCH.setOnClickListener(this);
        btnVerCarrMCP.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent();
        String url;
        switch (v.getId()){
            case R.id.btnMapa:
                Uri intentUri = Uri.parse("geo:19.5131887,-99.1374756?z=16.71&q=19.5131887,-99.1374756(ENMH)");
                i = new Intent(Intent.ACTION_VIEW, intentUri);
                break;

            case R.id.btnWebEsc:
                url = getString(R.string.httpENMH);
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

            case R.id.btnVerCarrMCH:
                i = new Intent(esc_ENMH.this, carrera_esc.class);
                i.putExtra("logo","enmh");
                i.putExtra("escuela", "ENMH");
                i.putExtra("esc","ENMH");
                i.putExtra("carr","MCH" );
                break;

            case R.id.btnVerCarrMCP:
                i = new Intent(esc_ENMH.this, carrera_esc.class);
                i.putExtra("logo","enmh");
                i.putExtra("escuela", "ENMH");
                i.putExtra("esc","ENMH");
                i.putExtra("carr","MCP" );
                break;
        }

        startActivity(i);
    }
}

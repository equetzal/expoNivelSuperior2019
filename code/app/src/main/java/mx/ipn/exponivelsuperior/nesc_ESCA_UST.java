package mx.ipn.exponivelsuperior;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class nesc_ESCA_UST extends AppCompatActivity implements View.OnClickListener{
    ImageButton btnMapa;
    ImageView btnBack;
    LinearLayout btnWebEsc;
    LinearLayout btnWebBecas;
    LinearLayout btnWebSalud;
    LinearLayout btnWebSoftware;
    LinearLayout btnWebPolivirtual;
    LinearLayout btnWebAulaPolivirtual;
    LinearLayout btnWebUPEV;

    LinearLayout btnVerCarrCP;
    LinearLayout btnVerCarrLADE;
    LinearLayout btnVerCarrLCInt;
    LinearLayout btnVerCarrLNI;
    LinearLayout btnVerCarrLRC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nesc_esca_ust);

        btnMapa = findViewById(R.id.btnMapa);
        btnBack = findViewById(R.id.backEsc);
        btnWebEsc = findViewById(R.id.btnWebEsc);
        btnWebUPEV = findViewById(R.id.btnWebUPEV);
        btnWebBecas = findViewById(R.id.btnWebBecas);
        btnWebSalud = findViewById(R.id.btnWebSalud);
        btnWebSoftware = findViewById(R.id.btnWebSoftware);
        btnWebPolivirtual = findViewById(R.id.btnWebPolivirtual);
        btnWebAulaPolivirtual = findViewById(R.id.btnWebAulaPolivirtual);

        btnVerCarrCP = findViewById(R.id.btnVerCarrCP);
        btnVerCarrLADE = findViewById(R.id.btnVerCarrLADE);
        btnVerCarrLCInt = findViewById(R.id.btnVerCarrLCInt);
        btnVerCarrLNI = findViewById(R.id.btnVerCarrLNI);
        btnVerCarrLRC = findViewById(R.id.btnVerCarrLRC);

        btnMapa.setOnClickListener(this);
        btnWebEsc.setOnClickListener(this);
        btnWebUPEV.setOnClickListener(this);
        btnWebBecas.setOnClickListener(this);
        btnWebSalud.setOnClickListener(this);
        btnWebSoftware.setOnClickListener(this);
        btnWebPolivirtual.setOnClickListener(this);
        btnWebAulaPolivirtual.setOnClickListener(this);

        btnVerCarrCP.setOnClickListener(this);
        btnVerCarrLADE.setOnClickListener(this);
        btnVerCarrLCInt.setOnClickListener(this);
        btnVerCarrLNI.setOnClickListener(this);
        btnVerCarrLRC.setOnClickListener(this);

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
        String url;
        switch (v.getId()){
            case R.id.btnMapa:
                Uri intentUri = Uri.parse("geo:19.4540234,-99.1678988?z=16.92&q=19.4540234,-99.1678988(ESCA+UST)");
                i = new Intent(Intent.ACTION_VIEW, intentUri);
                break;

            case R.id.btnWebEsc:
                url = getString(R.string.httpENBA);
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

            case R.id.btnWebPolivirtual:
                url = getString(R.string.webPolivirtual);
                i = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                break;

            case R.id.btnWebAulaPolivirtual:
                url = getString(R.string.webAulaPolivirtual);
                i = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                break;

            case R.id.btnWebUPEV:
                url = getString(R.string.webUPEV);
                i = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                break;

            case R.id.btnVerCarrCP:
                i = new Intent(nesc_ESCA_UST.this, carrera_nesc.class);
                i.putExtra("logo","esca");
                i.putExtra("escuela", "ESCA UST");
                i.putExtra("esc","ESCA_UST");
                i.putExtra("carr","CP");
                break;

            case R.id.btnVerCarrLADE:
                i = new Intent(nesc_ESCA_UST.this, carrera_nesc.class);
                i.putExtra("logo","esca");
                i.putExtra("escuela", "ESCA UST");
                i.putExtra("esc","ESCA_UST");
                i.putExtra("carr","LADE");
                break;

            case R.id.btnVerCarrLCInt:
                i = new Intent(nesc_ESCA_UST.this, carrera_nesc.class);
                i.putExtra("logo","esca");
                i.putExtra("escuela", "ESCA UST");
                i.putExtra("esc","ESCA_UST");
                i.putExtra("carr","LCInt");
                break;

            case R.id.btnVerCarrLNI:
                i = new Intent(nesc_ESCA_UST.this, carrera_nesc.class);
                i.putExtra("logo","esca");
                i.putExtra("escuela", "ESCA UST");
                i.putExtra("esc","ESCA_UST");
                i.putExtra("carr","LNI");
                break;

            case R.id.btnVerCarrLRC:
                i = new Intent(nesc_ESCA_UST.this, carrera_nesc.class);
                i.putExtra("logo","esca");
                i.putExtra("escuela", "ESCA UST");
                i.putExtra("esc","ESCA_UST");
                i.putExtra("carr","LRC");
                break;
        }

        startActivity(i);
    }
}

package mx.ipn.exponivelsuperior;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class nesc_ENBA extends AppCompatActivity implements View.OnClickListener {
    ImageButton btnMapa;
    ImageView btnBack;
    LinearLayout btnWebEsc;
    LinearLayout btnWebBecas;
    LinearLayout btnWebSalud;
    LinearLayout btnWebSoftware;
    LinearLayout btnWebPolivirtual;
    LinearLayout btnWebAulaPolivirtual;
    LinearLayout btnWebUPEV;

    LinearLayout btnVerCarrLPA;
    LinearLayout btnVerCarrLPB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nesc_enba);

        btnMapa = findViewById(R.id.btnMapa);
        btnBack = findViewById(R.id.backEsc);
        btnWebEsc = findViewById(R.id.btnWebEsc);
        btnWebUPEV = findViewById(R.id.btnWebUPEV);
        btnWebBecas = findViewById(R.id.btnWebBecas);
        btnWebSalud = findViewById(R.id.btnWebSalud);
        btnWebSoftware = findViewById(R.id.btnWebSoftware);
        btnWebPolivirtual = findViewById(R.id.btnWebPolivirtual);
        btnWebAulaPolivirtual = findViewById(R.id.btnWebAulaPolivirtual);

        btnVerCarrLPA = findViewById(R.id.btnVerCarrLPA);
        btnVerCarrLPB = findViewById(R.id.btnVerCarrLPB);

        btnMapa.setOnClickListener(this);
        btnWebEsc.setOnClickListener(this);
        btnWebUPEV.setOnClickListener(this);
        btnWebBecas.setOnClickListener(this);
        btnWebSalud.setOnClickListener(this);
        btnWebSoftware.setOnClickListener(this);
        btnWebPolivirtual.setOnClickListener(this);
        btnWebAulaPolivirtual.setOnClickListener(this);

        btnVerCarrLPA.setOnClickListener(this);
        btnVerCarrLPB.setOnClickListener(this);

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
                Uri intentUri = Uri.parse("geo:19.5112461,-99.1329807?z=16.63&q=19.5112461,-99.1329807(ENBA)");;
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

            case R.id.btnVerCarrLPA:
                i = new Intent(nesc_ENBA.this, carrera_nesc.class);
                i.putExtra("logo","enba");
                i.putExtra("escuela", "ENBA");
                i.putExtra("esc","ENBA");
                i.putExtra("carr","LPA");
                break;

            case R.id.btnVerCarrLPB:
                i = new Intent(nesc_ENBA.this, carrera_nesc.class);
                i.putExtra("logo","enba");
                i.putExtra("escuela", "ENBA");
                i.putExtra("esc","ENBA");
                i.putExtra("carr","LPB");
                break;
        }

        startActivity(i);

    }
}

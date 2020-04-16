package mx.ipn.exponivelsuperior;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class esc_UPIBI extends AppCompatActivity implements View.OnClickListener {
    ImageButton btnMapa;
    ImageView btnBack;
    LinearLayout btnWebEsc;
    LinearLayout btnWebBecas;
    LinearLayout btnWebSalud;
    LinearLayout btnWebSoftware;

    LinearLayout btnVerCarrIAmb;
    LinearLayout btnVerCarrIBiomed;
    LinearLayout btnVerCarrIBiotec;
    LinearLayout btnVerCarrIAlim;
    LinearLayout btnVerCarrIFarm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.esc_upibi);

        btnMapa = findViewById(R.id.btnMapa);
        btnBack = findViewById(R.id.backEsc);
        btnWebEsc = findViewById(R.id.btnWebEsc);
        btnWebBecas = findViewById(R.id.btnWebBecas);
        btnWebSalud = findViewById(R.id.btnWebSalud);
        btnWebSoftware = findViewById(R.id.btnWebSoftware);

        btnVerCarrIAmb = findViewById(R.id.btnVerCarrIAmb);
        btnVerCarrIBiomed = findViewById(R.id.btnVerCarrIBiomed);
        btnVerCarrIBiotec = findViewById(R.id.btnVerCarrIBiotec);
        btnVerCarrIAlim = findViewById(R.id.btnVerCarrIAlim);
        btnVerCarrIFarm = findViewById(R.id.btnVerCarrIFarm);

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

        btnVerCarrIAmb.setOnClickListener(this);
        btnVerCarrIBiomed.setOnClickListener(this);
        btnVerCarrIBiotec.setOnClickListener(this);
        btnVerCarrIAlim.setOnClickListener(this);
        btnVerCarrIFarm.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent();
        String url;
        switch (v.getId()){
            case R.id.btnMapa:
                Uri intentUri = Uri.parse("geo:19.5146284,-99.1268514?z=16.09&q=19.5146284,-99.1268514(UPIBI)");
                i = new Intent(Intent.ACTION_VIEW, intentUri);
                break;

            case R.id.btnWebEsc:
                url = getString(R.string.httpUPIBI);
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

            case R.id.btnVerCarrIAmb:
                i = new Intent(esc_UPIBI.this, carrera_esc.class);
                i.putExtra("logo","upibi");
                i.putExtra("escuela", "UPIBI");
                i.putExtra("esc","UPIBI");
                i.putExtra("carr","IAmb" );
                break;

            case R.id.btnVerCarrIBiomed:
                i = new Intent(esc_UPIBI.this, carrera_esc.class);
                i.putExtra("logo","upibi");
                i.putExtra("escuela", "UPIBI");
                i.putExtra("esc","UPIBI");
                i.putExtra("carr","IBiomed" );
                break;

            case R.id.btnVerCarrIBiotec:
                i = new Intent(esc_UPIBI.this, carrera_esc.class);
                i.putExtra("logo","upibi");
                i.putExtra("escuela", "UPIBI");
                i.putExtra("esc","UPIBI");
                i.putExtra("carr","IBiotec" );
                break;

            case R.id.btnVerCarrIAlim:
                i = new Intent(esc_UPIBI.this, carrera_esc.class);
                i.putExtra("logo","upibi");
                i.putExtra("escuela", "UPIBI");
                i.putExtra("esc","UPIBI");
                i.putExtra("carr","IAlim" );
                break;

            case R.id.btnVerCarrIFarm:
                i = new Intent(esc_UPIBI.this, carrera_esc.class);
                i.putExtra("logo","upibi");
                i.putExtra("escuela", "UPIBI");
                i.putExtra("esc","UPIBI");
                i.putExtra("carr","IFarm" );
                break;
        }

        startActivity(i);
    }
}

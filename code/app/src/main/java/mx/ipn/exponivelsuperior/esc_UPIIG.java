package mx.ipn.exponivelsuperior;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class esc_UPIIG extends AppCompatActivity implements View.OnClickListener {
    ImageButton btnMapa;
    ImageView btnBack;
    LinearLayout btnWebEsc;
    LinearLayout btnWebBecas;
    LinearLayout btnWebSalud;
    LinearLayout btnWebSoftware;

    LinearLayout btnVerCarrIAero;
    LinearLayout btnVerCarrIBiotec;
    LinearLayout btnVerCarrIFarm;
    LinearLayout btnVerCarrIInd;
    LinearLayout btnVerCarrISAuto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.esc_upiig);

        btnMapa = findViewById(R.id.btnMapa);
        btnBack = findViewById(R.id.backEsc);
        btnWebEsc = findViewById(R.id.btnWebEsc);
        btnWebBecas = findViewById(R.id.btnWebBecas);
        btnWebSalud = findViewById(R.id.btnWebSalud);
        btnWebSoftware = findViewById(R.id.btnWebSoftware);

        btnVerCarrIAero = findViewById(R.id.btnVerCarrIAero);
        btnVerCarrIBiotec = findViewById(R.id.btnVerCarrIBiotec);
        btnVerCarrIFarm = findViewById(R.id.btnVerCarrIFarm);
        btnVerCarrIInd = findViewById(R.id.btnVerCarrIInd);
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

        btnVerCarrIAero.setOnClickListener(this);
        btnVerCarrIBiotec.setOnClickListener(this);
        btnVerCarrIFarm.setOnClickListener(this);
        btnVerCarrIInd.setOnClickListener(this);
        btnVerCarrISAuto.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent();
        String url;
        switch (v.getId()){
            case R.id.btnMapa:
                Uri intentUri = Uri.parse("geo:21.0162891,-101.5020315?z=13&q=21.0162891,-101.5020315(UPIIG)");
                i = new Intent(Intent.ACTION_VIEW, intentUri);
                break;

            case R.id.btnWebEsc:
                url = getString(R.string.httpUPIIG);
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

            case R.id.btnVerCarrIAero:
                i = new Intent(esc_UPIIG.this, carrera_esc.class);
                i.putExtra("logo","upiig");
                i.putExtra("escuela", "UPIIG");
                i.putExtra("esc","UPIIG");
                i.putExtra("carr","IAero" );
                break;

            case R.id.btnVerCarrIBiotec:
                i = new Intent(esc_UPIIG.this, carrera_esc.class);
                i.putExtra("logo","upiig");
                i.putExtra("escuela", "UPIIG");
                i.putExtra("esc","UPIIG");
                i.putExtra("carr","IBiotec" );
                break;

            case R.id.btnVerCarrIFarm:
                i = new Intent(esc_UPIIG.this, carrera_esc.class);
                i.putExtra("logo","upiig");
                i.putExtra("escuela", "UPIIG");
                i.putExtra("esc","UPIIG");
                i.putExtra("carr","IFarm" );
                break;

            case R.id.btnVerCarrIInd:
                i = new Intent(esc_UPIIG.this, carrera_esc.class);
                i.putExtra("logo","upiig");
                i.putExtra("escuela", "UPIIG");
                i.putExtra("esc","UPIIG");
                i.putExtra("carr","IInd");
                break;

            case R.id.btnVerCarrISAuto:
                i = new Intent(esc_UPIIG.this, carrera_esc.class);
                i.putExtra("logo","upiig");
                i.putExtra("escuela", "UPIIG");
                i.putExtra("esc","UPIIG");
                i.putExtra("carr","ISAuto" );
                break;
        }

        startActivity(i);
    }
}

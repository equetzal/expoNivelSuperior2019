package mx.ipn.exponivelsuperior;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class esc_ESIA_UTi extends AppCompatActivity implements View.OnClickListener {
    ImageButton btnMapa;
    ImageView btnBack;
    LinearLayout btnWebEsc;
    LinearLayout btnWebBecas;
    LinearLayout btnWebSalud;
    LinearLayout btnWebSoftware;

    LinearLayout btnVerCarrIGeofi;
    LinearLayout btnVerCarrIGeolo;
    LinearLayout btnVerCarrIPetro;
    LinearLayout btnVerCarrITF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.esc_esia_uti);

        btnMapa = findViewById(R.id.btnMapa);
        btnBack = findViewById(R.id.backEsc);
        btnWebEsc = findViewById(R.id.btnWebEsc);
        btnWebBecas = findViewById(R.id.btnWebBecas);
        btnWebSalud = findViewById(R.id.btnWebSalud);
        btnWebSoftware = findViewById(R.id.btnWebSoftware);

        btnVerCarrIGeofi = findViewById(R.id.btnVerCarrIGeofi);
        btnVerCarrIGeolo = findViewById(R.id.btnVerCarrIGeolo);
        btnVerCarrIPetro = findViewById(R.id.btnVerCarrIPetro);
        btnVerCarrITF = findViewById(R.id.btnVerCarrITF);

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

        btnVerCarrIGeofi.setOnClickListener(this);
        btnVerCarrIGeolo.setOnClickListener(this);
        btnVerCarrIPetro.setOnClickListener(this);
        btnVerCarrITF.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent();
        String url;
        switch (v.getId()){
            case R.id.btnMapa:
                Uri intentUri = Uri.parse("geo:19.5077437,-99.1306381?z=15.95&q=19.5077437,-99.1306381(ESIA+UTi)");
                i = new Intent(Intent.ACTION_VIEW, intentUri);
                break;

            case R.id.btnWebEsc:
                url = getString(R.string.httpESIA_UTi);
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

            case R.id.btnVerCarrIGeofi:
                i = new Intent(esc_ESIA_UTi.this, carrera_esc.class);
                i.putExtra("logo","esia");
                i.putExtra("escuela", "ESIA UTi");
                i.putExtra("esc","ESIA_UTi");
                i.putExtra("carr","IGeofi" );
                break;

            case R.id.btnVerCarrIGeolo:
                i = new Intent(esc_ESIA_UTi.this, carrera_esc.class);
                i.putExtra("logo","esia");
                i.putExtra("escuela", "ESIA UTi");
                i.putExtra("esc","ESIA_UTi");
                i.putExtra("carr","IGeolo" );
                break;

            case R.id.btnVerCarrIPetro:
                i = new Intent(esc_ESIA_UTi.this, carrera_esc.class);
                i.putExtra("logo","esia");
                i.putExtra("escuela", "ESIA UTi");
                i.putExtra("esc","ESIA_UTi");
                i.putExtra("carr","IPetro" );
                break;

            case R.id.btnVerCarrITF:
                i = new Intent(esc_ESIA_UTi.this, carrera_esc.class);
                i.putExtra("logo","esia");
                i.putExtra("escuela", "ESIA UTi");
                i.putExtra("esc","ESIA_UTi");
                i.putExtra("carr","ITF" );
                break;
        }

        startActivity(i);
    }
}

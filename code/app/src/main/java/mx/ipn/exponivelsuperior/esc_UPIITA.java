package mx.ipn.exponivelsuperior;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class esc_UPIITA extends AppCompatActivity implements View.OnClickListener {
    ImageButton btnMapa;
    ImageView btnBack;
    LinearLayout btnWebEsc;
    LinearLayout btnWebBecas;
    LinearLayout btnWebSalud;
    LinearLayout btnWebSoftware;

    LinearLayout btnVerCarrIMecatro;
    LinearLayout btnVerCarrIBioni;
    LinearLayout btnVerCarrITelem;
    LinearLayout btnVerCarrIEner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.esc_upiita);

        btnMapa = findViewById(R.id.btnMapa);
        btnBack = findViewById(R.id.backEsc);
        btnWebEsc = findViewById(R.id.btnWebEsc);
        btnWebBecas = findViewById(R.id.btnWebBecas);
        btnWebSalud = findViewById(R.id.btnWebSalud);
        btnWebSoftware = findViewById(R.id.btnWebSoftware);

        btnVerCarrIMecatro = findViewById(R.id.btnVerCarrIMecatro);
        btnVerCarrIBioni = findViewById(R.id.btnVerCarrIBioni);
        btnVerCarrITelem = findViewById(R.id.btnVerCarrITelem);
        btnVerCarrIEner = findViewById(R.id.btnVerCarrIEner);

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

        btnVerCarrIMecatro.setOnClickListener(this);
        btnVerCarrIBioni.setOnClickListener(this);
        btnVerCarrITelem.setOnClickListener(this);
        btnVerCarrIEner.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent();
        String url;
        switch (v.getId()){
            case R.id.btnMapa:
                Uri intentUri = Uri.parse("geo:19.5116459,-99.125859?z=16&q=19.5116459,-99.125859(UPIITA)");
                i = new Intent(Intent.ACTION_VIEW, intentUri);
                break;

            case R.id.btnWebEsc:
                url = getString(R.string.httpUPIITA);
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

            case R.id.btnVerCarrIMecatro:
                i = new Intent(esc_UPIITA.this, carrera_esc.class);
                i.putExtra("logo","upiita");
                i.putExtra("escuela", "UPIITA");
                i.putExtra("esc","UPIITA");
                i.putExtra("carr","IMecatro" );
                break;

            case R.id.btnVerCarrIBioni:
                i = new Intent(esc_UPIITA.this, carrera_esc.class);
                i.putExtra("logo","upiita");
                i.putExtra("escuela", "UPIITA");
                i.putExtra("esc","UPIITA");
                i.putExtra("carr","IBioni" );
                break;

            case R.id.btnVerCarrITelem:
                i = new Intent(esc_UPIITA.this, carrera_esc.class);
                i.putExtra("logo","upiita");
                i.putExtra("escuela", "UPIITA");
                i.putExtra("esc","UPIITA");
                i.putExtra("carr","ITelem" );
                break;


            case R.id.btnVerCarrIEner:
                i = new Intent(esc_UPIITA.this, carrera_esc.class);
                i.putExtra("logo","upiita");
                i.putExtra("escuela", "UPIITA");
                i.putExtra("esc","UPIITA");
                i.putExtra("carr","IEner" );
                break;
        }

        startActivity(i);
    }
}

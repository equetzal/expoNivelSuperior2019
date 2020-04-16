package mx.ipn.exponivelsuperior;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class esc_UPIIZ extends AppCompatActivity implements View.OnClickListener {
    ImageButton btnMapa;
    ImageView btnBack;
    LinearLayout btnWebEsc;
    LinearLayout btnWebBecas;
    LinearLayout btnWebSalud;
    LinearLayout btnWebSoftware;

    LinearLayout btnVerCarrIMetal;
    LinearLayout btnVerCarrIMecatro;
    LinearLayout btnVerCarrIAlim;
    LinearLayout btnVerCarrIAmb;
    LinearLayout btnVerCarrISC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.esc_upiiz);

        btnMapa = findViewById(R.id.btnMapa);
        btnBack = findViewById(R.id.backEsc);
        btnWebEsc = findViewById(R.id.btnWebEsc);
        btnWebBecas = findViewById(R.id.btnWebBecas);
        btnWebSalud = findViewById(R.id.btnWebSalud);
        btnWebSoftware = findViewById(R.id.btnWebSoftware);

        btnVerCarrIMetal = findViewById(R.id.btnVerCarrIMetal);
        btnVerCarrIMecatro = findViewById(R.id.btnVerCarrIMecatro);
        btnVerCarrIAlim = findViewById(R.id.btnVerCarrIAlim);
        btnVerCarrIAmb = findViewById(R.id.btnVerCarrIAmb);
        btnVerCarrISC = findViewById(R.id.btnVerCarrISC);


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

        btnVerCarrIMetal.setOnClickListener(this);
        btnVerCarrIMecatro.setOnClickListener(this);
        btnVerCarrIAlim.setOnClickListener(this);
        btnVerCarrIAmb.setOnClickListener(this);
        btnVerCarrISC.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent();
        String url;
        switch (v.getId()){
            case R.id.btnMapa:
                Uri intentUri = Uri.parse("geo:22.782612,-102.613849?z=13.68&q=22.782612,-102.613849(UPIIZ)");
                i = new Intent(Intent.ACTION_VIEW, intentUri);
                break;

            case R.id.btnWebEsc:
                url = getString(R.string.httpUPIIZ);
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

            case R.id.btnVerCarrIMetal:
                i = new Intent(esc_UPIIZ.this, carrera_esc.class);
                i.putExtra("logo","upiiz");
                i.putExtra("escuela", "UPIIZ");
                i.putExtra("esc","UPIIZ");
                i.putExtra("carr","IMetal" );
                break;

            case R.id.btnVerCarrIMecatro:
                i = new Intent(esc_UPIIZ.this, carrera_esc.class);
                i.putExtra("logo","upiiz");
                i.putExtra("escuela", "UPIIZ");
                i.putExtra("esc","UPIIZ");
                i.putExtra("carr","IMecatro" );
                break;

            case R.id.btnVerCarrIAlim:
                i = new Intent(esc_UPIIZ.this, carrera_esc.class);
                i.putExtra("logo","upiiz");
                i.putExtra("escuela", "UPIIZ");
                i.putExtra("esc","UPIIZ");
                i.putExtra("carr","IAlim" );
                break;

            case R.id.btnVerCarrIAmb:
                i = new Intent(esc_UPIIZ.this, carrera_esc.class);
                i.putExtra("logo","upiiz");
                i.putExtra("escuela", "UPIIZ");
                i.putExtra("esc","UPIIZ");
                i.putExtra("carr","IAmb" );
                break;

            case R.id.btnVerCarrISC:
                i = new Intent(esc_UPIIZ.this, carrera_esc.class);
                i.putExtra("logo","upiiz");
                i.putExtra("escuela", "UPIIZ");
                i.putExtra("esc","UPIIZ");
                i.putExtra("carr","ISC" );
                break;
        }

        startActivity(i);
    }
}

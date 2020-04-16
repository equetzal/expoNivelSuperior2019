package mx.ipn.exponivelsuperior;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class esc_ENCB_UST extends AppCompatActivity implements View.OnClickListener {
    ImageButton btnMapa;
    ImageView btnBack;
    LinearLayout btnWebEsc;
    LinearLayout btnWebBecas;
    LinearLayout btnWebSalud;
    LinearLayout btnWebSoftware;

    LinearLayout btnVerCarrIBioqui;
    LinearLayout btnVerCarrISAmb;
    LinearLayout btnVerCarrLBio;
    LinearLayout btnVerCarrQBP;
    LinearLayout btnVerCarrQFI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.esc_encb_ust);

        btnMapa = findViewById(R.id.btnMapa);
        btnBack = findViewById(R.id.backEsc);
        btnWebEsc = findViewById(R.id.btnWebEsc);
        btnWebBecas = findViewById(R.id.btnWebBecas);
        btnWebSalud = findViewById(R.id.btnWebSalud);
        btnWebSoftware = findViewById(R.id.btnWebSoftware);

        btnVerCarrIBioqui = findViewById(R.id.btnVerCarrIBioqui);
        btnVerCarrISAmb = findViewById(R.id.btnVerCarrISAmb);
        btnVerCarrLBio = findViewById(R.id.btnVerCarrLBio);
        btnVerCarrQBP = findViewById(R.id.btnVerCarrQBP);
        btnVerCarrQFI = findViewById(R.id.btnVerCarrQFI);

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

        btnVerCarrIBioqui.setOnClickListener(this);
        btnVerCarrISAmb.setOnClickListener(this);
        btnVerCarrLBio.setOnClickListener(this);
        btnVerCarrQBP.setOnClickListener(this);
        btnVerCarrQFI.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent();
        String url;
        switch (v.getId()){
            case R.id.btnMapa:
                Uri intentUri = Uri.parse("geo:19.4541222,-99.1716791?z=16.63&q=19.4541222,-99.1716791(ENCB+UST)");
                i = new Intent(Intent.ACTION_VIEW, intentUri);
                break;

            case R.id.btnWebEsc:
                url = getString(R.string.httpENCB_UST);
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

            case R.id.btnVerCarrIBioqui:
                i = new Intent(esc_ENCB_UST.this, carrera_esc.class);
                i.putExtra("logo","encb");
                i.putExtra("escuela", "ENCB");
                i.putExtra("esc","ENCB");
                i.putExtra("carr","IBioqui" );
                break;

            case R.id.btnVerCarrISAmb:
                i = new Intent(esc_ENCB_UST.this, carrera_esc.class);
                i.putExtra("logo","encb");
                i.putExtra("escuela", "ENCB");
                i.putExtra("esc","ENCB");
                i.putExtra("carr","ISAmb" );
                break;

            case R.id.btnVerCarrLBio:
                i = new Intent(esc_ENCB_UST.this, carrera_esc.class);
                i.putExtra("logo","encb");
                i.putExtra("escuela", "ENCB");
                i.putExtra("esc","ENCB");
                i.putExtra("carr","LBio" );
                break;

            case R.id.btnVerCarrQBP:
                i = new Intent(esc_ENCB_UST.this, carrera_esc.class);
                i.putExtra("logo","encb");
                i.putExtra("escuela", "ENCB");
                i.putExtra("esc","ENCB");
                i.putExtra("carr","QBP" );
                break;

            case R.id.btnVerCarrQFI:
                i = new Intent(esc_ENCB_UST.this, carrera_esc.class);
                i.putExtra("logo","encb");
                i.putExtra("escuela", "ENCB");
                i.putExtra("esc","ENCB");
                i.putExtra("carr","QFI" );
                break;
        }

        startActivity(i);

    }
}

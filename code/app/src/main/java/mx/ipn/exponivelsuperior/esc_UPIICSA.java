package mx.ipn.exponivelsuperior;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class esc_UPIICSA extends AppCompatActivity implements View.OnClickListener {
    ImageButton btnMapa;
    ImageView btnBack;
    LinearLayout btnWebEsc;
    LinearLayout btnWebBecas;
    LinearLayout btnWebSalud;
    LinearLayout btnWebSoftware;

    LinearLayout btnVerCarrIInfor;
    LinearLayout btnVerCarrITrans;
    LinearLayout btnVerCarrIInd;
    LinearLayout btnVerCarrLCI;
    LinearLayout btnVerCarrLAI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.esc_upiicsa);

        btnMapa = findViewById(R.id.btnMapa);
        btnBack = findViewById(R.id.backEsc);
        btnWebEsc = findViewById(R.id.btnWebEsc);
        btnWebBecas = findViewById(R.id.btnWebBecas);
        btnWebSalud = findViewById(R.id.btnWebSalud);
        btnWebSoftware = findViewById(R.id.btnWebSoftware);

        btnVerCarrIInfor = findViewById(R.id.btnVerCarrIInfor);
        btnVerCarrITrans = findViewById(R.id.btnVerCarrITrans);
        btnVerCarrIInd = findViewById(R.id.btnVerCarrIInd);
        btnVerCarrLAI = findViewById(R.id.btnVerCarrLAI);
        btnVerCarrLCI = findViewById(R.id.btnVerCarrLCI);

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

        btnVerCarrIInfor.setOnClickListener(this);
        btnVerCarrITrans.setOnClickListener(this);
        btnVerCarrIInd.setOnClickListener(this);
        btnVerCarrLCI.setOnClickListener(this);
        btnVerCarrLAI.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent();
        String url;
        switch (v.getId()){
            case R.id.btnMapa:
                Uri intentUri = Uri.parse("geo:19.3964553,-99.0916467?z=16&q=19.3964553,-99.0916467(UPIICSA)");
                i = new Intent(Intent.ACTION_VIEW, intentUri);
                break;

            case R.id.btnWebEsc:
                url = getString(R.string.httpUPIICSA);
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

            case R.id.btnVerCarrIInfor:
                i = new Intent(esc_UPIICSA.this, carrera_esc.class);
                i.putExtra("logo","upiicsa");
                i.putExtra("escuela", "UPIICSA");
                i.putExtra("esc","UPIICSA");
                i.putExtra("carr","IInfor" );
                break;

            case R.id.btnVerCarrITrans:
                i = new Intent(esc_UPIICSA.this, carrera_esc.class);
                i.putExtra("logo","upiicsa");
                i.putExtra("escuela", "UPIICSA");
                i.putExtra("esc","UPIICSA");
                i.putExtra("carr","ITrans");
                break;

            case R.id.btnVerCarrIInd:
                i = new Intent(esc_UPIICSA.this, carrera_esc.class);
                i.putExtra("logo","upiicsa");
                i.putExtra("escuela", "UPIICSA");
                i.putExtra("esc","UPIICSA");
                i.putExtra("carr","IInd" );
                break;

            case R.id.btnVerCarrLCI:
                i = new Intent(esc_UPIICSA.this, carrera_esc.class);
                i.putExtra("logo","upiicsa");
                i.putExtra("escuela", "UPIICSA");
                i.putExtra("esc","UPIICSA");
                i.putExtra("carr","LCI" );
                break;

            case R.id.btnVerCarrLAI:
                i = new Intent(esc_UPIICSA.this, carrera_esc.class);
                i.putExtra("logo","upiicsa");
                i.putExtra("escuela", "UPIICSA");
                i.putExtra("esc","UPIICSA");
                i.putExtra("carr","LAI" );
                break;
        }

        startActivity(i);
    }
}

package mx.ipn.exponivelsuperior;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class carrera_esc extends AppCompatActivity {
    ImageView btnBack;
    ImageView logo;
    ImageView imgCarr;
    ImageView btnMapaCurricular;
    TextView nombreCarr;
    TextView objetivoCarr;
    TextView ingresoCarr;
    TextView egresoCarr;
    TextView nombre;
    String urlMapaCurricular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.carrera_esc);

        Intent parentIntent = getIntent();

        btnBack = findViewById(R.id.backCarr);
        logo = findViewById(R.id.carrLogoEsc);
        nombre = findViewById(R.id.txtCarrEsc);
        imgCarr = findViewById(R.id.imgCarrera);
        nombreCarr = findViewById(R.id.txtNombreCarrera);
        objetivoCarr = findViewById(R.id.txtObjetivoCarrera);
        ingresoCarr = findViewById(R.id.txtPerfilIngreso);
        egresoCarr = findViewById(R.id.txtPerfilEgreso);
        btnMapaCurricular = findViewById(R.id.btnMapaCurricular);

        logo.setImageResource(this.getResources().getIdentifier(parentIntent.getStringExtra("logo"),"drawable",this.getPackageName()));
        nombre.setText(parentIntent.getStringExtra("escuela"));
        nombreCarr.setText(this.getResources().getIdentifier("carr"+parentIntent.getStringExtra("carr"), "string", this.getPackageName()));
        imgCarr.setImageResource(this.getResources().getIdentifier("img_"+parentIntent.getStringExtra("carr").toLowerCase(), "drawable",this.getPackageName()));
        objetivoCarr.setText(this.getResources().getIdentifier("obj"+parentIntent.getStringExtra("carr"), "string", this.getPackageName()));
        ingresoCarr.setText(this.getResources().getIdentifier("ing"+parentIntent.getStringExtra("carr"), "string", this.getPackageName()));
        egresoCarr.setText(this.getResources().getIdentifier("egre"+parentIntent.getStringExtra("carr"), "string", this.getPackageName()));
        urlMapaCurricular = getString(this.getResources().getIdentifier("mapaCurr"+parentIntent.getStringExtra("carr")+parentIntent.getStringExtra("esc"),"string", this.getPackageName()));

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnMapaCurricular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(urlMapaCurricular));
                startActivity(i);
            }
        });
    }
}

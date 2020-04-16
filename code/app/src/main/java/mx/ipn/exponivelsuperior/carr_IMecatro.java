package mx.ipn.exponivelsuperior;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class carr_IMecatro extends AppCompatActivity implements View.OnClickListener{
    ImageView btnBack;

    LinearLayout btnEscEscUPIIH;
    LinearLayout btnEscEscUPIITA;
    LinearLayout btnEscEscUPIIZ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.carr_imecatro);

        btnBack = findViewById(R.id.backToCarr);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnEscEscUPIIH = findViewById(R.id.btnEscEscUPIIH);
        btnEscEscUPIITA = findViewById(R.id.btnEscEscUPIITA);
        btnEscEscUPIIZ = findViewById(R.id.btnEscEscUPIIZ);

        btnEscEscUPIIH.setOnClickListener(this);
        btnEscEscUPIITA.setOnClickListener(this);
        btnEscEscUPIIZ.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent();
        switch (v.getId()){
            case R.id.btnEscEscUPIIH:
                i = new Intent(carr_IMecatro.this, carrera_esc.class);
                i.putExtra("logo","upiih");
                i.putExtra("escuela", "UPIIH");
                i.putExtra("esc","UPIIH");
                i.putExtra("carr","IMecatro");
                break;

            case R.id.btnEscEscUPIITA:
                i = new Intent(carr_IMecatro.this, carrera_esc.class);
                i.putExtra("logo","upiita");
                i.putExtra("escuela", "UPIITA");
                i.putExtra("esc","UPIITA");
                i.putExtra("carr","IMecatro");
                break;

            case R.id.btnEscEscUPIIZ:
                i = new Intent(carr_IMecatro.this, carrera_esc.class);
                i.putExtra("logo","upiiz");
                i.putExtra("escuela", "UPIIZ");
                i.putExtra("esc","UPIIZ");
                i.putExtra("carr","IMecatro");
                break;
        }
        startActivity(i);

    }
}

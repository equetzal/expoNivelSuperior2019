package mx.ipn.exponivelsuperior;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class carr_IAmb extends AppCompatActivity implements View.OnClickListener{
    ImageView btnBack;

    LinearLayout btnEscEscUPIBI;
    LinearLayout btnEscEscUPIIZ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.carr_iamb);

        btnBack = findViewById(R.id.backToCarr);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnEscEscUPIBI = findViewById(R.id.btnEscEscUPIBI);
        btnEscEscUPIIZ = findViewById(R.id.btnEscEscUPIIZ);

        btnEscEscUPIIZ.setOnClickListener(this);
        btnEscEscUPIBI.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent();
        switch (v.getId()){
            case R.id.btnEscEscUPIBI:
                i = new Intent(carr_IAmb.this, carrera_esc.class);
                i.putExtra("logo","upibi");
                i.putExtra("escuela", "UPIBI");
                i.putExtra("esc","UPIBI");
                i.putExtra("carr","IAmb");
                break;

            case R.id.btnEscEscUPIIZ:
                i = new Intent(carr_IAmb.this, carrera_esc.class);
                i.putExtra("logo","upiiz");
                i.putExtra("escuela", "UPIIZ");
                i.putExtra("esc","UPIIZ");
                i.putExtra("carr","IAmb");
                break;
        }
        startActivity(i);

    }
}

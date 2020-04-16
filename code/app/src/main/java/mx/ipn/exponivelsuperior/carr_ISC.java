package mx.ipn.exponivelsuperior;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class carr_ISC extends AppCompatActivity implements View.OnClickListener{
    ImageView btnBack;

    LinearLayout btnEscEscESCOM;
    LinearLayout btnEscEscUPIIZ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.carr_isc);

        btnBack = findViewById(R.id.backToCarr);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnEscEscESCOM = findViewById(R.id.btnEscEscESCOM);
        btnEscEscUPIIZ = findViewById(R.id.btnEscEscUPIIZ);

        btnEscEscESCOM.setOnClickListener(this);
        btnEscEscUPIIZ.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent();
        switch (v.getId()){
            case R.id.btnEscEscESCOM:
                i = new Intent(carr_ISC.this, carrera_esc.class);
                i.putExtra("logo","escom");
                i.putExtra("escuela", "ESCOM");
                i.putExtra("esc","ESCOM");
                i.putExtra("carr","ISC" );
                break;

            case R.id.btnEscEscUPIIZ:
                i = new Intent(carr_ISC.this, carrera_esc.class);
                i.putExtra("logo","upiiz");
                i.putExtra("escuela", "UPIIZ");
                i.putExtra("esc","UPIIZ");
                i.putExtra("carr","ISC");
                break;
        }
        startActivity(i);
    }
}

package mx.ipn.exponivelsuperior;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class carr_IFarm extends AppCompatActivity implements View.OnClickListener{
    ImageView btnBack;

    LinearLayout btnEscEscUPIBI;
    LinearLayout btnEscEscUPIIG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.carr_ifarm);

        btnBack = findViewById(R.id.backToCarr);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnEscEscUPIBI = findViewById(R.id.btnEscEscUPIBI);
        btnEscEscUPIIG = findViewById(R.id.btnEscEscUPIIG);

        btnEscEscUPIBI.setOnClickListener(this);
        btnEscEscUPIIG.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent();
        switch (v.getId()){
            case R.id.btnEscEscUPIBI:
                i = new Intent(carr_IFarm.this, carrera_esc.class);
                i.putExtra("logo","upibi");
                i.putExtra("escuela", "UPIBI");
                i.putExtra("esc","UPIBI");
                i.putExtra("carr","IFarm");
                break;

            case R.id.btnEscEscUPIIG:
                i = new Intent(carr_IFarm.this, carrera_esc.class);
                i.putExtra("logo","upiig");
                i.putExtra("escuela", "UPIIG");
                i.putExtra("esc","UPIIG");
                i.putExtra("carr","IFarm");
                break;
        }
        startActivity(i);

    }
}

package mx.ipn.exponivelsuperior;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class esc_sedes_ENCB extends AppCompatActivity implements View.OnClickListener {
    LinearLayout btnEscEscENCB_UST;
    LinearLayout btnEscEscENCB_UZ;
    ImageView btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.esc_sedes_encb);

        btnBack = findViewById(R.id.btnBackToSchools);
        btnEscEscENCB_UST = findViewById(R.id.btnEscEscENCB_UST);
        btnEscEscENCB_UZ = findViewById(R.id.btnEscEscENCB_UZ);

        btnEscEscENCB_UST.setOnClickListener(this);
        btnEscEscENCB_UZ.setOnClickListener(this);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent();
        switch (v.getId()){
            case R.id.btnEscEscENCB_UST:
                i = new Intent(esc_sedes_ENCB.this, esc_ENCB_UST.class);
                break;

            case R.id.btnEscEscENCB_UZ:
                i = new Intent(esc_sedes_ENCB.this, esc_ENCB_UZ.class);
                break;
        }
        startActivity(i);
    }
}

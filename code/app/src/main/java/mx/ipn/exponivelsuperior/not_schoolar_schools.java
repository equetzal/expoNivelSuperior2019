package mx.ipn.exponivelsuperior;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class not_schoolar_schools extends AppCompatActivity {
    ImageView btnBack;
    LinearLayout btnNescEscESCA;
    LinearLayout btnNescEscENBA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_not_schoolar_schools);

        btnBack = findViewById(R.id.btnBackToViewMode);
        btnNescEscESCA = findViewById(R.id.btnNescEscESCA);
        btnNescEscENBA = findViewById(R.id.btnNescEscENBA);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnNescEscESCA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(not_schoolar_schools.this, nesc_sedes_ESCA.class);
                startActivity(i);
            }
        });

        btnNescEscENBA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(not_schoolar_schools.this, nesc_ENBA.class);
                startActivity(i);
            }
        });


    }
}

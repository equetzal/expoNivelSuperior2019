package mx.ipn.exponivelsuperior;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class mixed_schools extends AppCompatActivity {
    ImageView btnBack;
    LinearLayout btnMixEscEST;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mixed_schools);

        btnBack = findViewById(R.id.btnBackToViewMode);
        btnMixEscEST = findViewById(R.id.btnMixEscEST);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnMixEscEST.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mixed_schools.this, mix_EST.class);
                startActivity(i);
            }
        });
    }
}

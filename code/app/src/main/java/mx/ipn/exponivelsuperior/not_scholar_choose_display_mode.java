package mx.ipn.exponivelsuperior;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class not_scholar_choose_display_mode extends AppCompatActivity {
    ImageView btnBackToModalities;
    Button btnGoToMixedCareers;
    Button btnGoToMixedSchools;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_not_scholar_choose_display_mode);

        btnBackToModalities = findViewById(R.id.btnBackToModalities);
        btnGoToMixedCareers = findViewById(R.id.btnGoToMixedCareers);
        btnGoToMixedSchools = findViewById(R.id.btnGoToMixedSchools);

        btnBackToModalities.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnGoToMixedSchools.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(not_scholar_choose_display_mode.this, not_schoolar_schools.class);
                startActivity(i);
            }
        });

        btnGoToMixedCareers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(not_scholar_choose_display_mode.this, not_schoolar_careers.class);
                startActivity(i);
            }
        });

    }
}

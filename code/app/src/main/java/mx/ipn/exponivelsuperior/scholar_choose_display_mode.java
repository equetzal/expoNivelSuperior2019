package mx.ipn.exponivelsuperior;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class scholar_choose_display_mode extends AppCompatActivity implements View.OnClickListener{
    ImageView btnBackToModalities;
    Button btnGoToScholarSchools;
    Button btnGoToScholarCareers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_scholar_choose_display_mode);

        btnBackToModalities = findViewById(R.id.btnBackToModalities);
        btnGoToScholarSchools = findViewById(R.id.btnGoToScholarSchools);
        btnGoToScholarCareers = findViewById(R.id.btnGoToScholarCareers);


        btnBackToModalities.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        btnGoToScholarSchools.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scholar_choose_display_mode.this, schoolar_schools.class);
                startActivity(i);
            }
        });
        btnGoToScholarCareers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scholar_choose_display_mode.this, schoolar_careers.class);
                startActivity(i);
            }
        });

    }

    @Override
    public void onClick(View v) {

    }
}

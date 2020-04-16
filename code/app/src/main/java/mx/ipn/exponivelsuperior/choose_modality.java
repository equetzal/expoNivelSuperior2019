package mx.ipn.exponivelsuperior;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class choose_modality extends AppCompatActivity{

    Button btnGoToScholarMode;
    Button btnGoToNotScholarMode;
    Button btnGoToMixedMode;
    ImageButton btnGoToQuestions;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_choose_modality);


        btnGoToScholarMode = findViewById(R.id.btnGoToScholar);
        btnGoToNotScholarMode = findViewById(R.id.btnGoToNotScholar);
        btnGoToMixedMode = findViewById(R.id.btnGoToMixed);
        btnGoToQuestions = findViewById(R.id.btnGoToQuestions);


        btnGoToScholarMode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(choose_modality.this, scholar_choose_display_mode.class);
                startActivity(i);
                //finish();
            }
        });

        btnGoToNotScholarMode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(choose_modality.this, not_scholar_choose_display_mode.class);
                startActivity(i);
                //finish();
            }
        });

        btnGoToMixedMode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(choose_modality.this, mixed_choose_display_mode.class);
                startActivity(i);
                //finish();
            }
        });

        btnGoToQuestions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(choose_modality.this, questions.class);
                startActivity(i);
                //finish();
            }
        });

    }


}

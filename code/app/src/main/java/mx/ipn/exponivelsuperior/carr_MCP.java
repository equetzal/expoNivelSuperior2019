package mx.ipn.exponivelsuperior;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class carr_MCP extends AppCompatActivity implements View.OnClickListener{
    ImageView btnBack;

    LinearLayout btnEscEscCICS_UMA;
    LinearLayout btnEscEscENMH;
    LinearLayout btnEscEscESM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.carr_mcp);

        btnBack = findViewById(R.id.backToCarr);
        btnEscEscCICS_UMA = findViewById(R.id.btnEscEscCICS_UMA);
        btnEscEscENMH = findViewById(R.id.btnEscEscENMH);
        btnEscEscESM = findViewById(R.id.btnEscEscESM);

        btnEscEscCICS_UMA.setOnClickListener(this);
        btnEscEscENMH.setOnClickListener(this);
        btnEscEscESM.setOnClickListener(this);

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
            case R.id.btnEscEscCICS_UMA:
                i = new Intent(carr_MCP.this, carrera_esc.class);
                i.putExtra("logo","cics");
                i.putExtra("escuela", "CICS UMA");
                i.putExtra("esc","CICS_UMA");
                i.putExtra("carr","MCP");
                break;

            case R.id.btnEscEscENMH:
                i = new Intent(carr_MCP.this, carrera_esc.class);
                i.putExtra("logo","enmh");
                i.putExtra("escuela", "ENMH");
                i.putExtra("esc","ENMH");
                i.putExtra("carr","MCP");
                break;

            case R.id.btnEscEscESM:
                i = new Intent(carr_MCP.this, carrera_esc.class);
                i.putExtra("logo","esm");
                i.putExtra("escuela", "ESM");
                i.putExtra("esc","ESM");
                i.putExtra("carr","MCP");
                break;

        }

        startActivity(i);
    }
}

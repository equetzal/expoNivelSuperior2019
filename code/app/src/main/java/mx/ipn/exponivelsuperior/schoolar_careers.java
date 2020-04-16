package mx.ipn.exponivelsuperior;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class schoolar_careers extends AppCompatActivity implements View.OnClickListener {
    ImageView btnBack;

    LinearLayout btnCarrCP;
    LinearLayout btnCarrLAI;
    LinearLayout btnCarrLADE;
    LinearLayout btnCarrLEcono;
    LinearLayout btnCarrLNI;
    LinearLayout btnCarrLRC;
    LinearLayout btnCarrLTuri;
    LinearLayout btnCarrLPA;
    LinearLayout btnCarrLPB;

    LinearLayout btnCarrLNutri;
    LinearLayout btnCarrLOpto;
    LinearLayout btnCarrLPsico;
    LinearLayout btnCarrLBio;
    LinearLayout btnCarrLEnf;
    LinearLayout btnCarrLEO;
    LinearLayout btnCarrLOdonto;
    LinearLayout btnCarrLTS;
    LinearLayout btnCarrMCH;
    LinearLayout btnCarrMCP;
    LinearLayout btnCarrQBP;
    LinearLayout btnCarrQFI;

    LinearLayout btnCarrIAmb;
    LinearLayout btnCarrIBiomed;
    LinearLayout btnCarrIBioni;
    LinearLayout btnCarrIBioqui;
    LinearLayout btnCarrIBiotec;
    LinearLayout btnCarrICivil;
    LinearLayout btnCarrIElec;
    LinearLayout btnCarrIAero;
    LinearLayout btnCarrIAlim;
    LinearLayout btnCarrIComp;
    LinearLayout btnCarrICE;
    LinearLayout btnCarrICA;
    LinearLayout btnCarrIInfor;
    LinearLayout btnCarrIEner;
    LinearLayout btnCarrIMM;
    LinearLayout btnCarrIRI;
    LinearLayout btnCarrISAmb;
    LinearLayout btnCarrISAuto;
    LinearLayout btnCarrISC;
    LinearLayout btnCarrITrans;
    LinearLayout btnCarrIFarm;
    LinearLayout btnCarrIGeofi;
    LinearLayout btnCarrIGeolo;
    LinearLayout btnCarrIInd;
    LinearLayout btnCarrIMate;
    LinearLayout btnCarrIMecani;
    LinearLayout btnCarrIMecatro;
    LinearLayout btnCarrIMetal;
    LinearLayout btnCarrIPetro;
    LinearLayout btnCarrIQI;
    LinearLayout btnCarrIQP;
    LinearLayout btnCarrITelem;
    LinearLayout btnCarrITex;
    LinearLayout btnCarrITF;
    LinearLayout btnCarrIArqui;
    LinearLayout btnCarrLCI;
    LinearLayout btnCarrLFM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_schoolar_careers);

        btnBack = findViewById(R.id.btnBackToViewMode);
        btnCarrCP = findViewById(R.id.btnCarrCP);
        btnCarrLAI = findViewById(R.id.btnCarrLAI);
        btnCarrLADE = findViewById(R.id.btnCarrLADE);
        btnCarrLEcono = findViewById(R.id.btnCarrLEcono);
        btnCarrLNI = findViewById(R.id.btnCarrLNI);
        btnCarrLRC = findViewById(R.id.btnCarrLRC);
        btnCarrLTuri = findViewById(R.id.btnCarrLTuri);
        btnCarrLPA = findViewById(R.id.btnCarrLPA);
        btnCarrLPB = findViewById(R.id.btnCarrLPB);

        btnCarrLNutri = findViewById(R.id.btnCarrLNutri);
        btnCarrLOpto = findViewById(R.id.btnCarrLOpto);
        btnCarrLPsico = findViewById(R.id.btnCarrLPsico);
        btnCarrLBio = findViewById(R.id.btnCarrLBio);
        btnCarrLEnf = findViewById(R.id.btnCarrLEnf);
        btnCarrLEO = findViewById(R.id.btnCarrLEO);
        btnCarrLOdonto = findViewById(R.id.btnCarrLOdonto);
        btnCarrLTS = findViewById(R.id.btnCarrLTS);
        btnCarrMCH = findViewById(R.id.btnCarrMCH);
        btnCarrMCP = findViewById(R.id.btnCarrMCP);
        btnCarrQBP = findViewById(R.id.btnCarrQBP);
        btnCarrQFI = findViewById(R.id.btnCarrQFI);

        btnCarrIAmb = findViewById(R.id.btnCarrIAmb);
        btnCarrIBiomed = findViewById(R.id.btnCarrIBiomed);
        btnCarrIBioni = findViewById(R.id.btnCarrIBioni);
        btnCarrIBioqui = findViewById(R.id.btnCarrIBioqui);
        btnCarrIBiotec = findViewById(R.id.btnCarrIBiotec);
        btnCarrICivil = findViewById(R.id.btnCarrICivil);
        btnCarrIElec = findViewById(R.id.btnCarrIElec);
        btnCarrIAero = findViewById(R.id.btnCarrIAero);
        btnCarrIAlim = findViewById(R.id.btnCarrIAlim);
        btnCarrIComp = findViewById(R.id.btnCarrIComp);
        btnCarrICE = findViewById(R.id.btnCarrICE);
        btnCarrICA = findViewById(R.id.btnCarrICA);
        btnCarrIInfor = findViewById(R.id.btnCarrIInfor);
        btnCarrIEner = findViewById(R.id.btnCarrIEner);
        btnCarrIMM = findViewById(R.id.btnCarrIMM);
        btnCarrIRI = findViewById(R.id.btnCarrIRI);
        btnCarrISAmb = findViewById(R.id.btnCarrISAmb);
        btnCarrISAuto = findViewById(R.id.btnCarrISAuto);
        btnCarrISC = findViewById(R.id.btnCarrISC);
        btnCarrITrans = findViewById(R.id.btnCarrITrans);
        btnCarrIFarm = findViewById(R.id.btnCarrIFarm);
        btnCarrIGeofi = findViewById(R.id.btnCarrIGeofi);
        btnCarrIGeolo = findViewById(R.id.btnCarrIGeolo);
        btnCarrIInd = findViewById(R.id.btnCarrIInd);
        btnCarrIMate = findViewById(R.id.btnCarrIMate);
        btnCarrIMecani = findViewById(R.id.btnCarrIMecani);
        btnCarrIMecatro = findViewById(R.id.btnCarrIMecatro);
        btnCarrIMetal = findViewById(R.id.btnCarrIMetal);
        btnCarrIPetro = findViewById(R.id.btnCarrIPetro);
        btnCarrIQI = findViewById(R.id.btnCarrIQI);
        btnCarrIQP = findViewById(R.id.btnCarrIQP);
        btnCarrITelem = findViewById(R.id.btnCarrITelem);
        btnCarrITex = findViewById(R.id.btnCarrITex);
        btnCarrITF = findViewById(R.id.btnCarrITF);
        btnCarrIArqui = findViewById(R.id.btnCarrIArqui);
        btnCarrLCI = findViewById(R.id.btnCarrLCI);
        btnCarrLFM = findViewById(R.id.btnCarrLFM);


        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnCarrCP.setOnClickListener(this);
        btnCarrLAI.setOnClickListener(this);
        btnCarrLADE.setOnClickListener(this);
        btnCarrLEcono.setOnClickListener(this);
        btnCarrLNI.setOnClickListener(this);
        btnCarrLRC.setOnClickListener(this);
        btnCarrLTuri.setOnClickListener(this);
        btnCarrLPA.setOnClickListener(this);
        btnCarrLPB.setOnClickListener(this);

        btnCarrLNutri.setOnClickListener(this);
        btnCarrLOpto.setOnClickListener(this);
        btnCarrLPsico.setOnClickListener(this);
        btnCarrLBio.setOnClickListener(this);
        btnCarrLEnf.setOnClickListener(this);
        btnCarrLEO.setOnClickListener(this);
        btnCarrLOdonto.setOnClickListener(this);
        btnCarrLTS.setOnClickListener(this);
        btnCarrMCH.setOnClickListener(this);
        btnCarrMCP.setOnClickListener(this);
        btnCarrQBP.setOnClickListener(this);
        btnCarrQFI.setOnClickListener(this);

        btnCarrIAmb.setOnClickListener(this);
        btnCarrIBiomed.setOnClickListener(this);
        btnCarrIBioni.setOnClickListener(this);
        btnCarrIBioqui.setOnClickListener(this);
        btnCarrIBiotec.setOnClickListener(this);
        btnCarrICivil.setOnClickListener(this);
        btnCarrIElec.setOnClickListener(this);
        btnCarrIAero.setOnClickListener(this);
        btnCarrIAlim.setOnClickListener(this);
        btnCarrIComp.setOnClickListener(this);
        btnCarrICE.setOnClickListener(this);
        btnCarrICA.setOnClickListener(this);
        btnCarrIInfor.setOnClickListener(this);
        btnCarrIEner.setOnClickListener(this);
        btnCarrIMM.setOnClickListener(this);
        btnCarrIRI.setOnClickListener(this);
        btnCarrISAmb.setOnClickListener(this);
        btnCarrISAuto.setOnClickListener(this);
        btnCarrISC.setOnClickListener(this);
        btnCarrITrans.setOnClickListener(this);
        btnCarrIFarm.setOnClickListener(this);
        btnCarrIGeofi.setOnClickListener(this);
        btnCarrIGeolo.setOnClickListener(this);
        btnCarrIInd.setOnClickListener(this);
        btnCarrIMate.setOnClickListener(this);
        btnCarrIMecani.setOnClickListener(this);
        btnCarrIMecatro.setOnClickListener(this);
        btnCarrIMetal.setOnClickListener(this);
        btnCarrIPetro.setOnClickListener(this);
        btnCarrIQI.setOnClickListener(this);
        btnCarrIQP.setOnClickListener(this);
        btnCarrITelem.setOnClickListener(this);
        btnCarrITex.setOnClickListener(this);
        btnCarrITF.setOnClickListener(this);
        btnCarrIArqui.setOnClickListener(this);
        btnCarrLCI.setOnClickListener(this);
        btnCarrLFM.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent();
        switch (v.getId()){
        //Ciencias Sociales y Administrativas
            case R.id.btnCarrCP:
                i = new Intent(schoolar_careers.this, carr_CP.class);
                break;

            case R.id.btnCarrLAI:
                i = new Intent(schoolar_careers.this, carrera_esc.class);
                i.putExtra("logo","upiicsa");
                i.putExtra("escuela", "UPIICSA");
                i.putExtra("esc","UPIICSA");
                i.putExtra("carr","LAI");
                break;

            case R.id.btnCarrLADE:
                i = new Intent(schoolar_careers.this, carrera_esc.class);
                i.putExtra("logo","esca");
                i.putExtra("escuela", "ESCA UST");
                i.putExtra("esc","ESCA_UST");
                i.putExtra("carr","LADE");
                break;

            case R.id.btnCarrLEcono:
                i = new Intent(schoolar_careers.this, carrera_esc.class);
                i.putExtra("logo","ese");
                i.putExtra("escuela", "ESE");
                i.putExtra("esc","ESE");
                i.putExtra("carr","LEcono");
                break;

            case R.id.btnCarrLNI:
                i = new Intent(schoolar_careers.this, carr_LNI.class);
                break;

            case R.id.btnCarrLRC:
                i = new Intent(schoolar_careers.this, carr_LRC.class);
                break;

            case R.id.btnCarrLTuri:
                i = new Intent(schoolar_careers.this, carrera_esc.class);
                i.putExtra("logo","est");
                i.putExtra("escuela", "EST");
                i.putExtra("esc","EST");
                i.putExtra("carr","LTuri");
                break;

            case R.id.btnCarrLPA:
                i = new Intent(schoolar_careers.this, carrera_esc.class);
                i.putExtra("logo","enba");
                i.putExtra("escuela", "ENBA");
                i.putExtra("esc","ENBA");
                i.putExtra("carr","LPA");
                break;

            case R.id.btnCarrLPB:
                i = new Intent(schoolar_careers.this, carrera_esc.class);
                i.putExtra("logo","enba");
                i.putExtra("escuela", "ENBA");
                i.putExtra("esc","ENBA");
                i.putExtra("carr","LPB");
                break;

        //Ciencias Medico Biologicas
            case R.id.btnCarrLNutri:
                i = new Intent(schoolar_careers.this, carrera_esc.class);
                i.putExtra("logo","cics");
                i.putExtra("escuela", "CICS UMA");
                i.putExtra("esc","CICS_UMA");
                i.putExtra("carr","LNutri");
                break;

            case R.id.btnCarrLOpto:
                i = new Intent(schoolar_careers.this, carr_LOpto.class);
                break;

            case R.id.btnCarrLPsico:
                i = new Intent(schoolar_careers.this, carrera_esc.class);
                i.putExtra("logo","cics");
                i.putExtra("escuela", "CICS UST");
                i.putExtra("esc","CICS_UST");
                i.putExtra("carr","LPsico");
                break;

            case R.id.btnCarrLBio:
                i = new Intent(schoolar_careers.this, carrera_esc.class);
                i.putExtra("logo","encb");
                i.putExtra("escuela", "ENCB");
                i.putExtra("esc","ENCB");
                i.putExtra("carr","LBio");
                break;

            case R.id.btnCarrLEnf:
                i = new Intent(schoolar_careers.this, carr_LEnf.class);
                break;

            case R.id.btnCarrLEO:
                i = new Intent(schoolar_careers.this, carrera_esc.class);
                i.putExtra("logo","eseo");
                i.putExtra("escuela", "ESEO");
                i.putExtra("esc","ESEO");
                i.putExtra("carr","LEO");
                break;

            case R.id.btnCarrLOdonto:
                i = new Intent(schoolar_careers.this, carr_LOdonto.class);
                break;

            case R.id.btnCarrLTS:
                i = new Intent(schoolar_careers.this, carrera_esc.class);
                i.putExtra("logo","cics");
                i.putExtra("escuela", "CICS UMA");
                i.putExtra("esc","CICS_UMA");
                i.putExtra("carr","LTS");
                break;

            case R.id.btnCarrMCH:
                i = new Intent(schoolar_careers.this, carrera_esc.class);
                i.putExtra("logo","enmh");
                i.putExtra("escuela", "ENMH");
                i.putExtra("esc","ENMH");
                i.putExtra("carr","MCH");
                break;

            case R.id.btnCarrMCP:
                i = new Intent(schoolar_careers.this, carr_MCP.class);
                break;

            case R.id.btnCarrQBP:
                i = new Intent(schoolar_careers.this, carrera_esc.class);
                i.putExtra("logo","encb");
                i.putExtra("escuela", "ENCB");
                i.putExtra("esc","ENCB");
                i.putExtra("carr","QBP");
                break;

            case R.id.btnCarrQFI:
                i = new Intent(schoolar_careers.this, carrera_esc.class);
                i.putExtra("logo","encb");
                i.putExtra("escuela", "ENCB");
                i.putExtra("esc","ENCB");
                i.putExtra("carr","QFI");
                break;

        //Ingenieria
            case R.id.btnCarrIAmb:
                i = new Intent(schoolar_careers.this, carr_IAmb.class);
                break;

            case R.id.btnCarrIBiomed:
                i = new Intent(schoolar_careers.this, carrera_esc.class);
                i.putExtra("logo","upibi");
                i.putExtra("escuela", "UPIBI");
                i.putExtra("esc","UPIBI");
                i.putExtra("carr","IBiomed");
                break;

            case R.id.btnCarrIBioni:
                i = new Intent(schoolar_careers.this, carrera_esc.class);
                i.putExtra("logo","upiita");
                i.putExtra("escuela", "UPIITA");
                i.putExtra("esc","UPIITA");
                i.putExtra("carr","IBioni");
                break;

            case R.id.btnCarrIBioqui:
                i = new Intent(schoolar_careers.this, carrera_esc.class);
                i.putExtra("logo","encb");
                i.putExtra("escuela", "ENCB");
                i.putExtra("esc","ENCB");
                i.putExtra("carr","IBioqui");
                break;

            case R.id.btnCarrIBiotec:
                i = new Intent(schoolar_careers.this, carr_IBiotec.class);
                break;

            case R.id.btnCarrICivil:
                i = new Intent(schoolar_careers.this, carrera_esc.class);
                i.putExtra("logo","esia");
                i.putExtra("escuela", "ESIA UZ");
                i.putExtra("esc","ESIA_UZ");
                i.putExtra("carr","ICivil");
                break;

            case R.id.btnCarrIElec:
                i = new Intent(schoolar_careers.this, carrera_esc.class);
                i.putExtra("logo","esime");
                i.putExtra("escuela", "ESIME UZ");
                i.putExtra("esc","ESIME_UZ");
                i.putExtra("carr","IElec");
                break;

            case R.id.btnCarrIAero:
                i = new Intent(schoolar_careers.this, carr_IAero.class);
                break;

            case R.id.btnCarrIAlim:
                i = new Intent(schoolar_careers.this, carr_IAlim.class);
                break;

            case R.id.btnCarrIComp:
                i = new Intent(schoolar_careers.this, carrera_esc.class);
                i.putExtra("logo","esime");
                i.putExtra("escuela", "ESIME UC");
                i.putExtra("esc","ESIME_UC");
                i.putExtra("carr","IComp");
                break;

            case R.id.btnCarrICE:
                i = new Intent(schoolar_careers.this, carr_ICE.class);
                break;

            case R.id.btnCarrICA:
                i = new Intent(schoolar_careers.this, carrera_esc.class);
                i.putExtra("logo","esime");
                i.putExtra("escuela", "ESIME UZ");
                i.putExtra("esc","ESIME_UZ");
                i.putExtra("carr","ICA");
                break;

            case R.id.btnCarrIInfor:
                i = new Intent(schoolar_careers.this, carrera_esc.class);
                i.putExtra("logo","upiicsa");
                i.putExtra("escuela", "UPIICSA");
                i.putExtra("esc","UPIICSA");
                i.putExtra("carr","IInfor");
                break;

            case R.id.btnCarrIEner:
                i = new Intent(schoolar_careers.this, carrera_esc.class);
                i.putExtra("logo","upiita");
                i.putExtra("escuela", "UPIITA");
                i.putExtra("esc","UPIITA");
                i.putExtra("carr","IEner");
                break;

            case R.id.btnCarrIMM:
                i = new Intent(schoolar_careers.this, carrera_esc.class);
                i.putExtra("logo","esiqie");
                i.putExtra("escuela", "ESIQIE");
                i.putExtra("esc","ESIQIE");
                i.putExtra("carr","IMM");
                break;

            case R.id.btnCarrIRI:
                i = new Intent(schoolar_careers.this, carrera_esc.class);
                i.putExtra("logo","esime");
                i.putExtra("escuela", "ESIME UA");
                i.putExtra("esc","ESIME_UA");
                i.putExtra("carr","IRI");
                break;

            case R.id.btnCarrISAmb:
                i = new Intent(schoolar_careers.this, carrera_esc.class);
                i.putExtra("logo","encb");
                i.putExtra("escuela", "ENCB");
                i.putExtra("esc","ENCB");
                i.putExtra("carr","ISAmb");
                break;

            case R.id.btnCarrISAuto:
                i = new Intent(schoolar_careers.this, carr_ISAuto.class);
                break;

            case R.id.btnCarrISC:
                i = new Intent(schoolar_careers.this, carr_ISC.class);
                break;

            case R.id.btnCarrITrans:
                i = new Intent(schoolar_careers.this, carrera_esc.class);
                i.putExtra("logo","upiicsa");
                i.putExtra("escuela", "UPIICSA");
                i.putExtra("esc","UPIICSA");
                i.putExtra("carr","ITrans");
                break;

            case R.id.btnCarrIFarm:
                i = new Intent(schoolar_careers.this, carr_IFarm.class);
                break;

            case R.id.btnCarrIGeofi:
                i = new Intent(schoolar_careers.this, carrera_esc.class);
                i.putExtra("logo","esia");
                i.putExtra("escuela", "ESIA UTi");
                i.putExtra("esc","ESIA_UTi");
                i.putExtra("carr","IGeofi");
                break;

            case R.id.btnCarrIGeolo:
                i = new Intent(schoolar_careers.this, carrera_esc.class);
                i.putExtra("logo","esia");
                i.putExtra("escuela", "ESIA UTi");
                i.putExtra("esc","ESIA_UTi");
                i.putExtra("carr","IGeolo");
                break;

            case R.id.btnCarrIInd:
                i = new Intent(schoolar_careers.this, carr_IInd.class);
                break;

            case R.id.btnCarrIMate:
                i = new Intent(schoolar_careers.this, carrera_esc.class);
                i.putExtra("logo","esfm");
                i.putExtra("escuela", "ESFM");
                i.putExtra("esc","ESFM");
                i.putExtra("carr","IMate");
                break;

            case R.id.btnCarrIMecani:
                i = new Intent(schoolar_careers.this, carr_IMecani.class);
                break;

            case R.id.btnCarrIMecatro:
                i = new Intent(schoolar_careers.this, carr_IMecatro.class);
                break;

            case R.id.btnCarrIMetal:
                i = new Intent(schoolar_careers.this, carrera_esc.class);
                i.putExtra("logo","upiiz");
                i.putExtra("escuela", "UPIIZ");
                i.putExtra("esc","UPIIZ");
                i.putExtra("carr","IMetal");
                break;

            case R.id.btnCarrIPetro:
                i = new Intent(schoolar_careers.this, carrera_esc.class);
                i.putExtra("logo","esia");
                i.putExtra("escuela", "ESIA UTi");
                i.putExtra("esc","ESIA_UTi");
                i.putExtra("carr","IPetro");
                break;

            case R.id.btnCarrIQI:
                i = new Intent(schoolar_careers.this, carrera_esc.class);
                i.putExtra("logo","esiqie");
                i.putExtra("escuela", "ESIQIE");
                i.putExtra("esc","ESIQIE");
                i.putExtra("carr","IQI");
                break;

            case R.id.btnCarrIQP:
                i = new Intent(schoolar_careers.this, carrera_esc.class);
                i.putExtra("logo","esiqie");
                i.putExtra("escuela", "ESIQIE");
                i.putExtra("esc","ESIQIE");
                i.putExtra("carr","IQP");
                break;

            case R.id.btnCarrITelem:
                i = new Intent(schoolar_careers.this, carrera_esc.class);
                i.putExtra("logo","upiita");
                i.putExtra("escuela", "UPIITA");
                i.putExtra("esc","UPIITA");
                i.putExtra("carr","ITelem");
                break;

            case R.id.btnCarrITex:
                i = new Intent(schoolar_careers.this, carrera_esc.class);
                i.putExtra("logo","esit");
                i.putExtra("escuela", "ESIT");
                i.putExtra("esc","ESIT");
                i.putExtra("carr","ITex");
                break;

            case R.id.btnCarrITF:
                i = new Intent(schoolar_careers.this, carrera_esc.class);
                i.putExtra("logo","esia");
                i.putExtra("escuela", "ESIA UTi");
                i.putExtra("esc","ESIA_UTi");
                i.putExtra("carr","ITF");
                break;

            case R.id.btnCarrIArqui:
                i = new Intent(schoolar_careers.this, carrera_esc.class);
                i.putExtra("logo","esia");
                i.putExtra("escuela", "ESIA UTec");
                i.putExtra("esc","ESIA_UTec");
                i.putExtra("carr","IArqui");
                break;

            case R.id.btnCarrLCI:
                i = new Intent(schoolar_careers.this, carrera_esc.class);
                i.putExtra("logo","upiicsa");
                i.putExtra("escuela", "UPIICSA");
                i.putExtra("esc","UPIICSA");
                i.putExtra("carr","LCI");
                break;

            case R.id.btnCarrLFM:
                i = new Intent(schoolar_careers.this, carrera_esc.class);
                i.putExtra("logo","esfm");
                i.putExtra("escuela", "ESFM");
                i.putExtra("esc","ESFM");
                i.putExtra("carr","LFM");
                break;


        }

        startActivity(i);
    }
}

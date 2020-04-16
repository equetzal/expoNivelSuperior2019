package mx.ipn.exponivelsuperior;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class welcome extends AppCompatActivity {

    private static final long TIME_OUT = 2000;

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_welcome);

        // Example of a call to a native method
        //TextView tv = (TextView) findViewById(R.id.sample_text);
        //tv.setText(stringFromJNI());

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(welcome.this, choose_modality.class);
                startActivity(i);
                finish();
            }
        }, TIME_OUT);
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
}

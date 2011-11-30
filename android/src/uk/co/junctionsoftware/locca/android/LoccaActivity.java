package uk.co.junctionsoftware.locca.android;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class LoccaActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        final ImageButton button = (ImageButton)findViewById(R.id.imageButton1);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	HttpClient client = new DefaultHttpClient();
                HttpGet request = new HttpGet("http://10.0.8.48:5525/trigger/android");
                try {
                	client.execute(request);
                } catch (IOException e) {
                	Toast.makeText(LoccaActivity.this, "Error: unable to trigger remote.", Toast.LENGTH_LONG).show();
                	return;
                }
            }
        });
    }
}
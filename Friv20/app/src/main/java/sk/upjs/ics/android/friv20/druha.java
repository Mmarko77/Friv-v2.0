package sk.upjs.ics.android.friv20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class druha extends AppCompatActivity {
    private Button spatbutton2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_druha);

        spatbutton2 = (Button) findViewById(R.id.spatbutton2);
        spatbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                spat();
            }
        });
    }

    public void spat(){
        Intent start = new Intent(this, HomeActivity.class);
        startActivity(start);
    }
}

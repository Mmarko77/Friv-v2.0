package sk.upjs.ics.android.friv20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class prva extends AppCompatActivity {
    private Button spatbutton2;
    private Button check;
    private  Button nextQ;
    private  Button hint;
    private TextView otazka;
    private EditText odpoved;
    private int pocitadlo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prva);

        spatbutton2 = (Button) findViewById(R.id.spatbutton2);
        check =       (Button) findViewById(R.id.check);
        nextQ =       (Button) findViewById(R.id.nextQ);
        hint =       (Button) findViewById(R.id.hint);
        otazka =      (TextView) findViewById(R.id.otazka);
        odpoved =     (EditText) findViewById(R.id.odpoved);
        spatbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                spat();
            }
        });

        pocitadlo=0;
        otazka.setText(otazky[pocitadlo]);

        hint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog();
            }
        });
    }

    String[] otazky = {
            "I'm tall when I'm young, I'm short when I'm old. What am I?",
            "I am always in front and never behind. What am I?",
            "I fly without wings, I cry without eyes. What am I?",
            "What has four legs, but can't walk?",
            "What has a neck but no head?",
            "What type of dress can never be worn?"
    };
    String[] odpovede = {
            "candle",
            "future",
            "clouds",
            "table",
            "bottle",
            "address"
    };


    public void KlikOdpoved(View view){
        String line = odpoved.getText().toString();
        if(line.length()==0){
            Toast.makeText(this, "Empty answer field :/", Toast.LENGTH_SHORT).show();
        }
        else{
            if (line.equals(odpovede[pocitadlo])) {
                Toast.makeText(this, "It is right :)", Toast.LENGTH_SHORT).show();
                pocitadlo++;
                nextQ.setVisibility(View.VISIBLE);
                check.setEnabled(false);
                if(pocitadlo==odpovede.length){
                    pocitadlo=0;
                    Toast.makeText(this, "No more questions, you are guessing from the beggining", Toast.LENGTH_SHORT).show();
                }


            }
            else{
                Toast.makeText(this, "It is wrong :(", Toast.LENGTH_SHORT).show();
            }
        }


    }

    public void DalsiaOtazka(View view){
        otazka.setText(otazky[pocitadlo]);
        nextQ.setVisibility(View.INVISIBLE);
        odpoved.setText("");
        check.setEnabled(true);
    }


    public void spat(){
        Intent start = new Intent(this, HomeActivity.class);
        startActivity(start);
    }

    public void openDialog(){
        HintDialog hintDialog = new HintDialog();
        hintDialog.show(getSupportFragmentManager(), "hint dialog");
    }
}

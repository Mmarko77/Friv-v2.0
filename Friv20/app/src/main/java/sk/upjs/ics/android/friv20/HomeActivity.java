package sk.upjs.ics.android.friv20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {
    private Button button;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button feedback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        button2=(Button) findViewById(R.id.button2);
        button3=(Button) findViewById(R.id.button3);
        button4=(Button) findViewById(R.id.button4);
        feedback=(Button) findViewById(R.id.feedback);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prva();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                druha();
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tretia();
            }
        });

        feedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                feedback();
            }
        });

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog();
            }
        });
    }

    public void openDialog(){
        HelpDialog helpDialog = new HelpDialog();
        helpDialog.show(getSupportFragmentManager(), "help dialog");
    }


    public void prva(){
        Intent start = new Intent(this, prva.class);
        startActivity(start);
    }

    public void druha(){
        Intent start = new Intent(this, druha.class);
        startActivity(start);
    }

    public void tretia(){
        Intent start = new Intent(this, tretia.class);
        startActivity(start);
    }

    public void feedback(){
        Intent start = new Intent(this, feedback.class);
        startActivity(start);
    }
}

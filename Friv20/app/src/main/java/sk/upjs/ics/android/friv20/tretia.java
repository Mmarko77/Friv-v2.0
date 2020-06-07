package sk.upjs.ics.android.friv20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class tretia extends AppCompatActivity {
    private static int pocitadlo;
    private static View pic1;
    private static View pic2;
    private static TextView dalsia;
    private Button spatbutton2;
    private TextView result;
    private TextView slovo;
    private int zivoty;
    private TextView zivot;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tretia);

        spatbutton2 = (Button) findViewById(R.id.spatbutton2);
        spatbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                spat();
            }
        });
        pic1=(Button) findViewById(R.id.pic1);
        pic2=(Button) findViewById(R.id.pic2);
        dalsia=(Button) findViewById(R.id.dalsia);
        slovo=(TextView) findViewById(R.id.slovo);
        result=(TextView) findViewById(R.id.result);
        zivot=(TextView) findViewById(R.id.zivot);

        pocitadlo=0;
        zivoty=3;
        dalsia.setText("START");
        pic1.setVisibility(View.INVISIBLE);
        pic2.setVisibility(View.INVISIBLE);
    }


    public void DalsiaOtazka (View view){
        dalsia.setText("NEXT");
        pic1.setVisibility(View.VISIBLE);
        pic2.setVisibility(View.VISIBLE);
        slovo.setText(slova[pocitadlo]);
        zivot.setText("Lifes: "+zivoty);
        dalsia.setVisibility(View.INVISIBLE);

        if (pocitadlo==0){
            pic1.setBackgroundResource(R.drawable.apple);
            dalsia.setVisibility(View.INVISIBLE);
            pic1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    pocitadlo++;
                    result.setText("Correct");
                    result.setTextColor(Color.GREEN);
                    dalsia.setVisibility(View.VISIBLE);
                }
            });
            pic2.setBackgroundResource(R.drawable.girl);
            zivot.setText("Lifes: "+zivoty);
            pic2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    zivot.setText("Lifes: "+zivoty);
                    result.setText("No correct");
                    result.setTextColor(Color.RED);
                    zivoty--;
                    if (zivoty==0) {
                        nula();
                    }
                }
            });
        }else
            if (pocitadlo==1){
                result.setText("");
            pic1.setBackgroundResource(R.drawable.car);
            dalsia.setVisibility(View.INVISIBLE);
            pic1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    pocitadlo++;
                    result.setText("Correct" );
                    result.setTextColor(Color.GREEN);
                    dalsia.setVisibility(View.VISIBLE);
                }
            });
            pic2.setBackgroundResource(R.drawable.boy);
            pic2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    zivot.setText("Lifes: "+zivoty);
                    result.setText("No correct");
                    result.setTextColor(Color.RED);
                    zivoty--;
                    if (zivoty==0) {
                        nula();
                    }
                }
            });
        }else
            if (pocitadlo==2){
                result.setText("");
                pic1.setBackgroundResource(R.drawable.girl);
            dalsia.setVisibility(View.INVISIBLE);
            pic1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    zivot.setText("Lifes: "+zivoty);
                    result.setText("No correct");
                    result.setTextColor(Color.RED);
                    zivoty--;
                    if (zivoty==0) {
                        nula();
                    }
                }
            });
            pic2.setBackgroundResource(R.drawable.dog);
            pic2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    pocitadlo++;
                    result.setText("Correct");
                    result.setTextColor(Color.GREEN);
                    dalsia.setVisibility(View.VISIBLE);
                }
            });
        }else
            if (pocitadlo==3){
                result.setText("");
                pic1.setBackgroundResource(R.drawable.book);
            dalsia.setVisibility(View.INVISIBLE);
            pic1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    pocitadlo++;
                    result.setText("Correct");
                    result.setTextColor(Color.GREEN);
                    dalsia.setVisibility(View.VISIBLE);
                }
            });
            pic2.setBackgroundResource(R.drawable.apple);
            pic2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    zivot.setText("Lifes: "+zivoty);
                    result.setText("No correct");
                    result.setTextColor(Color.RED);
                    zivoty--;
                    if (zivoty==0) {
                        nula();
                    }
                }
            });
        }else
            if (pocitadlo==4){
                result.setText("");
                pic1.setBackgroundResource(R.drawable.dog);
                dalsia.setVisibility(View.INVISIBLE);
                pic1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        zivot.setText("Lifes: "+zivoty);
                        result.setText("No correct");
                        result.setTextColor(Color.RED);
                        zivoty--;
                        if (zivoty==0) {
                            nula();
                        }
                    }
                });
                pic2.setBackgroundResource(R.drawable.boy);
                pic2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        pocitadlo++;
                        result.setText("Correct" );
                        result.setTextColor(Color.GREEN);
                        dalsia.setVisibility(View.VISIBLE);
                    }
                });
            }else
            if (pocitadlo==5){
                result.setText("");
                pic1.setBackgroundResource(R.drawable.book);
                dalsia.setVisibility(View.INVISIBLE);
                pic1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        zivot.setText("Lifes: "+zivoty);
                        result.setText("No correct");
                        result.setTextColor(Color.RED);
                        zivoty--;
                        if (zivoty==0) {
                            nula();
                        }
                    }
                });
                pic2.setBackgroundResource(R.drawable.girl);
                pic2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        result.setText("Correct");
                        result.setTextColor(Color.GREEN);
                        dalsia.setVisibility(View.VISIBLE);
                        nula();
                    }
                });

            }

    }
    String[] slova ={
            "APPPLE",
            "CAR",
            "DOG",
            "BOOK",
            "BOY",
            "GIRL",
    };

    public void nula(){
        if (zivoty==0) {
            Toast.makeText(this, "No more lifes", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "No more words", Toast.LENGTH_SHORT).show();
        }
        result.setText("");
        pocitadlo=0;
        pic1.setVisibility(View.INVISIBLE);
        pic2.setVisibility(View.INVISIBLE);
        dalsia.setText("START AGAIN");
        dalsia.setVisibility(View.VISIBLE);
    }
    public void spat(){
        Intent start = new Intent(this, HomeActivity.class);
        startActivity(start);
    }
}

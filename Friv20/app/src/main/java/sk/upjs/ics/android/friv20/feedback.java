package sk.upjs.ics.android.friv20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class feedback extends AppCompatActivity {
    DatabaseReference reff;
    Hodnotenie hodnotenie;
    private String cislo;
    private String popisok;
    private String meno;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        final RatingBar mRatingBar = (RatingBar) findViewById(R.id.ratingBar);
        final TextView mRatingScale = (TextView) findViewById(R.id.tvRatingScale);
        final EditText mFeedback = (EditText) findViewById(R.id.etFeedback);
        final EditText nameText = (EditText) findViewById(R.id.nameText);
        Button mSendFeedback = (Button) findViewById(R.id.btnSubmit);

        hodnotenie=new Hodnotenie();
        reff= FirebaseDatabase.getInstance().getReference().child("Hodnotenie ");

        mRatingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {

            }

        });
        mRatingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                mRatingScale.setText(String.valueOf(v));
                cislo=String.valueOf(v);
                switch ((int) ratingBar.getRating()) {
                    case 1:
                        mRatingScale.setText("Very bad");
                        break;
                    case 2:
                        mRatingScale.setText("Need some improvement");
                        break;
                    case 3:
                        mRatingScale.setText("Good");
                        break;
                    case 4:
                        mRatingScale.setText("Great");
                        break;
                    case 5:
                        mRatingScale.setText("Awesome. I love it");
                        break;
                    default:
                        mRatingScale.setText(" ");
                }
            }
        });
        mSendFeedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((mFeedback.getText().toString().isEmpty()) || (nameText.getText().toString().isEmpty())) {
                    Toast.makeText(feedback.this, "Something is empty :/", Toast.LENGTH_LONG).show();
                } else {
                    hodnotenie.setHviezdicky(cislo);
                    meno=nameText.getText().toString();
                    hodnotenie.setMenoPriezvisko(meno);
                    popisok=mFeedback.getText().toString();
                    hodnotenie.setPopis(popisok);
                    reff.push().setValue(hodnotenie);
                    Toast.makeText(feedback.this, "Thank you for sharing your feedback", Toast.LENGTH_SHORT).show();
                    mFeedback.setText("");
                    nameText.setText("");
                    mRatingBar.setRating(0);}
            }
        });
    }

}

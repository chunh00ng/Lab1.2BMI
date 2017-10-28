package my.edu.tarc.lab12bmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView Result;
    private EditText Height, Weight;
    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


        public void displayBMI(View v) {
        Result = (TextView) findViewById(R.id.Result);
        Height = (EditText) findViewById(R.id.Height);
        Weight = (EditText) findViewById(R.id.Weight);
        image = (ImageView) findViewById(R.id.image);



        double height = Double.parseDouble(Height.getText().toString());
        double weight = Double.parseDouble(Weight.getText().toString());
        double bmi = weight / (height * height);

        if (bmi <= 18.5) {
            Result.setText(getString(R.string.under));
            image.setImageResource(R.drawable.under);
        } else if (bmi > 22.5) {
            Result.setText(getString(R.string.over));
            image.setImageResource(R.drawable.over);
        } else {
            Result.setText(getString(R.string.normal));
            image.setImageResource(R.drawable.normal);
        }

    }

    public void clear(View v) {

        Result.setText("");
        Weight.setText("");
        Height.setText("");
        image.setImageResource(R.drawable.empty);
    }
}

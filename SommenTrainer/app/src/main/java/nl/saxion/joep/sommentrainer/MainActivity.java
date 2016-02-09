package nl.saxion.joep.sommentrainer;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private TextView sumTV;
    private EditText answET;
    private Button checkBttn, nextBttn;
    private String currOperator;
    private double answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        sumTV = (TextView) findViewById(R.id.sumTextView);
        answET = (EditText) findViewById(R.id.answET);

        checkBttn = (Button) findViewById(R.id.checkBttn);
        nextBttn = (Button) findViewById(R.id.nextBttn);
        generateSum();


        checkBttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    double temp = Double.parseDouble(answET.getText().toString());
                    if (checkAnswer(temp)) {
                        answET.setBackgroundColor(Color.GREEN);
                    } else {
                        answET.setBackgroundColor(Color.RED);
                    }


                } catch (Exception e) {
                    //makes sure program wont crash after wrong input (:
                }

            }
        });


        nextBttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                generateSum();
                answET.setText("");
            }
        });
    }


    private boolean checkAnswer(Double d) {
        if (d == answer) {
            return true;
        }
        return false;
    }

    private void generateSum() {
        String sum;
        int first, second;
        ArrayList<String> operators = new ArrayList<>();
        operators.add("+");
        operators.add("-");
        operators.add("/");
        operators.add("*");
        Random r = new Random();

        int x = r.nextInt(4);

        //makes it a little easier when operator is " * " or " / "
        if (x == 2 || x == 3) {
            first = 1 + r.nextInt(149);
            second = 1 + r.nextInt(9);
        } else {
            first = 1 + r.nextInt(99);
            second = 1 + r.nextInt(99);
        }


        sum = first + " " + operators.get(x) + " " + second;

        sumTV.setText(sum);
        currOperator = operators.get(x);

        if (currOperator.equals("+")) {
            answer = first + second;
        } else if (currOperator.equals("-")) {
            answer = first - second;
        } else if (currOperator.equals("/")) {
            answer = first / second;
        } else {
            answer = first * second;
        }

    }

}

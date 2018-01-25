package com.example.android.harrypotterquiz;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    /**
     * Declaring each variable globally so they can be used in multiple methods
     */
    RadioButton questionOneRadioButtonA;
    RadioButton questionOneRadioButtonB;
    RadioButton questionOneRadioButtonC;
    RadioButton questionTwoRadioButtonA;
    RadioButton questionTwoRadioButtonB;
    RadioButton questionTwoRadioButtonC;
    RadioButton questionThreeRadioButtonA;
    RadioButton questionThreeRadioButtonB;
    RadioButton questionThreeRadioButtonC;
    RadioButton questionFourRadioButtonA;
    RadioButton questionFourRadioButtonB;
    RadioButton questionFourRadioButtonC;
    CheckBox questionFiveCheckBoxA;
    CheckBox questionFiveCheckBoxB;
    CheckBox questionFiveCheckBoxC;
    CheckBox questionFiveCheckBoxD;
    RadioButton questionSixRadioButtonA;
    RadioButton questionSixRadioButtonB;
    RadioButton questionSixRadioButtonC;
    RadioButton questionSevenRadioButtonA;
    RadioButton questionSevenRadioButtonB;
    RadioButton questionSevenRadioButtonC;
    RadioButton questionEightRadioButtonA;
    RadioButton questionEightRadioButtonB;
    RadioButton questionEightRadioButtonC;
    RadioButton questionNineRadioButtonA;
    RadioButton questionNineRadioButtonB;
    RadioButton questionNineRadioButtonC;
    EditText questionTenEditText;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * Set global variables to ids in activity_main.xml on app creation
         */
        Typeface font = ResourcesCompat.getFont(this, R.font.harry_potter);
        questionOneRadioButtonA = (RadioButton) findViewById(R.id.question_one_radio_button_a);
        questionOneRadioButtonA.setTypeface(font);
        questionOneRadioButtonB = (RadioButton) findViewById(R.id.question_one_radio_button_b);
        questionOneRadioButtonB.setTypeface(font);
        questionOneRadioButtonC = (RadioButton) findViewById(R.id.question_one_radio_button_c);
        questionOneRadioButtonC.setTypeface(font);
        questionTwoRadioButtonA = (RadioButton) findViewById(R.id.question_two_radio_button_a);
        questionTwoRadioButtonA.setTypeface(font);
        questionTwoRadioButtonB = (RadioButton) findViewById(R.id.question_two_radio_button_b);
        questionTwoRadioButtonB.setTypeface(font);
        questionTwoRadioButtonC = (RadioButton) findViewById(R.id.question_two_radio_button_c);
        questionTwoRadioButtonC.setTypeface(font);
        questionThreeRadioButtonA = (RadioButton) findViewById(R.id.question_three_radio_button_a);
        questionThreeRadioButtonA.setTypeface(font);
        questionThreeRadioButtonB = (RadioButton) findViewById(R.id.question_three_radio_button_b);
        questionThreeRadioButtonB.setTypeface(font);
        questionThreeRadioButtonC = (RadioButton) findViewById(R.id.question_three_radio_button_c);
        questionThreeRadioButtonC.setTypeface(font);
        questionFourRadioButtonA = (RadioButton) findViewById(R.id.question_four_radio_button_a);
        questionFourRadioButtonA.setTypeface(font);
        questionFourRadioButtonB = (RadioButton) findViewById(R.id.question_four_radio_button_b);
        questionFourRadioButtonB.setTypeface(font);
        questionFourRadioButtonC = (RadioButton) findViewById(R.id.question_four_radio_button_c);
        questionFourRadioButtonC.setTypeface(font);
        questionFiveCheckBoxA = (CheckBox) findViewById(R.id.question_five_checkbox_a);
        questionFiveCheckBoxA.setTypeface(font);
        questionFiveCheckBoxB = (CheckBox) findViewById(R.id.question_five_checkbox_b);
        questionFiveCheckBoxB.setTypeface(font);
        questionFiveCheckBoxC = (CheckBox) findViewById(R.id.question_five_checkbox_c);
        questionFiveCheckBoxC.setTypeface(font);
        questionFiveCheckBoxD = (CheckBox) findViewById(R.id.question_five_checkbox_d);
        questionFiveCheckBoxD.setTypeface(font);
        questionSixRadioButtonA = (RadioButton) findViewById(R.id.question_six_radio_button_a);
        questionSixRadioButtonA.setTypeface(font);
        questionSixRadioButtonB = (RadioButton) findViewById(R.id.question_six_radio_button_b);
        questionSixRadioButtonB.setTypeface(font);
        questionSixRadioButtonC = (RadioButton) findViewById(R.id.question_six_radio_button_c);
        questionSixRadioButtonC.setTypeface(font);
        questionSevenRadioButtonA = (RadioButton) findViewById(R.id.question_seven_radio_button_a);
        questionSevenRadioButtonA.setTypeface(font);
        questionSevenRadioButtonB = (RadioButton) findViewById(R.id.question_seven_radio_button_b);
        questionSevenRadioButtonB.setTypeface(font);
        questionSevenRadioButtonC = (RadioButton) findViewById(R.id.question_seven_radio_button_c);
        questionSevenRadioButtonC.setTypeface(font);
        questionEightRadioButtonA = (RadioButton) findViewById(R.id.question_eight_radio_button_a);
        questionEightRadioButtonA.setTypeface(font);
        questionEightRadioButtonB = (RadioButton) findViewById(R.id.question_eight_radio_button_b);
        questionEightRadioButtonB.setTypeface(font);
        questionEightRadioButtonC = (RadioButton) findViewById(R.id.question_eight_radio_button_c);
        questionEightRadioButtonC.setTypeface(font);
        questionNineRadioButtonA = (RadioButton) findViewById(R.id.question_nine_radio_button_a);
        questionNineRadioButtonA.setTypeface(font);
        questionNineRadioButtonB = (RadioButton) findViewById(R.id.question_nine_radio_button_b);
        questionNineRadioButtonB.setTypeface(font);
        questionNineRadioButtonC = (RadioButton) findViewById(R.id.question_nine_radio_button_c);
        questionNineRadioButtonC.setTypeface(font);
        questionTenEditText = (EditText) findViewById(R.id.question_ten_edit_text);
    }

    /**
     * After the submit button is clicked, the following method will tally up the user's score and give an appropriate toast
     */
    public void submitQuiz(View view) {
        /**
         * The following variables check to see if the correct answer was selected by the user. True if selected, false if not
         */
        boolean questionOneRightAnswer = questionOneRadioButtonC.isChecked();
        boolean questionTwoRightAnswer = questionTwoRadioButtonB.isChecked();
        boolean questionThreeRightAnswer = questionThreeRadioButtonC.isChecked();
        boolean questionFourRightAnswer = questionFourRadioButtonB.isChecked();
        boolean questionFiveRightAnswerOne = questionFiveCheckBoxA.isChecked();
        boolean questionFiveWrongAnswerOne = questionFiveCheckBoxB.isChecked();
        boolean questionFiveWrongAnswerTwo = questionFiveCheckBoxC.isChecked();
        boolean questionFiveRightAnswerTwo = questionFiveCheckBoxD.isChecked();
        boolean questionSixRightAnswer = questionSixRadioButtonC.isChecked();
        boolean questionSevenRightAnswer = questionSevenRadioButtonA.isChecked();
        boolean questionEightRightAnswer = questionEightRadioButtonB.isChecked();
        boolean questionNineRightAnswer = questionNineRadioButtonA.isChecked();
        String questionTenAnswer = questionTenEditText.getText().toString();

        /**
         * Declaring a score variable to store the user's score from the calculateScore method
         */
        int score = calculateScore(questionOneRightAnswer, questionTwoRightAnswer, questionThreeRightAnswer, questionFourRightAnswer, questionFiveRightAnswerOne, questionFiveWrongAnswerOne, questionFiveWrongAnswerTwo, questionFiveRightAnswerTwo, questionSixRightAnswer, questionSevenRightAnswer, questionEightRightAnswer, questionNineRightAnswer, questionTenAnswer);

        /**
         * If the user scores a perfect 100, the following toast will appear on screen
         */
        if (score == 100) {
           Toast toast = Toast.makeText(getApplicationContext(), "You scored a " + score + "\nCongratulations Muggle!", Toast.LENGTH_LONG);
            toast.show();
        }
            /**
             * If the user scores >= 70 < 100, the following toast will appear on screen
             */
            else if (score >= 70) {
            Toast toast = Toast.makeText(getApplicationContext(), "You scored a " + score + "\nNot bad!", Toast.LENGTH_LONG);
            toast.show();
        }
            /**
             * If the user scores <= 70, the following toast will appear on screen
             */
            else {
            Toast toast = Toast.makeText(getApplicationContext(), "You scored a " + score + "\nTry again Mudblood.", Toast.LENGTH_LONG);
            toast.show();
        }

        /**
         * Share your score with an external app
         */
        Intent sharingIntent = new Intent();
        sharingIntent.setAction(Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(Intent.EXTRA_TEXT,"I scored " + score + " on the Harry Potter Quiz App!");
        startActivity(Intent.createChooser(sharingIntent,"Share your score!"));

        clearQuizQuestions();
    }

    /**
     * Method to tally up user's score
     */
    private int calculateScore(boolean answerOne, boolean answerTwo, boolean answerThree, boolean answerFour, boolean answerFiveA, boolean answerFiveB, boolean answerFiveC, boolean answerFiveD, boolean answerSix, boolean answerSeven, boolean answerEight, boolean answerNine, String answerTen) {
        int score = 0;

        if (answerOne) {
            score += 10;
            Log.v("MainActivity", "1");
        }

        if (answerTwo) {
            score += 10;
            Log.v("MainActivity", "2");
        }

        if (answerThree) {
            score += 10;
            Log.v("MainActivity", "3");
        }

        if (answerFour) {
            score += 10;
            Log.v("MainActivity", "4");
        }

        if (answerFiveA && !answerFiveB && !answerFiveC && answerFiveD) {
            score += 10;
            Log.v("MainActivity", "5");
        }

        if (answerSix) {
            score += 10;
            Log.v("MainActivity", "6");
        }

        if (answerSeven) {
            score += 10;
            Log.v("MainActivity", "7");
        }

        if (answerEight) {
            score += 10;
            Log.v("MainActivity", "8");
        }

        if (answerNine) {
            score += 10;
            Log.v("MainActivity", "9");
        }

        if (answerTen.equals("Norbert")) {
            score += 10;
            Log.v("MainActivity", "10");
        }

        return score;
    }

    /**
     * Method to clear quiz questions
     */
    private void clearQuizQuestions() {
        RadioGroup questionOneRadioGroup = (RadioGroup) findViewById(R.id.question_one_radio_group);
        questionOneRadioGroup.clearCheck();

        RadioGroup questionTwoRadioGroup = (RadioGroup) findViewById(R.id.question_two_radio_group);
        questionTwoRadioGroup.clearCheck();

        RadioGroup questionThreeRadioGroup = (RadioGroup) findViewById(R.id.question_three_radio_group);
        questionThreeRadioGroup.clearCheck();

        RadioGroup questionFourRadioGroup = (RadioGroup) findViewById(R.id.question_four_radio_group);
        questionFourRadioGroup.clearCheck();

        questionFiveCheckBoxA.setChecked(false);
        questionFiveCheckBoxB.setChecked(false);
        questionFiveCheckBoxC.setChecked(false);
        questionFiveCheckBoxD.setChecked(false);

        RadioGroup questionSixRadioGroup = (RadioGroup) findViewById(R.id.question_six_radio_group);
        questionSixRadioGroup.clearCheck();

        RadioGroup questionSevenRadioGroup = (RadioGroup) findViewById(R.id.question_seven_radio_group);
        questionSevenRadioGroup.clearCheck();

        RadioGroup questionEightRadioGroup = (RadioGroup) findViewById(R.id.question_eight_radio_group);
        questionEightRadioGroup.clearCheck();

        RadioGroup questionNineRadioGroup = (RadioGroup) findViewById(R.id.question_nine_radio_group);
        questionNineRadioGroup.clearCheck();

        questionTenEditText.getText().clear();
    }
}

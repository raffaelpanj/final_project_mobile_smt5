package com.example.nicelife.apksehat.Category;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.nicelife.apksehat.R;

public class ResultBmi extends AppCompatActivity {

    TextView mbmidisplay,magedisplay,mweightdisplay,mheightdisplay,mbmicategory,mgender,mbmiadvice, mwater, msleep, mfood;
    Button mgotomain;
    Intent intent;

    ImageView mimageview;
    String mbmi, gender, calorie, age;
    String cateogory;
    float intbmi;
    double countcal;
    int intcountcal,intwater,glass;


    String height;
    String weight;

    float intheight,intweight,intage;

    RelativeLayout mbackground;

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_bmi);
        getSupportActionBar().setElevation(0);
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#1E1D1D"));
        getSupportActionBar().setBackgroundDrawable(colorDrawable);

        ///   ColorDrawable colorDrawable2=new ColorDrawable(Color.parseColor("#1E1D1D"));
        //      getSupportActionBar().setBackgroundDrawable(colorDrawable);


        getSupportActionBar().setTitle(Html.fromHtml("<font color=\"white\"></font>"));
        getSupportActionBar().setTitle("Result");


        intent = getIntent();
        mbmidisplay = findViewById(R.id.bmidisplay);
        //    magedisplay=findViewById(R.id.agedisplay);
        //    mweightdisplay=findViewById(R.id.weightdisplay);
        mbmicategory = findViewById(R.id.bmicategorydispaly);
        mbmiadvice = findViewById(R.id.bmicategoryadvice);
        mwater = findViewById(R.id.water);
        msleep = findViewById(R.id.sleep);
        mfood = findViewById(R.id.food);
        mgotomain = findViewById(R.id.gotomain);

        mimageview = findViewById(R.id.imageview);

        //   mheightdisplay=findViewById(R.id.heightdisplay);
        mgender = findViewById(R.id.genderdisplay);
        mbackground = findViewById(R.id.contentlayout);


        height = intent.getStringExtra("height");
        weight = intent.getStringExtra("weight");
        gender = intent.getStringExtra("gender");
        age = intent.getStringExtra("age");

        intage = Float.parseFloat(age);
        intheight = Float.parseFloat(height);
        intweight = Float.parseFloat(weight);

        intheight = intheight / 100;
        intbmi = intweight / (intheight * intheight);



        mbmi = Float.toString(intbmi);
        System.out.println(mbmi);

        if(gender.equals("Male")){
            countcal = (66.5 + (13.75*intweight) + (5.003*intheight*100)-(6.75* intage))*1.5;
        }else{
            countcal = (655 + (9.6* intweight) + (1.8*intheight*100)- (4.7 * intage))*1.5;
        }
        intcountcal = (int)countcal;
        calorie = intcountcal + " calories of food per day";
        mfood.setText(calorie);

        if(intage < 2){
            msleep.setText("12-14 hours of sleep per day");
        }else if(intage < 7){
            msleep.setText("11-13 hours of sleep per day");
        }else if(intage < 13){
            msleep.setText("10 hours of sleep per day");
        }else if(intage < 19){
            msleep.setText("8-9 hours of sleep per day");
        }else if(intage < 41){
            msleep.setText("7-8 hours of sleep per day");
        }else if(intage < 61){
            msleep.setText("7 hours of sleep per day");
        }else{
            msleep.setText("6 hours of sleep per day");
        }
        int intheightw = (int)intheight;
        intwater = 30 * (int)intweight;
        glass = intwater/230;
        mwater.setText( glass +" glasses of water per day");

        if (intbmi < 16) {
            mbmiadvice.setText("Adding snacks, eating several small meals a day, and Incorporating additional foods to gain your weight");
            mbmicategory.setText("Severe Thinness");
            //   mbackground.setBackgroundColor(Color.GRAY);
            mbackground.setBackgroundColor(Color.RED);
            mimageview.setImageResource(R.drawable.sad);
            //  mimageview.setBackground(colorDrawable2);

        } else if (intbmi < 16.9 && intbmi > 16) {
            mbmiadvice.setText("Adding snacks, eating several small meals a day, and Incorporating additional foods to gain your weight");
            mbmicategory.setText("Moderate Thinness");
//            mbackground.setBackgroundColor(R.color.greenwarn);
            mimageview.setImageResource(R.drawable.warning2);
            //   mimageview.setBackground(colorDrawable2);

        } else if (intbmi < 18.4 && intbmi > 17) {
            mbmiadvice.setText("Adding snacks, eating several small meals a day, and Incorporating additional foods to gain your weight");
            mbmicategory.setText("Mild Thinness");
//            mbackground.setBackgroundColor(R.color.greenwarn);
            mimageview.setImageResource(R.drawable.warning2);
            //   mimageview.setBackground(colorDrawable2);
        } else if (intbmi < 24.9 && intbmi > 18.5) {
            mbmiadvice.setText("Keep up the good work! Keep eating healthy food");
            mbmicategory.setText("Normal");
            mimageview.setImageResource(R.drawable.smile);
            // mbackground.setBackgroundColor(Color.YELLOW);
            //  mimageview.setBackground(colorDrawable2);
        } else if (intbmi < 29.9 && intbmi > 25) {
            mbmiadvice.setText("The best way to lose weight if you're overweight is through a combination of diet and exercise.");
            mbmicategory.setText("Overweight");
//            mbackground.setBackgroundColor(R.color.greenwarn);
            mimageview.setImageResource(R.drawable.warning2);
            //mimageview.setBackground(colorDrawable2);
        } else if (intbmi < 34.9 && intbmi > 30) {
            mbmiadvice.setText("The best way to lose weight if you're overweight is through a combination of diet and exercise.");
            mbmicategory.setText("Obese Class I");
//            mbackground.setBackgroundColor(R.color.greenwarn);
            mimageview.setImageResource(R.drawable.warning2);
            //  mimageview.setBackground(colorDrawable2);
        } else {
            mbmiadvice.setText("The best way to lose weight if you're overweight is through a combination of diet and exercise.");
            mbmicategory.setText("Obese Class II");
            mbackground.setBackgroundColor(Color.RED);
            mimageview.setImageResource(R.drawable.sad);
            //  mimageview.setBackground(colorDrawable2);
        }

        //magedisplay.setText("your age is"+intent.getStringExtra("age"));
        //mheightdisplay.setText("Your Height is "+intent.getStringExtra("height"));
        //mweightdisplay.setText("Your Weight is "+intent.getStringExtra("weight"));
        mgender.setText(intent.getStringExtra("gender"));
        mbmidisplay.setText(mbmi);


        mgotomain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getApplicationContext(), BMI.class);
                startActivity(intent1);
            }
        });
    }
}
package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
        Button redB,blueB;
        TextView story;
        int storyindex=1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        redB=(Button)findViewById(R.id.buttonTop);
        blueB=(Button)findViewById(R.id.buttonBottom);
        story=(TextView)findViewById(R.id.storyTextView);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        redB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(storyindex==1||storyindex==2)
                {
                    story.setText(R.string.T3_Story);
                    redB.setText(R.string.T3_Ans1);
                    blueB.setText(R.string.T3_Ans2);
                    storyindex=3;
                }

                else {
                    story.setText(R.string.T6_End);
                    redB.setVisibility(View.GONE);
                    blueB.setVisibility(View.GONE);
                    storyindex=6;
                }
            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        blueB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(storyindex==1)
                {
                    story.setText(R.string.T2_Story);
                    redB.setText(R.string.T2_Ans1);
                    blueB.setText(R.string.T2_Ans2);
                    storyindex=2;
                }
                else if(storyindex==2){
                    story.setText(R.string.T4_End);
                    redB.setVisibility(View.GONE);
                    blueB.setVisibility(View.GONE);
                    storyindex=4;
                }
                else if (storyindex==3){
                    story.setText(R.string.T5_End);
                    redB.setVisibility(View.GONE);
                    blueB.setVisibility(View.GONE);
                    storyindex=5;
                }

            }
        });

    }


}

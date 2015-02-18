package mmh.cognitiveassignment;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.graphics.Color;
import java.util.Random;
import java.lang.*;
import android.os.SystemClock;


public class ColorExercise extends ActionBarActivity {

    private static final int num_colors = 5;
    private Random mRandom = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_exercise);
/**        View v = findViewById(R.id.colorExercise);
        SystemClock.sleep(3000);
        v.setBackgroundColor(getResources().getColor(R.color.blue));
        SystemClock.sleep(3000);
        startActivity(new Intent(ColorExercise.this, Feedback.class));**/
    }

    public void getFeedback(View view) {
        startActivity(new Intent(ColorExercise.this, Feedback.class));
    }

}

package fed.funfacts;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Button;


public class FunFactsMainActivity extends ActionBarActivity {

    // GET NAME OF THE CLASS AND STORE IT IN A CONSTANT IN CASE YOU WANT TO REFACTOR IT
    public static final String TAG = FunFactsMainActivity.class.getSimpleName();

    // INSTANTIATE CLASS OBJECTS
    private final FactBook mFactBook = new FactBook();
    private final ColorWheel mColorWheel = new ColorWheel();
    private final RandomGenerator mRandomGenerator = new RandomGenerator();


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // GET THE NAME OF THE MAIN ACTIVITY AND STORE IT IN A CONSTANT
        final String TAG = FunFactsMainActivity.class.getSimpleName();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts_main);

        // "Get Elements By ID", you have to cast the variable
        // type because they will come as View types

        // LOG MESSAGING TEST
        Log.d(TAG, "App has been created!");


        final TextView factLabel = (TextView) findViewById(R.id.funFactTextView);
        final Button showFactButton = (Button) findViewById(R.id.Nextbutton);
        final RelativeLayout myLayout = (RelativeLayout) findViewById(R.id.mainLayout);

        // ADD CLICK EVENT TO BUTTON!!!!

        // 1. CREATE THE EVENT LISTENER
        View.OnClickListener myListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // WHEN THE BUTTON IS CLICKED, DO THIS:
                Log.d(TAG, "Next button has been clicked!");

                // GENERATE RANDOM NUMBER USING THE FACT  LIST AS ITS LENGTH
                int randomNumber = mRandomGenerator.getRandomNumber(mFactBook.getFactListLength());

                // GET RANDOM COLOR FROM THE COLOR WHEEL OBJECT
                int myColor = mColorWheel.getColor(randomNumber);


                // SET BACKGROUND COLOUR TO YOUR LAYOUT
                myLayout.setBackgroundColor(myColor);
                showFactButton.setTextColor(myColor);


                // UPDATE THE TEXT DYNAMICALLY
                factLabel.setText(mFactBook.getFact(randomNumber));

            }
        };

        // 2. ASSIGN THIS EVENT LISTENER TO THE BUTTON
        showFactButton.setOnClickListener(myListener);

    }

}
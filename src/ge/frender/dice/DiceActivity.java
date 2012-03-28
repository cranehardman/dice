package ge.frender.dice;

import java.util.Random;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DiceActivity extends Activity {
	/** Called when the activity is first created. */

	Button roll;
	TextView tdice1;
	TextView tdice2;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		roll = (Button) findViewById(R.id.bRoll);

		tdice1 = (TextView) findViewById(R.id.tDice1);
		tdice2 = (TextView) findViewById(R.id.tDice2);
		
		roll.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				Random r = new Random();
				int rdice1 = r.nextInt(6)+1;
				int rdice2 = r.nextInt(6)+1;
				
				tdice1.setText("kamateli I: " + rdice1);
				tdice2.setText("Kamateli II:" + rdice2);

			}
		});
		

	}
}
package ge.frender.dice;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class DiceActivity extends Activity {
	/** Called when the activity is first created. */

	int counter;
	Button add, sub;
	TextView display;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		counter = 0;
		add = (Button) findViewById(R.id.bAdd);
		sub = (Button) findViewById(R.id.bSub);
		display = (TextView) findViewById(R.id.tv);
		add.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				counter++;
				display.setText("your total is:" + counter);

			}
		}); 

		sub.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				counter--;
				display.setText("your total aaaa is:" + counter);

			}
		});
	}
}
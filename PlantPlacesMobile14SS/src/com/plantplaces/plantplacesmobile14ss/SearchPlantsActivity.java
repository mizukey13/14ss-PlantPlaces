package com.plantplaces.plantplacesmobile14ss;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SearchPlantsActivity extends Activity {
	
	// Declare a variable that will hold a reference to the editText component on the screen.
	EditText description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_plants);
        
        description = (EditText) findViewById(R.id.edtDescription);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.search_plants, menu);
        return true;
    }
    public void searchClicked(View v) {
    	String strDescription = description.getText().toString();
    	// call the method named sum
    	int value = sum(1, 2);
    	// pop-up a box when the button is clicked
    	Toast.makeText(this, strDescription + value, Toast.LENGTH_LONG).show();
   
    }
    
    public int sum(int operand1, int operand2) {
    	//declare a variable
    	int total;
    	// add together the two numbers and assign to variable
    	total = operand1 + operand2;
    	// return the total
    	return total;
    }
}

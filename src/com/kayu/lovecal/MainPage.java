package com.kayu.lovecal;


import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainPage extends Activity {

    private Button buttonLogin;
	private EditText yourName;
	private EditText partnerName;
    public String yName , pName;
	private Builder builder;
    public final static String EXTRA_MESSAGE = "com.kayu.love.MESSAGE";
    private CharSequence[] selectSex = {"Male","Female"};
	protected String sex;
	Love lv;

	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
        initalize();
    }

    private void initalize() {    	
    	 buttonLogin = (Button)findViewById(R.id.button1);
    	 yourName = (EditText)findViewById(R.id.editText1);
    	 partnerName = (EditText)findViewById(R.id.editText2);
    	 buttonLogin.setOnClickListener(new Button.OnClickListener() { 
         	public void onClick (View v){ 
         		validateNames();
         		} });		
	}
    

	protected void validateNames() {
		yName = yourName.getText().toString();
		pName = partnerName.getText().toString();
		if (yName.length() == 0 || pName.length() == 0)		
			displayTheErrorMessage();
				else
				{
					if(isNumeric(yName) && isNumeric(pName)){
						displayNumaricErrorMesage();
					}
					else
					   checkTheSex();
				}
	}

	private void displayNumaricErrorMesage() {
		builder = new AlertDialog.Builder(this);
		builder.setMessage(R.string.dialog_numeric_message);
		builder.setNeutralButton("Ok", new DialogInterface.OnClickListener() {
			    @Override
			   public void onClick(DialogInterface dialog, int which) {
			    	Toast.makeText(getApplicationContext(), "Ok Button Clicked ", Toast.LENGTH_SHORT).show();
			   }
			  });

		builder.show();	
		
	}

	public static boolean isNumeric(String str)
	{
		return str.matches("[+-]?\\d*(\\.\\d+)?");
	}
	
	private void checkTheSex() {
		builder = new AlertDialog.Builder(this);
		builder.setTitle(R.string.slect_sex);
		builder.setSingleChoiceItems(selectSex, -1,  
		         new DialogInterface.OnClickListener() {  
		          				@SuppressLint("UseValueOf")
				@Override  
		           public void onClick(DialogInterface dialog, int which) {  
		             Toast.makeText(MainPage.this,  
		                 selectSex[which] + " Selected",  
		                 Toast.LENGTH_LONG).show(); 
		             if (selectSex[which] == "Male")
		             {
		            	 sex = "Male";
		             }
		             else 
		            	 sex = "Female";		            	 
		             
		           }  		           
		           
		         });  
				
		 builder.setPositiveButton( "Ok", new DialogInterface.OnClickListener() { 
			  public void onClick( DialogInterface dialog, int whichButton) 
			  { 
				  
				  dialog.dismiss();		  
				  goNextpage();
				  
				  
			  } });
		     
		     AlertDialog alert = builder.create();  
		     alert.show();  
		
	}

	@SuppressWarnings("static-access")
	protected void goNextpage() {
		lv = new Love();
		lv.setyName(yName);
		lv.setpName(pName);
		lv.setSex(sex);		
		Intent intent = new Intent(this, SecoundPage.class);		
		startActivity(intent);
		onBackPressed();	
		
		
	}

	private void displayTheErrorMessage() {
		
		builder = new AlertDialog.Builder(this);
		builder.setMessage(R.string.dialog_message);
		builder.setNeutralButton("Ok", new DialogInterface.OnClickListener() {
			    @Override
			   public void onClick(DialogInterface dialog, int which) {
			    	Toast.makeText(getApplicationContext(), "Ok Button Clicked ", Toast.LENGTH_SHORT).show();
			   }
			  });

		builder.show();	
		
	}

	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main_page, menu);
        return true;
    }
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	    // Handle item selection
	    switch (item.getItemId()) {
	        case R.id.item1:
	            newLoveCal();
	            return true;
		case R.id.item2:
	            showAboutMe();
	            return true;
	        default:
	            return super.onOptionsItemSelected(item);
	    }
	}

	private void showAboutMe() {
		
		builder = new AlertDialog.Builder(this);
		builder.setMessage(R.string.AboutMe);
		builder.setNeutralButton("Ok", new DialogInterface.OnClickListener() {
			    @Override
			   public void onClick(DialogInterface dialog, int which) {
			    	Toast.makeText(getApplicationContext(), "Ok Button Clicked ", Toast.LENGTH_SHORT).show();
			   }
			  });

		builder.show();	
		
		
	}

	private void newLoveCal() {
		    startActivity(new Intent(this, MainPage.class));
		    finish();
		
	}
}

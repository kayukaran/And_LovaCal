package com.kayu.lovecal;



import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
//import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class SecoundPage extends Activity {
	
	public final static String EXTRA_MESSAGE = "com.kayu.love.MESSAGE";

    private TextView yourName;
	private TextView partnerName;
	private ImageButton facebookButton;
	private ImageButton twiterButton;
	private ImageButton lovePercentage;
	private ImageButton loveMessage;
	private ImageButton lovePlace;
	private ImageButton loveAnotherOne;
	private int yourNo, partnerNo;
	private String [] message;
	MessagePercentage MP;
	Resources res;
	private Builder builder;
	//private ProgressDialog progressbar;
	String uri ;

	
	
	

	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secound_page);
        inialize();
        
    }

    private void inialize() {
		yourName = (TextView)findViewById(R.id.textMsg);
		partnerName = (TextView)findViewById(R.id.textMsg2);
		facebookButton = (ImageButton)findViewById(R.id.imageButton1);
		twiterButton = (ImageButton)findViewById(R.id.imageButton2);
		lovePercentage = (ImageButton)findViewById(R.id.Button01);
		loveMessage = (ImageButton)findViewById(R.id.Button02);
		lovePlace = (ImageButton)findViewById(R.id.Button03);
		loveAnotherOne = (ImageButton)findViewById(R.id.Button04);
		MP = new MessagePercentage();
		res = getResources();
		yourNo = CalculateNumerlogy.getYourNumber();
		partnerNo = CalculateNumerlogy.getPartnerNumber();
		yourName.setText(Love.getyName());
		partnerName.setText(Love.getpName());
		message = res.getStringArray(MP.getPercentage(yourNo, partnerNo, Love.getSex()));		
		lovePercentage.setOnClickListener(new Button.OnClickListener() { 
        	public void onClick (View v){ 
        		checkPercentage();
        		} });
		loveMessage.setOnClickListener(new Button.OnClickListener() { 
        	public void onClick (View v){ 
        		checkMessage();
        		} });
		lovePlace.setOnClickListener(new Button.OnClickListener() { 
        	public void onClick (View v){ 
        		checkPlace();
        		} });
		loveAnotherOne.setOnClickListener(new Button.OnClickListener() { 
        	public void onClick (View v){ 
        		checkAnotherOne();
        		} });
		facebookButton.setOnClickListener(new Button.OnClickListener() { 
        	public void onClick (View v){ 
        		goToFacebook();
        		} });
		twiterButton.setOnClickListener(new Button.OnClickListener() { 
        	public void onClick (View v){ 
        		goToTwitter();
        		} });
	}

	protected void goToTwitter() {
		
		display(res.getString(R.string.twitterURl));
		onBackPressed();
				
		
	}

	

	protected void goToFacebook() {
		display(res.getString(R.string.facebookURl));
		onBackPressed();		
		
	}

	protected void checkAnotherOne() {
		
		startActivity(new Intent(this,MainPage.class));
		finish();
		
	}	

	

	protected void checkPlace() {
		
		Intent in = new Intent(this, Location.class);
		in.putExtra(EXTRA_MESSAGE, message[2]);
		startActivity(in);
	    finish();
		
		
	}

	protected void checkMessage() {
		
		Toast.makeText(getApplicationContext(), "Message from us ", Toast.LENGTH_SHORT).show();		
		builder = new AlertDialog.Builder(this);
		builder.setMessage(message[1]);
		builder.setIcon(R.drawable.icon1);
		builder.setTitle(R.string.alertbox_title_msg);		
		builder.setNeutralButton("Ok", new DialogInterface.OnClickListener() {
			    @Override
			   public void onClick(DialogInterface dialog, int which) {
			    	Toast.makeText(getApplicationContext(), "Ok button Clicked ", Toast.LENGTH_SHORT).show();
			   }
			  });

		builder.show();	
	}

	protected void checkPercentage() {
		
		Toast.makeText(getApplicationContext(), "Check your love percentage ", Toast.LENGTH_SHORT).show();		
		builder = new AlertDialog.Builder(this);
		builder.setMessage("Your Love Percentage is "+message[0]);
		builder.setIcon(R.drawable.icon);
		builder.setTitle(R.string.alertbox_title_percentage);
		builder.setNeutralButton("Ok", new DialogInterface.OnClickListener() {
			    @Override
			   public void onClick(DialogInterface dialog, int which) {
			    	Toast.makeText(getApplicationContext(), "Ok button Clicked ", Toast.LENGTH_SHORT).show();
			   }
			  });

		builder.show();	
		
		
	}
	
	/**private void navigateToPage(String url) {
		uri= url;
		progressbar=new ProgressDialog(this);
		progressbar.setMessage("File downloading ..." );
		progressbar.setCancelable(true);
		progressbar.show();
		        
        new Thread(new Runnable() {
			 

			public void run() {			
					display(uri);
					
				  try {
					Thread.sleep(3000);
				  } catch (InterruptedException e) {
					e.printStackTrace();
				  }

				  
				 
					progressbar.dismiss();
				}
			 

			
		       }).start();      
                   
		
	}**/
	
	
	
	
	private void display(String url) {
		String url1 = url ;
		Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(url1));
        startActivity(i);
        onBackPressed() ;
        		
	}

	
	
	 @Override
	    public void onBackPressed() {
		    startActivity(new Intent(this, MainPage.class));
		    finish();
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

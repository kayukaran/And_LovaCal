package com.kayu.lovecal;


import java.util.List;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.location.Geocoder;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapActivity;
import com.google.android.maps.MapView;
import com.google.android.maps.Overlay;
import com.google.android.maps.OverlayItem;



public class Location extends MapActivity {

	private MapView mapview ;
	public Geocoder geocoder = null;	
	private Resources res;
	private String[] points;
	private OverlayItem overlayitem;
	private HelloItemizedOverlay itemizedoverlay;
	private String location;
	private int XMLint;
	private Builder builder;
	
	
	

	@Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_location);
	        mapview = (MapView) findViewById(R.id.mapView);
	        mapview.setBuiltInZoomControls(true);
	        List<Overlay> mapOverlays = mapview.getOverlays();
 		    Drawable drawable = this.getResources().getDrawable(R.drawable.pin_green);
 		    itemizedoverlay = new HelloItemizedOverlay(drawable, this);
		    Intent intent = getIntent();
		    String Location = intent.getStringExtra(MainPage.EXTRA_MESSAGE);
		    XMLint = getPoints(Location);
		    res = getResources();
		    points = res.getStringArray(XMLint);
		    int lat = (int) (Double.valueOf(points[0]).doubleValue() * 1000000);  
 	        int lng = (int) (Double.valueOf(points[1]).doubleValue() * 1000000); 
 		    Log.i("point", points[0]);
 		    GeoPoint pt = new GeoPoint(lat, lng); 		    
            mapview.getController().setCenter(pt);
            overlayitem = new OverlayItem(pt , Location, points[2]);
		    mapview.getController().setZoom(13);
			itemizedoverlay.addOverlay(overlayitem);
			mapOverlays.add(itemizedoverlay);    
		      
	    }
	 
	   

		private int getPoints(String loc) {
	    	
	    	Log.i("msg", loc);
	    	location = loc;
	    	Log.i("check", location.toLowerCase());
	    	
	    	int AndroidXMLInt = 0;
	    	
	    	if (location.toString().equalsIgnoreCase( "colombo"))
	    	{   		
	 		    AndroidXMLInt = R.array.Colombo;	 		    
	 		       	 	       
	    	} 
	    	else if (location.toString().equalsIgnoreCase( "batticaloa"))
	    	{ 
	    		
	 		    AndroidXMLInt = R.array.Batticaloa;
	 		   	 		      	 	       
	    	}   
	    	else if (location.toString().equalsIgnoreCase( "Adams Peak"))
	    	{   		
	 		    AndroidXMLInt = R.array.Adams_Peak;
	 		      	 	       
	    	}
	    	else if (location.toString().equalsIgnoreCase( "Dambulla"))
	    	{   		
	 		    AndroidXMLInt = R.array.Dambulla;
	 		   
	    	} 
	    	else if (location.toString().equalsIgnoreCase( "Bentota"))
	    	{   		
	 		    AndroidXMLInt = R.array.Bentota;
	 		   	 		      	 	       
	    	} 
	    	else if (location.toString().equalsIgnoreCase("Nuwara Eliya"))
	    	{   		
	 		    AndroidXMLInt = R.array.Nuwara_Eliya;
	 		     	 	       
	    	} 
	    	else if (location.toString().equalsIgnoreCase( "Hikkaduwa"))
	    	{   		
	 		    AndroidXMLInt = R.array.Hikkaduwa;
	 		    	 	       
	    	} 
	    	else if (location.toString().equalsIgnoreCase( "Beruwela"))
	    	{   		
	 		    AndroidXMLInt = R.array.Beruwela;
	 		     	 	       
	    	} 
	    	else if (location.toString().equalsIgnoreCase( "Jaffna"))
	    	{   		
	 		    AndroidXMLInt = R.array.Jaffna;
	 		     	 	       
	    	} 
	    	else if (location.toString().equalsIgnoreCase( "Kurunegala"))
	    	{   		
	 		    AndroidXMLInt = R.array.Kurunegala;
	 		      	 	       
	    	} 
	    	else if (location.toString().equalsIgnoreCase( "galle"))
	    	{   		
	 		    AndroidXMLInt = R.array.Galle;
	 		      	 	       
	    	} 
	    	else   		
	 		    AndroidXMLInt = R.array.Kandy;
	 		   
	    	  		
	    	
	    		    	
	    	return AndroidXMLInt;  	
		
		
	}

		@Override
	    protected boolean isRouteDisplayed() {
	        return false;
	    }
		
		@Override
	    public void onBackPressed() {
		    startActivity(new Intent(this, SecoundPage.class));
		    finish();
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

package com.kayu.lovecal;



public class CalculateNumerlogy {
	
	
	
public static  int getYourNumber() {
	
	    String yourName[] = Love.getyName().trim().toLowerCase().split("(?!^)");	
				
		int calculteVal = 0 ;	
		
		
		
		for (int y=0;y<yourName.length;y++){
			if (yourName[y].equals("a")  || yourName[y].equals("j")  || yourName[y].equals("s") )
			{
				calculteVal = calculteVal+1;
								
			}
			
			else {
				calculteVal = calculteVal +0;
			      }
			
			if (yourName[y].equals("b")  || yourName[y].equals("k")  || yourName[y].equals("t") )
			{
				calculteVal = calculteVal+2;
				
			}
			
			else {
				calculteVal = calculteVal +0;
			      }
			
			 if (yourName[y].equals("c")  || yourName[y].equals("l")  || yourName[y].equals("u") )
			{
				calculteVal = calculteVal+3;
				
			}
			 
			 else {
					calculteVal = calculteVal +0;
				      }
			
			 if (yourName[y].equals("d")  || yourName[y].equals("m")  || yourName[y].equals("v") )
			{
				calculteVal = calculteVal+4;
				
			}
			 else {
					calculteVal = calculteVal +0;
				      }
			
			 if (yourName[y].equals("e")  || yourName[y].equals("n")  || yourName[y].equals("w") )
			{
				calculteVal = calculteVal+5;
				
			}
			 
			 else {
					calculteVal = calculteVal +0;
				      }
			
			 if (yourName[y].equals("f") || yourName[y].equals("o") || yourName[y].equals("x") )
			{
				calculteVal = calculteVal+6;
				
			}
			 
			 else {
					calculteVal = calculteVal +0;
				      }
			
			 if (yourName[y].equals("g")  || yourName[y].equals("p")  || yourName[y].equals("y") )
			{
				calculteVal = calculteVal+7;
				
			}
			 
			 else {
					calculteVal = calculteVal +0;
				      }
			
			if (yourName[y].equals("h")  || yourName[y].equals("q")  || yourName[y].equals("z") )
			{
				calculteVal = calculteVal+8;
				
			}
			
			else {
				calculteVal = calculteVal +0;
			      }
			
			 if (yourName[y].equals("i")  || yourName[y].equals("r")  )
			{
				calculteVal = calculteVal+9;
				
			}
			 
			 else {
					calculteVal = calculteVal +0;
				      }				
			
		}
		
		while (calculteVal > 9)
		{
			String val = Integer.toString(calculteVal);
			int z = checkValue(val);
			calculteVal = z;		
					
		}
		
		
		return calculteVal;
		
	}



	
	public static  int getPartnerNumber() {
		String partnerName[] = Love.getpName().trim().toLowerCase().split("(?!^)");
        int calculteYVal = 0 ;
		
		
		
		
		for (int y=0;y<partnerName.length;y++){
			if (partnerName[y].equals("a")  || partnerName[y].equals("j")  || partnerName[y].equals("s") )
			{
				calculteYVal = calculteYVal+1;
								
			}
			
			else {
				calculteYVal = calculteYVal +0;
			      }
			
			if (partnerName[y].equals("b")  || partnerName[y].equals("k")  || partnerName[y].equals("t") )
			{
				calculteYVal = calculteYVal+2;
				
			}
			
			else {
				calculteYVal = calculteYVal +0;
			      }
			
			 if (partnerName[y].equals("c")  || partnerName[y].equals("l")  || partnerName[y].equals("u") )
			{
				 calculteYVal = calculteYVal+3;
				
			}
			 
			 else {
				 calculteYVal = calculteYVal +0;
				      }
			
			 if (partnerName[y].equals("d")  || partnerName[y].equals("m")  || partnerName[y].equals("v") )
			{
				 calculteYVal = calculteYVal+4;
				
			}
			 else {
				 calculteYVal = calculteYVal +0;
				      }
			
			 if (partnerName[y].equals("e")  || partnerName[y].equals("n")  || partnerName[y].equals("w") )
			{
				 calculteYVal = calculteYVal+5;
				
			}
			 
			 else {
				 calculteYVal = calculteYVal +0;
				      }
			
			 if (partnerName[y].equals("f") || partnerName[y].equals("o") || partnerName[y].equals("x") )
			{
				 calculteYVal = calculteYVal+6;
				
			}
			 
			 else {
				 calculteYVal = calculteYVal +0;
				      }
			
			 if (partnerName[y].equals("g")  || partnerName[y].equals("p")  || partnerName[y].equals("y") )
			{
				 calculteYVal = calculteYVal+7;
				
			}
			 
			 else {
				 calculteYVal = calculteYVal +0;
				      }
			
			if (partnerName[y].equals("h")  || partnerName[y].equals("q")  || partnerName[y].equals("z") )
			{
				calculteYVal = calculteYVal+8;
				
			}
			
			else {
				calculteYVal = calculteYVal +0;
			      }
			
			 if (partnerName[y].equals("i")  || partnerName[y].equals("r")  )
			{
				 calculteYVal = calculteYVal+9;
				
			}
			 
			 else {
				 calculteYVal = calculteYVal +0;
				      }		
			
			
		}
		
		
		while (calculteYVal > 9)
		{
			String val = Integer.toString(calculteYVal);
			int z = checkValue(val);
			calculteYVal = z;		
						
		}		
		
		return calculteYVal;
			
	}
	
	
	
	
	
	public static int checkValue(String x)
	{
		String val = x;
		String value[] = val.split("(?!^)");
		int t = 0;
		for (int y=0 ;y<value.length;y++)
		{
			t= t+ Integer.parseInt(value[y]);
		}
		
		return t;
		
	}
	

}

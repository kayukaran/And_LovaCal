package com.kayu.lovecal;

public class MessagePercentage {
	
	static int YourNo, PartnerNo;
	String sx;
	
	
	public int getPercentage(int YNo ,int PNo, String sex){
		
		sx = sex;
		int AndroidXMLInt = 0;
		
		if (sx == "Male")
		{
			YourNo = YNo;
			PartnerNo = PNo;
		}
		else 
		{
			YourNo = PNo;
			PartnerNo = YNo;
		}	
	
		
		 if (YourNo == 1)
		   {
			  if (PartnerNo == 1)
			  {
				  AndroidXMLInt = R.array.message_1_1;
			  }
			  else if (PartnerNo == 2)
			  {
				  AndroidXMLInt = R.array.message_1_2;
			  }
			  else if (PartnerNo == 3)
			  {
				  AndroidXMLInt = R.array.message_1_3;
			  }
			  else if (PartnerNo == 4)
			  {
				  AndroidXMLInt = R.array.message_1_4;				  
			  }
			  else if (PartnerNo == 5)
			  {
				  AndroidXMLInt = R.array.message_1_5;				  
			  }
			  else if (PartnerNo == 6)
			  {
				  AndroidXMLInt = R.array.message_1_6;				  
			  }
			  else if (PartnerNo == 7)
			  {
				  AndroidXMLInt = R.array.message_1_7;				  
			  }
			  else if (PartnerNo == 8)
			  {
				  AndroidXMLInt = R.array.message_1_8;
			  }
			  else if (PartnerNo == 9)
			  {
				  AndroidXMLInt = R.array.message_1_9;				  
			  }
			  		   
		   }
			
		   else if (YourNo == 2)
		   {
			  if (PartnerNo == 1)
			  {
				  AndroidXMLInt = R.array.message_2_1;
			  }
			  else if (PartnerNo == 2)
			  {
				  AndroidXMLInt = R.array.message_2_2;
			  }
			  else if (PartnerNo == 3)
			  {
				  AndroidXMLInt = R.array.message_2_3;
			  }
			  else if (PartnerNo == 4)
			  {
				  AndroidXMLInt = R.array.message_2_4;
				  
			  }
			  else if (PartnerNo == 5)
			  {
				  AndroidXMLInt = R.array.message_2_5;
			  }
			  else if (PartnerNo == 6)
			  {
				  AndroidXMLInt = R.array.message_2_6;
			  }
			  else if (PartnerNo == 7)
			  {
				  AndroidXMLInt = R.array.message_2_7;
			  }
			  else if (PartnerNo == 8)
			  {
				  AndroidXMLInt = R.array.message_2_8;
			  }
			  else if (PartnerNo == 9)
			  {
				  AndroidXMLInt = R.array.message_2_9;
				  
			  }
			  		   
		   }
		   
		   else  if (YourNo == 3)
		   {
			  if (PartnerNo == 1)
			  {
				  AndroidXMLInt = R.array.message_3_1;
			  }
			  else if (PartnerNo == 2)
			  {
				  AndroidXMLInt = R.array.message_3_2;
			  }
			  else if (PartnerNo == 3)
			  {
				  AndroidXMLInt = R.array.message_3_3;
				  
			  }
			  else if (PartnerNo == 4)
			  {
				  AndroidXMLInt = R.array.message_3_4;
				  
			  }
			  else if (PartnerNo == 5)
			  {
				  AndroidXMLInt = R.array.message_3_5;
				  
			  }
			  else if (PartnerNo == 6)
			  {
				  AndroidXMLInt = R.array.message_3_6;
			  }
			  else if (PartnerNo == 7)
			  {
				  AndroidXMLInt = R.array.message_3_7;  
			  }
			  else if (PartnerNo == 8)
			  {
				  AndroidXMLInt = R.array.message_3_8;
				  
			  }
			  else if (PartnerNo == 9)
			  {
				  AndroidXMLInt = R.array.message_3_9;
			  }
			  		   
		   }
			
		   else  if (YourNo == 4)
		   {
			  if (PartnerNo == 1)
			  {
				  AndroidXMLInt = R.array.message_4_1;
			  }
			  else if (PartnerNo == 2)
			  {
				  AndroidXMLInt = R.array.message_4_2;
			  }
			  else if (PartnerNo == 3)
			  {
				  AndroidXMLInt = R.array.message_4_3;
			  }
			  else if (PartnerNo == 4)
			  {
				  AndroidXMLInt = R.array.message_4_4;
			  }
			  else if (PartnerNo == 5)
			  {
				  AndroidXMLInt = R.array.message_4_5;
			  }
			  else if (PartnerNo == 6)
			  {
				  AndroidXMLInt = R.array.message_4_6;
				  
			  }
			  else if (PartnerNo == 7)
			  {
				  AndroidXMLInt = R.array.message_4_7;
			  }
			  else if (PartnerNo == 8)
			  {
				  AndroidXMLInt = R.array.message_4_8;
			  }
			  else if (PartnerNo == 9)
			  {
				  AndroidXMLInt = R.array.message_4_9;
			  }
			  		   
		   }
		   
		   else if (YourNo == 5)
		   {
			  if (PartnerNo == 1)
			  {
				  AndroidXMLInt = R.array.message_5_1;
			  }
			  else if (PartnerNo == 2)
			  {
				  AndroidXMLInt = R.array.message_5_2;
			  }
			  else if (PartnerNo == 3)
			  {
				  AndroidXMLInt = R.array.message_5_3;
			  }
			  else if (PartnerNo == 4)
			  {
				  AndroidXMLInt = R.array.message_5_4;
			  }
			  else if (PartnerNo == 5)
			  {
				  AndroidXMLInt = R.array.message_5_5;
			  }
			  else if (PartnerNo == 6)
			  {
				  AndroidXMLInt = R.array.message_5_6;
				  
			  }
			  else if (PartnerNo == 7)
			  {
				  AndroidXMLInt = R.array.message_5_7;
			  }
			  else if (PartnerNo == 8)
			  {
				  AndroidXMLInt = R.array.message_5_8;
			  }
			  else if (PartnerNo == 9)
			  {
				  AndroidXMLInt = R.array.message_5_9;
			  }
			  		   
		   }
		   
		   else if (YourNo == 6)
		   {
			  if (PartnerNo == 1)
			  {
				  AndroidXMLInt = R.array.message_6_1;
			  }
			  else if (PartnerNo == 2)
			  {
				  AndroidXMLInt = R.array.message_6_2;
			  }
			  else if (PartnerNo == 3)
			  {
				  AndroidXMLInt = R.array.message_6_3;
			  }
			  else if (PartnerNo == 4)
			  {
				  AndroidXMLInt = R.array.message_6_4;
			  }
			  else if (PartnerNo == 5)
			  {
				  AndroidXMLInt = R.array.message_6_5;
			  }
			  else if (PartnerNo == 6)
			  {
				  AndroidXMLInt = R.array.message_6_6;
			  }
			  else if (PartnerNo == 7)
			  {
				  AndroidXMLInt = R.array.message_6_7;
			  }
			  else if (PartnerNo == 8)
			  {
				  AndroidXMLInt = R.array.message_6_8;
			  }
			  else if (PartnerNo == 9)
			  {
				  AndroidXMLInt = R.array.message_6_9;
			  }
			  		   
		   }
		   
		   else if (YourNo == 7)
		   {
			  if (PartnerNo == 1)
			  {
				  AndroidXMLInt = R.array.message_7_1;
			  }
			  else if (PartnerNo == 2)
			  {
				  AndroidXMLInt = R.array.message_7_2;
			  }
			  else if (PartnerNo == 3)
			  {
				  AndroidXMLInt = R.array.message_7_3;
			  }
			  else if (PartnerNo == 4)
			  {
				  AndroidXMLInt = R.array.message_7_4;
			  }
			  else if (PartnerNo == 5)
			  {
				  AndroidXMLInt = R.array.message_7_5;
			  }
			  else if (PartnerNo == 6)
			  {
				  AndroidXMLInt = R.array.message_7_6;
			  }
			  else if (PartnerNo == 7)
			  {
				  AndroidXMLInt = R.array.message_7_7;
			  }
			  else if (PartnerNo == 8)
			  {
				  AndroidXMLInt = R.array.message_7_8;
			  }
			  else if (PartnerNo == 9)
			  {
				  AndroidXMLInt = R.array.message_7_9;
			  }
			  		   
		   }
		   
		   else if (YourNo == 8)
		   {
			  if (PartnerNo == 1)
			  {
				  AndroidXMLInt = R.array.message_8_1;
			  }
			  else if (PartnerNo == 2)
			  {
				  AndroidXMLInt = R.array.message_8_2;
			  }
			  else if (PartnerNo == 3)
			  {
				  AndroidXMLInt = R.array.message_8_3;
			  }
			  else if (PartnerNo == 4)
			  {
				  AndroidXMLInt = R.array.message_8_4;
			  }
			  else if (PartnerNo == 5)
			  {
				  AndroidXMLInt = R.array.message_8_5;
			  }
			  else if (PartnerNo == 6)
			  {
				  AndroidXMLInt = R.array.message_8_6;
			  }
			  else if (PartnerNo == 7)
			  {
				  AndroidXMLInt = R.array.message_8_7;
			  }
			  else if (PartnerNo == 8)
			  {
				  AndroidXMLInt = R.array.message_8_8;
			  }
			  else if (PartnerNo == 9)
			  {
				  AndroidXMLInt = R.array.message_8_9;
			  }
			  		   
		   }
		   
		   else if (YourNo == 9)
		   {
			  if (PartnerNo == 1)
			  {
				  AndroidXMLInt = R.array.message_9_1;
			  }
			  else if (PartnerNo == 2)
			  {
				  AndroidXMLInt = R.array.message_9_2;
			  }
			  else if (PartnerNo == 3)
			  {
				  AndroidXMLInt = R.array.message_9_3;
			  }
			  else if (PartnerNo == 4)
			  {
				  AndroidXMLInt = R.array.message_9_4;
			  }
			  else if (PartnerNo == 5)
			  {
				  AndroidXMLInt = R.array.message_9_5;
			  }
			  else if (PartnerNo == 6)
			  {
				  AndroidXMLInt = R.array.message_9_6;
			  }
			  else if (PartnerNo == 7)
			  {
				  AndroidXMLInt = R.array.message_9_7;
			  }
			  else if (PartnerNo == 8)
			  {
				  AndroidXMLInt = R.array.message_9_8;
			  }
			  else if (PartnerNo == 9)
			  {
				  AndroidXMLInt = R.array.message_9_9;
			  }
			  		   
		   }
		
		
		
		
		
		return AndroidXMLInt;
		
	
	}
	
	

}

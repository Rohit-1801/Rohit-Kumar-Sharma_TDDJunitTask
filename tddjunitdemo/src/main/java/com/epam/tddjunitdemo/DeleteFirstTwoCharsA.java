package com.epam.tddjunitdemo;

public class DeleteFirstTwoCharsA {

	public String delete(String string) {
		
		int stringLength=string.length();
		
		if(stringLength<2 && string.charAt(0)!='A' )
		{
			return(string);
		}
		
		if(stringLength==1 )
		{
			return("");
		}	
		
		if(string.charAt(0)=='A' && string.charAt(1)=='A')	
		{
			return(string.substring(2, string.length()));
		}
		
		else if(string.charAt(0)=='A')
		{
				return(string.substring(1));	
		}
		
		else if(string.charAt(1)=='A')
		{
			return(string.substring(0, 1) + string.substring(2));	
		}
		
		else
		{
			return(string.substring(0));
		}
	}	
}

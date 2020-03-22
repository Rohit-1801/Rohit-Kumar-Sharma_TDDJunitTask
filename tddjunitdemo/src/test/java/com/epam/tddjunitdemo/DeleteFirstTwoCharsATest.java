package com.epam.tddjunitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class DeleteFirstTwoCharsATest {

	
/*	 EX.	 "BA"    => ""      =>SUCCESS
			 "AA"    => ""		=>SUCCESS
	      	“ABCD” => “BCD”		=>SUCCESS
             “AACD” => “CD” 	=>SUCCESS
             “BACD” => “BCD”	=>SUCCESS
             “BBAA” => “BBAA”   =>SUCCESS   
             “AABAA” => “BAA”	=>SUCCESS
             "B"	=>  ""		=>SUCCESS
             "A"	=>  ""		=>SUCCESS
	 
	 */
	
	DeleteFirstTwoCharsA deleteFirstTwoCharsA ;
	
	@BeforeEach
	
	void setUp()
	{
		 deleteFirstTwoCharsA = new DeleteFirstTwoCharsA(); 
	}
	
	@Test
	void test2CharsA()
	{
		
		assertEquals("B",deleteFirstTwoCharsA.delete("BA"));
	}
	
	@Test
	void test2Chars()
	{
		
		assertEquals("",deleteFirstTwoCharsA.delete("AA"));
	}
	
	@Test
	void test4Chars()
	{
		
		assertEquals("BCD",deleteFirstTwoCharsA.delete("ABCD"));
	}

	@Test
	void test4CharsA()
	{
		
		assertEquals("CD",deleteFirstTwoCharsA.delete("AACD"));
	}
	
	@Test
	void test4AChars()
	{
		
		assertEquals("BCD",deleteFirstTwoCharsA.delete("BACD"));
	}
	
	@Test
	void test4BChars()
	{
		
		assertEquals("BBAA",deleteFirstTwoCharsA.delete("BBAA"));
	}
	
	
	
	@Test
	void testNChars()
	{
		
		assertEquals("BAA",deleteFirstTwoCharsA.delete("AABAA"));
	}
	
	@Test
	void test1Chars()
	{
		
		assertEquals("B",deleteFirstTwoCharsA.delete("B"));
	}
	
	@Test
	void test1CharsA()
	{
		
		assertEquals("",deleteFirstTwoCharsA.delete("A"));
	}


}

package com.cerner.tripletSum;
import static org.junit.Assert.*;
import org.junit.jupiter.api.Assertions;

import org.junit.Test;
public class tripletTest {

		@Test
		public void Actualtest() 
		{

			int a[]= {12,36,22,19,63};
			TripletSum ob=new TripletSum();
			assertEquals(1,ob.CheckPair(a, 31, 5));
		}

		@Test
		public void LengthZero()
		{
			int[] a= {};
			TripletSum ob=new TripletSum();
			assertEquals(1,ob.CheckPair(a,0,0));
		}
		@Test
		public void SumNotFoundTest()
		{
			int a[]= {12,36,22,21,63};
			TripletSum ob=new TripletSum();
			assertEquals(-1,ob.CheckPair(a, 31, 5));
		}

		@Test
		public void LengthLessThanZero()
		{
			int[] arr= {1,2,3};
			TripletSum ob=new TripletSum();
			ArrayIndexOutOfBoundsException ex=Assertions.assertThrows(ArrayIndexOutOfBoundsException.class,()->ob.CheckPair(arr,4,-1));
			assertEquals("Array should be within the Limits", ex.getMessage());
		}

		@Test
		public void LengthMoreThanSize()
		{
			int[] arr= {1,2,3};
			TripletSum ob=new TripletSum();
			ArrayIndexOutOfBoundsException ex=Assertions.assertThrows(ArrayIndexOutOfBoundsException.class,()->ob.CheckPair(arr,4,5));
			assertEquals("Array should be within the Limits", ex.getMessage());
		}

		
	}


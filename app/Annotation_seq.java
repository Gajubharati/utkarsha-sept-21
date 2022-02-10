package com.mycompany.app;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Annotation_seq {
	
	@Test
	public void a(){
		
		System.out.println("Hello");
	}
@Test
public void b() {
	System.out.println("Hello b");
	Assert.assertEquals(false, false);
	
}
}

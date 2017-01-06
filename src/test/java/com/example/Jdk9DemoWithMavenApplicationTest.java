package com.example;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

public class Jdk9DemoWithMavenApplicationTest {

	@Test
	public void contextLoads() {
		System.out.println(System.getProperties());
		Jdk9DemoWithMavenApplication.Message message = new Jdk9DemoWithMavenApplication.Message("Hello World !");
		Assert.assertThat(message.getText(), Is.is("Hello World !"));
	}

}

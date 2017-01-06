package com.example;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

public class Jdk9DemoWithMavenApplicationTest {

	@Test
	public void contextLoads() {
		Jdk9DemoWithMavenApplication.Message message = new Jdk9DemoWithMavenApplication.Message("test");
		Assert.assertThat(message.getText(), Is.is("test"));
	}

}

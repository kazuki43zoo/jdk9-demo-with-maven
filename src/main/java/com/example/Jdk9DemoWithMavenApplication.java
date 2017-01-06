package com.example;

public class Jdk9DemoWithMavenApplication {

	public static void main(String[] args) {
		Message message = new Message("Hello World !");
		System.out.println(message.getText());
		System.out.println(System.getProperties());
	}

	static class Message {
		private final String text;

		Message(String text) {
			this.text = text;
		}

		String getText() {
			return text;
		}
	}
}

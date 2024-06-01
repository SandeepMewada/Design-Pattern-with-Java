package com.in;



public class Client {

	
	//  java.text.NumberFormat.getInstance(); [Example of SimpleFactory Pattern]
	public static void main(String[] args) {
		Post post = PostFactory.createPost("news");
		System.out.println(post);

	}

}

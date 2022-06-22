package com.lessayer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;

public class Base64EncodeDecodePractice {
	
	public static void main(String... args) throws IOException {
		
		Base64.Encoder base64Encoder = Base64.getEncoder();
		Base64.Encoder base64MimeEncoder = Base64.getMimeEncoder();
		Base64.Encoder base64UrlEncoder = Base64.getUrlEncoder();
		Base64.Decoder base64Decoder = Base64.getDecoder();
		Base64.Decoder base64MimeDecoder = Base64.getMimeDecoder();
		Base64.Decoder base64UrlDecoder = Base64.getUrlDecoder();
		
		String exampleString = "This is a test string with symbols _ and +.";
		String urlString = "https://docs.oracle.com/javase/8/docs/technotes/guides/lang/enhancements.html#jdk8";
		byte[] imageBytes = Files.readAllBytes(Paths.get("src/com/lessayer/example.txt"));
		
		showBase64EncodeDecodeExample(exampleString.getBytes(), base64Encoder, base64Decoder);
		showBase64EncodeDecodeExample(urlString.getBytes(), base64UrlEncoder, base64UrlDecoder);
		showBase64EncodeDecodeExample(imageBytes, base64MimeEncoder, base64MimeDecoder);
		
	}
	
	public static void showBase64EncodeDecodeExample(byte[] src, Base64.Encoder encoder, Base64.Decoder decoder) {
		System.out.println("Before encode: ");
		System.out.println(new String(src));
		
		System.out.println("After encode:");
		byte[] encodedBytes = encoder.encode(src);
		System.out.println(new String(encodedBytes));
		
		System.out.println("After decode:");
		byte[] decodedBytes = decoder.decode(encodedBytes);
		System.out.println(new String(decodedBytes));
		
		System.out.println();
	}
	
}

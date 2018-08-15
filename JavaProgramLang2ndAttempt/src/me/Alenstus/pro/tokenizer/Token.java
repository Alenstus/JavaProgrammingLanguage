/**
 * This class contains the getter for tokens and the
 * getter for token type.
 * 
 * @version 1.0
 * @author Alenstus (Landon Whitworth)
 */
package me.Alenstus.pro.tokenizer;

public class Token {

	private String token;
	private TokenType type;
	
	public Token(String token, TokenType type) {
		this.token = token;
		this.type = type;
	}
	
	public String getToken() {
		return token;
	}
	
	public TokenType getType() {
		return type;
	}
}
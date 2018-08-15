package me.Alenstus.pro.parser;

//Imports
import me.Alenstus.pro.block.Class;
import me.Alenstus.pro.block.Block;
import me.Alenstus.pro.tokenizer.Tokenizer;

public class ClassParser extends Parser<Class> {
	
	@Override
	public boolean shouldParse(String line) {
		return line.matches("class [a-zA-Z][a-zA-Z0-9]*");
	}
	
	@Override
	public Class parse(Block superBlock, Tokenizer tokenizer) {
		tokenizer.nextToken(); //Skip the class token.
		
		String name = tokenizer.nextToken().getToken(); // Get the string value of the next token.
		
		return new Class(name);
	}

}
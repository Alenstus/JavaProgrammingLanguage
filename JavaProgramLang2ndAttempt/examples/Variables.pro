class Variables

	method main requires ()
		string str = getString()
		printString (str)
		
	method printString requires (string str) returns void
		print str
		
	method getString requires () returns string
		return "Hello"

public class Enigma {
	 public static String encode (String code){
		String encrypt = "";
		for(int x = 0; x < code.length() ; x++)
			if(x % 2 == 0){
				encrypt = encrypt + code.charAt(x);	
			}
			else {
				
				encrypt =  code.charAt(x) + encrypt;
			}
		encrypt = encrypt.replace( "a" , "ش" );
		encrypt = encrypt.replace( "e" , "ث" );
		encrypt = encrypt.replace( "i" , "ه" );
		encrypt = encrypt.replace( "o" , "خ" );
		encrypt = encrypt.replace( "u" , "ع" );
		encrypt = encrypt.replace( "A" , "ش" );
		encrypt = encrypt.replace( "E" , "ث" );
		encrypt = encrypt.replace( "I" , "ه" );
		encrypt = encrypt.replace( "O" , "خ" );
		encrypt = encrypt.replace( "U" , "ع" );
		encrypt = encrypt.replace( "n" , "ø" );
		encrypt = encrypt.replace( "s" , "å" );
		encrypt = encrypt.replace( "r" , "æ" );
		encrypt = encrypt.replace( "t" , "I LOVE TURTLES" );
		return encrypt;
	}
	public static String decrypt (String code){
		code = code.replace("I LOVE TURTLES" , "t" );
			String decrypt = "";
			int x = code.length() / 2; 
					decrypt += code.charAt(x);
			for(int z = 1; z < code.length(); z++){
				if(z % 2 == 0){
					decrypt += code.charAt(x+z);
					x = x + z;}
				else{
					decrypt += code.charAt(x-z);
					x = x - z;
				}
				decrypt = decrypt.replace( "ش" , "a" );
				decrypt = decrypt.replace( "ث" , "e" );
				decrypt = decrypt.replace( "ه" , "i" );
				decrypt = decrypt.replace( "خ" , "o" );
				decrypt = decrypt.replace( "ع" , "u" );
				decrypt = decrypt.replace( "ø" , "n" );
				decrypt = decrypt.replace( "å" , "s" );
				decrypt = decrypt.replace( "æ" , "r" );
			}
			return decrypt;
			
		}
}

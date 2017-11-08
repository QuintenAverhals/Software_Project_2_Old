package login;



import java.security.*;
import java.math.*;

public class SHA512 {	
	
	protected String hashString(String meegegevenString) throws Exception{
       String s= meegegevenString;
       MessageDigest m=MessageDigest.getInstance("SHA-512");
       m.update(s.getBytes(),0,s.length());
       return new BigInteger(1,m.digest()).toString(16);
       
    }
	
	public static void main(String[] args) throws Exception {
		SHA512 test = new SHA512();
		String password=test.hashString("traktor");
		System.out.println(password);
		System.out.println(test.hashString("traktor"));
	}
}
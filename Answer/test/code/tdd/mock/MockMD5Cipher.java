package code.tdd.mock;

public class MockMD5Cipher implements MD5Cipher {

	@Override
	public String encrypt(String source) {
		// TODO Auto-generated method stub
		//return null;
		return "bbbc4e2d59e4cc4551265439d14af969";
	}

	@Override
	public String decrypt(String source) {
		// TODO Auto-generated method stub
		//return null;
		return "!user01";
	}
	
	//  "potato"  암호값은  "8ee2027983915ec78acc45027d874316"
}

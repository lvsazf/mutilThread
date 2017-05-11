package justep.rancher.client.utils;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

import org.apache.commons.codec.binary.Base64;

public class EncrypRSA {
	
	protected byte[] encrypt(RSAPublicKey publicKey,byte[] srcBytes) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException{
		if(publicKey!=null){
			//Cipher负责完成加密或解密工作，基于RSA
			Cipher cipher = Cipher.getInstance("RSA");
			//根据公钥，对Cipher对象进行初始化
			cipher.init(Cipher.ENCRYPT_MODE, publicKey);
			byte[] resultBytes = cipher.doFinal(srcBytes);
			return resultBytes;
		}
		return null;
	}
	protected byte[] decrypt(RSAPrivateKey privateKey,byte[] srcBytes) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException{
		if(privateKey!=null){
			//Cipher负责完成加密或解密工作，基于RSA
			Cipher cipher = Cipher.getInstance("RSA");
			//根据公钥，对Cipher对象进行初始化
			cipher.init(Cipher.DECRYPT_MODE, privateKey);
			byte[] resultBytes = cipher.doFinal(srcBytes);
			return resultBytes;
		}
		return null;
	}
	
	public String encrypt(String msg,RSAPublicKey publicKey) throws InvalidKeyException, NoSuchAlgorithmException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException{
		Base64 base64 = new Base64();
		byte[] srcBytes = msg.getBytes();
		byte[] resultBytes = encrypt(publicKey, srcBytes);
		String result = base64.encodeToString(resultBytes);
		return result;
	}
	
	public String decrypt(String msg,RSAPrivateKey privateKey) throws InvalidKeyException, NoSuchAlgorithmException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException{
		Base64 base64 = new Base64();
		byte[] resultBytes=base64.decode(msg);
		byte[] decBytes = decrypt(privateKey, resultBytes);
		String result=new String(decBytes);
		return result;
	}
	
	public static void main(String[] args) throws NoSuchAlgorithmException, InvalidKeyException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException, UnsupportedEncodingException {
		EncrypRSA rsa = new EncrypRSA();
		String msg = "670100FAFE6D7F540A13:swxYzWdKPtcmvKtszDM6Rgy2VMhH8Ecv3RGCWDGn";
		KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("RSA");
		//初始化密钥对生成器，密钥大小为1024位
		keyPairGen.initialize(768);
		//生成一个密钥对，保存在keyPair中
		KeyPair keyPair = keyPairGen.generateKeyPair();
		//得到私钥
		RSAPrivateKey privateKey = (RSAPrivateKey)keyPair.getPrivate();				
		//得到公钥
		RSAPublicKey publicKey = (RSAPublicKey)keyPair.getPublic();
		
		System.out.println("明文是:" + msg);
		String result=rsa.encrypt(msg, publicKey);
		System.out.println("加密密文:" + result);
		System.out.println("原文是:" + rsa.decrypt(result,privateKey));
	}

}

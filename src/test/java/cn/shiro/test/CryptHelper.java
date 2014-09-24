package cn.shiro.test;

import org.apache.shiro.authc.credential.Sha256CredentialsMatcher;
import org.apache.shiro.crypto.hash.Sha1Hash;
import org.apache.shiro.crypto.hash.Sha256Hash;

import com.mysql.jdbc.authentication.Sha256PasswordPlugin;

public class CryptHelper {
	public static void main(String[] args) {
		String encrypt = new Sha256Hash("123456").toHex();
		System.out.println(encrypt);
	}
}	

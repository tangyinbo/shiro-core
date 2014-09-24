package cn.shiro.test;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;

public class ShiroInit01 {
	public static void main(String[] args) {
		// shiro security 工厂
		Factory<SecurityManager> factory = new IniSecurityManagerFactory("classpath:shiro01.ini");
		//获取securitymanager 对象
		SecurityManager securityManager = factory.getInstance();
		//登陆用户令牌
		UsernamePasswordToken token = new UsernamePasswordToken("admin", "123456");
		
		SecurityUtils.setSecurityManager(securityManager);
		
		Subject subject  = SecurityUtils.getSubject();
		
		subject.login(token);
		//是否有p1权限
		Boolean isPermitted=subject.isPermitted("p:aaa");
		
		System.out.println(isPermitted);

	}
}

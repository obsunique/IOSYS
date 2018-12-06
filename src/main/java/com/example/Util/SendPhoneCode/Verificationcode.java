package com.example.Util.SendPhoneCode;

import java.util.Random;

/*
 *验证码生成器
 * */
public class Verificationcode {
   public static String getVerificationcode(int i)
   {
	   Random r=new Random();
	   String code=null;
	   if(i==4)
	   {
		   code=1000+r.nextInt(8999)+"";
	   }
	   else{
		   code=100000+r.nextInt(899999)+"";
	   }
	   return code;
   }
}

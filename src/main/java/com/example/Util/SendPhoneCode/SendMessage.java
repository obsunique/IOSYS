package com.example.Util.SendPhoneCode;

public class SendMessage {
	public static String send(String phone) {
		String code = Verificationcode.getVerificationcode(6);
		IndustrySMS.setMessage(phone, code);
		IndustrySMS.execute();
		return code;
	}
}

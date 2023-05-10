package com.techgicus_Grp.util;

public interface EmailUtil {

	public void sendEmail(String to, String sub, String emailBody);

	public void sendEmailClient(String to, String sub, String emailBody);
}

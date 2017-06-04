package org.slsale.pojo.user;

import java.io.Serializable;

public class User implements Serializable {
		private String loginCode;
		private String password;
		private String password2;
		private String userName;
		public User(String loginCode, String password, String password2,
				String userName) {
			this.loginCode = loginCode;
			this.password = password;
			this.password2 = password2;
			this.userName = userName;
		}
		public User() {
		}
		public String getLoginCode() {
			return loginCode;
		}
		public void setLoginCode(String loginCode) {
			this.loginCode = loginCode;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getPassword2() {
			return password2;
		}
		public void setPassword2(String password2) {
			this.password2 = password2;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		@Override
		public String toString() {
			return "User [loginCode=" + loginCode + ", password=" + password
					+ ", password2=" + password2 + ", userName=" + userName
					+ "]";
		}
		

}

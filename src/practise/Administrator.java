package practise;

import java.util.Scanner;

public class Administrator {
	public String name;
	public String password;
	public Scanner scan = new Scanner(System.in);

	public void login() {

		String str, pass;

		System.out.println("请输入用户名：");
		str = scan.next();
		System.out.println("请输入密码：");
		pass = scan.next();
		if (name.equals(str) && password.equals(pass)) {
			this.changePsw();

		} else
			System.out.println("对不起你没有权限修改密码！");

		scan.close();

	}

	public void changePsw() {
		int count = 0;
		String str, pass;

		while (true) {
			count++;
			System.out.println("请输入新密码：");
			str = scan.next();
			System.out.println("请再次输入新密码：");
			pass = scan.next();

			if (str.equals(pass)) {
				System.out.println("修改密码成功，新密码为：" + pass);
				break;
			} else
				System.out.println("您两次密码输入不一致，请再次输入");

			if (count >= 3) {
				System.out.println("3次密码未修改成功请重新登录！");
				break;
			}

		}

	}

}

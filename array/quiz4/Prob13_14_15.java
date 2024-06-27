package array.quiz4;

public class Prob13_14_15 {
	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		boolean result = memberService.login("hong", "1234");
		if (result) {
			System.out.println("로그인 되었습니다.");
			memberService.logout("hong");
		} else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
	}
}

class Member {
    String name;
	String id;
	String password;
	int age;

	public Member(String name, String id) {
		this.name = name;
		this.id = id;
	}
}

class MemberService {
	public boolean login(String id, String password) {
		if (id.equals("hong") && password.equals("12345")) {
			return true;
		}

		return false;
	}

	public void logout(String id) {
		System.out.println(id + "님이 로그아웃 되었습니다.");
	}
}
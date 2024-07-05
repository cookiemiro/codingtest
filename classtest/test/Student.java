package classtest.test;

public class Student {
	private String name;
	private String subject;
	private int fee;
	private double returnFee;

	public Student(String name, String subject, int fee) {
		this.name = name;
		this.subject = subject;
		this.fee = fee;
	}

	public void calcReturnFee() {
		if (this.subject.equals("javaprogram")) {
			this.returnFee = this.fee * 0.25;
		} else if (this.subject.equals("jspprogram")) {
			this.returnFee = this.fee * 0.20;
		} else {
			System.out.println("그런 과정명은 없습니다.");
			System.exit(-1);
		}
	}

	public void print() {
		System.out.printf("%s 씨의 과정명은 %s 이고 교육비는 %d 이며 환급금은 %.2f 입니다.", this.name, this.subject, this.fee, this.returnFee);
	}

	public static void main(String args[]){
		Student stu = new Student("차은우", "jspprogram", 
				500000);
		stu.calcReturnFee();
		stu.print();
	}
}  
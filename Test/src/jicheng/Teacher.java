package jicheng;

public class Teacher {
	
	private String teacher_name;
	private String teacher_exp;
	private int teacher_age;
	
	
	

	public Teacher() {
		super();
	}

	

	public Teacher(String teacher_name, String teacher_exp, int teacher_age) {
		super();
		this.teacher_name = teacher_name;
		this.teacher_exp = teacher_exp;
		this.teacher_age = teacher_age;
	}


	public String getTeacher_name() {
		return teacher_name;
	}

	public void setTeacher_name(String teacher_name) {
		this.teacher_name = teacher_name;
	}

	public String getTeacher_exp() {
		return teacher_exp;
	}

	public void setTeacher_exp(String teacher_exp) {
		this.teacher_exp = teacher_exp;
	}

	public int getTeacher_age() {
		return teacher_age;
	}

	public void setTeacher_age(int teacher_age) {
		this.teacher_age = teacher_age;
	}

	
	
	protected void teacherLesson(){
		System.out.println("Teach lesson");
	}
	
	
}

package jicheng;

public class JavaTeacher extends Teacher {

	private String java_project;

	public JavaTeacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public JavaTeacher(String teacher_name, String teacher_exp, int teacher_age) {
		super(teacher_name, teacher_exp, teacher_age);
		// TODO Auto-generated constructor stub
	}

	public JavaTeacher(String teacher_name, String teacher_exp, int teacher_age, String java_project) {
		super(teacher_name, teacher_exp, teacher_age);
		// TODO Auto-generated constructor stub
		setJava_project(java_project);
	}

	

	public String getJava_project() {
		return java_project;
	}

	public void setJava_project(String java_project) {
		this.java_project = java_project;
	}

	@Override
	public void teacherLesson() {
		// TODO Auto-generated method stub
		super.teacherLesson();
		System.out.println("also teach javaproject");
	}

	public void speak() {
		System.out.println("speak");
	}
}

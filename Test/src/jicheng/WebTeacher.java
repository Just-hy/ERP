package jicheng;

public class WebTeacher extends Teacher {

	private String web_project;

	public WebTeacher() {
		super();
	}

	public WebTeacher(String teacher_name, String teacher_exp, int teacher_age) {
		super(teacher_name, teacher_exp, teacher_age);
	}

	public WebTeacher(String teacher_name, String teacher_exp, int teacher_age, String web_project) {
		super(teacher_name, teacher_exp, teacher_age);

	}

	public String getWeb_project() {
		return web_project;
	}

	public void setWeb_project(String web_project) {
		this.web_project = web_project;
	}
	
	public void teacherLesson(){
		super.teacherLesson();
		System.out.println("also teach webproject");
	}
	
}

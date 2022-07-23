package jicheng;

public class UiTeacher extends Teacher{
	private String ui_project;
	
	public UiTeacher(){
		super();
	}
	
	public UiTeacher(String teacher_name,String teacher_exp,int teacher_age,String ui_project){
		super(teacher_name, teacher_exp, teacher_age);
		
	}
	
	public String getUi_project(){
		return ui_project;
	}
	
	public void setUi_project(String ui_project){
		this.ui_project=ui_project;
	}
	
	
	
}

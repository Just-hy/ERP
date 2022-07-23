package jicheng;

public class TestTeacher {
	
	
	public static void main(String[] args) {
		Teacher teacher = new JavaTeacher("name", "exp", 30, "javava");
		//上课
		teacher.teacherLesson();
		//teacher.speak();  报错，基类没有speak方法
		JavaTeacher teacher1 = (JavaTeacher)teacher;
		teacher1.speak();
		
		System.out.println(teacher instanceof Teacher);
		System.out.println(teacher instanceof JavaTeacher);
		
		Teacher teacher2 = new Teacher();
		
		System.out.println(teacher2 instanceof Teacher);
		System.out.println(teacher2 instanceof JavaTeacher);
		
		System.out.println("--------------------------------------------");
		
		Teacher teacher3 = new UiTeacher();
		teacher3.teacherLesson();
	}
}

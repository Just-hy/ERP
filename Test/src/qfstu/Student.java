package qfstu;

public class Student {
	// ѧ������ ��Ա����
	String stuno;
	// ��������
	int stuage;
	// ��������
	String stuname;
	// �ɼ�����
	int score;

	public Student() {
		super();
	}

	public Student(String stuno, int stuage, String stuname) {
		super();
		this.stuno = stuno;
		this.stuage = stuage;
		this.stuname = stuname;
	}

	public Student(String stuno, int stuage, String stuname, int score) {
		super();
		setStuno(stuno);
		setStuage(stuage);
		setStuname(stuname);
		setScore(score);
	}

	public String getStuno() {
		return stuno;
	}

	public void setStuno(String stuno) {
		this.stuno = stuno;
	}

	public int getStuage() {
		return stuage;
	}

	public void setStuage(int stuage) {
		if (stuage >= 0 && stuage <= 100) {
			this.stuage = stuage;
		}else{
			this.stuage = 10;
			System.out.println("�����ʽ��Ĭ��10");
		}
	}

	public String getStuname() {
		return stuname;
	}

	public void setStuname(String stuname) {
		this.stuname = stuname;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		if (score >= 0 && score <= 100) {
			this.score = score;
		}else{
			this.score = 60;
			System.out.println("�ɼ���ʽ��Ĭ��60");
		}
	}
	
	public static void hhhSi(){
		
	}

	public static void main(String[] args) {
		Student.hhhSi();
		Student student = new Student("001",10,"zhangsan",999);
	}

}

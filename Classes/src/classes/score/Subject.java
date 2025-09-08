package classes.score;

public class Subject {
	//멤버변수 : 과목명, 점수
	private String subjectName;
	private int scorePoint;
	
	
	//기본생성자 생략
	//public Subject()
	
	//setter,getter
	
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	
	public String getSubjectName(){
		return subjectName;
	}
	
	
	
	
	public void setScorePoint(int scorePoint) {
		this.scorePoint = scorePoint;
	}
	
	public int getScorePoint() {
		return scorePoint;
	}
	

}

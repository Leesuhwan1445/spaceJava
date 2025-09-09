package classes.score2;

public class Main {
    public static void main(String [] args){
        Student lee = new Student(1001,"이수환");
        lee.addSubject("국어",90);
        lee.addSubject("수학",80);
        lee.addSubject("과학",70);

        lee.showInfo();
        
    }

}

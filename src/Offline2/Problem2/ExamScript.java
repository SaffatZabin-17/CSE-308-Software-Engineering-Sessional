package Offline2.Problem2;

public class ExamScript {
    int previousMark;
    int newMark;
    int studentID;

    public ExamScript(int previousMark, int newMark, int studentID){
        this.previousMark = previousMark;
        this.newMark = newMark;
        this.studentID = studentID;
    }

    public int getPreviousMark(){
        return this.previousMark;
    }
    public int getStudentID(){
        return this.studentID;
    }
}

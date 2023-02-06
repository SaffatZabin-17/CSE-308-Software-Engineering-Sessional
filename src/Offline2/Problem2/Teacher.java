package Offline2.Problem2;

import java.util.ArrayList;
import java.util.Random;

public class Teacher extends Client{

    private final Mediator mediator;
    private ArrayList<Student> numberList;
    private int studentCount;
    public Teacher(Mediator mediator, int clientID, int studentCount) {
        super(mediator, clientID);
        this.mediator = mediator;
        this.studentCount = studentCount;
    }
    public void setStudentCount(int studentCount){
        this.studentCount = studentCount;
    }
    public void setNumberList(ArrayList<Student> numberList){
        this.numberList = numberList;
    }
    @Override
    public void sendExamineRequest(int currentNumber, int clientID) {
        System.out.println("Invalid operation");
    }
    @Override
    public void replyToRequest(int previousNumber, int correctedNumber, int studentID) {
        System.out.println("From Teacher side: Re-examine request fulfilled. Reply sent to Exam controller for student ID: " + studentID);
        mediator.routeToStudent(previousNumber, correctedNumber, studentID);
    }
    public void publishResult(){
        Random random = new Random();
        System.out.println("From Teacher side: Result has been sent to Exam Controller for publishing");
        for(int i=0;i<studentCount;i++){
            numberList.get(i).setMark(random.nextInt(80));
        }
        mediator.publishResult(numberList);
    }
}

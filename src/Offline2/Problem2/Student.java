package Offline2.Problem2;

public class Student extends Client{

    private final Mediator mediator;
    int mark;
    public Student(Mediator mediator, int clientID) {
        super(mediator, clientID);
        this.mediator = mediator;
    }

    @Override
    public void sendExamineRequest(int currentNumber, int clientID) {
        System.out.println("============================================================================================");
        System.out.println("From Student side: Re-examine request sent to Exam controller from student ID: " + clientID);
        mediator.routeToTeacher(currentNumber, clientID);
    }

    @Override
    public void replyToRequest(int previousNumber, int correctedNumber, int studentID) {
        System.out.println("Invalid Operation");
    }
    public void setMark(int mark){
        this.mark = mark;
    }
    public int getMark(){
        return this.mark;
    }
}

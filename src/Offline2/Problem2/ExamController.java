package Offline2.Problem2;

import java.util.ArrayList;

public class ExamController implements Mediator{
    ArrayList<Client> studentRequestList;
    ArrayList<Student> studentList;
    ArrayList<ExamScript> requestList;
    ArrayList<ExamScript> replyList;
    public ExamController(){
        studentList = new ArrayList<>();
        requestList = new ArrayList<>();
        replyList = new ArrayList<>();
    }
    @Override
    public void routeToTeacher(int currentNumber, int studentID) {
        boolean newRequest = false;
        System.out.println("Exam Controller: Re-examine request received from student ID " + studentID);
        for(ExamScript e: requestList){
            if(e.studentID == studentID){
                System.out.println("Already one request has been sent");
            }
            else{
                newRequest = true;
            }
            break;
        }
        if(newRequest){
            ExamScript examScript = new ExamScript(currentNumber, currentNumber, studentID);
            requestList.add(examScript);
        }
    }

    @Override
    public void routeToStudent(int previousNumber, int correctedNumber, int studentID) {
        System.out.println("Exam Controller: Re-examine request fulfilled for student ID: " + studentID);
        System.out.println("Previous Mark: " + previousNumber + ", Current Mark: " + correctedNumber);
        System.out.println("============================================================================================");
        requestList.removeIf(e -> e.studentID == studentID);
    }

    @Override
    public void addStudent(Student client) {
        studentList.add(client);
    }

    @Override
    public void publishResult(ArrayList<Student> numberList){
        System.out.println("Publishing result from Exam Controller");
        for(int i=0;i<studentList.size();i++){
            System.out.println("Mark for student ID: " + studentList.get(i).getClientID() + ", Mark: " + numberList.get(i).getMark());
            studentList.get(i).setMark(numberList.get(i).getMark());
        }
    }
    public int getMark(int studentID){
        return studentList.get(studentID).getMark();
    }
}

package Offline2.Problem2;

import java.util.ArrayList;

public interface Mediator {
    void routeToTeacher(int currentNumber, int studentID);
    void routeToStudent(int previousNumber, int correctedNumber, int studentID);
    void addStudent(Student client);
    void publishResult(ArrayList<Student> numberList);
}

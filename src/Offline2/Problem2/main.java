package Offline2.Problem2;

import java.util.ArrayList;
import java.util.Random;

public class main {
    public static void main(String[] args) {
        int []a = new int[100];

        ExamController examController = new ExamController();
        ArrayList<Student> studentArrayList = new ArrayList<>();
        int studentCount = 5;
        for(int i=0;i<studentCount;i++){
            studentArrayList.add(new Student(examController, i+1));
        }
        for(int i=0;i<studentCount;i++){
            examController.addStudent(studentArrayList.get(i));
        }
        Teacher teacher = new Teacher(examController, 100, studentCount);
        teacher.setNumberList(studentArrayList);
        teacher.publishResult();
        for(int i=0;i<studentCount;i++){
            studentArrayList.get(i).setMark(examController.getMark(i));
        }

        Random random = new Random();

        for(int i=0;i<studentCount;i++){
            int x = random.nextInt(10);
            int y = random.nextInt();
            if(x >= 4){
                studentArrayList.get(i).sendExamineRequest(examController.getMark(i), i);
                int newNumber = examController.getMark(i)%5;
                teacher.replyToRequest(examController.getMark(i), examController.getMark(i) + newNumber, i);
                studentArrayList.get(i).setMark(examController.getMark(i) + newNumber);
            }
        }
        System.out.println("Finalized student mark: ");
        for(int i=0;i<studentCount;i++){
            System.out.println(studentArrayList.get(i).getMark());
        }
        //teacher.publishResult();
    }
}

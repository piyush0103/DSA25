package coder25.problemSolving1.mphasis;

import coder25.problemSolving1.mphasis.beans.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class AverageStudentMarks {
    public static void main(String[] args) {
        List<Student> studentList=new ArrayList<>();
        studentList.add(new Student("ALICE",80));
        studentList.add(new Student("DANA",810));
        studentList.add(new Student("CONOR",70));
        studentList.add(new Student("MIA",850));
        studentList.add(new Student("CONOR",12));
        studentList.add(new Student("CHARLES",80));
        studentList.add(new Student("ALICE",80));
Double averageHighest=getBestAverageScore(studentList);
        System.out.println(averageHighest);


    }

    private static Double getBestAverageScore(List<Student> studentList) {
        Map<String,Double> averageMarks0= studentList.stream().collect(Collectors.groupingBy(Student::name,Collectors.averagingDouble(Student::marks)));
        System.out.println(averageMarks0);

        Map<String,Double> averageMarks=  studentList.stream().map(s->s).collect(Collectors.groupingBy(s->s.name(), Collectors.averagingDouble(Student::marks)));


        String name=averageMarks.entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).get();
        Double value= averageMarks.entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getValue).get();
        return value;
    }
}

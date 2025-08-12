package coder25.problemSolving1.mphasis.beans;


import java.util.Objects;

public record Student(String name, double marks) {
    public Student {
        Objects.requireNonNull(name);
        Objects.requireNonNull(marks);
    }
}

package Lap8;

public class student {
    private int id;
    private String name;
    private double Exam_marks;

    public student(int id, String name, double Exam_marks) {
        this.id = id;
        this.name = name;
        this.Exam_marks = Exam_marks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getExam_marks() {
        return Exam_marks;
    }

    public void setExam_marks(double Exam_marks) {
        this.Exam_marks = Exam_marks;
    }

    @Override
    public String toString() {
        return "student{" + "id=" + id + ", name=" + name + ", Exam_marks=" + Exam_marks + '}';
    }
    
    
    
}
public class Student {
    private int rollNo;
    private String name;
    private String branch;
    private int marks;

    public Student(int rollNo, String name, String branch, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.branch = branch;
        this.marks = marks;
    }

    public int getRollNo() { return rollNo; }
    public String getName() { return name; }
    public String getBranch() { return branch; }
    public int getMarks() { return marks; }
}
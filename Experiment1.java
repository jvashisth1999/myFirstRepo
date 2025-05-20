class Student{
    String name;
    int rollNumber;
    int marks[];

    public Student(String name, int rollNumber, int[] marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Method to calculate total marks from the 'marks' array
    public int calculateTotalMarks() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    // Overloaded method to calculate total marks from three subjects
    public int calculateTotalMarks(int mark1, int mark2, int mark3) {
        return mark1 + mark2 + mark3;
    }

    // Method to display student details
    public void displayStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Total Marks: " + calculateTotalMarks());
    }

    public static void main(String[] args) {
        // Marks as an array
        int[] marksArray = {85, 90, 78};
        Student student1 = new Student("Ravi", 101, marksArray);
        student1.displayStudentInfo();

        // Using overloaded method with three parameters
        int total2 = student1.calculateTotalMarks(75, 80, 85);
        System.out.println("Total Marks using 3 parameters: " + total2);
    }
}

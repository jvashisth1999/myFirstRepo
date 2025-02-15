public class MultipleClasses {
    
    static class Student {
        private String name;
        private int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void displayStudent() {
            System.out.println("Student Name: " + name);
            System.out.println("Age: " + age);
        }
    }

    static class Course {
        private String courseName;
        private int duration; 

        public Course(String courseName, int duration) {
            this.courseName = courseName;
            this.duration = duration;
        }

        public void displayCourse() {
            System.out.println("Course Name: " + courseName);
            System.out.println("Duration: " + duration + " months");
        }
    }

    public static void main(String[] args) {
    
        Student student1 = new Student("Jyoti", 25);
        Student student2 = new Student("Komal", 22);

        Course course1 = new Course("Java Programming", 6);
        Course course2 = new Course("Web Development", 4);

        System.out.println("Student Details:");
        student1.displayStudent();
        student2.displayStudent();

        System.out.println("\nCourse Details:");
        course1.displayCourse();
        course2.displayCourse();
    }
}

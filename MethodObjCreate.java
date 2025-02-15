public class MethodObjCreate {
    public int age;
    public String name;

    // Correct constructor
    public MethodObjCreate() {
        name = "Komal";
        age = 22;
    }

    public static void main(String[] args) {
        // Method 1: Using the 'new' keyword
        MethodObjCreate stu = new MethodObjCreate();
        stu.age = 25;
        stu.name = "Jyoti";

        // Method 2: Using Reflection
        try {
            Class<?> c = Class.forName("MethodObjCreate");
            MethodObjCreate stu2 = (MethodObjCreate) c.getDeclaredConstructor().newInstance();

            System.out.println("Using Reflection:");
            System.out.println("Name: " + stu2.name);
            System.out.println("Age: " + stu2.age);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Printing details of stu using Method 1
        System.out.println("Using new keyword:");
        System.out.println("Name: " + stu.name);
        System.out.println("Age: " + stu.age);
    }
}

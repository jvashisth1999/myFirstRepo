class DefaultValues {
    byte a;
    short b;
    int c;
    long d;
    float e;
    double f;
    char g;
    boolean h;
    String i;
    Integer j;
    Double k;
    Boolean l;
    int[] m;

    public static void main(String[] args) {
        DefaultValue obj = new DefaultValue();

        System.out.println("Default values of primitive Data Types:");
        System.out.println("\nByte: " + obj.a);
        System.out.println("Short: " + obj.b);
        System.out.println("Int: " + obj.c);
        System.out.println("Long: " + obj.d);
        System.out.println("Float: " + obj.e);
        System.out.println("Double: " + obj.f);
        System.out.println("Char: [" + obj.g + "]");
        System.out.println("Boolean: " + obj.h);
        
        System.out.println("\nDefault values of non-primitive Data Types:");
        System.out.println("\nString: " + obj.i);
        System.out.println("Integer: " + obj.j);
        System.out.println("Double: " + obj.k);
        System.out.println("Boolean: " + obj.l);
        System.out.println("Array: " + obj.m);
    }
}

class DefaultValue {
    byte a;
    short b;
    int c;
    long d;
    float e;
    double f;
    char g;
    boolean h;
    String i;

    public static void main(String[] args) {
        DefaultValue obj = new DefaultValue();

        System.out.println("Default values of all Data Types in Java:");
        System.out.println("\nByte: " + obj.a);
        System.out.println("Short: " + obj.b);
        System.out.println("Int: " + obj.c);
        System.out.println("Long: " + obj.d);
        System.out.println("Float: " + obj.e);
        System.out.println("Double: " + obj.f);
        System.out.println("Char: [" + obj.g + "]");
        System.out.println("Boolean: " + obj.h);
        System.out.println("String: " + obj.h);
    }
}

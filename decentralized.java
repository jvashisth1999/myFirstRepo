class Example {
    String name;

    Example(String name) {
        this.name = name;
    }

    public Example decentralised(String newName) {
        return new Example(newName);
    }

    public void display() {
        System.out.println("Object Name: " + name);
    }

    public static void main(String[] args) {
        Example obj1 = new Example("Object1");

        Example obj2 = obj1.decentralised("Object2");
        Example obj3 = obj2.decentralised("Object3");
        Example obj4 = obj3.decentralised("Object4");

        obj1.display();
        obj2.display();
        obj3.display();
        obj4.display();
    }
}

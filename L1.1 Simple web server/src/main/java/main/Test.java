package main;

public class Test implements Comparable<Test> {
    private int a;
    private int b;

    public Test() {
    }

    public Test(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int compareTo(Test test) {
        return this.a == test.a ? 0 : this.a < this.b ? -1 : 1;
    }

    public static void main(String[] args) {
        Test test1 = new Test(10, 10);
        Test test2 = new Test(10, 5);
        System.out.println(test1.compareTo(test2));
    }
}

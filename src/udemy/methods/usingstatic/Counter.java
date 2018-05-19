package udemy.methods.usingstatic;

public class Counter {

    public static int count; // static
    public int anotherCount; // instance

    public Counter() {
        count++;
        anotherCount++;
    }

    public static void main(String[] args) {
        Counter one = new Counter(); // 1
        Counter two = new Counter(); // 2
        Counter three = new Counter(); // 3
        Counter four = new Counter();// 4

        // all prints will show 4
        System.out.println(count);
        System.out.println(one.count);
        System.out.println(two.count);
        System.out.println(three.count);
        System.out.println(four.count);

        count++;

        System.out.println(count);
        System.out.println(one.count);
        System.out.println(two.count);
        System.out.println(three.count);
        System.out.println(four.count);

        System.out.println(one.anotherCount);
        System.out.println(two.anotherCount);
        System.out.println(three.anotherCount);
        System.out.println(four.anotherCount);

        one.anotherCount = 2;
        two.anotherCount = 3;
        three.anotherCount = 4;
        four.anotherCount = 5;

        System.out.println(one.anotherCount);
        System.out.println(two.anotherCount);
        System.out.println(three.anotherCount);
        System.out.println(four.anotherCount);
    }
}

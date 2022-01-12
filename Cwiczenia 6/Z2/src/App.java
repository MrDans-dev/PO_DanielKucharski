public class App {
    public static void main(String[] args) throws Exception {
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();
        IntegerSet set3 = new IntegerSet();
        set1.insertElement(10);
        set1.insertElement(15);
        set1.insertElement(20);
        set2.insertElement(10);
        set2.insertElement(14);
        set2.insertElement(25);
        set3.insertElement(10);
        set3.insertElement(15);
        set3.insertElement(20);
        System.out.println(set1);
        System.out.println(set2);
        set2.deleteElement(14);
        System.out.println(set2);
        System.out.println(IntegerSet.union(set1, set2));
        System.out.println((IntegerSet.intersection(set1, set2)));
        System.out.println(set1.equals(set3));
        System.out.println(set1.equals(set2));
    }
}

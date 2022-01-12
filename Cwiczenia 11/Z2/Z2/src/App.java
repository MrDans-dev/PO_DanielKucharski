public class App {
    public static void main(String[] args) throws Exception {
        Pair p = new Pair<>();
        p.setFirst(5);
        p.setSecond(6);
        System.out.println(p.getFirst());
        System.out.println(p.getSecond());
        p.swap();
        System.out.println(p.getFirst());
        System.out.println(p.getSecond());
        PairUtil pu = new PairUtil();
        pu.swap(p);
        System.out.println(p.getFirst());
        System.out.println(p.getSecond());
    }
}

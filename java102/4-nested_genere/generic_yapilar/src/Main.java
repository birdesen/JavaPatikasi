public class Main {
    public static void main(String[] args) {

        // Undefined - tanımlanmamış
        String s;

        // null - tanımlama var ama içi boş
        String s1 = null;

        // empty - tanımlama var içi dolu ama aslen boş
        String s2 = "";


        String str = "1234";
        Nullable n = new Nullable(str);
        n.run();

        int i = 1234;
        NullableGeneric<Integer> t = new NullableGeneric<>(i);
        t.run();

        String[] arrS = {"S1", "S2", "S3"};
        Integer[] arrI = {1, 2, 3};
        Character[] arrC = {'A', 'B', 'C'};

        Print.printArray(arrS);
        Print.printArray(arrI);
        Print.printArray(arrC);

        Student<String> stu = new Student<>();
        stu.insert("ABC");



    }
}

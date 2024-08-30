import co.edu.uptc.structures.MyList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        MyList<Integer> list = new MyList<Integer>();

        list.add(20);
        list.add(6);
        list.add(9);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);
        list.add(17);

        MyList<Integer> sublist = (MyList<Integer>) list.subList(2, 6);
        
        System.out.println( sublist.Show());
        MyList<Integer> sublist2 = (MyList<Integer>) list.subList(6, 2);

        System.out.println(sublist2.Show());
        
    }
}

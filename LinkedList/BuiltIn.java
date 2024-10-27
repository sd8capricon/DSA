import java.util.LinkedList;

public class BuiltIn{
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<Integer>();

        list.add(10);
        list.add(19);
        list.add(67);
        list.add(2, 43);
        list.addLast(82);
        list.addFirst(4);
        
        System.out.println(list);
        System.out.println(list.get(1));
        System.out.println(list.contains(4));
        System.out.println(list.getFirst() + ", " + list.getLast());
    }
}
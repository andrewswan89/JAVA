package Sem4;

import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        // создаем очередь через linked list
        Queue<String> qu = new LinkedList<>();

        // добаление элементов
        qu.add("Robin");
        qu.add("Roy");
        qu.add("Stal");
        qu.add("Arnab");
        qu.add("Micheal");

        System.out.println("Queue : " + qu);

        
        String name = qu.remove();
        System.out.println("Removed from Queue : " + name + " | New Queue : " + qu);

        name = qu.poll();
        System.out.println("Removed from Queue : " + name + " | New Queue : " + qu);

        name=qu.peek();
        System.out.println("Removed from Queue : " + name + " | New Queue : " + qu);
    }
}

import java.util.PriorityQueue;

class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(2);
        pq.add(3);
        pq.add(4);
        pq.add(5);

        System.out.println(pq);

        System.out.println(pq.poll()); // poll first element and then remove first element
        System.out.println(pq);

        System.out.println(pq.peek()); // gives first element
        System.out.println(pq);

        System.out.println(pq.remove()); // removes first element
        System.out.println(pq);

    }

}

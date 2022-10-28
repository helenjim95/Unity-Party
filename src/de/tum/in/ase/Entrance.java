package de.tum.in.ase;

import java.util.*;

public class Entrance {

    private List<Student> queue;

    public Entrance() {
        queue = new LinkedList<>();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int getQueueLength() {
        return queue.size();
    }

    //TODO 2: Implement the enqueue method

    //TODO 3: Implement the dequeue method

    //TODO 4: Implement the toString method

    //TODO 5: Implement the sortQueue method

    public static void main(String[] args) {
        // Student student1 = new Student(19, "Wagner", new Ticket(true), true);
	    // Student student2 = new Student(21, "Lillard", new Ticket(false), false);
	    // Student student3 = new Student(29, "Ming", new Ticket(false), true);
	    // Entrance entrance = new Entrance();

        //TODO 6: Uncomment the lines above, enqueue all students and then print the Queue to console by using the toString method

        //TODO 7: Invoke the sortQueue method and print the Queue to console again

        //TODO 8: Dequeue all students
    }
}

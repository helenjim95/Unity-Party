package de.tum.in.ase;

import java.util.*;

public class Entrance {

    private List<Student> queue;

    public Entrance() {
        queue = new LinkedList<>();
    }

    public List<Student> getQueue() {
        return queue;
    }

    public void setQueue(List<Student> queue) {
        this.queue = queue;
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int getQueueLength() {
        return queue.size();
    }

    //Done: Implement the enqueue method
    public void enqueue(Student student) {
        queue.add(student);
    }

    //Done: Implement the dequeue method
    public Student dequeue() {
//        Create a dequeue method that simulates the admission (or denial) of a Student's entrance to the Unity Party.
//        The method should print if the student was admitted or not:
        //If the student has a ticket: "Entry was allowed for: {lastName}"
        //If the student doesn't have a ticket: "Entry was not allowed for: {lastName}"
        queue.sort(Comparator.comparingInt(student -> queue.indexOf(student)));
        Student student = queue.remove(0);
        if (student.getTicket().isValid()) {
            System.out.printf("Entry was allowed for: %s%n", student.getLastName());
        } else {
            System.out.printf("Entry was not allowed for: %s%n", student.getLastName());
        }
        return student;

    }

    //Done: Implement the toString method
//    Create a toString() method that prints all Students in the Queue like so: "{age} {lastName} has {valid | invalid} ticket \n"
//  Hint: Use the toString() method in Ticket.
    public String toString() {
        StringBuilder output = new StringBuilder();
        for (Student student : queue) {
            String isValid = student.getTicket().isValid()? "valid" : "invalid";
            output.append(String.format("%d %s has %s ticket\n", student.getAge(), student.getLastName(), isValid));
        }
        return output.toString();
    }

    //TODO 5: Implement the sortQueue method
//    The method allows organizers to get in front of the queue so that they don't have to wait long.
//    In the end all organizers should be in front of all other students in the queue.
//    (The order within organizers and non-organizers should stay the same)
    public void sortQueue() {
//        List<Student> sortedQueue = new LinkedList(queue);
        Comparator<Student> compareByOrganizer = Comparator.comparing(Student::isOrganizer).reversed();
        Comparator<Student> compareByIndex = Comparator.comparingInt(student -> queue.indexOf(student));
        queue.sort(Comparator.comparing(Student::isOrganizer).reversed().thenComparingInt(student -> queue.indexOf(student)));
//        for (int i = 0; i < queue.size() - 1; i++) {
//            Student student_current = queue.get(i);
//            Student student_next = queue.get(i + 1);
//            if (compareWithIsOrganizer(student_current, student_next) > 0) {
//                queue.put(i, student_next);
//            }
//        }
//        Collections.sort(queue, (Comparator.<Student>comparingInt(student -> student.isOrganizer())));
//        queue.stream().map(s -> s.isOrganizer()).forEach(Comparator.comparingBoolean);
    }

    public static void main(String[] args) {
         Student student1 = new Student(19, "Wagner", new Ticket(true), true);
	     Student student2 = new Student(21, "Lillard", new Ticket(false), false);
	     Student student3 = new Student(29, "Ming", new Ticket(false), true);
	     Entrance entrance = new Entrance();

        //TODO 6: Uncomment the lines above, enqueue all students and then print the Queue to console by using the toString method
        entrance.enqueue(student1);
        entrance.enqueue(student2);
        entrance.enqueue(student3);
        System.out.println(entrance.toString());
        //TODO 7: Invoke the sortQueue method and print the Queue to console again
//        for (Student student : entrance.getQueue()) {
//            System.out.println(student.getLastName() + student.isOrganizer());
//        }
        entrance.sortQueue();
//        for (Student student : entrance.getQueue()) {
//            System.out.println(student.getLastName() + student.isOrganizer());
//        }
        //TODO 8: Dequeue all students
        entrance.dequeue();
        entrance.dequeue();
        entrance.dequeue();
    }
}

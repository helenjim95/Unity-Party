package de.tum.in.ase;

public class Student {

    //TODO 1: Define variables with suitable datatypes, create a constructor and getter/setter methods for all variables
    private int age;
    private String lastName;
    private Ticket ticket;
    private boolean organizer;

    public Student(int age, String lastName, Ticket ticket, boolean organizer) {
        this.age = age;
        this.lastName = lastName;
        this.ticket = ticket;
        this.organizer = organizer;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Ticket hasTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public boolean isOrganizer() {
        return organizer;
    }

    public void setOrganizer(boolean organizer) {
        this.organizer = organizer;
    }
}
import java.util.ArrayList;

public class ReservationSystem {
    private ArrayList<Event>events;
    private ArrayList<Customer> customers;
    private double newPrice;

    public ReservationSystem() {
        events = new ArrayList<>();
        customers = new ArrayList<>();
    }
    public void addEvent(Event event) {
        events.add(event);
        System.out.println("Event added"+event);
    }
    public void addCustomer(Customer customer) {
        customers.add(customer);
        System.out.println("Customer added"+customer);
    }
    public void makeReservation(Customer customer, Event event) {
        customer.addReservation(event);
    }
    public Event findEvent(String name) {
        events.forEach(System.out::println);
        return null;
    }
    public void findCustomer(String name) {
        customers.forEach(System.out::println);
    }
    public void changeEventPrice(String name, double newPrice) {
        if (this.events.equals(name)) {
            this.newPrice = newPrice;
            System.out.println("Price for event '" + name + "' updated to $" + newPrice);
        } else {
            System.out.println("Event name does not match. Price update failed.");
        }

    }
}

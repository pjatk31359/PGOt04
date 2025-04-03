import java.util.ArrayList<Event>
public class Customer {
    String firstName;
    String lastName;
    String email;
    private ArrayList<Event> reservationLists;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Event> getReservationLists() {
        return reservationLists;
    }

    public void setReservationLists(ArrayList<Event> reservationLists) {
        this.reservationLists = reservationLists;
    }

    public Customer(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;


    }
}

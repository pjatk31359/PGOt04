public class Event {
    String name;
    String date;
    String location;
    int maxNumberOfSeats;
    int availableSeats;
    double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getMaxNumberOfSeats() {
        return maxNumberOfSeats;
    }

    public void setMaxNumberOfSeats(int maxNumberOfSeats) {
        this.maxNumberOfSeats = maxNumberOfSeats;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    Event(String name, double price) {
        this.name = name;
        this.price = price;
        this.date = date;
        this.location = location;
        this.maxNumberOfSeats = 100;
        this.availableSeats = 0;

    }
    @Override
    public String toString() {
        return "Event [name=" + name + ", date=" + date + ", location=" + location;

    }
    public void reserveSeats() {
        availableSeats--;
    }
}

public class Service {
    private String name;
    private String category;   // e.g. "Pharmacy", "Doctor", "Grocery"
    private String location;   // e.g. "MG Road, Bhopal"
    private boolean isOpen;

    public Service(String name, String category, String location, boolean isOpen) {
        this.name = name;
        this.category = category;
        this.location = location;
        this.isOpen = isOpen;
    }

    public String getName() { return name; }
    public String getCategory() { return category; }
    public String getLocation() { return location; }
    public boolean isOpen() { return isOpen; }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    @Override
    public String toString() {
        return name + " | " + category + " | " + location + " | " +
               (isOpen ? "OPEN" : "CLOSED");
    }
}

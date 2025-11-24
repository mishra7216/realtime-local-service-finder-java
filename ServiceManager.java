import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ServiceManager {
    private List<Service> services = new ArrayList<>();

    public ServiceManager() {
        // Pre-loaded sample data
        services.add(new Service("City Hospital", "Doctor", "Main Road", true));
        services.add(new Service("Sharma Medical Store", "Pharmacy", "Market Area", false));
        services.add(new Service("24x7 Grocery", "Grocery", "Bus Stand", true));
    }

    public List<Service> getAllServices() {
        return services;
    }

    public List<Service> searchByCategory(String category) {
        String catLower = category.toLowerCase();
        return services.stream()
                .filter(s -> s.getCategory().toLowerCase().contains(catLower))
                .collect(Collectors.toList());
    }

    public boolean updateStatus(String name, boolean isOpen) {
        for (Service s : services) {
            if (s.getName().equalsIgnoreCase(name)) {
                s.setOpen(isOpen);
                return true;
            }
        }
        return false;
    }
}

public class ServiceProvider {
    private String name;
    private String service;
    private String contact;

    public ServiceProvider(String name, String service, String contact) {
        this.name = name;
        this.service = service;
        this.contact = contact;
    }

    public String getName() { return name; }
    public String getService() { return service; }
    public String getContact() { return contact; }
}

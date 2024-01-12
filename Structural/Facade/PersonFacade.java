public class PersonFacade {
    private Name name;
    private Address address;
    public PersonFacade(String first, String last, String street, String city, String state, String zip) {
        name = new Name(first, last);
        address = new Address(street, city, state, zip);
    }
    public String toString() {
        return name.toString() + "\n" + address.toString();
    }
}
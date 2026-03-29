package basic.java16.recordClass;

public record User3(String name,int age) {

    public void printAddress(String city,String country) {
        record Address(String city,String country) {
            public String fullAddress() {
                return city+","+country;
            }
        }

        Address address = new Address(city,country);
        System.out.println(name+" "+age+" "+address.fullAddress());
    }
}

package CustomClassStatics;

public class Address {

    public int buildingNumber;
    public String street, city, state;
    public int zipCode;

    public static String country = "USA", planet = "Earth";

    public Address(int buildingNumber, String street, String city, String state, int zipCode) {
       this.buildingNumber = buildingNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }
    public String toString() {
        return buildingNumber+" "+street+"\n"+city+" "+state+", "+zipCode;
    }

}
/*
5. Address Task:
		1. Create a class named Address:
		    Attributes:
		        instance:  street, city, state, zipCode;
		        static: country, planet
	        Add a constructor that can set All the fields (instances)
		    Actions
		            toString: returns the address
		                        EX:
		                            7925 Jones Branch Dr
		                            McLean Va, 22012
 */
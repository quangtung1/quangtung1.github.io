package BBt;

public class Person {
    
    @Override
    public String toString() {
        return id +" - "+ firstName + " - "+ lastName + " - "+ gender + " - "+ country + " - "+ dateOfBirth;
    }
    //id, first_name, last_name, gender, dateOfBirth, country
    Long id;
    String firstName;
    String lastName;
    String gender;
    String country;
    String dateOfBirth;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
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
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public Person(Long id, String firstName, String lastName, String gender, String country, String dateOfBirth) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.country = country;
        this.dateOfBirth = dateOfBirth;
    }

}

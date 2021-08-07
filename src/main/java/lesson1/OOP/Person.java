package lesson1.OOP;

public class Person {

    private String firstName;
    private String lastName;
    private String middleName;
    private String country;
    private String address;
    private String phone;
    private Integer age;
    private String gender;

    private Person() {
        // private constructor
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getCountry() {
        return country;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public Integer getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }


    public static Builder newBuilder(String firstName, String lastName) {
        return new Person().new Builder(firstName, lastName);
    }

    public class Builder {

        private Builder(String firstName, String lastName) {
            Person.this.firstName = firstName;
            Person.this.lastName = lastName;
        }

        public Builder setFirstName(String firstName) {
            Person.this.firstName = firstName;

            return this;
        }

        public Builder setLastName(String lastName) {
            Person.this.lastName = lastName;

            return this;
        }

        public Builder setMiddleName(String middleName) {
            Person.this.middleName = middleName;

            return this;
        }

        public Builder setCountry(String country) {
            Person.this.country = country;

            return this;
        }

        public Builder setAddress(String address) {
            Person.this.address = address;

            return this;
        }

        public Builder setPhone(String phone) {
            Person.this.phone = phone;

            return this;
        }

        public Builder setAge(Integer age) {
            Person.this.age = age;

            return this;
        }

        public Builder setGender(String gender) {
            Person.this.gender = gender;

            return this;
        }

        public Person build() {
            return Person.this;
        }

    }

}
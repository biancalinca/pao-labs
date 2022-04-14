package classes;


    public class Librarian {
        int age;
        long phone_nr;
        String name;
        String address;
        String email;

        public Librarian() {
        }

        public Librarian(int age, long phone_nr, String name, String address, String email) {
            this.age = age;
            this.phone_nr = phone_nr;
            this.name = name;
            this.address = address;
            this.email = email;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public long getPhone_nr() {
            return phone_nr;
        }

        public void setPhone_nr(long phone_nr) {
            this.phone_nr = phone_nr;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

    }


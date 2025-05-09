public class encaps {
    public static void main(String[] args) {
        woo2 woo = new woo2("Nivedhan",29,"Otteri","93452567809");
        System.out.println("the current age: "+woo.getAge());
        woo.setAge(15);
        System.out.println("Age after setting: "+woo.getAge());

        }   
    }
    class woo2{
        private String name;
        private int age;
        private String address;
        private String phno;

        woo2(String name,int age,String address,String phno){
            this.name = name;
            this.age = age;
            this.address = address;
            this.phno = phno;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            if(age<18){
                System.out.println("Age is invalid...cannot set value");
            }
            else{
                this.age = age;
            }
        }
        public String getAddress() {
            return address;
        }
        public void setAddress(String address) {
            this.address = address;
        }
        public String getPhno() {
            return phno;
        }
        public void setPhno(String phno) {
            this.phno = phno;
        }

        
    }
     

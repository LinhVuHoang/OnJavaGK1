package School;

import java.util.Scanner;

public class Teacher {
    private int code;
    private String name;
    private String address;
    private String phone;

    public Teacher() {
        code = 0;
        name ="";
        address ="";
        phone = "";
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void getTeacherInfo(){
        System.out.println("The details about the teacher are: ");
        System.out.println("Code:" + code);
        System.out.println("Address: "+address);
        System.out.println("Phone Number: "+phone);
    }
    public void setTeacherInfo(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter details about the teacher: ");
        System.out.println("Enter the teacher's code: ");
        code = s.nextInt();
        s.nextLine();
        System.out.println("Enter name: ");
        name = s.nextLine();
        System.out.println("Enter address: ");
        address = s.nextLine();
        System.out.println("Enter phone number: ");
        phone = s.nextLine();
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien(1,"Hoang Vu Linh",10,10);
        SinhVien sv2 = new SinhVien();
        SinhVien sv3 = new SinhVien();
        System.out.println(sv1.toString());
        System.out.println(sv1.DiemTB());
        Scanner s = new Scanner(System.in);
        System.out.println("MaSV: ");
        sv2.setMaSV(s.nextInt());
        s.nextLine();
        System.out.println("TenSV: ");
        sv2.setTenSV(s.nextLine());
        System.out.println("DiemLT: ");
        sv2.setDiemLT(s.nextFloat());
        System.out.println("DiemTH: ");
        sv2.setDiemtTH(s.nextFloat());
        System.out.println(sv2.toString());
        System.out.println(sv2.DiemTB());

    }
}

public class SinhVien {
    private  int maSV;
    private String tenSV;
    private  float diemLT,diemtTH;

    public SinhVien(int maSV, String tenSV, float diemLT, float diemtTH) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.diemLT = diemLT;
        this.diemtTH = diemtTH;
    }

    public SinhVien() {
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public float getDiemLT() {
        return diemLT;
    }

    public void setDiemLT(float diemLT) {
        this.diemLT = diemLT;
    }

    public float getDiemtTH() {
        return diemtTH;
    }

    public void setDiemtTH(float diemtTH) {
        this.diemtTH = diemtTH;
    }

    public float DiemTB(){
        return (this.diemLT + this.diemtTH )/2;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "maSV=" + maSV +
                ", tenSV='" + tenSV + '\'' +
                ", diemLT=" + diemLT +
                ", diemtTH=" + diemtTH +
                '}';
    }

}

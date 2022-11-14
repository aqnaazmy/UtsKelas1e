import java.util.Scanner;

public class jawabanNoTiga {

    static int jumToplevel =0;
    static int jumMiddlelevel =0;
    static int jumRegulerStaff =0;
    static int jumStaff =0;

    static boolean success = false;

    static void cekNIKStaff(String nik){
        if (nik.length()<=10) {
            if (nik.contains("C01")) {
                success = true;
                jumToplevel++;
            } else if (nik.contains("J02")) {
                success = true;
                jumMiddlelevel++;
            } else if (nik.contains("N03")) {
                success = true;
                jumRegulerStaff++;
            } else if (nik.contains("P04")) {
                success = true;
                jumStaff++;
            } else {
                success = false;
                System.out.println("GAGAL, NIK anda tidak terdaftar");
            }
        }else {
            success = false;
            System.out.println("GAGAL, pastikan nik yang anda masukan benar");
        }
    }

    static void Nik(){

        Scanner inputRegristrasi = new Scanner(System.in);
        System.out.println("Masukan Nik Untuk Registrasi");
        String nik =  inputRegristrasi.nextLine();
        cekNIKStaff(nik);
        if (success){
            printResult();
        }
    }
    static void printResult(){
        System.out.println("jumlah peserta bus 01-Toplevel ="+jumToplevel);
        System.out.println("jumlah peserta bus 02-Middlelevel="+jumMiddlelevel);
        System.out.println("jumlah peserta bus 03-RegulerStaff="+jumRegulerStaff);
        System.out.println("jumlah peserta bus 04-Staff="+jumStaff);
        System.out.println();
    }


    public static void main(String[] args) {
        while (true){
            jawabanNoTiga.Nik();
        }
    }
}


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("Selamat Datang di Sistem Informasi Akademik");
        System.out.println("========================================\n");

        // Input data mahasiswa
        System.out.println("Silakan Masukkan Data Mahasiswa:");
        System.out.print("Nama Mahasiswa: ");
        String namaMahasiswa = scanner.nextLine();
        System.out.print("NIM Mahasiswa: ");
        String nimMahasiswa = scanner.nextLine();

        Mahasiswa mahasiswa = new Mahasiswa(namaMahasiswa, nimMahasiswa);

        // Input data dosen
        System.out.println("\nSilakan Masukkan Data Dosen:");
        System.out.print("Nama Dosen: ");
        String namaDosen = scanner.nextLine();
        System.out.print("ID Dosen: ");
        String idDosen = scanner.nextLine();

        Dosen dosen = new Dosen(namaDosen, idDosen);

        // Input data mata kuliah
        System.out.println("\nSilakan Masukkan Data Mata Kuliah:");
        System.out.print("Nama Mata Kuliah: ");
        String namaMatkul = scanner.nextLine();
        System.out.print("Kode Mata Kuliah: ");
        String kodeMatkul = scanner.nextLine();

        MataKuliah matkul = new MataKuliah(namaMatkul, kodeMatkul);

        // Menampilkan informasi yang telah dimasukkan
        System.out.println("\n====================");
        System.out.println("Data yang Telah Dimasukkan:");
        System.out.println("====================");

        System.out.println("Data Mahasiswa:");
        System.out.println("Nama: " + mahasiswa.getNama());
        System.out.println("NIM: " + mahasiswa.getNim());

        System.out.println("\nData Dosen:");
        System.out.println("Nama: " + dosen.getNama());
        System.out.println("ID: " + dosen.getId());

        System.out.println("\nData Mata Kuliah:");
        System.out.println("Nama: " + matkul.getNama());
        System.out.println("Kode: " + matkul.getKode());

        System.out.println("\nTerima kasih telah menggunakan Sistem Informasi Akademik!");
    }
}

class Mahasiswa {
    private String nama;
    private String nim;

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }
}

class Dosen {
    private String nama;
    private String id;

    public Dosen(String nama, String id) {
        this.nama = nama;
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public String getId() {
        return id;
    }
}

class MataKuliah {
    private String nama;
    private String kode;

    public MataKuliah(String nama, String kode) {
        this.nama = nama;
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public String getKode() {
        return kode;
    }
}

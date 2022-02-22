package inheritanceLatihan;
    public class anak extends ayah{
        double nilaimax=99.9;
        String nama="Dina";
        int age = 17;

        public void setNama(String nama) {
            this.nama = nama;
        }

        public void Cetak(){
            System.out.println("Anak ini memiliki sifat "+super.Sifat);
            System.out.println("yang bernama "+nama);
            System.out.println("berumur "+age+"tahun");
            System.out.println("dengan tinggi Badan "+super.TB);
            super.hobbi();
        }
    }



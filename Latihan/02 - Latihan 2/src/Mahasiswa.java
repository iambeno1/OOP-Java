public class Mahasiswa {
    float UTS;
    float UAS;
    float Tugas;
    float IPS;
    String prodi;

    float hitungNilai(){
        IPS = 0.2f * (UAS + UTS + Tugas);
        return IPS;
    }

    float rataRata(float UTS, float UAS, float Tugas){
        return (UTS + UAS + Tugas) / 3;
    }
}

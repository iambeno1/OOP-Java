public class Main {

    public static void main(String[] args) {
        Mahasiswa[] mhsArray = new Mahasiswa[10];

        mhsArray[0] = new Mahasiswa("105222002", "Benony Gabriel", "Maluku Barat Daya");
        mhsArray[1] = new Mahasiswa("105222003", "Rian Lot", "Bandung");
        mhsArray[2] = new Mahasiswa("105222004", "Jhon Doe", "Bandung");
        mhsArray[3] = new Mahasiswa("105222004", "Jhon Doe", null);

        mhsArray[0].display();
        mhsArray[1].display();
        mhsArray[2].display();
        mhsArray[3].display();

        Mahasiswa findMahasiswaNIM = Mahasiswa.cariNIM("105222002", mhsArray);

        if(findMahasiswaNIM != null){
            System.out.println("Mahasiswa ditemukan");
            findMahasiswaNIM.display();
        }else{
            System.out.println("Mahasiswa tidak ditemukan!");
        }

        Mahasiswa[] findMahasiswaAsal = Mahasiswa.cariAsalDaerah("Bandung", mhsArray);

        if(findMahasiswaAsal != null){
            System.out.println("Mahasiswa ditemukan");
            for(Mahasiswa mhs : findMahasiswaAsal){
                mhs.display();
            }
        }else{
            System.out.println("Mahasiswa tidak ditemukan!");
        }
    }
}

class Mahasiswa {
    private String NIM;
    private String nama;
    private String asalDaerah;

    public Mahasiswa(){}

    public Mahasiswa(String NIM, String nama, String asalDaerah){
        this.NIM = NIM;
        this.nama = nama;
        this.asalDaerah = asalDaerah;
    }

    public void display(){
        System.out.println("Nama\t\t: " + nama);
        System.out.println("NIM\t\t: " + NIM);
        System.out.println("Asal\t\t: " + asalDaerah + "\n");
    }

    public String getNIM(){
        return NIM;
    }

    public String getAsalDaerah(){
        return asalDaerah;
    }

    public static Mahasiswa cariNIM(String NIM, Mahasiswa[] mhsArray){
        for(Mahasiswa mhs : mhsArray){
            if(mhs != null && mhs.getNIM().equals(NIM)){
                return mhs;
            }
        }
        return null;
    }

    public static Mahasiswa[] cariAsalDaerah(String asalDaerah, Mahasiswa[] mhsArray){
        Mahasiswa[] result = new Mahasiswa[mhsArray.length];
        int count = 0;
        for(Mahasiswa mhs : mhsArray){
            if( mhs != null && mhs.getAsalDaerah().equals(asalDaerah)){
                result[count] = mhs;
                count++;
            }
        }
        if(count == 0){
            return null;
        }

        Mahasiswa[] finalResult = new Mahasiswa[count];
        System.arraycopy(result, 0, finalResult, 0, count);
        return finalResult;
    }
}

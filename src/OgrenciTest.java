public class OgrenciTest {
    public static void main(String[] args) {
        //javada obje oluşturma bu şekilde
        Ogrenci ogr = new Ogrenci();

        ogr.setNo(1);
        ogr.setAd("Aziz");
        ogr.setSoyad("sancar");
        ogr.setDogumYeri("Mardin");
        ogr.setHarc(1500);


        System.out.println(ogr.getNo() + "-" + ogr.getAd() + " " +
                           ogr.getSoyad() + " "+ogr.getHarc());
        ogr.setHarc(2000);

        System.out.println(ogr.getNo() + "-" + ogr.getAd() + " " +
                ogr.getSoyad() + " "+ogr.getHarc());
        ogr.setHarc(-500);

        System.out.println(ogr.getNo() + "-" + ogr.getAd() + " " +
                ogr.getSoyad() + " "+ogr.getHarc());


        Ogrenci ogr2 = new Ogrenci(2, "Tanju", "Çolak", "Samsun", 3000);

        System.out.println(ogr2);




    }
}

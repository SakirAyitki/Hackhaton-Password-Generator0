import java.util.Locale;
import java.util.Scanner;

public class Hackhaton0 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        /* Proje icinde kullanilacak bazi tanimlar yapildi */
        String cRandom1, cRandom2,cRandom3,cRandom4, name;
        char nameRandom1, nameRandom2, nameRandom3, nameRandom4;
        int num1, num2;

        /* Onceden tanimlanmis Num1 ve Num2 degiskenlerine random degerler atama islemi  */
        num1 = (int) Math.ceil(Math.random() * 9);
        num2 = (int) Math.floor(Math.random() * 10);

        /* Ozel karakterler icin dizi olusturuldu ve dizinin uzunlugu bir degiskene atandı */
        String character0[] = {"!", ">", "^", "#", "$", "+", "%", "&", "*", "|", "=", "~", "é", "<", "-", "/", "_", "}", "{", ".", ";", ",", ":"};
        int chLen0 = character0.length;

        /* Tanimlanan diziden rastgele iki adet deger cRandom1 ve cRandom2 degiskenlerine atandi */
        cRandom1 = character0[(int) (Math.floor(Math.random() * chLen0))];
        cRandom2 = character0[(int) (Math.floor(Math.random() * chLen0))];
        cRandom3 = character0[(int) (Math.floor(Math.random() * chLen0))];
        cRandom4 = character0[(int) (Math.floor(Math.random() * chLen0))];

        /* Kullanicidam isim degeri alindi ve name degiskenine atandi */
        System.out.print("Enter Your Name(If You Want Enter Surname Write Without Spaces):");
        name = scanner.nextLine().toLowerCase(Locale.ROOT);

        /* Isim uzunlugu nameLen degiskenine atandi */
        int nameLen = name.length();

        /* Isimden rastgele secilen harflerin atamasi yapildi */
        nameRandom1 = name.charAt((char) Math.floor(Math.random() * nameLen));
        nameRandom2 = name.charAt((char) Math.floor(Math.random() * nameLen));
        nameRandom3 = name.charAt((char) Math.floor(Math.random() * nameLen));
        nameRandom4 = name.charAt((char) Math.floor(Math.random() * nameLen));

        /*Butuk harf tanimlamaj icin nameRandom1 ve nameRandom3 string degiskenine cevirildi sonrasında buyuk harf yapildilar */
        String upperCase1 = String.valueOf(nameRandom3).toUpperCase(Locale.ROOT);
        String upperCase2 = String.valueOf(nameRandom1).toUpperCase(Locale.ROOT);


        /* Sifre Olusturma islemi gerceklestirildi */
        String password = cRandom1 + cRandom2 + upperCase1 + nameRandom2 + num1 + num2 + upperCase2 + nameRandom4 + cRandom3 + cRandom4;
        System.out.println("Password Is Created: " + password);

    }
}

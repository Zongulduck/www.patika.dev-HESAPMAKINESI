import java.util.Scanner;
public class HESAPMAK {
    public static void main(String[]args){

        Scanner input= new Scanner(System.in);
        int m;
        double n1,n2,sonuc;
        System.out.println("İstediğiniz işlemin numarasını giriniz;");
        System.out.println("Toplama/1 - Çıkarma/2 - Çarpma/3 - Bölme/4 ");
        m= input.nextInt();
        switch(m){
            case 1:
                System.out.println("toplamayı işlemini seçtiniz");
                System.out.println("ilk sayıyı giriniz");
                n1= input.nextDouble();
                System.out.println("ikinci sayıyı giriniz");
                n2= input.nextDouble();
                sonuc=(n1+n2);
                System.out.println("sonuç: "+sonuc);
                break;
            case 2:
                System.out.println("çıkarmayı seçtiniz");
                System.out.println("ilk sayıyı giriniz");
                n1=input.nextDouble();
                System.out.println("ikinci sayıyı giriniz");
                n2=input.nextDouble();
                sonuc=(n1-n2);
                System.out.println("sonuç: "+sonuc);
                break;
            case 3:
                System.out.println("Çarpmayı seçtiniz.");
                System.out.println("ilk sayıyı giriniz:");
                n1=input.nextDouble();
                System.out.println("ikinci sayıyı giriniz:");
                n2=input.nextDouble();
                sonuc=(n1*n2);
                System.out.println("sonuc: "+sonuc);
                break;
            case 4:
                System.out.println("bölmeyi seçtiniz");
                System.out.println("ilk sayıyı giriniz");
                n1=input.nextDouble();
                System.out.println("ikinci sayıyı giriniz");
                n2=input.nextDouble();
                sonuc=(n1/n2);
                System.out.println("sonuc: "+sonuc);
            default:
                System.out.println("hatalı giriş yaptınız yeniden başlatın!!");
                break;
        }
    }
}

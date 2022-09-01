import java.util.Scanner;

public class ATM {
    public ATM() {
        String userName, password,uN,pW;
        uN = "admin";
        pW = "admin";
        int hak=3;
        int balance = 1500;
        int select;
        boolean isLogin = false;
        Scanner input = new Scanner(System.in);
        System.out.print("Kullanici Adinizi Giriniz: ");
        userName = input.nextLine();
        System.out.print("Sifrenizi Giriniz: ");
        password = input.nextLine();
        while(hak>0){
            if(userName.equals(uN) && password.equals(pW)){
                isLogin = true;
                break;
            }
            else{
               
                System.out.println("Kullanici Adiniz veya Sifreniz Yanlis Kalan Hakkınız:"+hak);
                hak--;
                System.out.print("Kullanici Adinizi Giriniz: ");
                userName = input.nextLine();
                System.out.print("Sifrenizi Giriniz: ");
                password = input.nextLine();
            }
        }
        if(hak<=0||isLogin==false){
            System.out.println("Hakkınız Bitti");
        }
        while(isLogin){
            System.out.println("1.Bakiye Sorgulama");
            System.out.println("2.Para Yatirma");
            System.out.println("3.Para Cekme");
            System.out.println("4.Cikis");
            System.out.print("Seciminizi Giriniz: ");
            select = input.nextInt();
            switch(select){
                case 1:
                    System.out.println("Bakiyeniz: "+balance);
                    break;
                case 2:
                    System.out.print("Yatirmak istediginiz miktar: ");
                    int yatir = input.nextInt();
                    balance += yatir;
                    System.out.println("Yeni Bakiyeniz: "+balance);
                    break;
                case 3:
                    System.out.print("Cekmek istediginiz miktar: ");
                    int cek = input.nextInt();
                    if(balance>=cek){
                        balance -= cek;
                        System.out.println("Yeni Bakiyeniz: "+balance);
                    }
                    else{
                        System.out.println("Yeterli Bakiye Bulunmamaktadir");
                    }
                    break;
                case 4:
                    isLogin = false;
                    break;
                default:
                    System.out.println("Yanlis Secim Yaptiniz");
                    break;
            }
        }
        input.close();
        
       

       

        
        
        
    }
}
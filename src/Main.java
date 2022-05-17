import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	String username,password,answer,newPassword1,newPassword2;
	Scanner input=new Scanner(System.in);
        System.out.print("Kullanıcı Adınızı Giriniz : ");
        username=input.nextLine();
        System.out.print("Şifrenizi Giriniz : ");
        password=input.nextLine();

        if(username.equals("admin") && password.equals("123")){
            System.out.println("Giriş Başarılı");
        }
        else{
            System.out.println("Giriş Başarısız");
            System.out.println("Kullaıcı Adınızı veya Şifrenizi Hatalı Girdiniz Şifre Bilginizi Değiştirmek istermisiniz ? (E/H)");
            answer=input.nextLine();
            if(answer.equals("E")||answer.equals("e")){
                System.out.println("Yeni şifrenizi Giriniz : ");
                newPassword1=input.nextLine();
                System.out.println("Yeni şifrenizi Tekrar Giriniz : ");
                newPassword2=input.nextLine();
                if(newPassword1=="123"){
                    System.out.println("Şifreniz Eski Şifreniz ile Aynı Olamaz Lütfen Başka Şifre Oluşturunuz");
                }
                else{
                    if(newPassword1.equals(newPassword2)&&username.equals("admin") ){
                        System.out.println("Şifrenizi Değiştirme İşlemi Başarılı. Kullanıcı Adınız ve Yeni Şifreniz İle Giriş Yapınız");
                    }
                    else{
                        System.out.println("Şifrenizi Değiştirme İşlemi Başarısız");
                    }
                }

            }else{
                System.out.println("Şifre Değiştirme İşlemi Yapılmadı");
            }

        }

    }
}

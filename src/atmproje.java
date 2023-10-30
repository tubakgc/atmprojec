import java.util.Scanner;

public class atmproje {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;

        while(right > 0) {
            System.out.print("kullanıcı adını giriniz:");
            String usurName = input.nextLine();
            System.out.print("şifrenizi giriniz:");
            String password = input.nextLine();
            if (usurName.equals("patika") && password.equals("1234")) {
                System.out.println("bankamıza hoş geldiniz.");

                int select;
                do {
                    System.out.println("1.Para çekme\n2.Para yatırma \n 3.Bakiye sorgulama \n 4.çıkış.");
                    System.out.println("lütfen yapmak isteidğiniz işleni seçiniz:");
                    select = input.nextInt();
                    int price;
                    switch (select) {
                        case 1:
                            System.out.println("para miktarı:");
                            price = input.nextInt();
                            if (balance < price) {
                                System.out.println("bakiyeniz yetersiz");
                            } else {
                                balance -= price;
                            }
                            break;
                        case 2:
                            System.out.println("para miktarı:");
                            price = input.nextInt();
                            balance += price;
                            break;
                        case 3:
                            System.out.println("bakiyeniz:" + balance);
                    }
                } while(select != 4);

                System.out.println("tekrar görüşmek üzere.");
                break;
            }

            --right;
            System.out.println("HATALI KULLANICI VE ŞİFRESİ GİRDİNİZ!TEKRAR DENEYİNİZ.");
            if (right == 0) {
                System.out.println("Hesabınız bloke olmuştur.lütfen bankanız ile iletişiöe geçiniz.");
            } else {
                System.out.println("kalan hakkınız:" + right);
            }
    }
}
}

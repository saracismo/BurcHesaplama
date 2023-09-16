import java.util.Scanner;

public class BurcProgrami {
    public static void main(String[] args) {

        int gün, ay;

        Scanner inp = new Scanner(System.in);

        System.out.print("Doğum gününüzü giriniz: ");
        gün = inp.nextInt();

        System.out.print("Doğum ayınızı giriniz: ");
        ay = inp.nextInt();

        if(ay == 1){
            if(gün >=1 && gün <31){
                if(gün <=22){
                    System.out.println("Oğlak Burcusunuz");

                } else{
                    System.out.println("Kova Burcusunuz");
                }
            } else{
                System.out.println("Geçersiz gün girdiniz! ");
            }
        }
        if(ay == 2){
            if(gün >=1 && gün <28){
                if(gün <=19){
                    System.out.println("Kova Burcusunuz");

                } else{
                    System.out.println("Balık Burcusunuz");
                }
            } else{
                System.out.println("Geçersiz gün girdiniz! ");
            }
        }
        if(ay == 3){
            if(gün >=1 && gün <31){
                if(gün <=20){
                    System.out.println("Balık Burcusunuz");

                } else{
                    System.out.println("Koç Burcusunuz");
                }
            }else{
                System.out.println("Geçersiz gün girdiniz! ");
            }
        }
        if(ay == 4){
            if(gün >=1 && gün <30){
                if(gün <=20){
                    System.out.println("Koç Burcusunuz");

                } else{
                    System.out.println("Boğa Burcusunuz");
                }
            }else{
                System.out.println("Geçersiz gün girdiniz! ");
            }
        }
        if(ay == 5){
            if(gün >=1 && gün <31){
                if(gün <=21){
                    System.out.println("Boğa Burcusunuz");

                } else{
                    System.out.println("İkizler Burcusunuz");
                }
            }else{
                System.out.println("Geçersiz gün girdiniz! ");
            }
        }
        if(ay == 6){
            if(gün >=1 && gün <30){
                if(gün <=22){
                    System.out.println("İkizler Burcusunuz");

                } else{
                    System.out.println("Yengeç Burcusunuz");
                }
            }else{
                System.out.println("Geçersiz gün girdiniz! ");
            }
        }
        if(ay == 7){
            if(gün >=1 && gün <31){
                if(gün <=22){
                    System.out.println("Yengeç Burcusunuz");

                } else{
                    System.out.println("Aslan Burcusunuz");
                }
            }else{
                System.out.println("Geçersiz gün girdiniz! ");
            }
        }
        if(ay == 8){
            if(gün >=1 && gün <31){
                if(gün <=22){
                    System.out.println("Aslan Burcusunuz");

                } else{
                    System.out.println("Başak Burcusunuz");
                }
            }else{
                System.out.println("Geçersiz gün girdiniz! ");
            }
        }
        if(ay == 9){
            if(gün >=1 && gün <31){
                if(gün <=22){
                    System.out.println("Başak Burcusunuz");

                } else{
                    System.out.println("Terazi Burcusunuz");
                }
            }else{
                System.out.println("Geçersiz gün girdiniz! ");
            }
        }
        if(ay == 10){
            if(gün >=1 && gün <31){
                if(gün <=22){
                    System.out.println("Terazi Burcusunuz");

                } else{
                    System.out.println("Akrep Burcusunuz");
                }
            }else{
                System.out.println("Geçersiz gün girdiniz! ");
            }
        }
        if(ay == 11){
            if(gün >=1 && gün <31){
                if(gün <=21){
                    System.out.println("Akrep Burcusunuz");

                } else{
                    System.out.println("Yay Burcusunuz");
                }
            }else{
                System.out.println("Geçersiz gün girdiniz! ");
            }
        }
        if(ay == 12){
            if(gün >=1 && gün <31){
                if(gün <=21){
                    System.out.println("Yay Burcusunuz");

                } else{
                    System.out.println("Oğlak Burcusunuz");
                }
            }else{
                System.out.println("Geçersiz gün girdiniz! ");
            }
        }






















































    }
}
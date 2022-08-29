package lambda_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Lambda03_Odev {//odev

        //TASK 01 --> Structured Programming ve Functional Programming ile 1'den x'e kadar
        // tamsayilari toplayan bir program create ediniz.
        //Structured(AMELE) Programming
        public static int toplaAmele(int i) {

            int toplam= 0;

            for (int j = 1; j <= i; j++) {

                toplam+=j;

            }

            return toplam;
        }
        //TODO Functional(cincix Programming
        public static int toplaCincix(int x) {

            return IntStream.rangeClosed(1, x).reduce(Math::addExact).getAsInt();
        }
        //TODO TASK 02 --> 1'den x'e kadar cift tamsayilari toplayan bir program create ediniz.
        public static int toplaCift(int x) {

            return IntStream.rangeClosed(1,x).filter(t->t%2==0).reduce(Math::addExact).getAsInt();
        }
        //TASK 03 --> Ilk x pozitif cift sayiyi toplayan program  create ediniz.
        public static int toplaIlkXCift(int x) {

            return IntStream.rangeClosed(1,2*x-1).filter(t->t%2==0).reduce(Math::addExact).getAsInt();
        }
        //TODO TASK 04 --> Ilk X pozitif tek tamsayiyi toplayan programi  create ediniz.
        public static int toplaIlkXTek(int x) {

            return IntStream.rangeClosed(1,2*x).filter(t->t%2==1).reduce(Math::addExact).getAsInt();

        }
        //TASK 05 --> 2'nin ilk x kuvvetini ekrana yazdiran programi  create ediniz.
        public static void ikininIlkXKuvvetPrint(int x) {

        }
        //TASK 06 --> Istenilen bir sayinin ilk x kuvvetini ekrana yazdiran programi  create ediniz.
        public static void isteneSayiIlkXKuvvetPrint(int istenenSayi,int x) {



        }
        // TODO TASK 07 --> Istenilen bir sayinin faktoriyelini hesaplayan programi  create ediniz...
        public static int istenenSayiFactorial(int x) {

           return IntStream.rangeClosed(1, x).reduce(Math::multiplyExact).getAsInt();
        }

        //TASK 08 --> Istenilen bir sayinin  x. kuvvetini ekrana yazdiran programi  create ediniz.
        public static double xKuvveti(int sayi, int x) {

            return Math.pow(sayi, x);
        }
        /*TASK 09:
        2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki tüm
        elemanları bir
        listeye kopyalayan ve harf sırasına göre yazdıran bir METHOD yazınız.
        Eg : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
        Output:[Ali, Ayse, Can, Hasan, Suzan, Veli]
        */




         String[][] arr = {{"Ali", "Veli", "Ayse"}, {"Hasan", "Can"}, {"Suzan"}};


         }






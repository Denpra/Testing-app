package test.app;
import java.util.Arrays;
import java.util.Scanner;

public class TestApp {
    
   
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int loker,z = 0;
        int cari = 0;
        String id;
        int[] x = null ;
        String[] y = null;
        boolean found = false;
        
        System.out.print("Input jumlah Loker: ");
        loker  = s.nextInt();
    
   if (loker == 0){
      System.out.print("Loker kosong");
      System.exit(0);
   }else {
       
   while (true){
   System.out.println("-----------= Loker =-----------");
   System.out.println("Loker tersedia " + loker);
   System.out.println("-1. Masukkan Data");
   System.out.println("-2. Lihat Data");
   System.out.println("-3. Cari Nomor ID");
   System.out.println("-4. Tampilkan Tipe ID");
   System.out.println("-5. Hapus Data");
   System.out.println("-6. Keluar");
   System.out.println("-----------= ######## =-----------");
   System.out.print("Masukkan Pilihan Anda : ");
   
   int pilihan = Integer.parseInt(s.next());
   
   switch(pilihan){
   case 1 :
        x = new int[loker];
        y = new String[loker];
        for(int index=0; index<loker; index++)
        {
            System.out.println(index+1);
            System.out.print("Input Jenis ID : ");
            y[index] = s.next();
            System.out.print("Input Nomor ID : ");
            x[index] = s.nextInt();
            loker = loker-1;
        }
   break;
   
   case 2 :
       x = new int[loker];
        y = new String[loker];
        for(int index = 0; index<loker; index++)
        {
            if (index > 0)
            {
                z=index+1;
                System.out.println("Data ditemukan di Index ke :"+ z);
                System.out.println("                            "+ x[index]);
                System.out.println("                            "+ y[index]);
            }
            if(found == false)
        {
            System.out.println("Data tidak ditemukan");
        }
   break;
   
        }
case 3 :
       System.out.print("Input nomor ID yang dicari: ");
       cari = s.nextInt();
         for(int index=0; index<loker; index++)
        {
            if(x[index] == cari)
            {
                found = true;
                z=index+1;
                System.out.println("Data ditemukan di Index ke :"+ z);
            }
            if(found == false)
        {
            System.out.println("Data tidak ditemukan");
        }
   break;
        }
   case 4 :
         for(int index=0; index<loker; index++)
        {System.out.print("Input jenis ID yang dicari: ");
           y[index] = s.next();
            {
                found = true;
                z=index+1;
                System.out.println("Data ditemukan di Index ke :"+ z);
            }
            if(found == false)
        {
            System.out.println("Data tidak ditemukan");
        }
   break;
        }
         
         case 5 :
         for(int index=0; index<loker; index++)
        {System.out.print("Hapus antrian: ");
           y[index] = s.next();
            {
                z=index-1 ;
            }
            if(found == false)
        {
            System.out.println("Data tidak ditemukan");
        }
   break;
        }
         
         case 6 :
         System.out.println("exit..."); 
  

                System.exit(0); 
        }
         
   }

   }
   
   }
  }

import java.util.Scanner;
public class project_pak_niam_2 {
  
  public static void main (String[] args) {
    Scanner otong = new Scanner(System.in);
    
   int pilihan;
    System.out.println("Daftar siswa : ");
     System.out.println("1. fadlan");
     System.out.println("2. awan");
     System.out.println("3. fikri");
     System.out.println("4. misbah");
     System.out.println("masukan nomor pilihan anda");
    pilihan = otong.nextInt();
    
    switch (pilihan){
      case 1:
        System.out.println("anda memilih fadlan"); break;
          
      case 2:
        System.out.println("anda memilih awan"); break;  
        
      case 3:
       System.out.println("anda memilih fikri"); break;
        
      case 4:
       System.out.println("anda memilih misbah"); break;  
        
      default: System.out.println("pilihan anda tidak tersedia");
    }
    
    /*if (pilihan==1){
      System.out.println("anda memilih fadlan");
    }else if (pilihan==2){
      System.out.println("anda memilih awan");
    }else if (pilihan==3){
      System.out.println("anda memilih fikri");
    }else if (pilihan==4){
      System.out.println("anda anda telah memilih yang terbaik");
    }else  {
      System.out.println("pilihan anda tidak terpenuhi");
    }*/
     
  }
}
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] arrayString = {"1","1.ส้มตำ","2.ไก่ย่าง","3.ข้าวเหนียว","4.แคบหมู","5.หมูปิ้ง",""}; //ใส่ได้หลายตัวแปร

        System.out.println("..สวัสดีครับ ร้านส้มตำครับ..");
        System.out.println("..menu..1.ส้มตำ 2.ไก่ย่าง 3.ข้าวเหนียว 4.แคบหมู 5.หมูปิ้ง 6.เรียกดูรายการเพื่อชำระเงิน");
        System.out.println("..ลูกค้าจะรับดีอะไรครับ..");
        System.out.println("..กดหมายเลข 6 เพื่อยืนยันรายการนะครับ..");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int menu1 = 0;
        int menu2 = 0;
        int menu3 = 0;
        int menu4 = 0;
        int menu5 = 0;

        for (int menuNumber = number; menuNumber != 6;) {
            if(number == 1){
                System.out.println(arrayString[1]);
                menu1 = menu1 + 1;
            }
            else if(number == 2){
                System.out.println(arrayString[2]);
                menu2 = menu2 + 1;
            }
            else if(number == 3){
                System.out.println(arrayString[3]);
                menu3 = menu3 + 1;
            }
            else if(number == 4){
                System.out.println(arrayString[4]);
                menu4 = menu4 + 1;
            }
            else if(number == 5){
                System.out.println(arrayString[5]);
                menu5 = menu5 + 1;
            }
            System.out.println("..menu..1.ส้มตำ 2.ไก่ย่าง 3.ข้าวเหนียว 4.แคบหมู 5.หมูปิ้ง 6.เรียกดูรายการเพื่อชำระเงิน");
            menuNumber = scanner.nextInt();
        }
        if(menu1 >0){
            System.out.println("ส้มตำจำนาน"+menu1);
        }
        else if(menu2 >0){
            System.out.println("ไก่ย่างจำนาน"+menu2);
        }
        else if(menu3 >0){
            System.out.println("ข้าวเหนียวจำนาน"+menu3);
        }
        else if(menu4 >0){
            System.out.println("แคบหมูจำนาน"+menu4);
        }
        else if(menu5 >0){
            System.out.println("หมูปิ้งจำนาน"+menu5);
        }
    }
}
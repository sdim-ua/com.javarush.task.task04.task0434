/* 
Гадание на долларовый счет

Вывести на экран квадрат из 10х10 букв S используя цикл while.
Буквы в каждой строке не разделять
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        
      int a = 1;
      while(a < 11){
          int b = 1;
           while(b < 10){
               System.out.print(a  * b + " ");
               b++;
           }
          System.out.println(a  * b);
          a++;
          
      }
        

    }
    
    
}

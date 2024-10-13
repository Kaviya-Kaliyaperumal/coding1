

import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
       String str=s.nextLine();
       countnumber(str);
    }
    static void countnumber(String str)
    {
        StringBuffer deci=new StringBuffer();
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            if(Character.isDigit(str.charAt(i)))
            {
                count++;
            }
        }
        System.out.println(count);
    }
}

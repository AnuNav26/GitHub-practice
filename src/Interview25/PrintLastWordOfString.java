package Interview25;

public class PrintLastWordOfString
{
    public static void main(String[] args) {
        String str="   hello    World   moon ";
        System.out.println(str);
        str= str.trim();
        System.out.println(str);
        char[] ch=str.toCharArray();
        int count=0;
        String lastWordRev="";
        for(int i=ch.length-1;i>=0;i--)
        {

            if(ch[i] !=' ')
            {
                count=count+1;
                lastWordRev=lastWordRev+ch[i];
            }
            else if(count>0){
                System.out.println(count);
                break;
            }
        }
        //Reverse the last word
        String lastWord="";
        for(int i=lastWordRev.length()-1;i>=0;i--)
        {
            lastWord=lastWord+lastWordRev.charAt(i);
        }

        System.out.print(lastWord);

    }
}

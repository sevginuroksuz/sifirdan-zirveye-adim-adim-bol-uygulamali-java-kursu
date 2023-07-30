package kontrol_yapilari;

public class BreakVeContinue {
    public static void main(String[] args) {

        // break
        for(int i=0; i<10; i++)
        {
            if(i==4)
            {
                break;
            }

            System.out.println("i'nin degeri: " + i);
        }


        // etiket kullanimi ve break
        distakiFor:
        for(int a=0; a<5; a++)
        {
            ictekiFor:
            for(int b=0; b<3; b++)
            {
                System.out.println("a: " + a + " b: " +b);
                if(a==1 && b==2)
                {
                    break distakiFor;
                }

            }
        }

        // return
        for ( int i=0; i<5; i++)
        {
            if(i==2) {
                return;
            }
            System.out.println("return i degeri: " + i);
        }


        // continue
        for ( int i=0; i<4; i++)
        {
            if(i==3)
            {
                continue;
            }
            System.out.println("continue i degeri: " + i);
        }

    }
}

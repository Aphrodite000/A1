import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] a=new int[N];
        for(int i=0;i<N;i++){
            a[i]=sc.nextInt();
        }
        int a1=0;
        int a2=0;
        int a3=0;
        int sum4=0;
        float a4=0;
        int count4=0;
        int a5=0;
        int r2=0;
        int b1=0;
        int b5=0;
        for(int i=0;i<N;i++){
            //A1
            if(a[i]%10==0){
                a1=a1+a[i];
                b1++;
            }
            //A2
            if(a[i]%5==1){
                r2++;
            }
            //A3
            if(a[i]%5==2){
                a3++;
            }
            //A4
            if(a[i]%5==3){
                sum4=sum4+a[i];
                count4++;
            }
            //A5
            if(a[i]%5==4){
                if(a5==0){
                    a5=a[i];
                }else{
                    if(a[i]>a5){
                        a5=a[i];
                    }
                }
                b5++;
            }
        }
        int[] b=new int[r2];
        int j=0;
        for(int i=0;i<N;i++){
            if(a[i]%5==1){
                b[j]=a[i];
                j++;
            }
        }
        for (int i=0;i<b.length;i++){
            if(i%2==0){
                a2=a2+b[i];
            }
            if(i%2==1){
                a2=a2-b[i];
            }
        }

        if(b1==0){
            System.out.print("N");
            System.out.print(" ");
        }else{
            System.out.print(a1);
            System.out.print(" ");
        }
        if(r2==0){
            System.out.print("N");
            System.out.print(" ");
        }else {
            System.out.print(a2);
            System.out.print(" ");
        }
        if(a3==0){
            System.out.print("N");
            System.out.print(" ");
        }else {
            System.out.print(a3);
            System.out.print(" ");
        }
        if(count4==0){
            System.out.print("N");
            System.out.print(" ");
        }else {
            System.out.printf("%.1f",(float)sum4/count4);
            System.out.print(" ");
        }
        if(b5==0){
            System.out.println("N");
        }else {
            System.out.println(a5);
        }
    }
}

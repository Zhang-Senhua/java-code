package demo11;
import java.util.Scanner;

public class method {
	//欧几里得算法（辗转相除）：

    public static int gcd(int m,int n) {
        if(m<n) {
            int k=m;
            m=n;
            n=k;
        }
        //if(m%n!=0) {
        //    m=m%n;
        //    return gcd(m,n);
        //}
        //return n;
        return m%n == 0?n:gcd(n,m%n);
    } 

 
public static int gcd1(int m,int n) {
        int t;
        if(m<n) {
            t=m;
        }else {
            t=n;
        }
        while(m%t!=0||n%t!=0){
            t--;
        }
        return t;
    }


 

    //公因数法：(更相减损）

    public static int gcd2(int m,int n) {
        int i=0,t,x;
        while(m%2==0&n%2==0) {
            m/=2;
            n/=2;
            i++;
        }
        if(m<n){
            t=m;
            m=n;
            n=t;
        }
        while(n!=(m-n)) {
            x=m-n;
            m=(n>x)?n:x;
            n=(n<x)?n:x;
        }
        if(i==0)
            return n;
        else
            return (int)Math.pow(2, i)*n;
    }

    public static void main(String[] args) {
        System.out.println("请输入两个正整数:");
        Scanner scan = new Scanner(System.in);
        Scanner scan2=new Scanner(System.in);
        int m=scan.nextInt();
        int n=scan2.nextInt();
        System.out.println("欧几里得算法求最大公约数是:"+gcd(m,n));
        System.out.println("连续整数检测算法求最大公约数是:"+gcd1(m,n));
        System.out.println("公因数法求最大公约数是:"+gcd2(m,n));
    }


	public method() {
		// TODO Auto-generated constructor stub
	}

}

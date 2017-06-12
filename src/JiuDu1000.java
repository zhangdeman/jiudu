/**
 *时间限制：1 秒内存限制：32 兆特殊判题：否提交：48494解决：20864
 题目描述：
 求整数a，b的和。
 输入：
 测试案例有多行，每行为a，b的值。
 输出：
 输出多行，对应a+b的结果。
 样例输入：
 1 2
 4 5
 6 9
 样例输出：
 3
 9
 15

 **/
import java.util.Scanner;

class JiuDu1000 {
    public static void main(String[] args){
        int a,b;
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println(a+b);
        }
    }
}
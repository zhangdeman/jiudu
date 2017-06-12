/**
 * 时间限制：1 秒内存限制：32 兆特殊判题：否提交：19976解决：8207
 题目描述：
 给定两个整数A和B，其表示形式是：从个位开始，每三位数用逗号","隔开。
 现在请计算A+B的结果，并以正常形式输出。
 输入：
 输入包含多组数据数据，每组数据占一行，由两个整数A和B组成（-10^9 < A,B < 10^9）。
 输出：
 请计算A+B的结果，并以正常形式输出，每组数据占一行。
 样例输入：
 -234,567,890 123,456,789
 1,234 2,345,678
 样例输出：
 -111111101
 2346912
 **/
import java.util.Scanner;
class JiuDu1003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        String[] inputArr;
        int num_1;
        int num_2;
        while (sc.hasNextLine()) {
            input = sc.nextLine();
            input = input.replace("," , "");
            inputArr = input.split("\\s");
            if (inputArr.length != 2) {
                break;
            }
            num_1 = Integer.valueOf(inputArr[0]);
            num_2 = Integer.valueOf(inputArr[1]);
            System.out.println(num_1 + num_2);
        }
    }
}
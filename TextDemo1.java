import java.util.regex.Matcher;

/**
 * ClassName:TextDemo1
 * Package:PACKAGE_NAME
 * Description:
 *
 * @Author:HP
 * @date:2021/5/7 22:46
 */
public class TextDemo1 {
//    public String str = "20";

    //字符串匹配
//public static boolean isMatch(String s1,String s2) {
//    char[] ch1 = s1.toCharArray();
//    char[] ch2 = s2.toCharArray();
//    for(int i = 0,j = 0; i < ch1.length; i++) {
//        if(ch1[i] == '?' && (j < ch2.length) && ((ch2[j] >= 'a' && ch2[j] <= 'z') || (ch2[j] >= '0' && ch2[j] <= '9') || (ch2[j] >='A' && ch2[j] <= 'Z'))) {
//            j++;
//            continue;
//        }
//        if(ch1[i] == '*') {
//            while((j < ch2.length) && ((ch2[j] >= 'a' && ch2[j] <= 'z') || (ch2[j] >= '0' && ch2[j] <= '9') || (ch2[j] >='A' && ch2[j] <= 'Z'))) {
//                j++;
//            }
//            if(j >= ch2.length) return true;
//            continue;
//        }
//        if((j < ch2.length) && ch1[i] == ch2[j]) {
//            j++;
//        } else {
//            return false;
//        }
//    }
//    return true;
//}

    //统计每个月兔子的总数
//    public static int getTotalCount(int month) {
//        if(month == 1 || month == 2) return month;
//        int fir = 1;
//        int sec = 1;
//        int sum = 0;
//        for(int i = 2; i < month; i++) {
//            sum = fir + sec;
//            fir = sec;
//            sec = sum;
//        }
//        return sum;
//    }


    //不同路径 II
//    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
//        int m = obstacleGrid.length;
//        if(m == 0) return 0;
//        int n = obstacleGrid[0].length;
//        if(n == 0) return 0;
//        int[][] dp = new int[m][n];
//        //初始化行和列
//        for(int i = 0; i < m && obstacleGrid[i][0] == 0; i++) dp[i][0] = 1;
//        for(int i = 0; i < n && obstacleGrid[0][i] == 0; i++) dp[0][i] = 1;
//        //转移方程
//        for(int i = 1; i < m; i++) {
//            for(int j = 1; j < n; j++) {
//                if(obstacleGrid[i][j] == 0) {
//                    dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
//                }
//            }
//        }
//        return dp[m - 1][n - 1];
//    }
    public static void main(String[] args) {
//        String s1 = "cxtsbywrpggq*i?moporwlokxyldd*jc";
//        String s2 = "cxtsbywrpggqiiymopoywlokxylddrjc";
//        System.out.println(isMatch(s1, s2));
//        TextDemo1 t = new TextDemo1();
//        chage(t.str);
//        System.out.println(t.str);
//        Integer i1 = 30;
//        int i2 = 30;
//        Integer i3 = Integer.valueOf(30);
//        Integer i4 = new Integer(30);
//        System.out.println(i2 == i4);
//        System.out.println(i3 == i4);
    }

//    private static void chage(String str) {
//        str = "10";
//    }
}

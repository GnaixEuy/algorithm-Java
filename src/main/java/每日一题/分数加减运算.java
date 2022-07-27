package 每日一题;

/**
 * <img src="http://blog.gnaixeuy.cn/wp-content/uploads/2022/06/bug.png"/>
 *
 * <p>项目： algorithm-java </p>
 *
 * @author GnaixEuy
 * @date 2022/7/27
 * @see <a href="https://github.com/GnaixEuy"> GnaixEuy的GitHub </a>
 */
public class 分数加减运算 {
    class Solution {
        public String fractionAddition(String expression) {
            int fenzi = 0;
            int fenmu = 1;
            char[] chars = expression.toCharArray();
            int length = chars.length;
            int index = 0;
            while (index < length) {
                int tmpFenzi = 0;
                boolean isMinus = false;
                if (chars[index] == '-' || chars[index] == '+') {
                    isMinus = chars[index] == '-';
                    index++;
                }
                while (index < length && chars[index] >= '0') {
                    tmpFenzi *= 10;
                    tmpFenzi += chars[index] - '0';
                    index++;
                }
                tmpFenzi *= isMinus ? -1 : 1;
                index++; // /符号跳过
                int tmpFenmu = 0;
                while (index < length && chars[index] >= '0') {
                    tmpFenmu *= 10;
                    tmpFenmu += chars[index] - '0';
                    index++;
                }
                //交叉通分计算新分数
                fenzi = fenzi * tmpFenmu + tmpFenzi * fenmu;
                fenmu *= tmpFenmu;
            }
            //开始约分
            if (fenzi == 0) {
                return "0/1";
            }
            int greatestCommonDivisor = gcd(Math.abs(fenzi), fenmu);
            return fenzi / greatestCommonDivisor + "/" + fenmu / greatestCommonDivisor;
        }

        /**
         * 辗转相除法求最大共约数
         *
         * @param a 数a
         * @param b 数b
         * @return 递归
         */
        private int gcd(int a, int b) {
            return b == 0 ? a : gcd(b, a % b);
        }
    }
}

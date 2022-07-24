package 算法入门.第四天;

/**
 * <img src="http://blog.gnaixeuy.cn/wp-content/uploads/2022/06/bug.png"/>
 *
 * <p>项目： algorithm-java </p>
 *
 * @author GnaixEuy
 * @date 2022/7/24
 * @see <a href="https://github.com/GnaixEuy"> GnaixEuy的GitHub </a>
 */
public class 反转字符串中的单词_III {
    class Solution {
        public String reverseWords(String s) {
            StringBuilder stringBuilder = new StringBuilder();
            String[] strings = s.split(" ");
            for (int i = 0; i < strings.length; i++) {
                stringBuilder.append(new StringBuffer(strings[i]).reverse());
                if (i != strings.length-1){
                    stringBuilder.append(" ");
                }
            }
            return stringBuilder.toString();
        }
    }
}

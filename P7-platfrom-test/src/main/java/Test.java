import sun.net.util.IPAddressUtil;

import java.util.Arrays;

/**
 * @Description 用来做简单测试用
 * @Date 2020/5/16 11:19
 * @Created by Jeremy
 */
public class Test {
    public static void main(String[] args) {
//       short s = 1;
//       short ss = 123456;
        System.out.println("args = " + IPAddressUtil.isIPv6LiteralAddress("1.1.1.1/10"));
    }
}

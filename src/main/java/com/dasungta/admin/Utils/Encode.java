package com.dasungta.admin.Utils;

import com.google.common.base.Utf8;
import sun.misc.BASE64Decoder;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import static com.dasungta.admin.Utils.Md5Util.md5;
import static com.dasungta.admin.Utils.SHA.encryptSHA;

/**
 * Created with IntelliJ IDEA.
 * User: zyc77
 * Date: 2017/7/24
 * Time: 16:10
 */
public class Encode {
    public static String toMd5(String s) {
        char hexDigits[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        try {
            byte[] btInput = s.getBytes();
            // 获得MD5摘要算法的 MessageDigest 对象
            MessageDigest mdInst = MessageDigest.getInstance("MD5");
            // 使用指定的字节更新摘要
            mdInst.update(btInput);
            // 获得密文
            byte[] md = mdInst.digest();
            // 把密文转换成十六进制的字符串形式
            int j = md.length;
            char str[] = new char[j * 2];
            int k = 0;
            for (int i = 0; i < j; i++) {
                byte byte0 = md[i];
                str[k++] = hexDigits[byte0 >>> 4 & 0xf];
                str[k++] = hexDigits[byte0 & 0xf];
            }
            return new String(str);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String getFromBASE64(String s) {

        if (s == null)
            return null;
        BASE64Decoder decoder = new BASE64Decoder();
        try {
            byte[] b = decoder.decodeBuffer(s);
            return new String(b);
        } catch (Exception e) {
            return null;
        }
    }

    public static String user_md5(String s) throws Exception {
        return null == s ? null : md5(encryptSHA(s));
    }


}

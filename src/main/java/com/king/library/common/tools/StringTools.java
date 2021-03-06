package com.king.library.common.tools;

import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;

/**
 * @date: 2019/12/12 15:02
 * @author: duanyong
 * @desc:
 */
public class StringTools {

    public static boolean isEmpty(String str){
        if(str==null || str.trim().length()==0){
            return true;
        }
        return false;
    }

    public static boolean isNotEmpty(String str){
        if(str==null || str.trim().length()==0){
            return false;
        }
        return true;
    }
    public static boolean isNullOrEmpty(String str) {
        return null == str || "".equals(str) || "null".equals(str);
    }

    public static boolean isNullOrEmpty(Object obj) {
        return null == obj || "".equals(obj);
    }

    public static String filterObject(Object obj){
        if(obj==null){
            return "";
        }
        return obj.toString();
    }

    /**
     * 用户注册时加密用户的密码
     * 输入密码明文 返回密文与盐值
     * @param password
     * @return 第一个是密文  第二个是密码盐值
     */
    public static String[] encryptPassword(String username,String password) {
        //生成盐值
        String salt = new SecureRandomNumberGenerator().nextBytes().toHex();
        salt = username + salt;
        //加密的次数
        int hashIterations = 2;
        //加密方式
        String hashAlgorithmName = "md5";
        Object simpleHash = new SimpleHash(hashAlgorithmName, password,
                salt, hashIterations);
        String[] strings = new String[]{salt, simpleHash.toString()};
        return strings;
    }

    public static final String md5(String password, String salt){
        //加密方式
        String hashAlgorithmName = "MD5";
        //盐：为了即使相同的密码不同的盐加密后的结果也不同
        ByteSource byteSalt = ByteSource.Util.bytes(salt);
        //密码
        Object source = password;
        //加密次数
        int hashIterations = 1024;
        SimpleHash result = new SimpleHash(hashAlgorithmName, source, byteSalt, hashIterations);
        return result.toString();
    }
}

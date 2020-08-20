package com.macro.mall.util;
 

import java.util.regex.Pattern;

public class StringUtil
{

    public StringUtil()
    {
    }

    public static boolean isEmpty(String str)
    {
        return str == null || "".equals(str);
    }

    public static boolean isNotEmpty(String str)
    {
        return !isEmpty(str);
    }

    public static String toUpperCase(String instr)
    {
        return instr != null ? instr.toUpperCase() : instr;
    }

    public static String toLowerCase(String instr)
    {
        return instr != null ? instr.toLowerCase() : instr;
    }

    public static String toUpperCaseFirst(String str)
    {
        if(str == null)
            return null;
        if(str.length() == 0)
        {
            return str;
        } else
        {
            String pre = String.valueOf(str.charAt(0));
            return str.replaceFirst(pre, pre.toUpperCase());
        }
    }

    public static String toLowerCaseFirst(String str)
    {
        if(str == null)
            return null;
        if(str.length() == 0)
        {
            return str;
        } else
        {
            String pre = String.valueOf(str.charAt(0));
            return str.replaceFirst(pre, pre.toLowerCase());
        }
    }

    public static String trim(String str)
    {
        return str != null ? str.trim() : null;
    }

    public static String nvl(String instr)
    {
        return nvl(instr, "");
    }

    public static String nvl(String instr, String defaultValue)
    {
        return instr != null && !"".equals(instr) ? instr : defaultValue;
    }

    public static boolean equals(String str1, String str2)
    {
        if(str1 == null && str2 == null)
            return true;
        return str1 != null && str1.equals(str2);
    }

    public static String apadLeft(double a, int b, int len)
    {
        return apadLeft(String.valueOf(a), String.valueOf(b), len);
    }

    public static String apadRight(double a, int b, int len)
    {
        return apadRight(String.valueOf(a), String.valueOf(b), len);
    }

    public static String apadLeft(String str, String str2, int len)
    {
        if(str == null || str.length() == len || str2 == null)
            return str;
        if(str.length() > len)
            return str.substring(str.length() - len, len);
        else
            return apadpro(str, str2, len, true);
    }

    public static String apadRight(String str, String str2, int len)
    {
        if(str == null || str.length() == len || str2 == null)
            return str;
        if(str.length() > len)
            return str.substring(0, len);
        else
            return apadpro(str, str2, len, false);
    }

    private static String apadpro(String a, String b, int len, boolean appendleft)
    {
        int f = len - a.length();
        for(int i = 0; i < f; i++)
            a = appendleft ? (new StringBuilder(String.valueOf(b))).append(a).toString() : (new StringBuilder(String.valueOf(a))).append(b).toString();

        return a;
    }

    public static String clear(String str)
    {
        return clear(str, " ");
    }

    public static String clear(String str, String str2)
    {
        if(str == null)
            return str;
        if(str2 == null)
            return str;
        String reg = (new StringBuilder("(")).append(str2).append(")+").toString();
        for(Pattern p = Pattern.compile(reg); p.matcher(str).find(); str = str.replaceAll(reg, ""));
        return str;
    }

    public static String suojin(String str, int c, String sub)
    {
        if(isEmpty(str))
            return str;
        if(str.length() <= c)
        {
            return str;
        } else
        {
            sub = nvl(sub);
            c -= sub.length();
            c = c <= str.length() ? c : 0;
            str = str.substring(0, c);
            return (new StringBuilder(String.valueOf(str))).append(sub).toString();
        }
    }

    public static String suojin(String str, int length)
    {
        return suojin(str, length, "\u2026");
    }

    public static String replaceOnce(String text, String searchString, String replacement)
    {
        return replace(text, searchString, replacement, 1);
    }

    public static String replace(String text, String searchString, String replacement)
    {
        return replace(text, searchString, replacement, -1);
    }

    public static String replace(String text, String searchString, String replacement, int max)
    {
        if(isEmpty(text) || isEmpty(searchString) || replacement == null || max == 0)
            return text;
        int start = 0;
        int end = text.indexOf(searchString, start);
        if(end == -1)
            return text;
        int replLength = searchString.length();
        int increase = replacement.length() - replLength;
        increase = increase < 0 ? 0 : increase;
        increase *= max < 0 ? 16 : max > 64 ? 64 : max;
        StringBuffer buf = new StringBuffer(text.length() + increase);
        do
        {
            if(end == -1)
                break;
            buf.append(text.substring(start, end)).append(replacement);
            start = end + replLength;
            if(--max == 0)
                break;
            end = text.indexOf(searchString, start);
        } while(true);
        buf.append(text.substring(start));
        return buf.toString();
    }
}
 

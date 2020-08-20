package com.macro.mall.communicate.match.bean;

import com.google.gson.Gson;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class MatchParam {
    private  String email;
    private  String height;
    private  String weight;

    private  String emgergencyName;
    private  String emgergencyAddress;
    private  String emgergencyPhone;


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmgergencyName() {
        return emgergencyName;
    }

    public void setEmgergencyName(String emgergencyName) {
        this.emgergencyName = emgergencyName;
    }

    public String getEmgergencyAddress() {
        return emgergencyAddress;
    }

    public void setEmgergencyAddress(String emgergencyAddress) {
        this.emgergencyAddress = emgergencyAddress;
    }

    public String getEmgergencyPhone() {
        return emgergencyPhone;
    }

    public void setEmgergencyPhone(String emgergencyPhone) {
        this.emgergencyPhone = emgergencyPhone;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }


    public static void main(String[] args) throws Exception {
        Gson gson =new Gson();

        MatchParam bean= gson.fromJson( "{\"height\":\"\"}", MatchParam.class);
        Field[] field =bean.getClass().getDeclaredFields();
        StringBuffer sb=new StringBuffer();
        for (int i = 0; i < field.length; i++) {

                String name =field[i].getName();
                name=name.substring(0,1).toUpperCase()+name.substring(1);
                Method m=bean.getClass().getMethod("get"+name);
                String value=(String)m.invoke(bean);
                System.out.println(name+"--------------"+value);
                if (value!=null){
                    sb.append(field[i].getName()+",");
//                    if (i!=field.length-1){
//                        sb.append(",");
//                    }
                }

        }

        System.out.println(sb.substring(0,sb.length()-1));
//     String tt="emgergencyName";
//        String[] str11=tt.split(",");
//        System.out.println(str11[0]);
    }

    @Override
    public String toString() {
        return "MatchParam{" +
                "height='" + height + '\'' +
                ", weight='" + weight + '\'' +
                ", emgergencyName='" + emgergencyName + '\'' +
                ", emgergencyAddress='" + emgergencyAddress + '\'' +
                ", emgergencyPhone='" + emgergencyPhone + '\'' +
                '}';
    }
}

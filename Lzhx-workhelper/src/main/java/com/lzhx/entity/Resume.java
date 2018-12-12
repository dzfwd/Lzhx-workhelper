package com.lzhx.entity;

/**
 * Created by Administrator on 2018/12/11 0011.
 */
public class Resume {
    private String rid;//简历ID
    private String state;//求职意向
    private String uid;//用户ID
    private String sex;//用户性别
    private String birthdate;//用户生日
    private String phone;//联系方式
    private String education;//教育程度（学历）
    private String graduated;//毕业院校
    private String gtime;//毕业时间
    private String nation;//民族
    private String IDcardNo;//身份证号
    private String nativeplace;//籍贯
    private String address;//现居住地
    private String wechatorqq;//微信qq
    private String salary;//期望薪资
    private String Introduce;//自我介绍

    public String getIntroduce() {
        return Introduce;
    }

    public void setIntroduce(String introduce) {
        Introduce = introduce;
    }

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getGraduated() {
        return graduated;
    }

    public void setGraduated(String graduated) {
        this.graduated = graduated;
    }

    public String getGtime() {
        return gtime;
    }

    public void setGtime(String gtime) {
        this.gtime = gtime;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getIDcardNo() {
        return IDcardNo;
    }

    public void setIDcardNo(String IDcardNo) {
        this.IDcardNo = IDcardNo;
    }

    public String getNativeplace() {
        return nativeplace;
    }

    public void setNativeplace(String nativeplace) {
        this.nativeplace = nativeplace;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getWechatorqq() {
        return wechatorqq;
    }

    public void setWechatorqq(String wechatorqq) {
        this.wechatorqq = wechatorqq;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}

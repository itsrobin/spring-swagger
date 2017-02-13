package cn.itsrobin.model;

import lombok.Getter;
import lombok.Setter;

/**
 * @author lifeng
 * @createTime 2017/2/12.
 * @updateTime 2017/2/13
 */

public class User {
    private String name;
    private String age;
    private String sex;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}

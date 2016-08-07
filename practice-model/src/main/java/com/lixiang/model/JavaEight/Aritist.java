package com.lixiang.model.JavaEight;

import java.util.Set;
/**
 * Created by lixiang on 2016/8/7.
 */
public class Aritist {
    /*the name of aritist */
    private String name;

    /* the members of aitist */
    private Set members;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set getMembers() {
        return members;
    }

    public void setMembers(Set members) {
        this.members = members;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    /*where the aritist from */
    private String origin;

}

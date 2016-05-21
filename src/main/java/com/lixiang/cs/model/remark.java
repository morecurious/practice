package com.lixiang.cs.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by lixiang on 2016/4/24.
 */
public class remark implements Serializable{


    private static final long serialVersionUID = 5323841307505810556L;
    /**
     * id ,唯一标识一条评论记录
     */
    private int id ;

    /**
     * 评论用户名称
     */
    private String user;

    /**
     * 评论内容
     */
    private String context;

    /** 该评论的关键字 */
    private List<String> keyWords;

    /** 该评论的回复内容 */
    private String reply;

    /** 状态标识，标识这条评论用哪一系列的话术回复，在前台可以供选择*/
    private int status;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public List<String> getKeyWords() {
        return keyWords;
    }

    public void setKeyWords(List<String> keyWords) {
        this.keyWords = keyWords;
    }

    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply;
    }

    public remark(){

    }

    public remark(int id, String user,  String context) {
        this.user = user;

        this.context = context;
        this.id=id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }



}

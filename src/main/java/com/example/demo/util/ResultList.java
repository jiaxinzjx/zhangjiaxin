package com.example.demo.util;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;
import java.util.Map;

public class ResultList {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Object obj;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Map map;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List list;

    private String status="200";

    private String message="OK";

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

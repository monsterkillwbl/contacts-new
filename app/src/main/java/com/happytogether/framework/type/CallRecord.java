package com.happytogether.framework.type;

import java.util.Objects;

public class CallRecord extends FeatureObj {

    private String _number;
    private int _status;
    private int _duration;
    private long _startTime;
    private String _id;
    private String _name;

    public static final int ERROR_NUM = 0;
    public static final int INCOMMING = 1;
    public static final int OUTGOING = 2;
    public static final int IN_MISSED = 3;
    public static final int OUT_MISSED = 4;

    public CallRecord(){
        _number = "";
        _status = ERROR_NUM;
        _duration = 0;
    }

    public void setId(String id) { _id = id; }

    public String getId() { return _id; }

    public void setNumber(String number){
        _number = number;
    }

    public String getNumber(){
        return _number;
    }

    public void setStatus(int status){
        _status = status;
    }

    public int getStatus(){
        return _status;
    }

    public void setDuration(int duration){
        _duration = duration;
    }

    public int getDuration(){
        return _duration;
    }

    public void setStartTime(long ts){
        _startTime = ts;
    }

    public long getStartTime(){
        return _startTime;
    }

    public void setName(String name) { _name = name; }

    public String getName() { return _name + ""; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CallRecord that = (CallRecord) o;
        return _status == that._status &&
                _duration == that._duration &&
                Objects.equals(_number, that._number);
    }

}

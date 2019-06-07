package com.xaydunglopStopWatch;
public class StopWatch {
    public long   startTime, endTime;
    StopWatch(){
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public StopWatch(long startTime) {
        this.startTime = startTime;
    }
    public long StartTime(){
        return startTime=System.currentTimeMillis();
    }

    public long start(){

         return startTime=System.currentTimeMillis();
    }
    public long stop(){
        return endTime=System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return endTime-startTime;
    }
}

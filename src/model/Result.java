package model;

public class Result {

    public String algorithmName;
    public GanttChart ganttChart;

    public double avgWaitingTime;
    public double avgTurnaroundTime;
    public double avgResponseTime;

    public Result(String algorithmName) {
        this.algorithmName = algorithmName;
    }
}

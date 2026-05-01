package model;

public class GanttBlock {

    public String processId;
    public int start;
    public int end;

    public GanttBlock(String processId, int start, int end) {
        this.processId = processId;
        this.start = start;
        this.end = end;
    }
}

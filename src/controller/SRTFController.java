package controller;

import model.Process;
import model.Result;
import java.util.List;

public class SRTFController {
    private int currentTime = 0;
    public Result buildResult(List<Process> processes) {
        return new Result("SRTF algorith");
    }
}
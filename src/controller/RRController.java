package controller;

import model.Process;
import model.Result;
import java.util.List;

public class RRController {
    private int currentTime = 0;
    public Result buildResult(List<Process> processes, int quantum) {
        return new Result("Round Robin algorith");
    }
}

package headfirst.designpatterns.combined.djview.dj;

import headfirst.designpatterns.combined.djview.BeatController;
import headfirst.designpatterns.combined.djview.BeatModel;
import headfirst.designpatterns.combined.djview.BeatModelInterface;
import headfirst.designpatterns.combined.djview.ControllerInterface;

public class DJTestDrive {

    public static void main (String[] args) {
        BeatModelInterface model = new BeatModel();
		ControllerInterface controller = new BeatController(model);
    }
}

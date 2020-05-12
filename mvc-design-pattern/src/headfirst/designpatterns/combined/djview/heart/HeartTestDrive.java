package headfirst.designpatterns.combined.djview.heart;

import headfirst.designpatterns.combined.djview.ControllerInterface;

public class HeartTestDrive {

    public static void main (String[] args) {
		HeartModel heartModel = new HeartModel();
        ControllerInterface model = new HeartController(heartModel);
    }
}
package headfirst.designpatterns.combined.djview.heart;

import headfirst.designpatterns.combined.djview.BPMObserver;
import headfirst.designpatterns.combined.djview.BeatObserver;

public interface HeartModelInterface {
	int getHeartRate();
	void registerObserver(BeatObserver o);
	void removeObserver(BeatObserver o);
	void registerObserver(BPMObserver o);
	void removeObserver(BPMObserver o);
}

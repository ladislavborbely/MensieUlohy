package sorting.time_comparison;

public class Stopwatch {

	private long start = 0;
	private long stop = 0;
	private String name = "Unnamed Stopwatch";

	public Stopwatch() {

	}

	public Stopwatch(String name) {
		this.name = name;
	}

	public void start() {
		//if (start == 0)
			start = System.nanoTime();
	}

	public void stop() {
		stop = System.nanoTime();
	}

	public long getDuration() {
		if (stop == 0) {
			return System.nanoTime() - start;
		}
		return stop - start;
	}

	public void printDuration() {
		System.out.println(name + " -> " + this.getDuration() + " nanosec. ~" + (this.getDuration() / 1000_000_000) + "sec.");
	}

}

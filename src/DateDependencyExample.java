import java.util.Date;

public class DateDependencyExample {
	Date date = new Date();

	public void doSomething() {
		this.date = newDate();
		// ‚È‚ñ‚ç‚©‚Ìˆ—
	}

	Date newDate() {
		return new Date();
	}
}

import java.util.Date;

public class DateDependencyExample {
	Date date = new Date();

	public void doSomething() {
		this.date = newDate();
		// �Ȃ�炩�̏���
	}

	Date newDate() {
		return new Date();
	}
}

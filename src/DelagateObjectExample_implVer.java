import java.util.Date;

public class DelagateObjectExample_implVer {
	IDateFactory dateFactory = new DateFactoryImpl();
	Date date = new Date();

	public void doSomething() {
		this.date = dateFactory.newDate();
		// �Ȃ�炩�̏���
	}
}

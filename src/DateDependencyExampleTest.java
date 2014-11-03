import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class DateDependencyExampleTest extends DateDependencyExample {

	public DateDependencyExampleTest() {
	}

	@Test
	public void doSomething��date�Ɍ��ݎ������ݒ肳���t() throws Exception {

		final Date current = new Date();
		DateDependencyExample sut = new DateDependencyExample() {
			@Override
			Date newDate() {
				return current;
			}

		};
		sut.doSomething();
		assertThat(sut.date, is(sameInstance(current)));
	}

}

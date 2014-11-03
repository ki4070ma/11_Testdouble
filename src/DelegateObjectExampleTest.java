import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class DelegateObjectExampleTest {

	public DelegateObjectExampleTest() {
	}

	@Test
	public void doSomething�����s�����date�Ɍ��ݎ������ݒ肳���() throws Exception {
		final Date current = new Date();
		DelegateObjectExample sut = new DelegateObjectExample();
		sut.dateFactory = new DateFactory() {

			@Override
			Date newDate() {
				return current;
			}

		};
		sut.doSomething();
		assertThat(sut.date, is(sameInstance(current)));
	}

}

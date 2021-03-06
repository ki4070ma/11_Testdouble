import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class DelegateObjectExampleTest {

	public DelegateObjectExampleTest() {
	}

	@Test
	public void doSomethingを実行するとdateに現在時刻が設定される() throws Exception {
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

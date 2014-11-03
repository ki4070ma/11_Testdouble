import java.util.Date;

public class DateFactoryImpl implements IDateFactory {

	@Override
	public Date newDate() {
		return new Date();
	}

}

package tt;

public class TTConnector implements ITTConnector, ITestTT {
	
	final static String TIME_TABLE_ONLINE = "Time Table Online";
	
	@Override
	public TTData getTT(Long ttId) {
		return getTT_TEST(ttId); //test
	}

	@Override
	public Boolean saveTT(TTData tt) {
		return saveTT_TEST(tt) ; //test

	}
	private Boolean saveTT_TEST(TTData tt) {
		return ITestTT.TEST_TTDATA.equals(tt);
	}

	private TTData getTT_TEST(Long ttId) {
		if(ITestTT.TEST_TTID.equals(ttId))
			return ITestTT.TEST_TTDATA;
		return null;
	}


}

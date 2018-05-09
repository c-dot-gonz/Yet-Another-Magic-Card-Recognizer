import boofcv.abst.feature.detect.interest.ConfigFastHessian;

public class StaticConfigs {
	public static final boolean DEBUG = true;
	
	public static final int LIMIT_TO_TOP_N_HASH_MATCH = 1000;
	
	public static final String DEFAULT_ART_FORMAT = "normal";
	
	private static float detectThreshold = 10;
	private static int extractRadius = 2;
	private static int maxFeaturesPerScale = 100;
	private static int initialSampleSize = 2;
	private static int initialSize = 9;
	private static int numberScalesPerOctave = 3;
	private static int numberOfOctaves = 4;
	
	public static ConfigFastHessian getHessianConf()
	{
		return new ConfigFastHessian(detectThreshold, extractRadius, maxFeaturesPerScale,
				initialSampleSize, initialSize, numberScalesPerOctave, numberOfOctaves); 
	}
	
	public static ConfigFastHessian getHessianConf(float thresh)
	{
		return new ConfigFastHessian(thresh, extractRadius, maxFeaturesPerScale,
				initialSampleSize, initialSize, numberScalesPerOctave, numberOfOctaves); 
	}
}

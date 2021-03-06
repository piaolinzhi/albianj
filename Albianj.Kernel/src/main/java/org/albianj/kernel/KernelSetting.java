package org.albianj.kernel;

import org.albianj.verify.Validate;

public class KernelSetting
{
	private static String kernelId = null;
//	private static String kernelKey = null;
	private static String appName = null;
	private static int threadPoolCoreSize = 5;
	private static int threadPoolMaxSize = 20;
	private static AlbianLevel level = AlbianLevel.Release;
	private static AlbianStartupMode mode = AlbianStartupMode.Normal;
	private static String fpath = "../config/";
	private static String kernelpath = "../config/";

	public static String getKernelId()
	{
		return kernelId;
	}

	public static void setKernelId(String kernelId)
	{
		KernelSetting.kernelId = kernelId;
	}

//	public static String getKernelKey()
//	{
//		return kernelKey;
//	}

//	public static void setKernelKey(String kernelKey)
//	{
//		KernelSetting.kernelKey = kernelKey;
//	}

	public static void setAppName(String appName)
	{
		KernelSetting.appName = appName;
	}

	public static String getAppName()
	{
		return appName;
	}

	public static int getThreadPoolMaxSize()
	{
		return threadPoolMaxSize;
	}
	public static void setThreadPoolMaxSize(int threadPoolMaxSize)
	{
		KernelSetting.threadPoolMaxSize = threadPoolMaxSize;
	}
	
	public static int getThreadPoolCoreSize()
	{
		return threadPoolCoreSize;
	}

	public static void setThreadPoolCoreSize(int threadPoolCoreSize)
	{
		KernelSetting.threadPoolCoreSize = threadPoolCoreSize;
	}
	
	public static void setAlbianLevel(AlbianLevel l){
		KernelSetting.level = l;
	}
	public static AlbianLevel getAlbianLevel(){
		return KernelSetting.level;
	}
	
	public static void setAlbianStartupMode(AlbianStartupMode m){
		mode = m;
	}
	
	public static AlbianStartupMode getAlbianStartupMode(){
		return mode;
	}
	
	public static void setAlbianConfigFilePath(String fpath){
		if(!Validate.isNullOrEmptyOrAllSpace(fpath)){
			if(fpath.endsWith("/")){
				KernelSetting.fpath = fpath;
			} else {
				KernelSetting.fpath = fpath + "/";
			}
		}
	}
	
	public static String getAlbianConfigFilePath(){
		return fpath;
	}
	
	public static void setAlbianKernelConfigFilePath(String fpath){
		if(!Validate.isNullOrEmptyOrAllSpace(fpath)){
			if(fpath.endsWith("/")){
				KernelSetting.kernelpath = fpath;
			} else {
				KernelSetting.kernelpath = fpath + "/";
			}
		}
	}
	
	public static String getAlbianKernelConfigFilePath(){
		return kernelpath;
	}
}

package base;


public interface Supports {
    String APK_SYSTEM_PATH = "C:/apks/";
    String APIDEMOS = "ApiDemos-debug.apk";
    String SERENDROID = "selendroid-test-app-0.17.0.apk";
    String APPIUM_SERVER = "http://localhost:4723/wd/hub";
    public static final String ANDROID_HYBRID_APP = "ANDROID_HYBRID_APP";
    public static final String ANDROID_NATIVE_APP = "NATIVE";
    public static final String IOS = "IOS";
    public static final String WINDOW = "WINDOW";
    public static final String ANDROID_MOBILE_WEB = "ANDROID_WEB";
    public static final String IOS_MOBILE_WEB = "IOS_WEB";
    public static final String MASSAGE_NATIVE_ACTIVITY = ".ui.conversationlist.ConversationListActivity";
    public static final String MASSAGE_NATIVE_APP = "com.android.messaging";
    public static final String PHOTO_NATIVE_APP = "com.google.android.apps.photos";
    public static final String PHOTO_NATIVE_ACTIVITY = ".home.HomeActivity t32";


    String PLATFORM_NAME = "Android";
    String AUTOMATION_NAME = "UiAutomator2";
    String PLATFORM_VERSION = "8.0";
    String DEVICE_NAME = "Android Emulator";
    String AUTO_GRANT_PERMISSION = "true";



    static void thread_waitTime(int wait) {
        try {
            Thread.sleep(wait);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

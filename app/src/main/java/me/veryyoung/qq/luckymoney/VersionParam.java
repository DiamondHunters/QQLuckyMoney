package me.veryyoung.qq.luckymoney;

public class VersionParam {

    public static String QQPluginClass = "com.tenpay.android.qqplugin.a.q";

    public static void init(String version) {
        switch (version) {
            case "6.2.0":
            case "6.2.1":
            case "6.2.3":
            case "6.3.1":
            case "6.3.3":
            case "6.3.5":
            case "6.3.6":
            case "6.3.7":
            case "6.5.0":
            case "6.5.3":
            case "6.5.5":
            case "6.5.8":
                QQPluginClass = "com.tenpay.android.qqplugin.a.p";
                break;
            case "6.6.0":
            case "6.6.1":
            case "6.6.2":
            case "6.6.5":
            case "6.6.6":
                QQPluginClass = "com.tenpay.android.qqplugin.a.q";
                break;
            default:
                QQPluginClass = "com.tenpay.android.qqplugin.a.q";
        }
    }

}

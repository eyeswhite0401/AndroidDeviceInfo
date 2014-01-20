package com.example.deviceinfo;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;

public class DeviceInfoUtils {
    /**
     * 最終的にユーザへ表示するモデル名を返す
     * @return
     */
    public static String getDeviceModel(){
        return Build.MODEL;
    }

    /**
     * ユーザーに表示するバージョン番号を返す
     * @return
     */
    public static String getDeviceVersion(){
        return Build.VERSION.RELEASE;
    }

    /**
     * アプリのバージョンコードを取得する
     * @param context
     * @return
     */
    public static int getAppVersionCode(Context context){
        PackageManager pm = context.getPackageManager();
        int versionCode = 0;
        try{
            PackageInfo packageInfo = pm.getPackageInfo(context.getPackageName(), 0);
            versionCode = packageInfo.versionCode;
        }catch(PackageManager.NameNotFoundException e){
            e.printStackTrace();
        }
        return versionCode;
    }

    /**
     * アプリのバージョンネームを取得する
     * @param context
     * @return
     */
    public static String getAppVersionName(Context context){
        PackageManager pm = context.getPackageManager();
        String versionName = "";
        try{
            PackageInfo packageInfo = pm.getPackageInfo(context.getPackageName(), 0);
            versionName = packageInfo.versionName;
        }catch(PackageManager.NameNotFoundException e){
            e.printStackTrace();
        }
        return versionName;
    }
}

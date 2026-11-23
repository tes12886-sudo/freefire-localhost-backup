package com.dts.freefireth.FFNetCommand;

import android.text.TextUtils;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class IPUtil {
    private static final String TAG = "IPUtil";

    public static boolean isIPv4(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.matches("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");
    }

    public static InetAddress parseIPv4Address(String str) throws UnknownHostException {
        List<InetAddress> iPv4Addresses = parseIPv4Addresses(str);
        if (iPv4Addresses == null || iPv4Addresses.size() <= 0) {
            throw new UnknownHostException(str);
        }
        return iPv4Addresses.get(0);
    }

    public static String parseIPv4AddressString(String str) throws UnknownHostException {
        InetAddress iPv4Address = parseIPv4Address(str);
        if (iPv4Address != null) {
            return iPv4Address.getHostAddress();
        }
        throw new UnknownHostException(str);
    }

    public static List<InetAddress> parseIPv4Addresses(String str) throws UnknownHostException {
        ArrayList arrayList = new ArrayList();
        for (InetAddress inetAddress : InetAddress.getAllByName(str)) {
            if (isIPv4(inetAddress.getHostAddress())) {
                arrayList.add(inetAddress);
            }
        }
        return arrayList;
    }
}

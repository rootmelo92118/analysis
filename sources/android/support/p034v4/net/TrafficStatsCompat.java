package android.support.p034v4.net;

import android.net.TrafficStats;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.support.annotation.RequiresApi;
import java.net.DatagramSocket;
import java.net.Socket;

/* renamed from: android.support.v4.net.TrafficStatsCompat */
public final class TrafficStatsCompat {
    private static final TrafficStatsCompatBaseImpl IMPL;

    /* renamed from: android.support.v4.net.TrafficStatsCompat$TrafficStatsCompatBaseImpl */
    static class TrafficStatsCompatBaseImpl {
        TrafficStatsCompatBaseImpl() {
        }

        public void tagDatagramSocket(DatagramSocket datagramSocket) {
            ParcelFileDescriptor fromDatagramSocket = ParcelFileDescriptor.fromDatagramSocket(datagramSocket);
            TrafficStats.tagSocket(new DatagramSocketWrapper(datagramSocket, fromDatagramSocket.getFileDescriptor()));
            fromDatagramSocket.detachFd();
        }

        public void untagDatagramSocket(DatagramSocket datagramSocket) {
            ParcelFileDescriptor fromDatagramSocket = ParcelFileDescriptor.fromDatagramSocket(datagramSocket);
            TrafficStats.untagSocket(new DatagramSocketWrapper(datagramSocket, fromDatagramSocket.getFileDescriptor()));
            fromDatagramSocket.detachFd();
        }
    }

    @RequiresApi(24)
    /* renamed from: android.support.v4.net.TrafficStatsCompat$TrafficStatsCompatApi24Impl */
    static class TrafficStatsCompatApi24Impl extends TrafficStatsCompatBaseImpl {
        TrafficStatsCompatApi24Impl() {
        }

        public void tagDatagramSocket(DatagramSocket datagramSocket) {
            TrafficStats.tagDatagramSocket(datagramSocket);
        }

        public void untagDatagramSocket(DatagramSocket datagramSocket) {
            TrafficStats.untagDatagramSocket(datagramSocket);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 24) {
            IMPL = new TrafficStatsCompatApi24Impl();
        } else {
            IMPL = new TrafficStatsCompatBaseImpl();
        }
    }

    @Deprecated
    public static void clearThreadStatsTag() {
        TrafficStats.clearThreadStatsTag();
    }

    @Deprecated
    public static int getThreadStatsTag() {
        return TrafficStats.getThreadStatsTag();
    }

    @Deprecated
    public static void incrementOperationCount(int i) {
        TrafficStats.incrementOperationCount(i);
    }

    @Deprecated
    public static void incrementOperationCount(int i, int i2) {
        TrafficStats.incrementOperationCount(i, i2);
    }

    @Deprecated
    public static void setThreadStatsTag(int i) {
        TrafficStats.setThreadStatsTag(i);
    }

    @Deprecated
    public static void tagSocket(Socket socket) {
        TrafficStats.tagSocket(socket);
    }

    @Deprecated
    public static void untagSocket(Socket socket) {
        TrafficStats.untagSocket(socket);
    }

    public static void tagDatagramSocket(DatagramSocket datagramSocket) {
        IMPL.tagDatagramSocket(datagramSocket);
    }

    public static void untagDatagramSocket(DatagramSocket datagramSocket) {
        IMPL.untagDatagramSocket(datagramSocket);
    }

    private TrafficStatsCompat() {
    }
}

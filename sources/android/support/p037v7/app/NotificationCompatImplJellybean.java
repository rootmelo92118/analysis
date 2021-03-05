package android.support.p037v7.app;

import android.annotation.TargetApi;
import android.app.Notification;
import android.support.annotation.RequiresApi;
import android.support.p034v4.app.NotificationBuilderWithBuilderAccessor;

@TargetApi(16)
@RequiresApi(16)
/* renamed from: android.support.v7.app.NotificationCompatImplJellybean */
class NotificationCompatImplJellybean {
    NotificationCompatImplJellybean() {
    }

    public static void addBigTextStyle(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor, CharSequence charSequence) {
        new Notification.BigTextStyle(notificationBuilderWithBuilderAccessor.getBuilder()).bigText(charSequence);
    }
}

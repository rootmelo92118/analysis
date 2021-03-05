package android.support.p037v7.app;

import android.annotation.TargetApi;
import android.app.Notification;
import android.media.session.MediaSession;
import android.support.annotation.RequiresApi;
import android.support.p034v4.app.NotificationBuilderWithBuilderAccessor;

@TargetApi(21)
@RequiresApi(21)
/* renamed from: android.support.v7.app.NotificationCompatImpl21 */
class NotificationCompatImpl21 {
    NotificationCompatImpl21() {
    }

    public static void addMediaStyle(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor, int[] iArr, Object obj) {
        Notification.MediaStyle mediaStyle = new Notification.MediaStyle(notificationBuilderWithBuilderAccessor.getBuilder());
        if (iArr != null) {
            mediaStyle.setShowActionsInCompactView(iArr);
        }
        if (obj != null) {
            mediaStyle.setMediaSession((MediaSession.Token) obj);
        }
    }
}

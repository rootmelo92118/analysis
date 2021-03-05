package android.support.p037v7.app;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.p034v4.app.NotificationBuilderWithBuilderAccessor;
import android.support.p034v4.app.NotificationCompat;
import android.support.p034v4.app.NotificationCompatBase;
import android.support.p037v7.appcompat.C0510R;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.List;

@TargetApi(9)
@RequiresApi(9)
/* renamed from: android.support.v7.app.NotificationCompatImplBase */
class NotificationCompatImplBase {
    private static final int MAX_ACTION_BUTTONS = 3;
    static final int MAX_MEDIA_BUTTONS = 5;
    static final int MAX_MEDIA_BUTTONS_IN_COMPACT = 3;

    public static float constrain(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    NotificationCompatImplBase() {
    }

    @TargetApi(11)
    @RequiresApi(11)
    public static <T extends NotificationCompatBase.Action> RemoteViews overrideContentViewMedia(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor, Context context, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, Bitmap bitmap, CharSequence charSequence4, boolean z, long j, int i2, List<T> list, int[] iArr, boolean z2, PendingIntent pendingIntent, boolean z3) {
        RemoteViews generateContentViewMedia = generateContentViewMedia(context, charSequence, charSequence2, charSequence3, i, bitmap, charSequence4, z, j, i2, list, iArr, z2, pendingIntent, z3);
        notificationBuilderWithBuilderAccessor.getBuilder().setContent(generateContentViewMedia);
        if (z2) {
            notificationBuilderWithBuilderAccessor.getBuilder().setOngoing(true);
        }
        return generateContentViewMedia;
    }

    @TargetApi(11)
    @RequiresApi(11)
    private static <T extends NotificationCompatBase.Action> RemoteViews generateContentViewMedia(Context context, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, Bitmap bitmap, CharSequence charSequence4, boolean z, long j, int i2, List<T> list, int[] iArr, boolean z2, PendingIntent pendingIntent, boolean z3) {
        int i3;
        int[] iArr2 = iArr;
        RemoteViews applyStandardTemplate = applyStandardTemplate(context, charSequence, charSequence2, charSequence3, i, 0, bitmap, charSequence4, z, j, i2, 0, z3 ? C0510R.layout.notification_template_media_custom : C0510R.layout.notification_template_media, true);
        int size = list.size();
        if (iArr2 == null) {
            i3 = 0;
        } else {
            i3 = Math.min(iArr2.length, 3);
        }
        applyStandardTemplate.removeAllViews(C0510R.C0512id.media_actions);
        if (i3 > 0) {
            int i4 = 0;
            while (i4 < i3) {
                if (i4 < size) {
                    applyStandardTemplate.addView(C0510R.C0512id.media_actions, generateMediaActionButton(context, (NotificationCompatBase.Action) list.get(iArr2[i4])));
                    i4++;
                } else {
                    throw new IllegalArgumentException(String.format("setShowActionsInCompactView: action %d out of bounds (max %d)", new Object[]{Integer.valueOf(i4), Integer.valueOf(size - 1)}));
                }
            }
        }
        Context context2 = context;
        if (z2) {
            applyStandardTemplate.setViewVisibility(C0510R.C0512id.end_padder, 8);
            applyStandardTemplate.setViewVisibility(C0510R.C0512id.cancel_action, 0);
            applyStandardTemplate.setOnClickPendingIntent(C0510R.C0512id.cancel_action, pendingIntent);
            applyStandardTemplate.setInt(C0510R.C0512id.cancel_action, "setAlpha", context.getResources().getInteger(C0510R.integer.cancel_button_image_alpha));
        } else {
            applyStandardTemplate.setViewVisibility(C0510R.C0512id.end_padder, 0);
            applyStandardTemplate.setViewVisibility(C0510R.C0512id.cancel_action, 8);
        }
        return applyStandardTemplate;
    }

    @TargetApi(16)
    @RequiresApi(16)
    public static <T extends NotificationCompatBase.Action> void overrideMediaBigContentView(Notification notification, Context context, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, Bitmap bitmap, CharSequence charSequence4, boolean z, long j, int i2, int i3, List<T> list, boolean z2, PendingIntent pendingIntent, boolean z3) {
        Notification notification2 = notification;
        notification2.bigContentView = generateMediaBigView(context, charSequence, charSequence2, charSequence3, i, bitmap, charSequence4, z, j, i2, i3, list, z2, pendingIntent, z3);
        if (z2) {
            notification2.flags |= 2;
        }
    }

    @TargetApi(11)
    @RequiresApi(11)
    public static <T extends NotificationCompatBase.Action> RemoteViews generateMediaBigView(Context context, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, Bitmap bitmap, CharSequence charSequence4, boolean z, long j, int i2, int i3, List<T> list, boolean z2, PendingIntent pendingIntent, boolean z3) {
        int min = Math.min(list.size(), 5);
        RemoteViews applyStandardTemplate = applyStandardTemplate(context, charSequence, charSequence2, charSequence3, i, 0, bitmap, charSequence4, z, j, i2, i3, getBigMediaLayoutResource(z3, min), false);
        applyStandardTemplate.removeAllViews(C0510R.C0512id.media_actions);
        if (min > 0) {
            for (int i4 = 0; i4 < min; i4++) {
                applyStandardTemplate.addView(C0510R.C0512id.media_actions, generateMediaActionButton(context, (NotificationCompatBase.Action) list.get(i4)));
            }
        }
        Context context2 = context;
        if (z2) {
            applyStandardTemplate.setViewVisibility(C0510R.C0512id.cancel_action, 0);
            applyStandardTemplate.setInt(C0510R.C0512id.cancel_action, "setAlpha", context.getResources().getInteger(C0510R.integer.cancel_button_image_alpha));
            applyStandardTemplate.setOnClickPendingIntent(C0510R.C0512id.cancel_action, pendingIntent);
        } else {
            applyStandardTemplate.setViewVisibility(C0510R.C0512id.cancel_action, 8);
        }
        return applyStandardTemplate;
    }

    @TargetApi(11)
    @RequiresApi(11)
    private static RemoteViews generateMediaActionButton(Context context, NotificationCompatBase.Action action) {
        boolean z = action.getActionIntent() == null;
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), C0510R.layout.notification_media_action);
        remoteViews.setImageViewResource(C0510R.C0512id.action0, action.getIcon());
        if (!z) {
            remoteViews.setOnClickPendingIntent(C0510R.C0512id.action0, action.getActionIntent());
        }
        if (Build.VERSION.SDK_INT >= 15) {
            remoteViews.setContentDescription(C0510R.C0512id.action0, action.getTitle());
        }
        return remoteViews;
    }

    @TargetApi(11)
    @RequiresApi(11)
    private static int getBigMediaLayoutResource(boolean z, int i) {
        return i <= 3 ? z ? C0510R.layout.notification_template_big_media_narrow_custom : C0510R.layout.notification_template_big_media_narrow : z ? C0510R.layout.notification_template_big_media_custom : C0510R.layout.notification_template_big_media;
    }

    public static RemoteViews applyStandardTemplateWithActions(Context context, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, int i2, Bitmap bitmap, CharSequence charSequence4, boolean z, long j, int i3, int i4, int i5, boolean z2, ArrayList<NotificationCompat.Action> arrayList) {
        boolean z3;
        int size;
        RemoteViews applyStandardTemplate = applyStandardTemplate(context, charSequence, charSequence2, charSequence3, i, i2, bitmap, charSequence4, z, j, i3, i4, i5, z2);
        applyStandardTemplate.removeAllViews(C0510R.C0512id.actions);
        int i6 = 0;
        if (arrayList == null || (size = arrayList.size()) <= 0) {
            z3 = false;
        } else {
            if (size > 3) {
                size = 3;
            }
            for (int i7 = 0; i7 < size; i7++) {
                applyStandardTemplate.addView(C0510R.C0512id.actions, generateActionButton(context, arrayList.get(i7)));
            }
            z3 = true;
        }
        if (!z3) {
            i6 = 8;
        }
        applyStandardTemplate.setViewVisibility(C0510R.C0512id.actions, i6);
        applyStandardTemplate.setViewVisibility(C0510R.C0512id.action_divider, i6);
        return applyStandardTemplate;
    }

    private static RemoteViews generateActionButton(Context context, NotificationCompat.Action action) {
        int i;
        boolean z = action.actionIntent == null;
        String packageName = context.getPackageName();
        if (z) {
            i = getActionTombstoneLayoutResource();
        } else {
            i = getActionLayoutResource();
        }
        RemoteViews remoteViews = new RemoteViews(packageName, i);
        remoteViews.setImageViewBitmap(C0510R.C0512id.action_image, createColoredBitmap(context, action.getIcon(), context.getResources().getColor(C0510R.color.notification_action_color_filter)));
        remoteViews.setTextViewText(C0510R.C0512id.action_text, action.title);
        if (!z) {
            remoteViews.setOnClickPendingIntent(C0510R.C0512id.action_container, action.actionIntent);
        }
        if (Build.VERSION.SDK_INT >= 15) {
            remoteViews.setContentDescription(C0510R.C0512id.action_container, action.title);
        }
        return remoteViews;
    }

    private static Bitmap createColoredBitmap(Context context, int i, int i2) {
        return createColoredBitmap(context, i, i2, 0);
    }

    private static Bitmap createColoredBitmap(Context context, int i, int i2, int i3) {
        Drawable drawable = context.getResources().getDrawable(i);
        int intrinsicWidth = i3 == 0 ? drawable.getIntrinsicWidth() : i3;
        if (i3 == 0) {
            i3 = drawable.getIntrinsicHeight();
        }
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, i3, Bitmap.Config.ARGB_8888);
        drawable.setBounds(0, 0, intrinsicWidth, i3);
        if (i2 != 0) {
            drawable.mutate().setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_IN));
        }
        drawable.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    private static int getActionLayoutResource() {
        return C0510R.layout.notification_action;
    }

    private static int getActionTombstoneLayoutResource() {
        return C0510R.layout.notification_action_tombstone;
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01dd  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01df  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01e8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.widget.RemoteViews applyStandardTemplate(android.content.Context r17, java.lang.CharSequence r18, java.lang.CharSequence r19, java.lang.CharSequence r20, int r21, int r22, android.graphics.Bitmap r23, java.lang.CharSequence r24, boolean r25, long r26, int r28, int r29, int r30, boolean r31) {
        /*
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r22
            r6 = r23
            r7 = r24
            r8 = r26
            r10 = r29
            android.content.res.Resources r11 = r17.getResources()
            android.widget.RemoteViews r12 = new android.widget.RemoteViews
            java.lang.String r13 = r17.getPackageName()
            r14 = r30
            r12.<init>(r13, r14)
            r13 = -1
            r14 = r28
            if (r14 >= r13) goto L_0x002a
            r14 = 1
            goto L_0x002b
        L_0x002a:
            r14 = 0
        L_0x002b:
            int r13 = android.os.Build.VERSION.SDK_INT
            r15 = 16
            if (r13 < r15) goto L_0x005e
            int r13 = android.os.Build.VERSION.SDK_INT
            r15 = 21
            if (r13 >= r15) goto L_0x005e
            if (r14 == 0) goto L_0x004c
            int r13 = android.support.p037v7.appcompat.C0510R.C0512id.notification_background
            java.lang.String r14 = "setBackgroundResource"
            int r15 = android.support.p037v7.appcompat.C0510R.C0511drawable.notification_bg_low
            r12.setInt(r13, r14, r15)
            int r13 = android.support.p037v7.appcompat.C0510R.C0512id.icon
            java.lang.String r14 = "setBackgroundResource"
            int r15 = android.support.p037v7.appcompat.C0510R.C0511drawable.notification_template_icon_low_bg
            r12.setInt(r13, r14, r15)
            goto L_0x005e
        L_0x004c:
            int r13 = android.support.p037v7.appcompat.C0510R.C0512id.notification_background
            java.lang.String r14 = "setBackgroundResource"
            int r15 = android.support.p037v7.appcompat.C0510R.C0511drawable.notification_bg
            r12.setInt(r13, r14, r15)
            int r13 = android.support.p037v7.appcompat.C0510R.C0512id.icon
            java.lang.String r14 = "setBackgroundResource"
            int r15 = android.support.p037v7.appcompat.C0510R.C0511drawable.notification_template_icon_bg
            r12.setInt(r13, r14, r15)
        L_0x005e:
            r15 = 8
            if (r6 == 0) goto L_0x00ac
            int r13 = android.os.Build.VERSION.SDK_INT
            r14 = 16
            if (r13 < r14) goto L_0x0074
            int r13 = android.support.p037v7.appcompat.C0510R.C0512id.icon
            r14 = 0
            r12.setViewVisibility(r13, r14)
            int r13 = android.support.p037v7.appcompat.C0510R.C0512id.icon
            r12.setImageViewBitmap(r13, r6)
            goto L_0x0079
        L_0x0074:
            int r13 = android.support.p037v7.appcompat.C0510R.C0512id.icon
            r12.setViewVisibility(r13, r15)
        L_0x0079:
            if (r5 == 0) goto L_0x00e1
            int r13 = android.support.p037v7.appcompat.C0510R.dimen.notification_right_icon_size
            int r13 = r11.getDimensionPixelSize(r13)
            int r14 = android.support.p037v7.appcompat.C0510R.dimen.notification_small_icon_background_padding
            int r14 = r11.getDimensionPixelSize(r14)
            int r14 = r14 * 2
            int r14 = r13 - r14
            int r15 = android.os.Build.VERSION.SDK_INT
            r8 = 21
            if (r15 < r8) goto L_0x009b
            android.graphics.Bitmap r0 = createIconWithBackground(r0, r5, r13, r14, r10)
            int r5 = android.support.p037v7.appcompat.C0510R.C0512id.right_icon
            r12.setImageViewBitmap(r5, r0)
            goto L_0x00a5
        L_0x009b:
            int r8 = android.support.p037v7.appcompat.C0510R.C0512id.right_icon
            r9 = -1
            android.graphics.Bitmap r0 = createColoredBitmap(r0, r5, r9)
            r12.setImageViewBitmap(r8, r0)
        L_0x00a5:
            int r0 = android.support.p037v7.appcompat.C0510R.C0512id.right_icon
            r8 = 0
            r12.setViewVisibility(r0, r8)
            goto L_0x00e1
        L_0x00ac:
            r8 = 0
            if (r5 == 0) goto L_0x00e1
            int r9 = android.support.p037v7.appcompat.C0510R.C0512id.icon
            r12.setViewVisibility(r9, r8)
            int r8 = android.os.Build.VERSION.SDK_INT
            r9 = 21
            if (r8 < r9) goto L_0x00d7
            int r8 = android.support.p037v7.appcompat.C0510R.dimen.notification_large_icon_width
            int r8 = r11.getDimensionPixelSize(r8)
            int r9 = android.support.p037v7.appcompat.C0510R.dimen.notification_big_circle_margin
            int r9 = r11.getDimensionPixelSize(r9)
            int r8 = r8 - r9
            int r9 = android.support.p037v7.appcompat.C0510R.dimen.notification_small_icon_size_as_large
            int r9 = r11.getDimensionPixelSize(r9)
            android.graphics.Bitmap r0 = createIconWithBackground(r0, r5, r8, r9, r10)
            int r5 = android.support.p037v7.appcompat.C0510R.C0512id.icon
            r12.setImageViewBitmap(r5, r0)
            goto L_0x00e1
        L_0x00d7:
            int r8 = android.support.p037v7.appcompat.C0510R.C0512id.icon
            r9 = -1
            android.graphics.Bitmap r0 = createColoredBitmap(r0, r5, r9)
            r12.setImageViewBitmap(r8, r0)
        L_0x00e1:
            if (r1 == 0) goto L_0x00e8
            int r0 = android.support.p037v7.appcompat.C0510R.C0512id.title
            r12.setTextViewText(r0, r1)
        L_0x00e8:
            if (r2 == 0) goto L_0x00f1
            int r0 = android.support.p037v7.appcompat.C0510R.C0512id.text
            r12.setTextViewText(r0, r2)
            r14 = 1
            goto L_0x00f2
        L_0x00f1:
            r14 = 0
        L_0x00f2:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 >= r1) goto L_0x00fc
            if (r6 == 0) goto L_0x00fc
            r0 = 1
            goto L_0x00fd
        L_0x00fc:
            r0 = 0
        L_0x00fd:
            if (r3 == 0) goto L_0x010d
            int r0 = android.support.p037v7.appcompat.C0510R.C0512id.info
            r12.setTextViewText(r0, r3)
            int r0 = android.support.p037v7.appcompat.C0510R.C0512id.info
            r1 = 0
            r12.setViewVisibility(r0, r1)
        L_0x010a:
            r0 = 1
            r14 = 1
            goto L_0x0144
        L_0x010d:
            if (r4 <= 0) goto L_0x0138
            int r0 = android.support.p037v7.appcompat.C0510R.integer.status_bar_notification_info_maxnum
            int r0 = r11.getInteger(r0)
            if (r4 <= r0) goto L_0x0123
            int r0 = android.support.p037v7.appcompat.C0510R.C0512id.info
            int r1 = android.support.p037v7.appcompat.C0510R.string.status_bar_notification_info_overflow
            java.lang.String r1 = r11.getString(r1)
            r12.setTextViewText(r0, r1)
            goto L_0x0131
        L_0x0123:
            java.text.NumberFormat r0 = java.text.NumberFormat.getIntegerInstance()
            int r1 = android.support.p037v7.appcompat.C0510R.C0512id.info
            long r3 = (long) r4
            java.lang.String r0 = r0.format(r3)
            r12.setTextViewText(r1, r0)
        L_0x0131:
            int r0 = android.support.p037v7.appcompat.C0510R.C0512id.info
            r1 = 0
            r12.setViewVisibility(r0, r1)
            goto L_0x010a
        L_0x0138:
            int r1 = android.support.p037v7.appcompat.C0510R.C0512id.info
            r3 = 8
            r12.setViewVisibility(r1, r3)
            r16 = r14
            r14 = r0
            r0 = r16
        L_0x0144:
            if (r7 == 0) goto L_0x016a
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 16
            if (r1 < r3) goto L_0x016a
            int r1 = android.support.p037v7.appcompat.C0510R.C0512id.text
            r12.setTextViewText(r1, r7)
            if (r2 == 0) goto L_0x0162
            int r1 = android.support.p037v7.appcompat.C0510R.C0512id.text2
            r12.setTextViewText(r1, r2)
            int r1 = android.support.p037v7.appcompat.C0510R.C0512id.text2
            r2 = 0
            r12.setViewVisibility(r1, r2)
            r1 = 1
            r8 = 8
            goto L_0x016d
        L_0x0162:
            int r1 = android.support.p037v7.appcompat.C0510R.C0512id.text2
            r8 = 8
            r12.setViewVisibility(r1, r8)
            goto L_0x016c
        L_0x016a:
            r8 = 8
        L_0x016c:
            r1 = 0
        L_0x016d:
            if (r1 == 0) goto L_0x0199
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 16
            if (r1 < r2) goto L_0x0199
            if (r31 == 0) goto L_0x0184
            int r1 = android.support.p037v7.appcompat.C0510R.dimen.notification_subtext_size
            int r1 = r11.getDimensionPixelSize(r1)
            float r1 = (float) r1
            int r2 = android.support.p037v7.appcompat.C0510R.C0512id.text
            r3 = 0
            r12.setTextViewTextSize(r2, r3, r1)
        L_0x0184:
            int r1 = android.support.p037v7.appcompat.C0510R.C0512id.line1
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r17 = r12
            r18 = r1
            r19 = r2
            r20 = r3
            r21 = r4
            r22 = r5
            r17.setViewPadding(r18, r19, r20, r21, r22)
        L_0x0199:
            r1 = 0
            r3 = r26
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 == 0) goto L_0x01d8
            if (r25 == 0) goto L_0x01c9
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 16
            if (r1 < r2) goto L_0x01c9
            int r1 = android.support.p037v7.appcompat.C0510R.C0512id.chronometer
            r2 = 0
            r12.setViewVisibility(r1, r2)
            int r1 = android.support.p037v7.appcompat.C0510R.C0512id.chronometer
            java.lang.String r2 = "setBase"
            long r5 = android.os.SystemClock.elapsedRealtime()
            long r9 = java.lang.System.currentTimeMillis()
            long r5 = r5 - r9
            long r3 = r3 + r5
            r12.setLong(r1, r2, r3)
            int r1 = android.support.p037v7.appcompat.C0510R.C0512id.chronometer
            java.lang.String r2 = "setStarted"
            r14 = 1
            r12.setBoolean(r1, r2, r14)
            goto L_0x01d8
        L_0x01c9:
            r14 = 1
            int r1 = android.support.p037v7.appcompat.C0510R.C0512id.time
            r15 = 0
            r12.setViewVisibility(r1, r15)
            int r1 = android.support.p037v7.appcompat.C0510R.C0512id.time
            java.lang.String r2 = "setTime"
            r12.setLong(r1, r2, r3)
            goto L_0x01d9
        L_0x01d8:
            r15 = 0
        L_0x01d9:
            int r1 = android.support.p037v7.appcompat.C0510R.C0512id.right_side
            if (r14 == 0) goto L_0x01df
            r2 = 0
            goto L_0x01e1
        L_0x01df:
            r2 = 8
        L_0x01e1:
            r12.setViewVisibility(r1, r2)
            int r1 = android.support.p037v7.appcompat.C0510R.C0512id.line3
            if (r0 == 0) goto L_0x01e9
            r8 = 0
        L_0x01e9:
            r12.setViewVisibility(r1, r8)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p037v7.app.NotificationCompatImplBase.applyStandardTemplate(android.content.Context, java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, int, android.graphics.Bitmap, java.lang.CharSequence, boolean, long, int, int, int, boolean):android.widget.RemoteViews");
    }

    public static Bitmap createIconWithBackground(Context context, int i, int i2, int i3, int i4) {
        int i5 = C0510R.C0511drawable.notification_icon_background;
        if (i4 == 0) {
            i4 = 0;
        }
        Bitmap createColoredBitmap = createColoredBitmap(context, i5, i4, i2);
        Canvas canvas = new Canvas(createColoredBitmap);
        Drawable mutate = context.getResources().getDrawable(i).mutate();
        mutate.setFilterBitmap(true);
        int i6 = (i2 - i3) / 2;
        int i7 = i3 + i6;
        mutate.setBounds(i6, i6, i7, i7);
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
        mutate.draw(canvas);
        return createColoredBitmap;
    }

    public static void buildIntoRemoteViews(Context context, RemoteViews remoteViews, RemoteViews remoteViews2) {
        hideNormalContent(remoteViews);
        remoteViews.removeAllViews(C0510R.C0512id.notification_main_column);
        remoteViews.addView(C0510R.C0512id.notification_main_column, remoteViews2.clone());
        remoteViews.setViewVisibility(C0510R.C0512id.notification_main_column, 0);
        if (Build.VERSION.SDK_INT >= 21) {
            remoteViews.setViewPadding(C0510R.C0512id.notification_main_column_container, 0, calculateTopPadding(context), 0, 0);
        }
    }

    private static void hideNormalContent(RemoteViews remoteViews) {
        remoteViews.setViewVisibility(C0510R.C0512id.title, 8);
        remoteViews.setViewVisibility(C0510R.C0512id.text2, 8);
        remoteViews.setViewVisibility(C0510R.C0512id.text, 8);
    }

    public static int calculateTopPadding(Context context) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C0510R.dimen.notification_top_pad);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(C0510R.dimen.notification_top_pad_large_text);
        float constrain = (constrain(context.getResources().getConfiguration().fontScale, 1.0f, 1.3f) - 1.0f) / 0.29999995f;
        return Math.round(((1.0f - constrain) * ((float) dimensionPixelSize)) + (constrain * ((float) dimensionPixelSize2)));
    }
}

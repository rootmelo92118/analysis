package android.support.p037v7.view.menu;

import android.content.Context;
import android.os.Build;
import android.support.annotation.RestrictTo;
import android.support.p034v4.internal.view.SupportMenu;
import android.support.p034v4.internal.view.SupportMenuItem;
import android.support.p034v4.internal.view.SupportSubMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: android.support.v7.view.menu.MenuWrapperFactory */
public final class MenuWrapperFactory {
    private MenuWrapperFactory() {
    }

    public static Menu wrapSupportMenu(Context context, SupportMenu supportMenu) {
        if (Build.VERSION.SDK_INT >= 14) {
            return new MenuWrapperICS(context, supportMenu);
        }
        throw new UnsupportedOperationException();
    }

    public static MenuItem wrapSupportMenuItem(Context context, SupportMenuItem supportMenuItem) {
        if (Build.VERSION.SDK_INT >= 16) {
            return new MenuItemWrapperJB(context, supportMenuItem);
        }
        if (Build.VERSION.SDK_INT >= 14) {
            return new MenuItemWrapperICS(context, supportMenuItem);
        }
        throw new UnsupportedOperationException();
    }

    public static SubMenu wrapSupportSubMenu(Context context, SupportSubMenu supportSubMenu) {
        if (Build.VERSION.SDK_INT >= 14) {
            return new SubMenuWrapperICS(context, supportSubMenu);
        }
        throw new UnsupportedOperationException();
    }
}
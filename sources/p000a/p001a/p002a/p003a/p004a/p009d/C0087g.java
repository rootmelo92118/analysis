package p000a.p001a.p002a.p003a.p004a.p009d;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: a.a.a.a.a.d.g */
/* compiled from: GZIPQueueFileEventStorage */
public class C0087g extends C0088h {
    public C0087g(Context context, File file, String str, String str2) {
        super(context, file, str, str2);
    }

    /* renamed from: a */
    public OutputStream mo192a(File file) {
        return new GZIPOutputStream(new FileOutputStream(file));
    }
}

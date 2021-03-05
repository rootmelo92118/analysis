package com.google.android.gms.internal.ads;

import android.util.Log;
import com.google.android.gms.internal.ads.zzki;

final class bdv {

    /* renamed from: A */
    private static final int f3830A = bkp.m5828f("sosn");

    /* renamed from: B */
    private static final int f3831B = bkp.m5828f("tvsh");

    /* renamed from: C */
    private static final int f3832C = bkp.m5828f("----");

    /* renamed from: D */
    private static final String[] f3833D = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop"};

    /* renamed from: a */
    private static final int f3834a = bkp.m5828f("nam");

    /* renamed from: b */
    private static final int f3835b = bkp.m5828f("trk");

    /* renamed from: c */
    private static final int f3836c = bkp.m5828f("cmt");

    /* renamed from: d */
    private static final int f3837d = bkp.m5828f("day");

    /* renamed from: e */
    private static final int f3838e = bkp.m5828f("ART");

    /* renamed from: f */
    private static final int f3839f = bkp.m5828f("too");

    /* renamed from: g */
    private static final int f3840g = bkp.m5828f("alb");

    /* renamed from: h */
    private static final int f3841h = bkp.m5828f("com");

    /* renamed from: i */
    private static final int f3842i = bkp.m5828f("wrt");

    /* renamed from: j */
    private static final int f3843j = bkp.m5828f("lyr");

    /* renamed from: k */
    private static final int f3844k = bkp.m5828f("gen");

    /* renamed from: l */
    private static final int f3845l = bkp.m5828f("covr");

    /* renamed from: m */
    private static final int f3846m = bkp.m5828f("gnre");

    /* renamed from: n */
    private static final int f3847n = bkp.m5828f("grp");

    /* renamed from: o */
    private static final int f3848o = bkp.m5828f("disk");

    /* renamed from: p */
    private static final int f3849p = bkp.m5828f("trkn");

    /* renamed from: q */
    private static final int f3850q = bkp.m5828f("tmpo");

    /* renamed from: r */
    private static final int f3851r = bkp.m5828f("cpil");

    /* renamed from: s */
    private static final int f3852s = bkp.m5828f("aART");

    /* renamed from: t */
    private static final int f3853t = bkp.m5828f("sonm");

    /* renamed from: u */
    private static final int f3854u = bkp.m5828f("soal");

    /* renamed from: v */
    private static final int f3855v = bkp.m5828f("soar");

    /* renamed from: w */
    private static final int f3856w = bkp.m5828f("soaa");

    /* renamed from: x */
    private static final int f3857x = bkp.m5828f("soco");

    /* renamed from: y */
    private static final int f3858y = bkp.m5828f("rtng");

    /* renamed from: z */
    private static final int f3859z = bkp.m5828f("pgap");

    /* renamed from: a */
    public static zzki.zza m5063a(bkh bkh) {
        zzkq zzkq;
        int d = bkh.mo12055d() + bkh.mo12065l();
        int l = bkh.mo12065l();
        int i = l >>> 24;
        zzkp zzkp = null;
        if (i == 169 || i == 65533) {
            int i2 = 16777215 & l;
            if (i2 == f3836c) {
                int l2 = bkh.mo12065l();
                if (bkh.mo12065l() == bdd.f3677aE) {
                    bkh.mo12056d(8);
                    String e = bkh.mo12058e(l2 - 16);
                    zzkp = new zzkm("und", e, e);
                } else {
                    String valueOf = String.valueOf(bdd.m5027c(l));
                    Log.w("MetadataUtil", valueOf.length() != 0 ? "Failed to parse comment attribute: ".concat(valueOf) : new String("Failed to parse comment attribute: "));
                }
                bkh.mo12054c(d);
                return zzkp;
            }
            if (i2 != f3834a) {
                if (i2 != f3835b) {
                    if (i2 != f3841h) {
                        if (i2 != f3842i) {
                            if (i2 == f3837d) {
                                zzkq a = m5065a(l, "TDRC", bkh);
                                bkh.mo12054c(d);
                                return a;
                            } else if (i2 == f3838e) {
                                zzkq a2 = m5065a(l, "TPE1", bkh);
                                bkh.mo12054c(d);
                                return a2;
                            } else if (i2 == f3839f) {
                                zzkq a3 = m5065a(l, "TSSE", bkh);
                                bkh.mo12054c(d);
                                return a3;
                            } else if (i2 == f3840g) {
                                zzkq a4 = m5065a(l, "TALB", bkh);
                                bkh.mo12054c(d);
                                return a4;
                            } else if (i2 == f3843j) {
                                zzkq a5 = m5065a(l, "USLT", bkh);
                                bkh.mo12054c(d);
                                return a5;
                            } else if (i2 == f3844k) {
                                zzkq a6 = m5065a(l, "TCON", bkh);
                                bkh.mo12054c(d);
                                return a6;
                            } else if (i2 == f3847n) {
                                zzkq a7 = m5065a(l, "TIT1", bkh);
                                bkh.mo12054c(d);
                                return a7;
                            }
                        }
                    }
                    zzkq a8 = m5065a(l, "TCOM", bkh);
                    bkh.mo12054c(d);
                    return a8;
                }
            }
            zzkq a9 = m5065a(l, "TIT2", bkh);
            bkh.mo12054c(d);
            return a9;
        }
        try {
            if (l == f3846m) {
                int b = m5066b(bkh);
                String str = (b <= 0 || b > f3833D.length) ? null : f3833D[b - 1];
                if (str != null) {
                    zzkq = new zzkq("TCON", (String) null, str);
                } else {
                    Log.w("MetadataUtil", "Failed to parse standard genre code");
                    zzkq = null;
                }
                return zzkq;
            } else if (l == f3848o) {
                zzkq b2 = m5067b(l, "TPOS", bkh);
                bkh.mo12054c(d);
                return b2;
            } else if (l == f3849p) {
                zzkq b3 = m5067b(l, "TRCK", bkh);
                bkh.mo12054c(d);
                return b3;
            } else if (l == f3850q) {
                zzkp a10 = m5064a(l, "TBPM", bkh, true, false);
                bkh.mo12054c(d);
                return a10;
            } else if (l == f3851r) {
                zzkp a11 = m5064a(l, "TCMP", bkh, true, true);
                bkh.mo12054c(d);
                return a11;
            } else if (l == f3845l) {
                int l3 = bkh.mo12065l();
                if (bkh.mo12065l() == bdd.f3677aE) {
                    int b4 = bdd.m5026b(bkh.mo12065l());
                    String str2 = b4 == 13 ? "image/jpeg" : b4 == 14 ? "image/png" : null;
                    if (str2 == null) {
                        StringBuilder sb = new StringBuilder(41);
                        sb.append("Unrecognized cover art flags: ");
                        sb.append(b4);
                        Log.w("MetadataUtil", sb.toString());
                    } else {
                        bkh.mo12056d(4);
                        byte[] bArr = new byte[(l3 - 16)];
                        bkh.mo12050a(bArr, 0, bArr.length);
                        zzkp = new zzkk(str2, (String) null, 3, bArr);
                    }
                } else {
                    Log.w("MetadataUtil", "Failed to parse cover art attribute");
                }
                bkh.mo12054c(d);
                return zzkp;
            } else if (l == f3852s) {
                zzkq a12 = m5065a(l, "TPE2", bkh);
                bkh.mo12054c(d);
                return a12;
            } else if (l == f3853t) {
                zzkq a13 = m5065a(l, "TSOT", bkh);
                bkh.mo12054c(d);
                return a13;
            } else if (l == f3854u) {
                zzkq a14 = m5065a(l, "TSO2", bkh);
                bkh.mo12054c(d);
                return a14;
            } else if (l == f3855v) {
                zzkq a15 = m5065a(l, "TSOA", bkh);
                bkh.mo12054c(d);
                return a15;
            } else if (l == f3856w) {
                zzkq a16 = m5065a(l, "TSOP", bkh);
                bkh.mo12054c(d);
                return a16;
            } else if (l == f3857x) {
                zzkq a17 = m5065a(l, "TSOC", bkh);
                bkh.mo12054c(d);
                return a17;
            } else if (l == f3858y) {
                zzkp a18 = m5064a(l, "ITUNESADVISORY", bkh, false, false);
                bkh.mo12054c(d);
                return a18;
            } else if (l == f3859z) {
                zzkp a19 = m5064a(l, "ITUNESGAPLESS", bkh, false, true);
                bkh.mo12054c(d);
                return a19;
            } else if (l == f3830A) {
                zzkq a20 = m5065a(l, "TVSHOWSORT", bkh);
                bkh.mo12054c(d);
                return a20;
            } else if (l == f3831B) {
                zzkq a21 = m5065a(l, "TVSHOW", bkh);
                bkh.mo12054c(d);
                return a21;
            } else if (l == f3832C) {
                String str3 = null;
                String str4 = null;
                int i3 = -1;
                int i4 = -1;
                while (bkh.mo12055d() < d) {
                    int d2 = bkh.mo12055d();
                    int l4 = bkh.mo12065l();
                    int l5 = bkh.mo12065l();
                    bkh.mo12056d(4);
                    if (l5 == bdd.f3675aC) {
                        str3 = bkh.mo12058e(l4 - 12);
                    } else if (l5 == bdd.f3676aD) {
                        str4 = bkh.mo12058e(l4 - 12);
                    } else {
                        if (l5 == bdd.f3677aE) {
                            i3 = d2;
                            i4 = l4;
                        }
                        bkh.mo12056d(l4 - 12);
                    }
                }
                if ("com.apple.iTunes".equals(str3) && "iTunSMPB".equals(str4)) {
                    if (i3 != -1) {
                        bkh.mo12054c(i3);
                        bkh.mo12056d(16);
                        zzkp = new zzkm("und", str4, bkh.mo12058e(i4 - 16));
                    }
                }
                bkh.mo12054c(d);
                return zzkp;
            }
        } finally {
            bkh.mo12054c(d);
        }
        String valueOf2 = String.valueOf(bdd.m5027c(l));
        Log.d("MetadataUtil", valueOf2.length() != 0 ? "Skipped unknown metadata entry: ".concat(valueOf2) : new String("Skipped unknown metadata entry: "));
        bkh.mo12054c(d);
        return null;
    }

    /* renamed from: a */
    private static zzkq m5065a(int i, String str, bkh bkh) {
        int l = bkh.mo12065l();
        if (bkh.mo12065l() == bdd.f3677aE) {
            bkh.mo12056d(8);
            return new zzkq(str, (String) null, bkh.mo12058e(l - 16));
        }
        String valueOf = String.valueOf(bdd.m5027c(i));
        Log.w("MetadataUtil", valueOf.length() != 0 ? "Failed to parse text attribute: ".concat(valueOf) : new String("Failed to parse text attribute: "));
        return null;
    }

    /* renamed from: a */
    private static zzkp m5064a(int i, String str, bkh bkh, boolean z, boolean z2) {
        int b = m5066b(bkh);
        if (z2) {
            b = Math.min(1, b);
        }
        if (b < 0) {
            String valueOf = String.valueOf(bdd.m5027c(i));
            Log.w("MetadataUtil", valueOf.length() != 0 ? "Failed to parse uint8 attribute: ".concat(valueOf) : new String("Failed to parse uint8 attribute: "));
            return null;
        } else if (z) {
            return new zzkq(str, (String) null, Integer.toString(b));
        } else {
            return new zzkm("und", str, Integer.toString(b));
        }
    }

    /* renamed from: b */
    private static zzkq m5067b(int i, String str, bkh bkh) {
        int l = bkh.mo12065l();
        if (bkh.mo12065l() == bdd.f3677aE && l >= 22) {
            bkh.mo12056d(10);
            int g = bkh.mo12060g();
            if (g > 0) {
                StringBuilder sb = new StringBuilder(11);
                sb.append(g);
                String sb2 = sb.toString();
                int g2 = bkh.mo12060g();
                if (g2 > 0) {
                    String valueOf = String.valueOf(sb2);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 12);
                    sb3.append(valueOf);
                    sb3.append("/");
                    sb3.append(g2);
                    sb2 = sb3.toString();
                }
                return new zzkq(str, (String) null, sb2);
            }
        }
        String valueOf2 = String.valueOf(bdd.m5027c(i));
        Log.w("MetadataUtil", valueOf2.length() != 0 ? "Failed to parse index/count attribute: ".concat(valueOf2) : new String("Failed to parse index/count attribute: "));
        return null;
    }

    /* renamed from: b */
    private static int m5066b(bkh bkh) {
        bkh.mo12056d(4);
        if (bkh.mo12065l() == bdd.f3677aE) {
            bkh.mo12056d(8);
            return bkh.mo12059f();
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }
}

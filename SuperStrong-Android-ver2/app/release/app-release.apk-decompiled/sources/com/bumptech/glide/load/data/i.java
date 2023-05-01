package com.bumptech.glide.load.data;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
/* loaded from: classes.dex */
public final class i implements d<InputStream> {

    /* renamed from: b  reason: collision with root package name */
    public final o1.f f2861b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2862c;

    /* renamed from: d  reason: collision with root package name */
    public HttpURLConnection f2863d;

    /* renamed from: e  reason: collision with root package name */
    public InputStream f2864e;

    /* renamed from: f  reason: collision with root package name */
    public volatile boolean f2865f;

    /* loaded from: classes.dex */
    public static class a {
    }

    static {
        new a();
    }

    public i(o1.f fVar, int i6) {
        this.f2861b = fVar;
        this.f2862c = i6;
    }

    public static int c(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e6) {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Failed to get a response code", e6);
                return -1;
            }
            return -1;
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void b() {
        InputStream inputStream = this.f2864e;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f2863d;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f2863d = null;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
        this.f2865f = true;
    }

    public final InputStream d(URL url, int i6, URL url2, Map<String, String> map) {
        boolean z5;
        InputStream inputStream;
        if (i6 < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new i1.e(-1, "In re-direct loop", null);
                    }
                } catch (URISyntaxException unused) {
                }
            }
            boolean z6 = false;
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                }
                int i7 = this.f2862c;
                httpURLConnection.setConnectTimeout(i7);
                httpURLConnection.setReadTimeout(i7);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setInstanceFollowRedirects(false);
                this.f2863d = httpURLConnection;
                try {
                    httpURLConnection.connect();
                    this.f2864e = this.f2863d.getInputStream();
                    if (this.f2865f) {
                        return null;
                    }
                    int c6 = c(this.f2863d);
                    int i8 = c6 / 100;
                    if (i8 == 2) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        HttpURLConnection httpURLConnection2 = this.f2863d;
                        try {
                            if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                                inputStream = new e2.c(httpURLConnection2.getInputStream(), httpURLConnection2.getContentLength());
                            } else {
                                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                    Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection2.getContentEncoding());
                                }
                                inputStream = httpURLConnection2.getInputStream();
                            }
                            this.f2864e = inputStream;
                            return inputStream;
                        } catch (IOException e6) {
                            throw new i1.e(c(httpURLConnection2), "Failed to obtain InputStream", e6);
                        }
                    }
                    if (i8 == 3) {
                        z6 = true;
                    }
                    if (z6) {
                        String headerField = this.f2863d.getHeaderField("Location");
                        if (!TextUtils.isEmpty(headerField)) {
                            try {
                                URL url3 = new URL(url, headerField);
                                b();
                                return d(url3, i6 + 1, url, map);
                            } catch (MalformedURLException e7) {
                                throw new i1.e(c6, "Bad redirect url: " + headerField, e7);
                            }
                        }
                        throw new i1.e(c6, "Received empty or null redirect url", null);
                    } else if (c6 == -1) {
                        throw new i1.e(c6, "Http request failed", null);
                    } else {
                        try {
                            throw new i1.e(c6, this.f2863d.getResponseMessage(), null);
                        } catch (IOException e8) {
                            throw new i1.e(c6, "Failed to get a response message", e8);
                        }
                    }
                } catch (IOException e9) {
                    throw new i1.e(c(this.f2863d), "Failed to connect or obtain data", e9);
                }
            } catch (IOException e10) {
                throw new i1.e(0, "URL.openConnection threw", e10);
            }
        }
        throw new i1.e(-1, "Too many (> 5) redirects!", null);
    }

    @Override // com.bumptech.glide.load.data.d
    public final i1.a e() {
        return i1.a.REMOTE;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void f(com.bumptech.glide.i iVar, d.a<? super InputStream> aVar) {
        StringBuilder sb;
        o1.f fVar = this.f2861b;
        int i6 = e2.f.f3822b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                aVar.d(d(fVar.d(), 0, null, fVar.f5524b.a()));
            } catch (IOException e6) {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Failed to load data for url", e6);
                }
                aVar.c(e6);
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    sb = new StringBuilder("Finished http url fetcher fetch in ");
                } else {
                    return;
                }
            }
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb = new StringBuilder("Finished http url fetcher fetch in ");
                sb.append(e2.f.a(elapsedRealtimeNanos));
                Log.v("HttpUrlFetcher", sb.toString());
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + e2.f.a(elapsedRealtimeNanos));
            }
            throw th;
        }
    }
}

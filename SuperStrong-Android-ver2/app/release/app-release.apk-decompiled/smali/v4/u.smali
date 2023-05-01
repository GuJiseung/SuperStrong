.class public final Lv4/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;
.implements Lv4/d$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv4/u$b;
    }
.end annotation


# static fields
.field public static final x:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lv4/v;",
            ">;"
        }
    .end annotation
.end field

.field public static final y:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lv4/h;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final b:Lv4/k;

.field public final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lv4/v;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lv4/h;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lv4/r;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lv4/r;",
            ">;"
        }
    .end annotation
.end field

.field public final g:Lm3/j;

.field public final h:Ljava/net/ProxySelector;

.field public final i:Lv4/j$a;

.field public final j:Ljavax/net/SocketFactory;

.field public final k:Ljavax/net/ssl/SSLSocketFactory;

.field public final l:Ljavax/net/ssl/HostnameVerifier;

.field public final m:Lv4/f;

.field public final n:Landroidx/fragment/app/x0;

.field public final o:Landroidx/fragment/app/x0;

.field public final p:Ld/s;

.field public final q:La2/d;

.field public final r:Z

.field public final s:Z

.field public final t:Z

.field public final u:I

.field public final v:I

.field public final w:I


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    const/4 v0, 0x2

    new-array v1, v0, [Lv4/v;

    sget-object v2, Lv4/v;->f:Lv4/v;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget-object v2, Lv4/v;->d:Lv4/v;

    const/4 v4, 0x1

    aput-object v2, v1, v4

    invoke-static {v1}, Lw4/e;->l([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    sput-object v1, Lv4/u;->x:Ljava/util/List;

    new-array v0, v0, [Lv4/h;

    sget-object v1, Lv4/h;->e:Lv4/h;

    aput-object v1, v0, v3

    sget-object v1, Lv4/h;->f:Lv4/h;

    aput-object v1, v0, v4

    invoke-static {v0}, Lw4/e;->l([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lv4/u;->y:Ljava/util/List;

    new-instance v0, Lv4/u$a;

    invoke-direct {v0}, Lv4/u$a;-><init>()V

    sput-object v0, Lw4/a;->a:Lv4/u$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    new-instance v0, Lv4/u$b;

    invoke-direct {v0}, Lv4/u$b;-><init>()V

    invoke-direct {p0, v0}, Lv4/u;-><init>(Lv4/u$b;)V

    return-void
.end method

.method public constructor <init>(Lv4/u$b;)V
    .locals 8

    const-string v0, "No System TLS"

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v1, p1, Lv4/u$b;->a:Lv4/k;

    iput-object v1, p0, Lv4/u;->b:Lv4/k;

    iget-object v1, p1, Lv4/u$b;->b:Ljava/util/List;

    iput-object v1, p0, Lv4/u;->c:Ljava/util/List;

    iget-object v1, p1, Lv4/u$b;->c:Ljava/util/List;

    iput-object v1, p0, Lv4/u;->d:Ljava/util/List;

    iget-object v2, p1, Lv4/u$b;->d:Ljava/util/ArrayList;

    invoke-static {v2}, Lw4/e;->k(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Lv4/u;->e:Ljava/util/List;

    iget-object v2, p1, Lv4/u$b;->e:Ljava/util/ArrayList;

    invoke-static {v2}, Lw4/e;->k(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Lv4/u;->f:Ljava/util/List;

    iget-object v2, p1, Lv4/u$b;->f:Lm3/j;

    iput-object v2, p0, Lv4/u;->g:Lm3/j;

    iget-object v2, p1, Lv4/u$b;->g:Ljava/net/ProxySelector;

    iput-object v2, p0, Lv4/u;->h:Ljava/net/ProxySelector;

    iget-object v2, p1, Lv4/u$b;->h:Lv4/j$a;

    iput-object v2, p0, Lv4/u;->i:Lv4/j$a;

    iget-object v2, p1, Lv4/u$b;->i:Ljavax/net/SocketFactory;

    iput-object v2, p0, Lv4/u;->j:Ljavax/net/SocketFactory;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    const/4 v2, 0x0

    move v3, v2

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v5, 0x1

    if-eqz v4, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lv4/h;

    if-nez v3, :cond_1

    .line 1
    iget-boolean v3, v4, Lv4/h;->a:Z

    if-eqz v3, :cond_0

    :cond_1
    move v3, v5

    goto :goto_0

    .line 2
    :cond_2
    iget-object v1, p1, Lv4/u$b;->j:Ljavax/net/ssl/SSLSocketFactory;

    const/4 v4, 0x0

    if-nez v1, :cond_5

    if-nez v3, :cond_3

    goto :goto_1

    :cond_3
    const-string v1, "Unexpected default trust managers:"

    .line 3
    :try_start_0
    invoke-static {}, Ljavax/net/ssl/TrustManagerFactory;->getDefaultAlgorithm()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljavax/net/ssl/TrustManagerFactory;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/TrustManagerFactory;

    move-result-object v3

    invoke-virtual {v3, v4}, Ljavax/net/ssl/TrustManagerFactory;->init(Ljava/security/KeyStore;)V

    invoke-virtual {v3}, Ljavax/net/ssl/TrustManagerFactory;->getTrustManagers()[Ljavax/net/ssl/TrustManager;

    move-result-object v3

    array-length v6, v3

    if-ne v6, v5, :cond_4

    aget-object v6, v3, v2

    instance-of v7, v6, Ljavax/net/ssl/X509TrustManager;

    if-eqz v7, :cond_4

    check-cast v6, Ljavax/net/ssl/X509TrustManager;
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_1

    .line 4
    :try_start_1
    sget-object v1, Lc5/f;->a:Lc5/f;

    .line 5
    invoke-virtual {v1}, Lc5/f;->i()Ljavax/net/ssl/SSLContext;

    move-result-object v3

    new-array v5, v5, [Ljavax/net/ssl/TrustManager;

    aput-object v6, v5, v2

    invoke-virtual {v3, v4, v5, v4}, Ljavax/net/ssl/SSLContext;->init([Ljavax/net/ssl/KeyManager;[Ljavax/net/ssl/TrustManager;Ljava/security/SecureRandom;)V

    invoke-virtual {v3}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0
    :try_end_1
    .catch Ljava/security/GeneralSecurityException; {:try_start_1 .. :try_end_1} :catch_0

    .line 6
    iput-object v0, p0, Lv4/u;->k:Ljavax/net/ssl/SSLSocketFactory;

    .line 7
    invoke-virtual {v1, v6}, Lc5/f;->c(Ljavax/net/ssl/X509TrustManager;)Landroidx/activity/result/c;

    move-result-object v0

    goto :goto_2

    :catch_0
    move-exception p1

    .line 8
    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1, v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 9
    :cond_4
    :try_start_2
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v3}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_2
    .catch Ljava/security/GeneralSecurityException; {:try_start_2 .. :try_end_2} :catch_1

    :catch_1
    move-exception p1

    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1, v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 10
    :cond_5
    :goto_1
    iput-object v1, p0, Lv4/u;->k:Ljavax/net/ssl/SSLSocketFactory;

    iget-object v0, p1, Lv4/u$b;->k:Landroidx/activity/result/c;

    :goto_2
    iget-object v1, p0, Lv4/u;->k:Ljavax/net/ssl/SSLSocketFactory;

    if-eqz v1, :cond_6

    .line 11
    sget-object v2, Lc5/f;->a:Lc5/f;

    .line 12
    invoke-virtual {v2, v1}, Lc5/f;->f(Ljavax/net/ssl/SSLSocketFactory;)V

    :cond_6
    iget-object v1, p1, Lv4/u$b;->l:Ljavax/net/ssl/HostnameVerifier;

    iput-object v1, p0, Lv4/u;->l:Ljavax/net/ssl/HostnameVerifier;

    .line 13
    iget-object v1, p1, Lv4/u$b;->m:Lv4/f;

    iget-object v2, v1, Lv4/f;->b:Landroidx/activity/result/c;

    .line 14
    invoke-static {v2, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    goto :goto_3

    :cond_7
    new-instance v2, Lv4/f;

    iget-object v1, v1, Lv4/f;->a:Ljava/util/Set;

    invoke-direct {v2, v1, v0}, Lv4/f;-><init>(Ljava/util/Set;Landroidx/activity/result/c;)V

    move-object v1, v2

    .line 15
    :goto_3
    iput-object v1, p0, Lv4/u;->m:Lv4/f;

    iget-object v0, p1, Lv4/u$b;->n:Landroidx/fragment/app/x0;

    iput-object v0, p0, Lv4/u;->n:Landroidx/fragment/app/x0;

    iget-object v0, p1, Lv4/u$b;->o:Landroidx/fragment/app/x0;

    iput-object v0, p0, Lv4/u;->o:Landroidx/fragment/app/x0;

    iget-object v0, p1, Lv4/u$b;->p:Ld/s;

    iput-object v0, p0, Lv4/u;->p:Ld/s;

    iget-object v0, p1, Lv4/u$b;->q:La2/d;

    iput-object v0, p0, Lv4/u;->q:La2/d;

    iget-boolean v0, p1, Lv4/u$b;->r:Z

    iput-boolean v0, p0, Lv4/u;->r:Z

    iget-boolean v0, p1, Lv4/u$b;->s:Z

    iput-boolean v0, p0, Lv4/u;->s:Z

    iget-boolean v0, p1, Lv4/u$b;->t:Z

    iput-boolean v0, p0, Lv4/u;->t:Z

    iget v0, p1, Lv4/u$b;->u:I

    iput v0, p0, Lv4/u;->u:I

    iget v0, p1, Lv4/u$b;->v:I

    iput v0, p0, Lv4/u;->v:I

    iget p1, p1, Lv4/u$b;->w:I

    iput p1, p0, Lv4/u;->w:I

    iget-object p1, p0, Lv4/u;->e:Ljava/util/List;

    invoke-interface {p1, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    iget-object p1, p0, Lv4/u;->f:Ljava/util/List;

    invoke-interface {p1, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return-void

    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Null network interceptor: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lv4/u;->f:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Null interceptor: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lv4/u;->e:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final a(Lv4/x;)Lv4/w;
    .locals 2

    new-instance v0, Lv4/w;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lv4/w;-><init>(Lv4/u;Lv4/x;Z)V

    new-instance p1, Ly4/i;

    invoke-direct {p1, p0, v0}, Ly4/i;-><init>(Lv4/u;Lv4/w;)V

    iput-object p1, v0, Lv4/w;->c:Ly4/i;

    return-object v0
.end method

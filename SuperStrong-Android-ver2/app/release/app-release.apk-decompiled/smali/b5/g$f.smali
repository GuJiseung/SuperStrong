.class public final Lb5/g$f;
.super Lw4/b;
.source "SourceFile"

# interfaces
.implements Lb5/q$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb5/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "f"
.end annotation


# instance fields
.field public final c:Lb5/q;

.field public final synthetic d:Lb5/g;


# direct methods
.method public constructor <init>(Lb5/g;Lb5/q;)V
    .locals 2

    iput-object p1, p0, Lb5/g$f;->d:Lb5/g;

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object p1, p1, Lb5/g;->e:Ljava/lang/String;

    aput-object p1, v0, v1

    const-string p1, "OkHttp %s"

    invoke-direct {p0, p1, v0}, Lw4/b;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    iput-object p2, p0, Lb5/g$f;->c:Lb5/q;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    iget-object v0, p0, Lb5/g$f;->d:Lb5/g;

    iget-object v1, p0, Lb5/g$f;->c:Lb5/q;

    const/4 v2, 0x0

    :try_start_0
    invoke-virtual {v1, p0}, Lb5/q;->h(Lb5/q$b;)V

    :goto_0
    const/4 v3, 0x0

    invoke-virtual {v1, v3, p0}, Lb5/q;->f(ZLb5/q$b;)Z

    move-result v3
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x1

    const/4 v4, 0x6

    invoke-virtual {v0, v3, v4, v2}, Lb5/g;->c(IILjava/io/IOException;)V

    goto :goto_1

    :catchall_0
    move-exception v3

    const/4 v4, 0x3

    invoke-virtual {v0, v4, v4, v2}, Lb5/g;->c(IILjava/io/IOException;)V

    invoke-static {v1}, Lw4/e;->b(Ljava/io/Closeable;)V

    throw v3

    :catch_0
    move-exception v2

    const/4 v3, 0x2

    invoke-virtual {v0, v3, v3, v2}, Lb5/g;->c(IILjava/io/IOException;)V

    :goto_1
    invoke-static {v1}, Lw4/e;->b(Ljava/io/Closeable;)V

    return-void
.end method

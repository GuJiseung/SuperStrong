.class public final Lf5/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf5/y;


# instance fields
.field public final synthetic b:Lf5/y;

.field public final synthetic c:Lf5/c;


# direct methods
.method public constructor <init>(Lf5/p;Lf5/o;)V
    .locals 0

    iput-object p1, p0, Lf5/b;->c:Lf5/c;

    iput-object p2, p0, Lf5/b;->b:Lf5/y;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final B(Lf5/e;J)J
    .locals 2

    iget-object p2, p0, Lf5/b;->c:Lf5/c;

    invoke-virtual {p2}, Lf5/c;->i()V

    :try_start_0
    iget-object p3, p0, Lf5/b;->b:Lf5/y;

    const-wide/16 v0, 0x2000

    invoke-interface {p3, p1, v0, v1}, Lf5/y;->B(Lf5/e;J)J

    move-result-wide v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x1

    invoke-virtual {p2, p1}, Lf5/c;->k(Z)V

    return-wide v0

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    :try_start_1
    invoke-virtual {p2, p1}, Lf5/c;->j(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    const/4 p3, 0x0

    invoke-virtual {p2, p3}, Lf5/c;->k(Z)V

    throw p1
.end method

.method public final b()Lf5/z;
    .locals 1

    iget-object v0, p0, Lf5/b;->c:Lf5/c;

    return-object v0
.end method

.method public final close()V
    .locals 3

    iget-object v0, p0, Lf5/b;->c:Lf5/c;

    invoke-virtual {v0}, Lf5/c;->i()V

    :try_start_0
    iget-object v1, p0, Lf5/b;->b:Lf5/y;

    invoke-interface {v1}, Lf5/y;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lf5/c;->k(Z)V

    return-void

    :catchall_0
    move-exception v1

    goto :goto_0

    :catch_0
    move-exception v1

    :try_start_1
    invoke-virtual {v0, v1}, Lf5/c;->j(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object v1

    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lf5/c;->k(Z)V

    throw v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "AsyncTimeout.source("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lf5/b;->b:Lf5/y;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

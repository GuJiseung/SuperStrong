.class public final Lf5/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf5/x;


# instance fields
.field public final synthetic b:Lf5/x;

.field public final synthetic c:Lf5/c;


# direct methods
.method public constructor <init>(Lf5/p;Lf5/n;)V
    .locals 0

    iput-object p1, p0, Lf5/a;->c:Lf5/c;

    iput-object p2, p0, Lf5/a;->b:Lf5/x;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b()Lf5/z;
    .locals 1

    iget-object v0, p0, Lf5/a;->c:Lf5/c;

    return-object v0
.end method

.method public final close()V
    .locals 3

    iget-object v0, p0, Lf5/a;->c:Lf5/c;

    invoke-virtual {v0}, Lf5/c;->i()V

    :try_start_0
    iget-object v1, p0, Lf5/a;->b:Lf5/x;

    invoke-interface {v1}, Lf5/x;->close()V
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

.method public final flush()V
    .locals 3

    iget-object v0, p0, Lf5/a;->c:Lf5/c;

    invoke-virtual {v0}, Lf5/c;->i()V

    :try_start_0
    iget-object v1, p0, Lf5/a;->b:Lf5/x;

    invoke-interface {v1}, Lf5/x;->flush()V
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

    const-string v1, "AsyncTimeout.sink("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lf5/a;->b:Lf5/x;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u(Lf5/e;J)V
    .locals 6

    iget-wide v0, p1, Lf5/e;->c:J

    const-wide/16 v2, 0x0

    move-wide v4, p2

    invoke-static/range {v0 .. v5}, Lf5/a0;->a(JJJ)V

    :goto_0
    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-lez v2, :cond_2

    iget-object v2, p1, Lf5/e;->b:Lf5/u;

    :goto_1
    const-wide/32 v3, 0x10000

    cmp-long v3, v0, v3

    if-gez v3, :cond_1

    iget v3, v2, Lf5/u;->c:I

    iget v4, v2, Lf5/u;->b:I

    sub-int/2addr v3, v4

    int-to-long v3, v3

    add-long/2addr v0, v3

    cmp-long v3, v0, p2

    if-ltz v3, :cond_0

    move-wide v0, p2

    goto :goto_2

    :cond_0
    iget-object v2, v2, Lf5/u;->f:Lf5/u;

    goto :goto_1

    :cond_1
    :goto_2
    iget-object v2, p0, Lf5/a;->c:Lf5/c;

    invoke-virtual {v2}, Lf5/c;->i()V

    :try_start_0
    iget-object v3, p0, Lf5/a;->b:Lf5/x;

    invoke-interface {v3, p1, v0, v1}, Lf5/x;->u(Lf5/e;J)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sub-long/2addr p2, v0

    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lf5/c;->k(Z)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_3

    :catch_0
    move-exception p1

    :try_start_1
    invoke-virtual {v2, p1}, Lf5/c;->j(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_3
    const/4 p2, 0x0

    invoke-virtual {v2, p2}, Lf5/c;->k(Z)V

    throw p1

    :cond_2
    return-void
.end method

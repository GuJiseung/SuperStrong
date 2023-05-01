.class public final Lf5/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf5/x;


# instance fields
.field public final synthetic b:Lf5/z;

.field public final synthetic c:Ljava/io/OutputStream;


# direct methods
.method public constructor <init>(Ljava/io/OutputStream;Lf5/p;)V
    .locals 0

    iput-object p2, p0, Lf5/n;->b:Lf5/z;

    iput-object p1, p0, Lf5/n;->c:Ljava/io/OutputStream;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b()Lf5/z;
    .locals 1

    iget-object v0, p0, Lf5/n;->b:Lf5/z;

    return-object v0
.end method

.method public final close()V
    .locals 1

    iget-object v0, p0, Lf5/n;->c:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    return-void
.end method

.method public final flush()V
    .locals 1

    iget-object v0, p0, Lf5/n;->c:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "sink("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lf5/n;->c:Ljava/io/OutputStream;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u(Lf5/e;J)V
    .locals 7

    iget-wide v0, p1, Lf5/e;->c:J

    const-wide/16 v2, 0x0

    move-wide v4, p2

    invoke-static/range {v0 .. v5}, Lf5/a0;->a(JJJ)V

    :cond_0
    :goto_0
    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-lez v0, :cond_1

    iget-object v0, p0, Lf5/n;->b:Lf5/z;

    invoke-virtual {v0}, Lf5/z;->f()V

    iget-object v0, p1, Lf5/e;->b:Lf5/u;

    iget v1, v0, Lf5/u;->c:I

    iget v2, v0, Lf5/u;->b:I

    sub-int/2addr v1, v2

    int-to-long v1, v1

    invoke-static {p2, p3, v1, v2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    long-to-int v1, v1

    iget-object v2, v0, Lf5/u;->a:[B

    iget v3, v0, Lf5/u;->b:I

    iget-object v4, p0, Lf5/n;->c:Ljava/io/OutputStream;

    invoke-virtual {v4, v2, v3, v1}, Ljava/io/OutputStream;->write([BII)V

    iget v2, v0, Lf5/u;->b:I

    add-int/2addr v2, v1

    iput v2, v0, Lf5/u;->b:I

    int-to-long v3, v1

    sub-long/2addr p2, v3

    iget-wide v5, p1, Lf5/e;->c:J

    sub-long/2addr v5, v3

    iput-wide v5, p1, Lf5/e;->c:J

    iget v1, v0, Lf5/u;->c:I

    if-ne v2, v1, :cond_0

    invoke-virtual {v0}, Lf5/u;->a()Lf5/u;

    move-result-object v1

    iput-object v1, p1, Lf5/e;->b:Lf5/u;

    invoke-static {v0}, Lf5/v;->a(Lf5/u;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.class public final Lf5/d;
.super Ljava/io/OutputStream;
.source "SourceFile"


# instance fields
.field public final synthetic b:Lf5/e;


# direct methods
.method public constructor <init>(Lf5/e;)V
    .locals 0

    iput-object p1, p0, Lf5/d;->b:Lf5/e;

    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 0

    return-void
.end method

.method public final flush()V
    .locals 0

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lf5/d;->b:Lf5/e;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ".outputStream()"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final write(I)V
    .locals 1

    iget-object v0, p0, Lf5/d;->b:Lf5/e;

    int-to-byte p1, p1

    invoke-virtual {v0, p1}, Lf5/e;->G(I)V

    return-void
.end method

.method public final write([BII)V
    .locals 1

    iget-object v0, p0, Lf5/d;->b:Lf5/e;

    invoke-virtual {v0, p1, p2, p3}, Lf5/e;->write([BII)V

    return-void
.end method

.class public final La5/a$f;
.super La5/a$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La5/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "f"
.end annotation


# instance fields
.field public e:Z


# direct methods
.method public constructor <init>(La5/a;)V
    .locals 0

    invoke-direct {p0, p1}, La5/a$a;-><init>(La5/a;)V

    return-void
.end method


# virtual methods
.method public final B(Lf5/e;J)J
    .locals 2

    iget-boolean p2, p0, La5/a$a;->c:Z

    if-nez p2, :cond_2

    iget-boolean p2, p0, La5/a$f;->e:Z

    const-wide/16 v0, -0x1

    if-eqz p2, :cond_0

    return-wide v0

    :cond_0
    const-wide/16 p2, 0x2000

    invoke-super {p0, p1, p2, p3}, La5/a$a;->B(Lf5/e;J)J

    move-result-wide p1

    cmp-long p3, p1, v0

    if-nez p3, :cond_1

    const/4 p1, 0x1

    iput-boolean p1, p0, La5/a$f;->e:Z

    invoke-virtual {p0}, La5/a$a;->c()V

    return-wide v0

    :cond_1
    return-wide p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final close()V
    .locals 1

    iget-boolean v0, p0, La5/a$a;->c:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-boolean v0, p0, La5/a$f;->e:Z

    if-nez v0, :cond_1

    invoke-virtual {p0}, La5/a$a;->c()V

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, La5/a$a;->c:Z

    return-void
.end method

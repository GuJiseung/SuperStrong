.class public final Lf5/k;
.super Lf5/z;
.source "SourceFile"


# instance fields
.field public e:Lf5/z;


# direct methods
.method public constructor <init>(Lf5/z;)V
    .locals 1

    invoke-direct {p0}, Lf5/z;-><init>()V

    if-eqz p1, :cond_0

    iput-object p1, p0, Lf5/k;->e:Lf5/z;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "delegate == null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final a()Lf5/z;
    .locals 1

    iget-object v0, p0, Lf5/k;->e:Lf5/z;

    invoke-virtual {v0}, Lf5/z;->a()Lf5/z;

    move-result-object v0

    return-object v0
.end method

.method public final b()Lf5/z;
    .locals 1

    iget-object v0, p0, Lf5/k;->e:Lf5/z;

    invoke-virtual {v0}, Lf5/z;->b()Lf5/z;

    move-result-object v0

    return-object v0
.end method

.method public final c()J
    .locals 2

    iget-object v0, p0, Lf5/k;->e:Lf5/z;

    invoke-virtual {v0}, Lf5/z;->c()J

    move-result-wide v0

    return-wide v0
.end method

.method public final d(J)Lf5/z;
    .locals 1

    iget-object v0, p0, Lf5/k;->e:Lf5/z;

    invoke-virtual {v0, p1, p2}, Lf5/z;->d(J)Lf5/z;

    move-result-object p1

    return-object p1
.end method

.method public final e()Z
    .locals 1

    iget-object v0, p0, Lf5/k;->e:Lf5/z;

    invoke-virtual {v0}, Lf5/z;->e()Z

    move-result v0

    return v0
.end method

.method public final f()V
    .locals 1

    iget-object v0, p0, Lf5/k;->e:Lf5/z;

    invoke-virtual {v0}, Lf5/z;->f()V

    return-void
.end method

.method public final g(JLjava/util/concurrent/TimeUnit;)Lf5/z;
    .locals 1

    iget-object v0, p0, Lf5/k;->e:Lf5/z;

    invoke-virtual {v0, p1, p2, p3}, Lf5/z;->g(JLjava/util/concurrent/TimeUnit;)Lf5/z;

    move-result-object p1

    return-object p1
.end method

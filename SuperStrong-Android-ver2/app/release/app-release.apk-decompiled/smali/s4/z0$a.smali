.class public final Ls4/z0$a;
.super Ls4/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls4/z0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ls4/g<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final j:Ls4/z0;


# direct methods
.method public constructor <init>(Le4/d;Ls4/z0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le4/d<",
            "-TT;>;",
            "Ls4/z0;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1}, Ls4/g;-><init>(Le4/d;)V

    iput-object p2, p0, Ls4/z0$a;->j:Ls4/z0;

    return-void
.end method


# virtual methods
.method public final m(Ls4/z0;)Ljava/lang/Throwable;
    .locals 2

    iget-object v0, p0, Ls4/z0$a;->j:Ls4/z0;

    invoke-virtual {v0}, Ls4/z0;->D()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ls4/z0$c;

    if-eqz v1, :cond_1

    move-object v1, v0

    check-cast v1, Ls4/z0$c;

    invoke-virtual {v1}, Ls4/z0$c;->b()Ljava/lang/Throwable;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    return-object v1

    :cond_1
    :goto_0
    instance-of v1, v0, Ls4/n;

    if-eqz v1, :cond_2

    check-cast v0, Ls4/n;

    iget-object p1, v0, Ls4/n;->a:Ljava/lang/Throwable;

    return-object p1

    :cond_2
    invoke-virtual {p1}, Ls4/z0;->s()Ljava/util/concurrent/CancellationException;

    move-result-object p1

    return-object p1
.end method

.method public final t()Ljava/lang/String;
    .locals 1

    const-string v0, "AwaitContinuation"

    return-object v0
.end method

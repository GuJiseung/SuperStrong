.class public final Ls4/f1;
.super Ls4/y0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ls4/y0;"
    }
.end annotation


# instance fields
.field public final f:Ls4/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ls4/g<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ls4/z0$a;)V
    .locals 0

    invoke-direct {p0}, Ls4/y0;-><init>()V

    iput-object p1, p0, Ls4/f1;->f:Ls4/g;

    return-void
.end method


# virtual methods
.method public final bridge synthetic f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Ls4/f1;->m(Ljava/lang/Throwable;)V

    sget-object p1, Lc4/h;->a:Lc4/h;

    return-object p1
.end method

.method public final m(Ljava/lang/Throwable;)V
    .locals 1

    invoke-virtual {p0}, Ls4/y0;->n()Ls4/z0;

    move-result-object p1

    invoke-virtual {p1}, Ls4/z0;->D()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Ls4/n;

    if-eqz v0, :cond_0

    check-cast p1, Ls4/n;

    iget-object p1, p1, Ls4/n;->a:Ljava/lang/Throwable;

    invoke-static {p1}, La1/f0;->e(Ljava/lang/Throwable;)Lc4/d$a;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {p1}, Landroidx/fragment/app/r0;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_0
    iget-object v0, p0, Ls4/f1;->f:Ls4/g;

    invoke-virtual {v0, p1}, Ls4/g;->d(Ljava/lang/Object;)V

    return-void
.end method

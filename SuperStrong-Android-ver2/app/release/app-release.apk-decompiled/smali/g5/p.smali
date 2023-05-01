.class public final Lg5/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg5/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lg5/d<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Ls4/f;


# direct methods
.method public constructor <init>(Ls4/g;)V
    .locals 0

    iput-object p1, p0, Lg5/p;->a:Ls4/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lg5/b;Ljava/lang/Throwable;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg5/b<",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    const-string v0, "call"

    invoke-static {p1, v0}, Ll4/f;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "t"

    invoke-static {p2, p1}, Ll4/f;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, La1/f0;->e(Ljava/lang/Throwable;)Lc4/d$a;

    move-result-object p1

    iget-object p2, p0, Lg5/p;->a:Ls4/f;

    invoke-interface {p2, p1}, Le4/d;->d(Ljava/lang/Object;)V

    return-void
.end method

.method public final b(Lg5/b;Lg5/b0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg5/b<",
            "Ljava/lang/Object;",
            ">;",
            "Lg5/b0<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string v0, "call"

    invoke-static {p1, v0}, Ll4/f;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "response"

    invoke-static {p2, p1}, Ll4/f;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lg5/b0;->a()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p2, Lg5/b0;->b:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    new-instance p1, Lg5/j;

    invoke-direct {p1, p2}, Lg5/j;-><init>(Lg5/b0;)V

    invoke-static {p1}, La1/f0;->e(Ljava/lang/Throwable;)Lc4/d$a;

    move-result-object p1

    :goto_0
    iget-object p2, p0, Lg5/p;->a:Ls4/f;

    invoke-interface {p2, p1}, Le4/d;->d(Ljava/lang/Object;)V

    return-void
.end method

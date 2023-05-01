.class public final Lg5/r;
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

    iput-object p1, p0, Lg5/r;->a:Ls4/f;

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

    iget-object p2, p0, Lg5/r;->a:Ls4/f;

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

    iget-object p1, p0, Lg5/r;->a:Ls4/f;

    invoke-interface {p1, p2}, Le4/d;->d(Ljava/lang/Object;)V

    return-void
.end method

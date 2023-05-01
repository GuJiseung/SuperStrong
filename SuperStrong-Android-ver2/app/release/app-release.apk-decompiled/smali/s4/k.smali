.class public final Ls4/k;
.super Ls4/w0;
.source "SourceFile"

# interfaces
.implements Ls4/j;


# instance fields
.field public final f:Ls4/l;


# direct methods
.method public constructor <init>(Ls4/z0;)V
    .locals 0

    invoke-direct {p0}, Ls4/w0;-><init>()V

    iput-object p1, p0, Ls4/k;->f:Ls4/l;

    return-void
.end method


# virtual methods
.method public final d(Ljava/lang/Throwable;)Z
    .locals 1

    invoke-virtual {p0}, Ls4/y0;->n()Ls4/z0;

    move-result-object v0

    invoke-virtual {v0, p1}, Ls4/z0;->t(Ljava/lang/Throwable;)Z

    move-result p1

    return p1
.end method

.method public final bridge synthetic f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Ls4/k;->m(Ljava/lang/Throwable;)V

    sget-object p1, Lc4/h;->a:Lc4/h;

    return-object p1
.end method

.method public final m(Ljava/lang/Throwable;)V
    .locals 1

    invoke-virtual {p0}, Ls4/y0;->n()Ls4/z0;

    move-result-object p1

    iget-object v0, p0, Ls4/k;->f:Ls4/l;

    invoke-interface {v0, p1}, Ls4/l;->q(Ls4/z0;)V

    return-void
.end method

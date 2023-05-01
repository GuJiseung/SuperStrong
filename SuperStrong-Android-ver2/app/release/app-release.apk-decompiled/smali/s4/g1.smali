.class public Ls4/g1;
.super Ls4/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls4/a<",
        "Lc4/h;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Le4/f;Z)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ls4/a;-><init>(Le4/f;Z)V

    return-void
.end method


# virtual methods
.method public final G(Ljava/lang/Throwable;)Z
    .locals 1

    iget-object v0, p0, Ls4/a;->c:Le4/f;

    invoke-static {v0, p1}, Lc0/n;->f(Le4/f;Ljava/lang/Throwable;)V

    const/4 p1, 0x1

    return p1
.end method

.class public final Lq3/j$a;
.super Lq3/x;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq3/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lq3/x<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public a:Lq3/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lq3/x<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lq3/x;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lx3/a;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx3/a;",
            ")TT;"
        }
    .end annotation

    iget-object v0, p0, Lq3/j$a;->a:Lq3/x;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lq3/x;->a(Lx3/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method public final b(Lx3/c;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx3/c;",
            "TT;)V"
        }
    .end annotation

    iget-object v0, p0, Lq3/j$a;->a:Lq3/x;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Lq3/x;->b(Lx3/c;Ljava/lang/Object;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

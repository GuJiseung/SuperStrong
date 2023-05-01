.class public final Lg5/i$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg5/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg5/i;
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
        "Ljava/lang/Object;",
        "Lg5/b<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final b:Ljava/util/concurrent/Executor;

.field public final c:Lg5/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lg5/b<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Lg5/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Lg5/b<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg5/i$a;->b:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lg5/i$a;->c:Lg5/b;

    return-void
.end method


# virtual methods
.method public final cancel()V
    .locals 1

    iget-object v0, p0, Lg5/i$a;->c:Lg5/b;

    invoke-interface {v0}, Lg5/b;->cancel()V

    return-void
.end method

.method public final clone()Lg5/b;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lg5/b<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lg5/i$a;

    iget-object v1, p0, Lg5/i$a;->c:Lg5/b;

    invoke-interface {v1}, Lg5/b;->clone()Lg5/b;

    move-result-object v1

    iget-object v2, p0, Lg5/i$a;->b:Ljava/util/concurrent/Executor;

    invoke-direct {v0, v2, v1}, Lg5/i$a;-><init>(Ljava/util/concurrent/Executor;Lg5/b;)V

    return-object v0
.end method

.method public final bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lg5/i$a;->clone()Lg5/b;

    move-result-object v0

    return-object v0
.end method

.method public final k(Lg5/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg5/d<",
            "TT;>;)V"
        }
    .end annotation

    new-instance v0, Lg5/i$a$a;

    invoke-direct {v0, p0, p1}, Lg5/i$a$a;-><init>(Lg5/i$a;Lg5/d;)V

    iget-object p1, p0, Lg5/i$a;->c:Lg5/b;

    invoke-interface {p1, v0}, Lg5/b;->k(Lg5/d;)V

    return-void
.end method

.method public final n()Lv4/x;
    .locals 1

    iget-object v0, p0, Lg5/i$a;->c:Lg5/b;

    invoke-interface {v0}, Lg5/b;->n()Lv4/x;

    move-result-object v0

    return-object v0
.end method

.method public final o()Z
    .locals 1

    iget-object v0, p0, Lg5/i$a;->c:Lg5/b;

    invoke-interface {v0}, Lg5/b;->o()Z

    move-result v0

    return v0
.end method

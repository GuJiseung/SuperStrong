.class public abstract Ls3/m$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls3/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public b:Ls3/m$e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ls3/m$e<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field public c:Ls3/m$e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ls3/m$e<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field public d:I

.field public final synthetic e:Ls3/m;


# direct methods
.method public constructor <init>(Ls3/m;)V
    .locals 1

    iput-object p1, p0, Ls3/m$d;->e:Ls3/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Ls3/m;->f:Ls3/m$e;

    iget-object v0, v0, Ls3/m$e;->e:Ls3/m$e;

    iput-object v0, p0, Ls3/m$d;->b:Ls3/m$e;

    const/4 v0, 0x0

    iput-object v0, p0, Ls3/m$d;->c:Ls3/m$e;

    iget p1, p1, Ls3/m;->e:I

    iput p1, p0, Ls3/m$d;->d:I

    return-void
.end method


# virtual methods
.method public final a()Ls3/m$e;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ls3/m$e<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object v0, p0, Ls3/m$d;->b:Ls3/m$e;

    iget-object v1, p0, Ls3/m$d;->e:Ls3/m;

    iget-object v2, v1, Ls3/m;->f:Ls3/m$e;

    if-eq v0, v2, :cond_1

    iget v1, v1, Ls3/m;->e:I

    iget v2, p0, Ls3/m$d;->d:I

    if-ne v1, v2, :cond_0

    iget-object v1, v0, Ls3/m$e;->e:Ls3/m$e;

    iput-object v1, p0, Ls3/m$d;->b:Ls3/m$e;

    iput-object v0, p0, Ls3/m$d;->c:Ls3/m$e;

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw v0

    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final hasNext()Z
    .locals 2

    iget-object v0, p0, Ls3/m$d;->b:Ls3/m$e;

    iget-object v1, p0, Ls3/m$d;->e:Ls3/m;

    iget-object v1, v1, Ls3/m;->f:Ls3/m$e;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final remove()V
    .locals 3

    iget-object v0, p0, Ls3/m$d;->c:Ls3/m$e;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    iget-object v2, p0, Ls3/m$d;->e:Ls3/m;

    invoke-virtual {v2, v0, v1}, Ls3/m;->d(Ls3/m$e;Z)V

    const/4 v0, 0x0

    iput-object v0, p0, Ls3/m$d;->c:Ls3/m$e;

    iget v0, v2, Ls3/m;->e:I

    iput v0, p0, Ls3/m$d;->d:I

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.class public final Landroidx/databinding/f;
.super Ljava/lang/ref/WeakReference;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/ref/WeakReference<",
        "Landroidx/databinding/ViewDataBinding;",
        ">;"
    }
.end annotation


# instance fields
.field public a:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# virtual methods
.method public final a()Z
    .locals 2

    iget-object v0, p0, Landroidx/databinding/f;->a:Ljava/lang/Object;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    const/4 v1, 0x0

    iput-object v1, p0, Landroidx/databinding/f;->a:Ljava/lang/Object;

    return v0

    :cond_0
    const/4 v0, 0x0

    throw v0
.end method

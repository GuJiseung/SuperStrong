.class public abstract Lb2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb2/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lb2/g<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final b:I

.field public final c:I

.field public d:La2/c;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, -0x80000000

    invoke-static {v0, v0}, Le2/j;->g(II)Z

    move-result v1

    if-eqz v1, :cond_0

    iput v0, p0, Lb2/c;->b:I

    iput v0, p0, Lb2/c;->c:I

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final a()V
    .locals 0

    return-void
.end method

.method public final b()V
    .locals 0

    return-void
.end method

.method public final c(La2/c;)V
    .locals 0

    iput-object p1, p0, Lb2/c;->d:La2/c;

    return-void
.end method

.method public final d(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    return-void
.end method

.method public final e(Lb2/f;)V
    .locals 2

    iget v0, p0, Lb2/c;->b:I

    iget v1, p0, Lb2/c;->c:I

    invoke-interface {p1, v0, v1}, Lb2/f;->b(II)V

    return-void
.end method

.method public final f(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    return-void
.end method

.method public final g()La2/c;
    .locals 1

    iget-object v0, p0, Lb2/c;->d:La2/c;

    return-object v0
.end method

.method public final i(Lb2/f;)V
    .locals 0

    return-void
.end method

.method public final k()V
    .locals 0

    return-void
.end method

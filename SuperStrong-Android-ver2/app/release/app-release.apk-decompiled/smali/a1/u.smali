.class public final La1/u;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La1/d0;

.field public static final b:La1/u$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    new-instance v0, La1/e0;

    invoke-direct {v0}, La1/e0;-><init>()V

    goto :goto_0

    :cond_0
    new-instance v0, La1/d0;

    invoke-direct {v0}, La1/d0;-><init>()V

    :goto_0
    sput-object v0, La1/u;->a:La1/d0;

    new-instance v0, La1/u$a;

    invoke-direct {v0}, La1/u$a;-><init>()V

    sput-object v0, La1/u;->b:La1/u$a;

    new-instance v0, La1/u$b;

    invoke-direct {v0}, La1/u$b;-><init>()V

    return-void
.end method

.method public static a(Landroid/view/View;IIII)V
    .locals 6

    sget-object v0, La1/u;->a:La1/d0;

    move-object v1, p0

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-virtual/range {v0 .. v5}, La1/c0;->r(Landroid/view/View;IIII)V

    return-void
.end method

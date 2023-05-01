.class public La1/d0;
.super La1/c0;
.source "SourceFile"


# static fields
.field public static j:Z = true


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, La1/c0;-><init>()V

    return-void
.end method


# virtual methods
.method public k(Landroid/view/View;I)V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-ne v0, v1, :cond_0

    invoke-super {p0, p1, p2}, La1/f0;->k(Landroid/view/View;I)V

    goto :goto_0

    :cond_0
    sget-boolean v0, La1/d0;->j:Z

    if-eqz v0, :cond_1

    :try_start_0
    invoke-static {p1, p2}, La1/v;->c(Landroid/view/View;I)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p1, 0x0

    sput-boolean p1, La1/d0;->j:Z

    :cond_1
    :goto_0
    return-void
.end method

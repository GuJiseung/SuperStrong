.class public La1/a0;
.super La1/x;
.source "SourceFile"


# static fields
.field public static g:Z = true

.field public static h:Z = true


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, La1/x;-><init>()V

    return-void
.end method


# virtual methods
.method public p(Landroid/view/View;Landroid/graphics/Matrix;)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    sget-boolean v0, La1/a0;->g:Z

    if-eqz v0, :cond_0

    :try_start_0
    invoke-static {p1, p2}, La1/z;->d(Landroid/view/View;Landroid/graphics/Matrix;)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p1, 0x0

    sput-boolean p1, La1/a0;->g:Z

    :cond_0
    :goto_0
    return-void
.end method

.method public q(Landroid/view/View;Landroid/graphics/Matrix;)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    sget-boolean v0, La1/a0;->h:Z

    if-eqz v0, :cond_0

    :try_start_0
    invoke-static {p1, p2}, La1/y;->c(Landroid/view/View;Landroid/graphics/Matrix;)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p1, 0x0

    sput-boolean p1, La1/a0;->h:Z

    :cond_0
    :goto_0
    return-void
.end method

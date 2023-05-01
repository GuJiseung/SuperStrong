.class public final Lv1/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Li1/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li1/g<",
            "Li1/b;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Li1/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li1/g<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    sget-object v0, Li1/b;->b:Li1/b;

    const-string v1, "com.bumptech.glide.load.resource.gif.GifOptions.DecodeFormat"

    invoke-static {v0, v1}, Li1/g;->a(Ljava/lang/Object;Ljava/lang/String;)Li1/g;

    move-result-object v0

    sput-object v0, Lv1/g;->a:Li1/g;

    const-string v0, "com.bumptech.glide.load.resource.gif.GifOptions.DisableAnimation"

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v1, v0}, Li1/g;->a(Ljava/lang/Object;Ljava/lang/String;)Li1/g;

    move-result-object v0

    sput-object v0, Lv1/g;->b:Li1/g;

    return-void
.end method

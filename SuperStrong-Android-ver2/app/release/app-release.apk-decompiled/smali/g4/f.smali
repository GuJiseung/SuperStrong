.class public final Lg4/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg4/f$a;
    }
.end annotation


# static fields
.field public static final a:Lg4/f$a;

.field public static b:Lg4/f$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lg4/f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1, v1}, Lg4/f$a;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V

    sput-object v0, Lg4/f;->a:Lg4/f$a;

    return-void
.end method

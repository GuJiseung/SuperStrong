.class public final enum Li1/c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Li1/c;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Li1/c;

.field public static final enum c:Li1/c;

.field public static final enum d:Li1/c;

.field public static final synthetic e:[Li1/c;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    new-instance v0, Li1/c;

    const-string v1, "SOURCE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Li1/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Li1/c;->b:Li1/c;

    new-instance v1, Li1/c;

    const-string v3, "TRANSFORMED"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Li1/c;-><init>(Ljava/lang/String;I)V

    sput-object v1, Li1/c;->c:Li1/c;

    new-instance v3, Li1/c;

    const-string v5, "NONE"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Li1/c;-><init>(Ljava/lang/String;I)V

    sput-object v3, Li1/c;->d:Li1/c;

    const/4 v5, 0x3

    new-array v5, v5, [Li1/c;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, Li1/c;->e:[Li1/c;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Li1/c;
    .locals 1

    const-class v0, Li1/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Li1/c;

    return-object p0
.end method

.method public static values()[Li1/c;
    .locals 1

    sget-object v0, Li1/c;->e:[Li1/c;

    invoke-virtual {v0}, [Li1/c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Li1/c;

    return-object v0
.end method

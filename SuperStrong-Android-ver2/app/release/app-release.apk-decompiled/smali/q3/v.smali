.class public abstract enum Lq3/v;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lq3/v;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lq3/v$a;

.field public static final synthetic c:[Lq3/v;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Lq3/v$a;

    invoke-direct {v0}, Lq3/v$a;-><init>()V

    sput-object v0, Lq3/v;->b:Lq3/v$a;

    new-instance v1, Lq3/v$b;

    invoke-direct {v1}, Lq3/v$b;-><init>()V

    const/4 v2, 0x2

    new-array v2, v2, [Lq3/v;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object v1, v2, v0

    sput-object v2, Lq3/v;->c:[Lq3/v;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lq3/v;
    .locals 1

    const-class v0, Lq3/v;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lq3/v;

    return-object p0
.end method

.method public static values()[Lq3/v;
    .locals 1

    sget-object v0, Lq3/v;->c:[Lq3/v;

    invoke-virtual {v0}, [Lq3/v;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lq3/v;

    return-object v0
.end method

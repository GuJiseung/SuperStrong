.class public final Ls4/c1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls4/i0;
.implements Ls4/j;


# static fields
.field public static final b:Ls4/c1;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ls4/c1;

    invoke-direct {v0}, Ls4/c1;-><init>()V

    sput-object v0, Ls4/c1;->b:Ls4/c1;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 0

    return-void
.end method

.method public final d(Ljava/lang/Throwable;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "NonDisposableHandle"

    return-object v0
.end method
